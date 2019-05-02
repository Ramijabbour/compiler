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
                        if(Folder_Path != null) {
                            File folder = new File(Folder_Path);
                            File[] listOfFiles = folder.listFiles();
                            String in_path = "";
                            File out_dir = new File(Folder_Path + "\\out");//add unique name for each select stmt
                            out_dir.mkdirs();
                            for (File listOfFile : listOfFiles) {
                                if (listOfFile.isFile()) {
                                    System.out.println("File " + listOfFile.getName());
                                    in_path = listOfFile.getPath();
                                    //write_file_buffer(Tokens,"E:\\رابعة\\Compiler2\\intellij_out\\test_table1\\out\\","star_out");
                                    //print the output
                                    int vars_num = get_vars_num(table_name);int counter = 1 ;
                                    Data_Type select_header  = table_name_exist(table_name);
                                    for(int i = 0 ; i < select_header.names.size() ; i ++ )
                                    {
                                        String temp = (String)select_header.names.get(i);
                                        System.out.print(temp+" |");
                                    }
                                    System.out.println();
                                    separate_star(in_path, ",");
                                    /*for(int i = 0 ; i<Tokens.size() ; i ++ )
                                    {
                                        String temp = (String)Tokens.get(i);
                                        System.out.print(temp+" | ");
                                        if(counter % vars_num == 0 ){
                                            System.out.println();}
                                        counter++ ;
                                    }*/
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
                int[] indexes = get_indexes(select_columns,table_name);
                int vars_count = get_vars_num(table_name);
                String in_path = "";String out_path = "" ;
                ArrayList tokens = new ArrayList() ;
                Shuffle_output SO = new Shuffle_output();
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
                            //try {
                              //  Map(indexes, tokens, vars_count, listOfFile.getName(), Folder_Path+"\\out");
                                //print_Map(Folder_Path+"\\out",select_columns);
                           // }catch(Exception E ){
                             //   System.out.println("error in Visitor//MapFunction");
                               // E.printStackTrace();
                            //}
                            //   String Final_Path = out_dir+"\\"+"Map_Out_"+listOfFile.getName()+".txt";
                            //     SO.shuffle_folder(Final_Path,Folder_Path,listOfFile.getName());
                        }
                    }
                    // SO.Reduce("sum", Folder_Path+"\\shuffle_out");
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

    ///map reduce code starts here

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

    public int get_vars_num(String DTName)
    {
        for(int i = 0 ; i < launch.Data_Types.size() ; i++)
        {
            Data_Type dt = (Data_Type)launch.Data_Types.get(i);
            if(dt.name.equalsIgnoreCase(DTName))
            {
                return dt.vars.size() ;
            }
        }
        return -1 ;
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

// test comment
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


    public boolean exist(String path )
    {

        return (new File(path)).exists();
    }

    public void write_file_buffer(ArrayList Tokens ,String path  , String ext) throws IOException
    {
        String Final_Path = path+"\\"+ext+".txt";
        File file = new File(Final_Path);
        FileWriter fr = new FileWriter(file, true);
        BufferedWriter br = new BufferedWriter(fr);
        for(Object s : Tokens )
        {
            br.write((String)s);
        }
        br.newLine();
        br.close();
        fr.close();
    }

    public void Map(int[] index ,ArrayList tokens,int num ,String filename , String folder_path ) throws IOException
    {
        for(int i = 0 ; i <tokens.size()/ num; i+=num)
        {
            ArrayList Tokens_Temp = new ArrayList() ;
            for(int j = 0 ; j < index.length ; j ++)
            {
                //if(i == index[j] || i%num == index[j])
                //{
               // System.out.println(tokens.get(i+index[j]));
                    Tokens_Temp.add(tokens.get(i+index[j]));
                //}
            }
            if(!Tokens_Temp.isEmpty())
                write_file_buffer(Tokens_Temp,folder_path,"Map_Out_"+filename);
        }
        System.out.println("");
    }

    public void print_Map(String folder_path ,ArrayList select_list )//to print the map output
    {
        File folder = new File(folder_path);
        File[] listOfFiles = folder.listFiles();
        File out_dir = new File(folder_path);//add unique name for each select stmt
        out_dir.mkdirs();
        for (File listOfFile : listOfFiles) {
            if (listOfFile.isFile()) {
                BufferedReader fileReader = null;
                try {
                    System.out.println();
                    String line = "";
                    int counter = 0;
                    fileReader = new BufferedReader(new FileReader(listOfFile.getPath()));
                    for (int i = 0; i < select_list.size(); i++) {
                        String temp = (String) select_list.get(i);
                        System.out.print(temp + " ");
                    }
                    System.out.println();
                    while ((line = fileReader.readLine()) != null)
                    {
                        System.out.print(line + " ");
                        counter++;
                        if (counter % select_list.size() == 0) {
                            System.out.println();
                        }

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        fileReader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    /// mapreduce code end
}