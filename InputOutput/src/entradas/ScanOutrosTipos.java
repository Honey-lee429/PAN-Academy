package entradas;

import java.util.Scanner;

public class ScanOutrosTipos {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("enter a short number /nshort - um inteiro com 16 bits, com sinal na representa��o complementar de dois; de -32.768 a 32.767\r\n"
				+ "");
		short num2 = ler.nextShort();
		System.out.println(num2);
		
		
		System.out.println("enter a lomg number /nint - um inteiro com 32 bits, com sinal na representa��o complementar de dois; de -2.147.483.648 a 2.147.483.647\r\n"
				+ "");
		long num3 = ler.nextLong();
		System.out.println(num3);
	}
}
