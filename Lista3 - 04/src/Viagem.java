
public class Viagem {

	private int duracao;
	private double kmRodados;
	private double venda;
	
	public Viagem (int duracao, double kmRodados, double venda) {
		this.setDuracao(duracao);
		this.setKmRodados(kmRodados);
		this.setVenda(venda);
	}


	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		if(duracao < 1 || duracao > 31) {
			throw new IllegalArgumentException("Duração em dias deve estar entre 1 e 31");
		}
		this.duracao = duracao;
	}

	public double getKmRodados() {
		return kmRodados;
	}

	public void setKmRodados(double kmRodados) {
		if(kmRodados < 0) {
			throw new IllegalArgumentException("KM rodados não podem ser inferior a 0");
		}
		this.kmRodados = kmRodados;
	}

	public double getVenda() {
		return venda;
	}

	public void setVenda(double venda) {
		if(venda < 0) {
			throw new IllegalArgumentException("Valor de venda inválido");
		}
		this.venda = venda;
	}
	
	
	
}
