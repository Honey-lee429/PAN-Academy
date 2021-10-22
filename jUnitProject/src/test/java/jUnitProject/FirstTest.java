package jUnitProject;

import org.junit.After;
import org.junit.Test;

public class FirstTest {
	@Test
	public void firstMethod() { 
			
	}
	
//	@Test
//	public String secondMethod() {
//		method must be void
//	}
	
	
//	@Test
//	private void thirdMethod() {
//		method should be public	
//	}
	
//	@Test
//	protected void fourthMethod() {
//		method should be public
//	}
	
	@After
	public void comSysOut() {
		System.out.println("teste 1 foi executado");
	}
	
	
	@Test
	public void comSysOut2() {
		System.out.println("teste 2 foi executado");
	}
	
	
	public void metodoNaoETeste() {
		System.out.println("este método não roda");
	}
	
	
}
