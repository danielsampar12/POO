
public class Atleta {
	private String nome;
	private float altura;
	private float peso;
	private String posicao;
	private double desempenho;
	private double imc;
	
	public Atleta() {
		
	}
	
	public double getImc() {
		return this.peso/Math.pow(this.altura, 2);
	}
	
	public void setImc(double imc) {
		this.imc = imc;
	}
	public double getDesempenho() {
		return desempenho;
	}
	public void setDesempenho(double desempenho) {
		this.desempenho = desempenho;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
	
}
