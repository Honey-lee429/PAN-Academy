import java.util.HashMap;
import java.util.Map;

public class HashFor1 {
	public static void main(String[] args) {
		Map<String, String> tabelaCursos = new HashMap<String, String>();
		tabelaCursos.put("ang", "angular9");
		tabelaCursos.put("J...", "Java");
		tabelaCursos.put("0...", "Oracle");
		
		for (Map.Entry<String, String> string : tabelaCursos.entrySet()){
			
			System.out.println(string.getKey() + " = " + string.getValue());
		{
			System.out.println("---------------");
			
			for (Map.Entry<String, String> string1 : tabelaCursos.entrySet()) {
				if (string1.getKey() == "ang") {
					System.out.println(string1.getKey() + " = " + string1.getValue());
				}
			}
		}
			
		}
	}
}
