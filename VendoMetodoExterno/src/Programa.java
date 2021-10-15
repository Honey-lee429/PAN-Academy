import java.lang.reflect.Method;

public class Programa {
	public static void main(String[] args) {
		//para tornar o m�todo privado pegarNome acess�vel
		try 
		{
			//chama a classe  e coloca ela no objetinho
			Object objetinho = Class.forName("Pessoa").newInstance();
			
			//chama o m�todo e coloca ela do metodinho
			Method metodinho = objetinho.getClass().getDeclaredMethod("pegarNome", String.class);
			
			//metodinho torna-se acess�vel
			metodinho.setAccessible(true);
			
			String nome = (String) metodinho.invoke(objetinho, "");
			System.out.println(nome);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
