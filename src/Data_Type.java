
import java.io.Serializable;
import java.util.ArrayList ;

public class Data_Type implements Serializable {

    public String name,Type,Tname ;
    ArrayList vars ;
    ArrayList names ;
    String Path_in_memory ;
    String delimiter ;


    Data_Type()
    {
        names = new ArrayList() ;
        vars = new ArrayList();
    }

    Data_Type(String na,String Ty,String path,String DELIMITER )
    {
        names = new ArrayList() ;
        vars = new ArrayList();
        name = na ; Type = Ty ;
        Path_in_memory = path ;
        delimiter = DELIMITER ;
    }


    public boolean set_type(ArrayList vars , ArrayList names )
    {
        for(int i = 0 ; i < vars.size() ; i++)
        {
            if(!find_var(vars.get(i).toString()))
                return false ;
        }
        if( check_name_repeat(names) )
        {
            this.vars = vars ;
            this.names = names;
            return true ;
        }
        return false ;
    }

    public boolean check_name_repeat(ArrayList namess )
    {
        for(int i = 0 ; i < namess.size() ; i++)
        {
            String temp = namess.get(i).toString();
            if(names.contains(temp))
                return false ;
            else
                names.add(temp);
        }
        return true ;
    }

    public boolean find_var(String s )
    {
        for(int i = 0 ; i < launch.Data_Types.size() ; i++)
        {
            Data_Type temp = (Data_Type)launch.Data_Types.get(i);
            if(temp.name.equals(s))
                return true  ;
        }
        return false ;
    }

    public void print_type()
    {
        System.out.println("name : "+ name + " Type : " + Type + " Delimiter : "+delimiter + "path in memory : "+Path_in_memory );
        for(int i = 0 ; i<vars.size() ; i ++ )
        {
            String s = (String)names.get(i);
            System.out.print(s+" ");
            String temp = (String)vars.get(i);
            System.out.println(temp);
        }
    }

    public boolean compare_name(ArrayList select_columns) {
        for(int i = 0 ; i < select_columns.size() ; i ++ )
        {
           if(!names.contains(select_columns.get(i)))
           {
               return false ;
           }
        }
        return true  ;
    }
}
