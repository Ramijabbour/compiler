import java.io.*;
import java.util.ArrayList;

public class Visitor   extends gBaseVisitor<Object> {

    @Override public Object visitCreate_table_stmt(gParser.Create_table_stmtContext ctx)
    {
        for(int i = 0 ; i < launch.Data_Types.size() ; i ++ )
        {
            Data_Type temp = (Data_Type) launch.Data_Types.get(i);
            String temp2 = temp.name;
            if(temp2.equalsIgnoreCase(ctx.table_name().ident().getText()))
            {
                System.out.println("error in table name");
                return null ;
            }
        }
        String delimiter ;
        try
        {
            delimiter = ctx.create_table_definition().create_table_options_ed().create_table_options_item().create_table_options_hive_item().create_table_hive_row_format().create_table_hive_row_format_fields().expr().getText();
        }
        catch(Exception e )
        {
            System.out.println("delimiter = null ");
            delimiter ="," ;
        }
        String path  ;
        try
        {
            path =  ctx.create_table_definition().create_table_options().expr().getText() ;
            path = path.substring(1,path.length()-1);
            System.out.println(path);
        }
        catch(Exception e )
        {
            System.out.println("path = null ");
            path ="C:\\Users\\MJ\\IdeaProjects\\untitled3\\src\\Data" ;
        }
        Data_Type d = new Data_Type(ctx.table_name().ident().getText(),"table",path,delimiter);
        ArrayList names = new ArrayList() ; ArrayList vars = new ArrayList();
        for ( int k = 0 ; k < ctx.create_table_definition().create_table_columns().create_table_columns_item().size() ; k ++ )
        {
            names.add(ctx.create_table_definition().create_table_columns().create_table_columns_item(k).column_name().ident().getText());
            vars.add(ctx.create_table_definition().create_table_columns().create_table_columns_item(k).dtype().getText());
        }

        if(d.set_type(vars,names))
            launch.Save_Data_Types(d);
        else System.out.println("syntax error in visitor // visit_create_table : unavailable column name or Type ");
        return visitChildren(ctx);
    }

    @Override public Object visitSelect_stmt(gParser.Select_stmtContext ctx)
    {
        String table_name = ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().from_clause().from_table_clause().from_table_name_clause().table_name().ident().getText();
        Data_Type table_from_data_type = table_name_exist(table_name);
        if(table_from_data_type != null)
        {
            //////slect star case begin
            try{
                if(ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().select_list().select_list_item(0).select_list_asterisk().getText() != null )
                {
                    if(ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().select_list().select_list_item(0).select_list_asterisk().getText().equalsIgnoreCase("*"))
                    {
                        String Folder_Path =  get_dir(table_name);
                        if(Folder_Path != null)
                        {
                            Folder_Path = Handle_Where_Clause(ctx,Folder_Path,table_name);
                            File folder = new File(Folder_Path);
                            File[] listOfFiles = folder.listFiles();
                            String in_path = "";
                            File out_dir = new File(Folder_Path + "\\out");//add unique name for each select stmt
                            out_dir.mkdirs();
                            for (File listOfFile : listOfFiles)
                            {
                                if (listOfFile.isFile())
                                {
                                    System.out.println("File " + listOfFile.getName());
                                    in_path = listOfFile.getPath();
                                    Data_Type select_header  = table_name_exist(table_name);
                                    for(int i = 0 ; i < select_header.names.size() ; i ++ )
                                    {
                                        String temp = (String)select_header.names.get(i);
                                        System.out.print(temp+" |");
                                    }
                                    System.out.println();
                                    separate_star(in_path, ",");
                                }
                            }
                        }
                    }
                    return null ;
                }}catch(Exception e ){}
            //////slect star case END

            ArrayList select_columns = new ArrayList<String>() ;
            for(int i = 0 ; i < ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().select_list().select_list_item().size() ; i ++)
            {
                select_columns.add( ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().select_list().select_list_item(i).expr().expr_atom().ident().getText());
                System.out.println();
            }
            if(table_from_data_type.compare_name(select_columns))
            {
                String Folder_Path =  get_dir(table_name);
                Folder_Path = Handle_Where_Clause(ctx,Folder_Path,table_name);
                int[] indexes = get_indexes(select_columns,table_name);
                String in_path = "";String out_path = "" ;
                if(Folder_Path != null)
                {
                    File folder = new File(Folder_Path);
                    File[] listOfFiles = folder.listFiles();
                    File out_dir = new File(Folder_Path+"\\out");//add unique name for each select stmt
                    out_dir.mkdirs();
                    for (File listOfFile : listOfFiles)
                    {
                        if (listOfFile.isFile())
                        {
                            System.out.println("File " + listOfFile.getName());
                            System.out.println();
                            in_path = listOfFile.getPath();
                            out_path = out_dir+"\\"+listOfFile.getName()+"map_out";
                            System.out.println(out_path);
                            separate(in_path,",",indexes,out_path);
                        }
                    }
                }else
                {
                    System.out.println("data Type path not Found !! ");
                }
            }
            else
            {
                System.out.println("error in columns ");
            }
        }
        return visitChildren(ctx);
    }

