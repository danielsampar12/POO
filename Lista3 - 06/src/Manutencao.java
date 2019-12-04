
public class Manutencao {

	int numero;
	String descricao;
	double custo;
	int tempoParado;
	

	public double getCustoMedio() {
		return this.custo/this.tempoParado;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		if(numero <= 0) {
			throw new IllegalArgumentException("Numero negativo");
		}
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}
	public int getTempoParado() {
		return tempoParado;
	}
	public void setTempoParado(int tempoParado) {
		this.tempoParado = tempoParado;
	}
	
	
}
