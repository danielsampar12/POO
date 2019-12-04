import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VereadorTest {

	public VereadorTest() {
	}
	
	@Test
	public void testGetIndiceTrabalho01() {
		System.out.println("GetIndiceTrbalho01");
		Vereador instance = new Vereador();
		instance.setQtdProj(20);
		double expResult = 1.22;
		double result = instance.getIndiceTrabalho();
		assertEquals(expResult, result);
		
	}
	
	@Test
	public void testGetIndiceTrabalho02() {
		System.out.println("GetIndiceTrabalho02");
		Vereador instance = new Vereador();
		instance.setQtdProj(6);
		double expResult = 1;
		double result = instance.getIndiceTrabalho();
		assertEquals(expResult, result);
		
	}
	
	@Test
	public void testGetIndiceTrabalho03() {
		System.out.println("GetIndiceTrabalho03");
		Vereador instance = new Vereador();
		instance.setQtdProj(1);
		double expResult = 0.8;
		double result = instance.getIndiceTrabalho();
		assertEquals(expResult, result);
		
	}
	
	@Test
	public void testSetNome01() {
		System.out.println("SetNome01");
		Partido instancePartido = new Partido("PSOL", 50);
		Vereador instance = new Vereador();
		instance.setNome("Sei lá");
		String expResult = "Sei lá";
		String result = instance.getNome();
		assertEquals(expResult, result);
	}
	
	

}