    public String Handle_Where_Clause(gParser.Select_stmtContext ctx , String Folder_Path , String table_name)
    {
        String Final_Path ;
        try
        {
            ///// if the is where clause we process the file first then we select
            if(ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().where_clause().getText() != null)
            {
                String line_1 = ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().where_clause().bool_expr().bool_expr_atom().bool_expr_binary().expr(0).expr_atom().ident().getText();
                int line_1_index = get_where_index(line_1,table_name);
                if(line_1_index == -1 )
                {
                    System.out.println("syc error in where clause : column not found  ");
                    return null ;
                }
                String operator = ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().where_clause().bool_expr().bool_expr_atom().bool_expr_binary().bool_expr_binary_operator().getText();
                String line_2 = ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().where_clause().bool_expr().bool_expr_atom().bool_expr_binary().expr(1).expr_atom().int_number().getText();
                Final_Path = handle_where_clause_unary(Folder_Path,line_1_index,line_2,operator,",");
                return Final_Path ;
            }
        }
        catch (Exception e )
        {}
        try
        {
            ///// if the is where clause we process the file first then we select
            if(ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().where_clause().getText() != null)
            {
                String line_1 = ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().where_clause().bool_expr().bool_expr_atom().bool_expr_binary().expr(0).expr_atom().ident().getText();
                String operator = ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().where_clause().bool_expr().bool_expr_atom().bool_expr_binary().bool_expr_binary_operator().getText();
                String line_2 = ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().where_clause().bool_expr().bool_expr_atom().bool_expr_binary().expr(1).expr_atom().ident().getText();
                int line_1_index = get_where_index(line_1,table_name);
                int line_2_index = get_where_index(line_2,table_name);
                String line_1_type=get_column_type(line_1,table_name);
                String line_2_type=get_column_type(line_2,table_name);
                if(line_1_index == -1 || line_2_index == -1  ) // error code 1 column not found
                {
                    System.out.println("syc error in where clause : column not found  ");
                    return null ;
                }
                if(line_1_index == -2 || line_2_index == -2) // error code 2 type missmatch
                {
                    return null ;
                }
                if(!line_1_type.equalsIgnoreCase(line_2_type))
                {
                    System.out.println("error at class visitor : Type miss match ");
                    return null ;
                }
                Final_Path = handle_where_clause_binary(Folder_Path,line_1_index,line_2_index,operator,",");
                return Final_Path;
            }
        }
        catch (Exception e )
        {}
        try // handle like statement
        {
            String line_1 = ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().where_clause().bool_expr().bool_expr_atom().bool_expr_binary().expr(0).expr_atom().ident().getText();
            String operator = ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().where_clause().bool_expr().bool_expr_atom().bool_expr_binary().bool_expr_binary_operator().getText();
            String line_2 = ctx.fullselect_stmt().fullselect_stmt_item(0).subselect_stmt().where_clause().bool_expr().bool_expr_atom().bool_expr_binary().expr(1).expr_atom().string().getText();
            line_2 = line_2.substring(1,line_2.length()-1);
            int line_1_index = get_where_index(line_1,table_name);
            if(operator.equalsIgnoreCase("like") && get_column_type(line_1,table_name).equalsIgnoreCase("string"))
            {
                Final_Path = handle_like_stmt(Folder_Path,line_1_index,line_2,",");
                return Final_Path;
            }
        }
        catch(Exception e )
        {}
        return Folder_Path ;
    }

