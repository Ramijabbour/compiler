import java.util.ArrayList ;
import java.util.Stack;

public class Symbol_Table extends gBaseVisitor<Object>{

    int counter = 0 ,size  = 10 , leveli = 0  , levelj  = 0  ;
    Stack scopes ;
    ArrayList table[][];
    int test_array[][] ;
    Methods current_scope = new Methods();
    Methods m = new Methods();

    Symbol_Table()
    {
        test_array = new int[10][10];
        table = new ArrayList[10][10];
        for(int i = 0 ; i < table.length ; i++)
            for(int j = 0 ; j < table.length ; j++)
            {
               table[i][j] = new ArrayList();
            }
    }

    void increase_array()
    {
        ArrayList temp[][] = new ArrayList[size][size];
        int sizei = size ;
        for(int i = 0 ; i < size ; i++)
            for(int j = 0 ; j < size ; j++)
            {
               temp[i][j] = table[i][j];
            }
            size +=5 ;
            table = new ArrayList[size][size];
        for(int i = 0 ; i < sizei ; i++)
            for(int j = 0 ; j < sizei ; j++)
            {
                table[i][j] = temp[i][j];
            }
    }


    @Override public Object visitGlobal_scope(gParser.Global_scopeContext ctx)
    {
        scopes = new Stack() ;
        current_scope.name = "global";
        current_scope.dt = "";
        scopes.push(current_scope);
        return visitChildren(ctx);
    }

    @Override public Object visitVarss(gParser.VarssContext ctx)
    {
        Methods current = (Methods)scopes.pop();
        String ttype = ctx.dtypee().getText();
        String tname = ctx.column_name().getText();
        //System.out.println(ttype);
        //System.out.println(tname);
        Vars tt = new Vars(tname,ttype);
        current.Add_var(tt);
        scopes.push(current);
        //add_var(tt);

        return visitChildren(ctx);
    }

    @Override public Object visitFunction_stmnt(gParser.Function_stmntContext ctx)
    {
        leveli++ ;
        //System.out.println("function visited" + counter );
        String return_type = ctx.return_type().getText();
        //System.out.println(return_type);
        String method_name = ctx.function_name().getText();
        //System.out.println(method_name);
        Methods s = new Methods() ;
        s.name = method_name ; s.dt = return_type;
        scopes.push(s);
        counter ++ ;
        return visitChildren(ctx);
    }

    @Override public Object visitFunction_end(gParser.Function_endContext ctx)
    {

        Methods temp = (Methods) scopes.pop();
        temp.print_method();
        table[leveli][levelj].add(temp);
        test_array[leveli][levelj] = 1 ;
        if(current_scope.name == "global")
        {for(int i = 0 ; i < size ; i ++ )
        {table[0][i].add(temp);
            test_array[0][i] = 1;}
        }
        leveli-- ;
        levelj++ ;
        return visitChildren(ctx);
    }


    @Override public Object visitPars(gParser.ParsContext ctx)
    {
        Methods current = (Methods)scopes.pop();
        String vname = ctx.column_name().getText();
        //System.out.println(vname);
        String vtype = ctx.dtypee().getText();
        //System.out.println(vtype);
        Vars temp = new Vars(vname,vtype);
        current.Add_pars(temp);
        scopes.push(current);
        //m.Add_pars(temp);
        return visitChildren(ctx);
    }


    public void print_table()
    {
        for(int i = 0 ; i < table.length ; i++)
            for(int j = 0 ; j < table.length ; j++)
            {
               printarray(table[i][j]);
            }
        printarray2(test_array);
    }
    public void printarray(ArrayList e )
    {
        for(int i = 0 ; i < e.size() ; i ++ )
        {
            Methods temp = (Methods)e.get(i);
            temp.print_method();
        }
    }

    public void printarray2(int[][] e )
    {
        for(int i = 0 ; i < 10 ; i ++ )
        {
            for(int j = 0 ; j < 10 ; j ++ )
            {
            System.out.print(e[i][j]+" ");
            }
            System.out.println();
        }
    }


}
