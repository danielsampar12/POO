import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AutomovelTest {


	
    @Test
    public void testSetImportadoIsImportado01() {
        System.out.println("testSetImportadoIsImportado01");
        Automovel instance = new Automovel("a", 2019, 10000, "AUT1", false);
        instance.setImportado(true);
        assertEquals(true, instance.isImportado());
    }
    
    @Test
    public void testSetImportadoIsImportado02() {
        System.out.println("testSetImportadoIsImportado02");
        Automovel instance = new Automovel("a", 2019, 10000, "AUT1", true);
        instance.setImportado(false);
        assertEquals(false, instance.isImportado());
    }
    
    @Test
    public void testGetIpvaIsImportado01() {
    	System.out.println("testGetIpva01");
    	Automovel instance = new Automovel("a", 2019, 10000, "AUT1", false);
    	instance.setImportado(true);
    	assertEquals(0.4f , instance.getValorIPVA());
    }
    
    @Test
    public void testGetIpvaIsImportado02() {
    	System.out.println("testGetIpva01");
    	Automovel instance = new Automovel("a", 2019, 10000, "AUT1", true);
    	instance.setImportado(false);
    	assertEquals(0.2f , instance.getValorIPVA());
    }
    
    @Test
    public void testGetIpvaSetAno01() {
    	System.out.println("testGetIpvaGetAno01");
    	Automovel instance = new Automovel("a", 2019, 10000, "AUT1", false);
    	instance.setAno(2006);
    	assertEquals(0.2f , instance.getValorIPVA());
    }
    
    @Test
    public void testGetIpvaIsImportadoSetAno01() {
    	System.out.println("testGetIpva01");
    	Automovel instance = new Automovel("a", 2019, 10000, "AUT1", false);
    	instance.setImportado(true);
    	instance.setAno(2000);
    	assertEquals(0.4f , instance.getValorIPVA());
    }
    
    @Test
    public void testGetIpvaIsImportadoSetAno02() {
    	System.out.println("testGetIpva01");
    	Automovel instance = new Automovel("a", 2000, 10000, "AUT1", true);
    	instance.setImportado(false);
    	instance.setAno(2019);
    	assertEquals(0.2f , instance.getValorIPVA());
    }
    @Test
    public void testGetCodigo() {
    	System.out.println("testGetCodigo");
    	Automovel instance = new Automovel("a", 2000, 10000, "ABC", true);
    	assertEquals("AUT" , instance.getCodigo());
    }
}
