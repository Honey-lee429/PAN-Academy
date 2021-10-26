package calculos;

public class PegarMaxMin {
	public static void main(String[] args) {
		
		//aquecimento 1
		System.out.println("Maximo: " + Math.max(5, 10));
		System.out.println("Minimo: " + Math.min(5, 10));
		
		/**
		 * ceil arrendonda para cima
		 * floor arredonta para baixo
		 */
		double a = 3.5; 
		System.out.println("ceil arr. para cima: " + Math.ceil(a));
		System.out.println("floor arr. para baixo: " + Math.floor(a));
		
		int[] arr = {4,2,5,3,6};
		int max = arr[0];
		
		
		for (int i = 1; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		
		System.out.println("Maior número do array: " + max);
	}
}
