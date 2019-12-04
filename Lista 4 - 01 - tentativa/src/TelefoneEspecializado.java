
public class TelefoneEspecializado extends Telefone{
	private int qtdContratada;

	public int getQtdContratada() {
		return qtdContratada;
	}

	public void setQtdContratada(int qtdContratada) {
		if(qtdContratada < 1) {
			throw new IllegalArgumentException("Valor inválido. Deve ser pelo menos 1");
		}
		this.qtdContratada = qtdContratada;
	}
	
	public float getValorBasico() {
		
		if(this.qtdContratada < 1001) {
			return 50;
		}else if(this.qtdContratada < 5001) {
			return 67.8f;
		}else if(this.qtdContratada < 10001) {
			return 98.5f;
		}else if(this.qtdContratada < 50001) {
			return 123.9f;
		}
		return 187.82f;
		
	}
	
	public String exibir() {
		return "Telefone especializado " + this.getNumero() 
				+ " do cliente " + this.getNomeUsuario()
				+ "\n instalado em " + this.getEndereco()
				+ " com valor básico de R$" + this.getValorBasico()
				+ "\n com " + this.qtdContratada + " ocorrencias contratadas.";
	}
}
