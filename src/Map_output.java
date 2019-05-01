import java.util.ArrayList;

public class Map_output {
    ArrayList entries  ;

    Map_output()
    {
        entries = new ArrayList<Map_Entry>();
    }

    public void add_item(Map_Entry item)
    {
        entries.add(item);
    }
    public void merge_list(ArrayList another )
    {
        entries.addAll(another);
    }
    public void sort_list()
    {
        entries.sort(null);
    }
    public void print_list()
    {
        for (Object entrie : entries) {
            Map_Entry temp = (Map_Entry) entrie;
            temp.print_pair();
        }
    }

}
