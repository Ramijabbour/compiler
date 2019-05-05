import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



public class MethodRecord extends Record {

	//private ArrayList<Record> parameters = new ArrayList<>();
	private HashMap<Integer, Record> parameters = new HashMap<>();
	public  int paramNumber = 0;
	
	public MethodRecord(String id, String type) {
		super(id, type);
	}

	public void addParameter(Record parameter) {
		//this.parameters.add(parameter);
		this.parameters.put(paramNumber, parameter);
		paramNumber++;
	}

	// check if method contains parameter
	public boolean containParameter(int paramNumber,Record parameter) {		
		// hash map
		Record paramRec = parameters.get(paramNumber);
		if(parameter == null || paramRec == null)
			return false;
		return paramRec.getId().equals(parameter.getId());
	}

	public int numberOfParameters() {
		return parameters.size();
	}

	public void printParameters() {
		System.out.println("             function  parameters           ");
		System.out.print("(");
		Iterator it = parameters.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        //System.out.println(pair.getKey() + " = " + pair.getValue());
	        System.out.print(pair.getValue().toString());
	    }
		/*
		for (Record it : parameters) {
			System.out.print(it.getType() + " " + it.getId() + " ");
		}
		*/
		System.out.print(" )\n");
	}

}
