package pilhas;

import java.util.Stack;

public class Pilhas {

	public static void main(String[] args) {
		//LIFO
		Stack<Integer> pilha = new Stack<>();
		
		boolean result = pilha.empty();
		
		
		System.out.println("a pilha está vazia? " + result);
		
		pilha.push(68);
		pilha.push(118);
		pilha.push(90);
		pilha.push(720); //LIFO 720 é o ultimo a entrar e o primeiro a sair
		pilha.pop();
		System.out.println("elementos do meu stack: " + pilha);
		
		result = pilha.empty();
		System.out.println("está vazio? " + result);
	}
	


}
