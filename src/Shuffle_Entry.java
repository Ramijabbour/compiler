import java.io.Serializable;
import java.util.ArrayList;

public class Shuffle_Entry implements Serializable {
    String key ;
    ArrayList values ;

    Shuffle_Entry()
    {
        values = new ArrayList() ;
    }
    public void set_entry_key(String key)
    {
        this.key = key ;
    }
    public void add_value(int value)
    {
        values.add(value);
    }
    public void print_list()
    {
        System.out.println("entry start : ");
        System.out.print("<"+key);
        for (Object value : values) {
            int x = (int) value;
            System.out.print(","+x);
        }
        System.out.print(">");
        System.out.println("entry end //");
    }
    public void reduce(String operation)
    {
        if(operation.equals("sum"))
        {
            int sum = 0 ;
            for(Object temp : values)
            {sum += (int)temp;}
        }
        else if (operation.equals("avg"))
        {
            int sum = 0 ;
            float avg ;
            for(Object temp : values)
            {sum += (int)temp;}
            avg = sum/values.size() ;
        }
        //all the cases we need
    }
}
