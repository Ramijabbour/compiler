import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import java.io.*;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

import java.util.ArrayList;

public class launch {
    public static ArrayList Data_Types = new ArrayList() ;
    public static void main(String []args)
    {
        //save_ess();
        try {
            Load_Data_Types();
            String source = "test.txt";
            CharStream cs=fromFileName(source);
            gLexer lexer = new gLexer(cs);
            CommonTokenStream token =new CommonTokenStream(lexer);
            gParser parser= new gParser(token);
            ParseTree tree = parser.program();
            Visitor visit = new Visitor();
            visit.visit(tree);

            SymbolTable s= new SymbolTable();
            s.visit(tree);
            s.printTable();
            //System.out.println("after visit :: ");
           //Load_Data_Types();
           // v.print_table();
            //Ast.draw_ast();
        } catch (IOException e) {
            System.out.println("exception occured");
            e.printStackTrace();
        }
}

    public static void Save_Data_Types(Data_Type DT )
    {
        try{
            Data_Types.add(DT);
            FileOutputStream fos = new FileOutputStream("src\\data_types.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(Data_Types);
            oos.close();
            fos.close();
        }
        catch (Exception e )
        {
            System.out.println(e.fillInStackTrace());
            System.out.println("error writing object in Data_Types.ser");
        }

    }

    public static void Load_Data_Types()
    {
        try{
            FileInputStream fin =  new FileInputStream("src\\data_types.ser");
            ObjectInputStream ois = new ObjectInputStream(fin);
            ArrayList Temp = (ArrayList)ois.readObject();
            for(int i = 0 ; i < Temp.size() ; i ++ )
            {
                Data_Type temp2 = (Data_Type)Temp.get(i);
                Data_Types.add(temp2);
                temp2.print_type();
            }
            ois.close();
            fin.close();
        }catch(Exception e )
        {
            System.out.println(e.fillInStackTrace());
            System.out.println("error loading data types from Data_Types.ser");
            System.out.println("at function : Load_Data_Types()");
        }
    }

    public static void save_ess()
    {
        Data_Type t1,t2,t3,t4 ;
        t1 = new Data_Type("int","integer number","","");t2 = new Data_Type("real","float number","","");
        t3 = new Data_Type("string","array of characters","","");t4 = new Data_Type("bool","Boolean value","","");
        Save_Data_Types(t1); Save_Data_Types(t2);Save_Data_Types(t3);Save_Data_Types(t4);
    }

}
