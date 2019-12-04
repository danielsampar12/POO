/*Autor: Daniel Garcia Sampar
 * 
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class ConteinerTest {

	@Test
	public void testComparaCom01() {
		System.out.println("TestComparaCom");
		Conteiner c1 = new Conteiner(0, null, 0, 0);
		c1.setCapacidadeMaxima(2500000);
		
		Conteiner c2 = new Conteiner(0, null, 0, 0);
		c2.setCapacidadeMaxima(1640750);
		
		if(c1.getCapacidadeDisponivel() == c1.getCapacidadeMaxima() 
			&& c2.getCapacidadeDisponivel() == c2.getCapacidadeMaxima()) {
			assertEquals(-1, c2.comparaCom(c1));
		}
		
		assertEquals(1, c1.comparaCom(c2));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConsistir() {
		System.out.println("TestConsistir");
		Conteiner instance = new Conteiner( 0, null, 0, 0);
		VolumeDeCarga v = new VolumeDeCarga();
		VolumeDeCarga v2 = new VolumeDeCarga();
		v.setValor(1500000);
		v2.setValor(200);
		instance.setValorSeguradora(1500100);
		instance.addVolume(v);
		instance.addVolume(v2);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConsistir02() {
		System.out.println("TestConsistir");
		Conteiner instance = new Conteiner(0, null, 0, 0);
		VolumeDeCarga v1 = new VolumeDeCarga();
		instance.setCapacidadeMaxima(4000);
		v1.setAltura(3);
		v1.setLargura(2);
		v1.setProfundidade(1);
		instance.addVolume(v1);
	}
	


}
