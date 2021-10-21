import java.util.HashMap;

public class HashFor {

	public static void main(String[] args) {
		HashMap<String, String> capitais = new HashMap<String, String>();
		capitais.put("inglaterra", "Londres");
		capitais.put("alemanha", "berlin");
		capitais.put("brasil", "brasilia");
		
		
		for (String i : capitais.keySet()) {
			if(i != "inglaterra") {
				System.out.println(i);
			}
		}
	}

}
