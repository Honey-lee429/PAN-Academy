package pacote_externo;

import pacote_interno.Produto;

public class UTestePacoteExterno {
	public static void main(String[] args) {
		Produto prodLuva = new Produto();
		prodLuva.setNomeProd("Luva");
		System.out.println(prodLuva.getNomeProd());
	}
}
