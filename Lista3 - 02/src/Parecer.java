import java.time.LocalDate;

public class Parecer {

	private String nomeParecista;
	private LocalDate data;
	private String conteudo;
	
	public Parecer(String nomeParecista, LocalDate data, String conteudo) {
		this.setNomeParecista(nomeParecista);
		this.setData(data);
		this.setConteudo(conteudo);
	}
	
	
	public String getNomeParecista() {
		return nomeParecista;
	}
	public void setNomeParecista(String nomeParecista) {
		if(nomeParecista != null && !nomeParecista.isEmpty()) {
			this.nomeParecista = nomeParecista;
		}else {
			throw new IllegalArgumentException("Nome do parecerista inválido");
		}
	}
	
	public String exibir() {
		return this.conteudo + " emitido por " + this.nomeParecista + " em " + this.data;
	}
	
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	
	
}
