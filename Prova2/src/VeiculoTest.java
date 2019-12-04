import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VeiculoTest {

    @Test
    public void testValidaAno() {
        System.out.println("testValidaAno");
        Veiculo instance = new Veiculo(null, 0, 0, null) {
			
			@Override
			public boolean isImportado() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public float getValorIPVA() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getCodigo() {
				// TODO Auto-generated method stub
				return null;
			}
		};
        assertEquals(true, instance.isImportado());
    }
}
