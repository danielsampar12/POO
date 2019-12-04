import java.time.LocalDate;

public class ProjetoDeLeiComplementar extends ProjetoDeLei {
	private int qtdVotosFavoraveis;
	private String artigoLO;
	

	public ProjetoDeLeiComplementar(String titulo, LocalDate dataApresentacao,  
									int qtdVotosFavoraveis,		String artigoLO) {
		
		super(titulo, dataApresentacao);
		this.setArtigoLO(artigoLO);
		this.setQtdVotosFavoraveis(qtdVotosFavoraveis);
		// TODO Auto-generated constructor stub
	}
	

	public String mostrar() {
		return "Complementar: " + super.mostrar()	+
				"\nArtigo de lei Org�nica " + this.artigoLO +
				(this.isAprovado()?"\nVotos favor�veis: " + this.qtdVotosFavoraveis : "");
	}
	
	public void setQtdVotosFavoraveis(int qtdVotosFavoraveis) {
		if(qtdVotosFavoraveis <= 0) {
			throw new IllegalArgumentException("Votos favor�veis n�o devem ser menor que 0");
		}
		this.qtdVotosFavoraveis = qtdVotosFavoraveis;
	}


	public String getArtigoLO() {
		if (artigoLO == null || artigoLO.isEmpty()) {
			throw new IllegalArgumentException("Artigo da Lei Org�nica inv�lido");
		}
		return artigoLO;
	}


	public void setArtigoLO(String artigoLO) {
		this.artigoLO = artigoLO;
	}

	public int getQtdVotosFavoraveis() {
		return qtdVotosFavoraveis;
	}


}