    public String handle_like_stmt(String path , int index , String comp_string , String Delimiter)
    {
        String out_String = "" ;
        if(path != null)
        {
            String out_path = "";
            String in_path = "" ;
            File folder = new File(path);
            File[] listOfFiles = folder.listFiles();
            File out_dir = new File(path+"\\temp");
            out_String = path+"\\temp" ;
            out_dir.mkdirs();
            for (File listOfFile : listOfFiles)
            {
                if (listOfFile.isFile())
                {
                    in_path = listOfFile.getPath();
                    out_path = out_dir+"\\"+listOfFile.getName()+"_where_handle_temp.txt";
                    BufferedReader fileReader = null;
                    String[] tokens = null ;
                    String line ;
                    try
                    {
                        fileReader = new BufferedReader(new FileReader(in_path));
                        File file = new File(out_path);
                        FileWriter fr = new FileWriter(file, true);
                        BufferedWriter br = new BufferedWriter(fr);
                        while ((line = fileReader.readLine()) != null)
                        {
                            tokens = line.split(Delimiter);
                            if(comp_string.charAt(0) == '%') // ends with
                            {
                                if(compare_like_stmt(comp_string,tokens[index],2))
                                {
                                    br.write(line);
                                    br.newLine();
                                }
                            }
                            else if(comp_string.charAt(comp_string.length()-1) == '%') // starts with
                            {
                                if(compare_like_stmt(comp_string,tokens[index],1))
                                {
                                    br.write(line);
                                    br.newLine();
                                }
                            }
                            else
                            {
                                if(tokens[index].equals(comp_string))
                                {
                                    br.write(line);
                                    br.newLine();
                                }
                            }
                        }
                        br.close();
                        fr.close();
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    finally {
                        try {
                            fileReader.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }else
        {
            System.out.println("data Type path not Found !! ");
            return null ;
        }
        return out_String ;
    }

    public boolean compare_like_stmt(String one , String two , int operation )
    // operation = 1 => string one starts with string two || operation = 2 => string one ends with string two
    {
        switch(operation)
        {
            case 1 :
            {
                try{
                for ( int i = 0 ; i < one.length()-1 ; i ++ )
                {
                    if(one.charAt(i) == two.charAt(i)) // might cause an out of bound exception
                    {}
                    else
                    {return false;}
                }
                return true;
                }catch(ArrayIndexOutOfBoundsException e ){return true;}
                catch(Exception ee ){
                    System.out.println("another exception");
                    return false ;
                }
            }
            case 2 :
            {
                    int one_counter = one.length()-1;int two_counter = two.length()-1;
                    while(one_counter != 0 )
                    {
                        if(one.charAt(one_counter) == two.charAt(two_counter))
                        {
                            one_counter--;two_counter--;
                        }
                        else{return false ; }
                    }
                    return true ;
            }
        }
        return false ;
    }

    public int stringCompare(String str1, String str2)
    {
        try{
        int str1_num = Integer.parseInt(str1);
        int str2_num = Integer.parseInt(str2);
        if(str1_num > str2_num)
            return 1 ;
        else if (str1_num < str2_num)
            return -1;
        else
            return 0;
        }catch (Exception e )
        {
            System.out.println("error at class visitor : stringcompare - type missmatch error");
            return -2 ;
        }
    }

    public String handle_where_clause_binary(String path , int index1 , int index2 , String operator , String Delimiter)
    {
        String out_String = "" ;
        if(path != null)
        {
            String out_path = "";
            String in_path = "" ;
            File folder = new File(path);
            File[] listOfFiles = folder.listFiles();
            File out_dir = new File(path+"\\temp");
            out_String = path+"\\temp" ;
            out_dir.mkdirs();
            for (File listOfFile : listOfFiles)
            {
                if (listOfFile.isFile())
                {
                    in_path = listOfFile.getPath();
                    out_path = out_dir+"\\"+listOfFile.getName()+"_where_handle_temp.txt";
                    BufferedReader fileReader = null;
                    String[] tokens = null ;
                    String line ;
                    try
                    {
                        fileReader = new BufferedReader(new FileReader(in_path));
                        File file = new File(out_path);
                        FileWriter fr = new FileWriter(file, true);
                        BufferedWriter br = new BufferedWriter(fr);
                        while ((line = fileReader.readLine()) != null)
                        {
                            tokens = line.split(Delimiter);
                            switch (operator)
                            {
                                case ">" :
                                    if(stringCompare(tokens[index1] , tokens[index2]) > 0 )
                                    {
                                        br.write(line);
                                        br.newLine();
                                    }
                                    break ;
                                case "<" :
                                    if(stringCompare(tokens[index1] , tokens[index2]) < 0 )
                                    {
                                        br.write(line);
                                        br.newLine();
                                    }
                                    break ;
                                case ">=" :
                                    if(stringCompare(tokens[index1] , tokens[index2]) >= 0 )
                                    {
                                        br.write(line);
                                        br.newLine();
                                    }
                                    break ;
                                case "<=" :
                                    if(stringCompare(tokens[index1] , tokens[index2]) <= 0 )
                                    {
                                        br.write(line);
                                        br.newLine();
                                    }
                                    break ;
                                case "=" :
                                    if(stringCompare(tokens[index1] , tokens[index2]) == 0 )
                                    {
                                        br.write(line);
                                        br.newLine();
                                    }
                                    break ;
                                case "like" :
                                    System.out.println("like clause binary ");
                                    break ;
                            }
                        }
                        br.close();
                        fr.close();
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    finally {
                        try {
                            fileReader.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                }
            }
        }else
        {
            System.out.println("data Type path not Found !! ");
            return null ;
        }
        return out_String ;
    }

    public String handle_where_clause_unary(String path , int index , String comp_string , String operator , String Delimiter)
    {
        String out_String = "" ;
        if(path != null)
        {
            String out_path = "";
            String in_path = "" ;
            File folder = new File(path);
            File[] listOfFiles = folder.listFiles();
            File out_dir = new File(path+"\\temp");
            out_String = path+"\\temp" ;
            out_dir.mkdirs();
            for (File listOfFile : listOfFiles)
            {
                if (listOfFile.isFile())
                {
                    in_path = listOfFile.getPath();
                    out_path = out_dir+"\\"+listOfFile.getName()+"_where_handle_temp.txt";
                    BufferedReader fileReader = null;
                    String[] tokens = null ;
                    String line ;
                    try
                    {
                        fileReader = new BufferedReader(new FileReader(in_path));
                        File file = new File(out_path);
                        FileWriter fr = new FileWriter(file, true);
                        BufferedWriter br = new BufferedWriter(fr);
                        while ((line = fileReader.readLine()) != null)
                        {
                            tokens = line.split(Delimiter);
                            switch (operator)
                            {
                                case ">" :
                                    if(stringCompare(tokens[index] , comp_string) > 0 )
                                    {
                                        br.write(line);
                                        br.newLine();
                                    }
                                    break ;
                                case "<" :
                                    if(stringCompare(tokens[index] , comp_string) < 0 )
                                    {
                                        br.write(line);
                                        br.newLine();
                                    }
                                    break ;
                                case ">=" :
                                    if(stringCompare(tokens[index] , comp_string) >= 0 )
                                    {
                                        br.write(line);
                                        br.newLine();
                                    }
                                    break ;
                                case "<=" :
                                    if(stringCompare(tokens[index] , comp_string) <= 0 )
                                    {
                                        br.write(line);
                                        br.newLine();
                                    }
                                    break ;
                                case "=" :
                                    if(stringCompare(tokens[index] , comp_string) == 0 )
                                    {
                                        br.write(line);
                                        br.newLine();
                                    }
                                    break ;
                                case "like" :
                                    System.out.println("like clause unary");
                                    break ;
                            }
                        }
                        br.close();
                        fr.close();
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    finally {
                        try {
                            fileReader.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                }
            }
        }else
        {
            System.out.println("data Type path not Found !! ");
            return null ;
        }
        return out_String ;
    }

    public  Data_Type table_name_exist(String s )
    {
        for (int i = 0 ; i < launch.Data_Types.size() ; i ++ )
        {
            Data_Type temp = (Data_Type)launch.Data_Types.get(i);
            if(s.equalsIgnoreCase(temp.name))
            {
                return temp ;
            }
        }
        return null ;
    }

    public  String get_dir(String DTName)
    {
        String path  = "" ;
        Data_Type dt = new Data_Type() ;
        for (Object Data_Type : launch.Data_Types)
        {
            dt = (Data_Type) Data_Type;
            if(dt.name.equalsIgnoreCase(DTName))
            {
                path = dt.Path_in_memory ;
                return path ;
            }
        }
        System.out.println("error : Data Type not found returning NULL as file path ");
        System.out.println("error trace : at String get_dir(String DTName)");
        return null  ;
    }

    public String get_column_type(String Name , String DTName)
    {
        Data_Type dt = new Data_Type() ;
        for (Object Data_Type : launch.Data_Types) {
            dt = (Data_Type) Data_Type;
            if(dt.name.equalsIgnoreCase(DTName))
            {
                ArrayList as = dt.names ;
                ArrayList types = dt.vars;
                String name =  Name;
                for(int j = 0 ; j < as.size() ; j ++ )
                {
                    if(as.get(j).equals(name))
                    {
                        String result = (String)types.get(j);
                        return result;
                    }
                }
                break ;
            }
        }
        return null ;
    }

    public int get_where_index(String Name , String DTName)
    {
        int index  ;
        Data_Type dt = new Data_Type() ;
        for (Object Data_Type : launch.Data_Types) {
            dt = (Data_Type) Data_Type;
            if(dt.name.equalsIgnoreCase(DTName))
            {
                ArrayList as = dt.names ;
                  String name =  Name;
                  for(int j = 0 ; j < as.size() ; j ++ )
                    {
                        if(as.get(j).equals(name))
                        {
                            index = j ;
                            return index ;
                        }
                    }
                break ;
            }
        }
        return -1 ;
    }

    public int[] get_indexes(ArrayList Names , String DTName)
    {
        int[] indexes = new int[Names.size()];
        int index = 0 ;
        Data_Type dt = new Data_Type() ;
        for (Object Data_Type : launch.Data_Types) {
            dt = (Data_Type) Data_Type;
            if(dt.name.equalsIgnoreCase(DTName))
            {
                ArrayList as = dt.names ;
                for (Object Name : Names)
                {
                    String name = (String) Name;
                    for(int j = 0 ; j < as.size() ; j ++ )
                    {
                        if(as.get(j).equals(name))
                        {
                            indexes[index] = j ;
                            index++ ;
                            break ;
                        }
                    }
                }
                break ;
            }
        }
        if(index != Names.size()) // didnt find all select parameters
        {
            System.out.println("some select pars not found - error at get_indexes");
            return null ;
        }
        else
        {
            return indexes ;
        }
    }

    public void separate(String in_path , String Delimiter , int[] indexes , String out_path)
    {
        BufferedReader fileReader = null;
        String[] tokens = null ;
        String line ;
        String Final_Path = out_path+".txt";
        try
        {
            fileReader = new BufferedReader(new FileReader(in_path));
            File file = new File(Final_Path);
            FileWriter fr = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fr);
            while ((line = fileReader.readLine()) != null)
            {
                tokens = line.split(Delimiter);
                for(int index : indexes)
                {
                    String final_S =  tokens[index]+","+"1";
                    br.write(final_S);
                    br.newLine();
                    System.out.print(tokens[index] + " | ");
                }
                System.out.println();
            }
            br.close();
            fr.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public void separate_star(String path , String Delimiter)
    {
        BufferedReader fileReader = null;
        String[] tokens = null ;
        String line ;
        try
        {
            fileReader = new BufferedReader(new FileReader(path));
            while (( line = fileReader.readLine()) != null)
            {
                tokens = line.split(Delimiter);
                for(String token : tokens )
                    System.out.print(token+ " | ");
                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public String reduce(String path , String function) // apply the function the return the result folder path
    {

        return null ;
    }

}