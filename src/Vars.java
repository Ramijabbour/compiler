public class Vars {
    String name ;
    String dt ;
    Methods scope ;

    Vars()
    {}
    Vars(String s , String d)
    {
        name = s  ; dt = d ;
    }

    public void print_var()
    {
        System.out.print("var name :"+name+" ");
        System.out.print("Type : " +dt+" ");
        System.out.println();
    }

}
