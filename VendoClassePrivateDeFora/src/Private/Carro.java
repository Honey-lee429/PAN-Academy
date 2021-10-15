package Private;

public class Carro {
	private String nome;
		
		void exibeVelocidade() {
			System.out.println("A velocidade de uma " + nome + " é de 390km");
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
		
		
		public String getName() {
			return this.nome;
		}
		
}
