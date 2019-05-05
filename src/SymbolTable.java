import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SymbolTable extends gBaseVisitor<Object>{

	private Scope root ; // the root scope
	private Scope current; // current scope
	
	boolean debug = false;	
	
	public SymbolTable() {
		this.root = new Scope(null);
		this.current = root;
	}


	@Override public Object visitVarss(gParser.VarssContext ctx)
	{
		boolean putInTable=true,existInParameters=false;

		Record r =new Record(ctx.column_name().getText(),ctx.dtypee().getText()) ;

		//vars and parameters  and tow parameters and parameters used in scope
		for (int i = 0; i < current.containingMethod.paramNumber; i++)
			if (current.containingMethod.containParameter(i, r)) {
				try {
					if (ctx.dtypee().error().getText() != null)
					{
						putInTable = false;
						existInParameters=true;
					}
				}
				catch (Exception e){
					System.err.println("error the parameters vars "+ ctx.column_name().getText()+"  is already declared");
					System.exit(-1);
				}


			}
			// tow vars in same scope
			if (current.exist(ctx.column_name().getText()) ) {
				try {

					if (ctx.dtypee().error().getText() != null)
					{
						putInTable = false;
					}
				}
				catch (Exception e){
					System.err.println("error the variable "+ ctx.column_name().getText()+ " is already declared");
					System.exit(-1);
				}

			}
					//not exist any where
				else if (!current.exist(ctx.column_name().getText()) && !existInParameters)
					{
						try {

				if (ctx.dtypee().error().getText() != null )
				{
					System.err.println("error the variable  "+ ctx.column_name().getText()+"  undeclared");
					System.exit(-1);
				}
			}
			catch (Exception e){
				putInTable=true;
			}

		}

		if(putInTable)
			put(ctx.column_name().getText(), r);
			//System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
			//root.printScope();


			return visitChildren(ctx);
			}


	@Override public Object visitFunction_stmnt(gParser.Function_stmntContext ctx)
	{

		setCurrentScopeNameAndType(ctx.function_name().getText(),ctx.return_type().getText());
		MethodRecord m = new MethodRecord(ctx.function_name().getText(),ctx.return_type().getText());
		setCurrentScopeFunction(m);
		//current.containingMethod.exist("i");

		return visitChildren(ctx);
	}


	@Override public Object visitFunction_end(gParser.Function_endContext ctx) {
		exitScope();
			return visitChildren(ctx);
	}

	@Override public Object visitPars(gParser.ParsContext ctx)
	{

		Record r= new Record(ctx.column_name().getText(),ctx.dtypee().getText());
		for (int i = 0 ; i<current.containingMethod.paramNumber;i++)
		if(current.containingMethod.containParameter(i,r)) {

		System.err.println("error the parameters is already declared");
		System.exit(-1);
	}
		current.containingMethod.addParameter(r);
		System.out.println(current.containingMethod.numberOfParameters());
		current.containingMethod.printParameters();


		return visitChildren(ctx);
	}

	@Override public Object visitFor_loop(gParser.For_loopContext ctx)
	{
		setCurrentScopeNameAndType("for",current.scopeName);
		Record r =new Record(ctx.column_name(0).getText(),ctx.for_type().getText());
		if(current.exist(ctx.column_name(0).getText()))
		{
			System.err.println("the variable    "  + ctx.column_name(0).getText()+ "    (for) is already declared");
			System.exit(-1);
	    }
		put(ctx.column_name(0).getText(),r);
		return visitChildren(ctx);
	}
	@Override public Object visitEnd_for(gParser.End_forContext ctx)
	{
		exitScope();
		return visitChildren(ctx);
	}


	@Override public Object visitIf_stmt(gParser.If_stmtContext ctx)
	{
		setCurrentScopeNameAndType("if",current.scopeName);


		if(!current.exist(ctx.if_tsql_stmt().bool_expr().bool_expr_atom().bool_expr_binary().expr(0).expr_atom().ident().getText()))
		{
			System.err.println("The variable in (if ) not declared ");
			System.exit(-1);
		}
		return visitChildren(ctx);
	}

	@Override public Object visitEnd_if(gParser.End_ifContext ctx)
	{
		exitScope();
		return visitChildren(ctx);
	}

	@Override public Object visitAssignment_stmt(gParser.Assignment_stmtContext ctx)
	{
		if(!current.exist(ctx.assignment_stmt_item(0).assignment_stmt_single_item().ident().getText()))
		{
			System.err.println("the variable "+ ctx.assignment_stmt_item(0).assignment_stmt_single_item().ident().getText()+" undeclared already  ");
			System.exit(-1);

		}
		//for(int i = 0 ; i < ctx.assignment_stmt_item(0).assignment_stmt_single_item().expr().)
		if(!current.exist(ctx.assignment_stmt_item(0).assignment_stmt_single_item().expr().expr(0).expr_atom().ident().getText()))
		{
			System.err.println("the variable "+ ctx.assignment_stmt_item(0).assignment_stmt_single_item().expr().expr(0).expr_atom().ident().getText()+" undeclared already  ");
			System.exit(-1);

		}


		return visitChildren(ctx);
	}

	@Override public Object visitStmt(gParser.StmtContext ctx)

	{

		return visitChildren(ctx);
	}


	public String getCurrentClassName(){
		return this.current.getContainingClass().getId();
	}
	
	public String getCurrentScopeName(){
		return this.current.getScopeName();
	}
	
	public String getCurrentScopeType(){
		return this.current.getScopeType();
	}
	
	public void setCurrentScopeNameAndType(String scopeName, String scopeType){
		enterScope();
		this.current.setScopeNameAndType(scopeName, scopeType);
	}

	// create a new scope if necessary
	public void enterScope() {
		current = current.nextChild();
	}

	public void setCurrentScopeClass(ClassRecord containingClass) {
		this.current.setContainingClass(containingClass);
	}

	public void setCurrentScopeFunction(MethodRecord containingMethod) {
		this.current.setContainingMethod(containingMethod);
	}


	public void exitScope() {
		current = current.getParent();
	}

	public void put(String key, Record item) {
		current.put(key, item);
	}

	public Record lookup(String key) {
		if(debug)System.out.println("\t Current SCOPE: "+current.getScopeName()+" | "+current.getScopeType());
		return current.lookup(key);
	}	
	
	
	// diagnostics
	public void printTable() {
		System.out.println("\n\t\tPrinting the Symbol Table:\n");
		System.out.printf("%s %n", "+-------------------------------------------------------------------------------------------+");
		System.out.printf("%" + 18 + "s %" + 32 + "s %" + 32 + "s %n", "ID", "RECORD", "SCOPE");
		System.out.printf("%s %n", "+-------------------------------------------------------------------------------------------+");
		root.printScope();
		System.out.printf("%s %n", "+-------------------------------------------------------------------------------------------+");
	}

	private void printLine(String id, String record, String scope) {
		System.out.printf("%" + 20 + "s %" + 32 + "s %" + 35 + "s %n", id, record, scope);
	}

	// called before each traversal
	public void resetTable() {
		root.resetScope();
	}

	// iterate the tree and print the RECORDS
	public void debugScopeTree(){
		root.debugScope();			
	}
	
	// iterate the scope tree and print everything
	public void printScopeTree(){
		System.out.println("\n\n");
		root.printScopeDebug();
	}
	
	
	private class Scope {
		private int next = 0; // next child to visit
		private Scope parent; // parent scope
		// children scopes
		private ArrayList<Scope> children = new ArrayList<Scope>();
		// symbol to record map
		private Map<String, Record> records = new HashMap<String, Record>();
		ClassRecord containingClass = new ClassRecord("prog", "program");

		MethodRecord containingMethod = new MethodRecord("root", "root");

		// for visual identification
		String scopeName = "";  
		String scopeType = "";
		
		public Scope(Scope parent) {
			this.parent = parent;
		}



		public void setScopeNameAndType(String scopeName, String scopeType) {
			this.scopeName = scopeName;
			this.scopeType = scopeType;
		}
		
		public String getScopeName(){
			return this.scopeName;
		}
		 		
		public String getScopeType(){
			return scopeType;
		}
		
		public ClassRecord getContainingClass() {
			return containingClass;
		}

		public void setContainingClass(ClassRecord containingClass) {
			this.containingClass = containingClass;
		}

		public void setContainingMethod(MethodRecord containingMethod) {
			this.containingMethod = containingMethod;
		}

		public Record getMethod(String methodName){
			return this.containingClass.getMethod(methodName);
		}
		
		public void printScope() {
			// print all the containing records
			Iterator it = records.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry pair = (Map.Entry) it.next();
				Record temp = (Record) pair.getValue();
				printLine(pair.getKey().toString(), temp.getId() + " - " + temp.getType(), scopeName+" [ "+scopeType+" ]");
			}
			// print children
			for (Scope scopeIt : children) {
				scopeIt.printScope();
			}
		}

		public void printScopeDebug(){			
			System.out.println("SCOPE: "+scopeName+" | "+scopeType+" \tCLASS: "+containingClass.getId());
			System.out.println(" RECORDS: ");
			Iterator it = records.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry pair = (Map.Entry) it.next();
				Record temp = (Record) pair.getValue();
				if(temp instanceof ClassRecord){
					System.out.println("\t CLASS RECORD");
				}else if(temp instanceof MethodRecord){
					System.out.println("\t METHOD RECORD");
				}else{
					System.out.println("\t VAR RECORD");
				}
				printLine(pair.getKey().toString(), temp.getId() + " - " + temp.getType(), scopeName+" [ "+scopeType+" ]");							
			}
			System.out.println("-");
			for (Scope scopeIt : children) {
				System.out.println(scopeName+" | "+scopeType+" -> CHILDREN: "+scopeIt.getScopeName()+" | "+scopeIt.getScopeType());
				scopeIt.printScopeDebug();
			}
		}
		
		// add a new record to the current scope
		public void put(String key, Record item) {
			records.put(key, item);
		}

		public Scope nextChild() {
			Scope nextChild;
			if (next >= children.size()) {
				nextChild = new Scope(this); // create a new Scope passing the parent scope
				children.add(nextChild);
			} else {
				// child exists
				nextChild = (Scope) children.get(next); // visited the next
														// child (Scope)
			}
			next++;
			return nextChild;
		}

		public Record lookup(String key) {
			System.out.println("***************************************************"+records.size());
			if(key.equals("this")){ // 'this' case

				System.out.println("1*****************");
				return containingClass;
			}
			if (records.containsKey(key)) {

				// is the key in current scope?
				System.out.println(" 2*********************");
				Record rec = (Record) records.get(key);
				if(debug)System.out.println("\tRecord found on: "+scopeName+" [ "+scopeType+" ]");
				return rec;
			} else {
				System.out.println("3       ++++++++++++++++++++++++++");
				// move the scope to parent scope
				if (parent == null) {
					return null; // identifier is not contained
				} else {
					return parent.lookup(key); // send the req to parent
				}
			}
		}


public boolean exist(String key)
{
			if (records.containsKey(key)) {

				// is the key in current scope?
				Record rec = (Record) records.get(key);
				debug=true;
				if(debug)System.out.println("\tRecord found on: "+scopeName+" [ "+scopeType+" ]");
				return true;
			} else {
				// move the scope to parent scope
				if (parent == null) {
					return false; // identifier is not contained
				} else {
					 return  parent.exist(key);

					 // send the req to parent
				}
			}
		}


		public void resetScope() {
			next = 0; // first child to visit next
			for (int i = 0; i < children.size(); i++) {
				((Scope) children.get(i)).resetScope();
			}
		}

		public Scope getParent() {
			return this.parent;
		}
	
		public void debugScope(){
			// print the records of the scopes			
			Iterator it = records.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry pair = (Map.Entry) it.next();
				Record temp = (Record) pair.getValue();				
				if(temp instanceof ClassRecord){
					System.out.println("\n\nCLASS RECORD FOUND : "+temp.id);
					ClassRecord instance = (ClassRecord)temp;
					instance.printMethods();
					instance.printFieldDeclarations();
				}				
			}
			// print children
			for (Scope scopeIt : children) {
				scopeIt.debugScope();
			}
		}
	}
}
