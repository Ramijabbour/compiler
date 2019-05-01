public class Map_Entry {
    String key ;
    int value ;

    Map_Entry(){}
    Map_Entry(String key , int value )
    {
        this.key = key ;
        this.value = value ;
    }

    public void print_pair()
    {
        System.out.println("<"+key+","+value+">");
    }
}
