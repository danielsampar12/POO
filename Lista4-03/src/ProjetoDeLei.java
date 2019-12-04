import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProjetoDeLei {
	private String titulo;
	private LocalDate dataApresentacao;
	private LocalDate dataAprovacao;
	private int numeroProjeto;
	private static int contadorProjeto = 0;
	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public ProjetoDeLei(String titulo, LocalDate dataApresentacao) {
		this.setDataApresentacao(dataApresentacao);
		this.setTitulo(titulo);
		this.numeroProjeto = contadorProjeto++;
	}
	
	public String mostrar() {
		return "Projeto de lei " + this.numeroProjeto + " - " + this.titulo + 
				"\napresentado em" + this.dataApresentacao.format(formatter) 
				+(this.isAprovado()?"\naprovado em " + this.dataAprovacao.format(formatter) : "\n ainda não aprovado");

	}
	

	public void setTitulo(String titulo) {
		if(titulo == null || titulo.isEmpty()) {
			throw new IllegalArgumentException("Titulo inválido.");
		}
		this.titulo = titulo;
	}

	public void setNumeroProjeto(int numeroProjeto) {
		if(numeroProjeto < 0) {
			throw new IllegalArgumentException("Número inválido.");
		}
		this.numeroProjeto = numeroProjeto;
	}
	
	public boolean isAprovado() {
		return	(this.dataAprovacao != null);
	}
	
	public String getTitulo() {
		return titulo;
	}
	public LocalDate getDataApresentacao() {
		return dataApresentacao;
	}
	public void setDataApresentacao(LocalDate dataApresentacao) {
		this.dataApresentacao = dataApresentacao;
	}
	public LocalDate getDataAprovacao() {
		return dataAprovacao;
	}
	public void setDataAprovacao(LocalDate dataAprovacao) {
		this.dataAprovacao = dataAprovacao;
	}
	
	public int getNumeroProjeto() {
		return numeroProjeto;
	}
	
}
