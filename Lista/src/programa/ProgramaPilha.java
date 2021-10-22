package programa;

import java.util.Stack;

public class ProgramaPilha extends PilhaRepo {
	public static void main(String[] args) {
		Stack<String> pilha = new Stack<>();
		System.out.println("stack: " + pilha);
		
		inserindoPush(pilha, "caixa acustica 110");
		inserindoPush(pilha, "caixa acustica 210");
		inserindoPush(pilha, "note");
		deletandoPop(pilha);
		deletandoPop(pilha);
	}
}
