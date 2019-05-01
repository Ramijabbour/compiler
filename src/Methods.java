import java.util.ArrayList;


public class Methods extends Vars  {

    ArrayList pars ;
    ArrayList vars ;

    Methods()
    {
        vars = new ArrayList();
        pars = new ArrayList();
    }

    public void Add_var(Vars v )
    {
        vars.add(v);
    }
    public void Add_pars(Vars v )
    {
        pars.add(v);
    }

    public void print_method()
    {
        System.out.println("current method : " + name );
        Vars temp ;
        System.out.println("pars : ");
        for(int i = 0 ; i < pars.size() ; i++)
        {
            temp = (Vars)pars.get(i);
            temp.print_var();
        }
        System.out.println("vars : " );
        for(int i = 0 ; i < vars.size() ; i++)
        {
            temp = (Vars)vars.get(i);
            temp.print_var();
        }
    }

}
