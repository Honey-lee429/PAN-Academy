import java.util.ArrayList;

public class Arrayfor {

	public static void main(String[] args) {
			ArrayList<String> pessoas = new ArrayList<>();
			pessoas.add("luiza");
			pessoas.add("gabriela");
			pessoas.add("Larcio");
			System.out.println("---------Todas pessoas----------");
			for (String gente : pessoas) {
				System.out.printf("posi??o %s\n", gente);
			}
			
			
			System.out.println("\n-------come?a com L---------");
			for (String g : pessoas) {
				if (g.charAt(0) == 'L'){
					System.out.printf("Posi??o %s\n", g);
				}
			}
			
			System.out.println("\n-------Pesosas e indices----------");
			System.out.println("Indo de um por um");
			int i = 0;
			for (String string : pessoas) {
				System.out.printf("posi??a - %d %s%n", i, string);
				i++;
			}
			
	}
}
