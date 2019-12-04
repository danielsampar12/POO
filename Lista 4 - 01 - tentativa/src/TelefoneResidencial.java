
public class TelefoneResidencial extends Telefone{
	private boolean conexaoInternet;
	private final float VALOR_BASICO = 15;
	
	public String exibir() {
		return "Telefone residencial " + this.getNumero()
				+	" do cliente " + this.getNomeUsuario()
				+(this.isConexaoInternet()?" sem " : " com ")+ " conex�o � internet"
				+ "\n instalado em " + this.getEndereco()
				+ " com o valor b�sico de R$" + this.getValorBasico();
	}
	
	public float getValorBasico() {
		return VALOR_BASICO; 
	}
	
    public boolean isConexaoInternet() {
        return conexaoInternet;
    }

    public void setConexaoInternet(boolean conexaoInternet) {
        this.conexaoInternet = conexaoInternet;
    }
}
