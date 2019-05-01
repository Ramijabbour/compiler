import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Shuffle_output implements Serializable{
    ArrayList Entries ;

    Shuffle_output()
    {
        Entries = new ArrayList<Shuffle_Entry>();
    }

    public int find_key(String key)
    {
        for(int i = 0 ; i < Entries.size() ; i ++)
        {
            Shuffle_Entry se = (Shuffle_Entry)Entries.get(i);
            if(se.key.equals(key))
            {
                return i ;
            }
        }
        return -1 ;
    }


    public void shuffle_folder(String final_path , String folder_path ,String File_name)//get the entries from final_path and store shuffle output in folder path
    {
        BufferedReader fileReader = null;
        File dir = new File(folder_path+"\\shuffle_out");//add unique name for each select stmt
        dir.mkdirs();
        try
        {
            String line = "";
            //Create the file reader
            fileReader = new BufferedReader(new FileReader(final_path));
            //Read the file line by line
            while ((line = fileReader.readLine()) != null)
            {
                int index = find_key(line);
                if(index == -1 )
                {
                    Shuffle_Entry SE = new Shuffle_Entry();
                    SE.key = line ;
                    SE.add_value(1);
                    Entries.add(SE);
                }
                else
                {
                    Shuffle_Entry se = (Shuffle_Entry)Entries.get(index);
                    se.add_value(1);
                }
            }
            FileOutputStream fos = new FileOutputStream(folder_path+"\\shuffle_out"+"\\"+File_name+".ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            oos.close();
            fos.close();
        }
        catch (Exception e) {
        }
        finally
        {
            try {
                fileReader.close();
            } catch (IOException e) {
            }
        }
    }

    public void Shuffle(Map_output mo)
    {
        for(int i = 0 ; i < mo.entries.size() ; i++)
        {
            Map_Entry temp = (Map_Entry)mo.entries.get(i);
            int index = find_key(temp.key);
            if(index == -1 )
            {
                Shuffle_Entry SE = new Shuffle_Entry();
                SE.key = temp.key ;
                SE.add_value(1);
                Entries.add(SE);
            }
            else
            {
                Shuffle_Entry se = (Shuffle_Entry)Entries.get(index);
                se.add_value(1);
            }
        }
    }

    public void get_entries()
    {
        for(Object temp : Entries )
        {
            Shuffle_Entry se = (Shuffle_Entry)temp;
            se.print_list();
        }
    }


    public Map_Entry do_operation(Shuffle_Entry shuffle_entry,String operation)
    {
        Map_Entry mo = new Map_Entry() ;
        mo.key = shuffle_entry.key ;
        switch (operation)
        {
            case "sum":
                int x = 0 ;
                for(int i = 0 ; i < shuffle_entry.values.size() ; i ++ )
                {
                    x += (int)shuffle_entry.values.get(i);
                }
                mo.value = x ;
                break ;
            case "avg":
                int sum = 0 ; float avg  ;
                for(int i = 0 ; i < shuffle_entry.values.size() ; i ++ )
                {
                    sum += (int)shuffle_entry.values.get(i);
                }
                avg = sum / shuffle_entry.values.size() ;
                mo.value = (int)avg ;
                break ;
        }
        return mo ;
    }

    public void Reduce(String operation , String Folder_Path)
    {
        Map<String,Integer> Reduce_out = new HashMap<>();
        File folder = new File(Folder_Path);
        File[] listOfFiles = folder.listFiles();
        for (File listOfFile : listOfFiles)
        {
            String in_path = "" ;
            in_path = listOfFile.getPath();
            try{
                FileInputStream fin =  new FileInputStream(in_path);
                ObjectInputStream ois = new ObjectInputStream(fin);
                Shuffle_output Temp = (Shuffle_output)ois.readObject();
                ois.close();
                fin.close();
                for(int i = 0 ; i < Temp.Entries.size();i++)
                {
                    Shuffle_Entry shuffle_entry = (Shuffle_Entry)Temp.Entries.get(i);
                    Map_Entry mo = do_operation(shuffle_entry , operation);
                    Reduce_out.put(mo.key,mo.value);
                }

            }
            catch(Exception e)
            {
                System.out.println(e.fillInStackTrace());
                System.out.println("error loading data types from shuffle.ser");
                System.out.println("at function : Shuffle_output->reduce()");
            }
        }
        System.out.println(Reduce_out);
    }

}
