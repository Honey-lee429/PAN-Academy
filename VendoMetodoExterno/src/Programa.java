import java.lang.reflect.Method;

public class Programa {
	public static void main(String[] args) {
		//para tornar o método privado pegarNome acessível
		try 
		{
			//chama a classe  e coloca ela no objetinho
			Object objetinho = Class.forName("Pessoa").newInstance();
			
			//chama o método e coloca ela do metodinho
			Method metodinho = objetinho.getClass().getDeclaredMethod("pegarNome", String.class);
			
			//metodinho torna-se acessível
			metodinho.setAccessible(true);
			
			String nome = (String) metodinho.invoke(objetinho, "");
			System.out.println(nome);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
