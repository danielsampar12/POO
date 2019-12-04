
public class Vereador {

	private String nome;
	private Partido partido;
	private int qtdProjAprov;
	private int qtdProj;
	private double indiceTrabalho;
	
	/*
	public Vereador (String nome, Partido partido, int qtdProjAprov, int qtdProj ) {
		this.setNome(nome);
		this.setPartido(partido);
		this.setQtdProjAprov(qtdProjAprov);
		this.setQtdProj(qtdProj);
	}
	*/
		
	public double getIndiceTrabalho() {
        if (this.qtdProj > 17){
            return 1.22;
        }
        if (this.qtdProj > 10){
            return 1.08;
        }
        if (this.qtdProj > 5){
            return 1;
        }    
        if (this.qtdProj > 0){
            return 0.8;
        }        
        return 0;
		
	} 
	
	public double getDesempenho() {
		
		return ((double)this.qtdProjAprov / this.qtdProj)*this.getIndiceTrabalho();
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome != null && !nome.isEmpty()) {
			this.nome = nome;
		}else {
			throw new IllegalArgumentException("Nome inválido.");
		}
		
	}
	public Partido getPartido() {
		return partido;
	}
	public void setPartido(Partido partido) {
		this.partido = partido;
	}
	public int getQtdProjAprov() {
		return qtdProjAprov;
	}
	public void setQtdProjAprov(int qtdProjAprov) {
		if(qtdProjAprov < 0) {
			throw new IllegalArgumentException("Quantidade inválida. Deve ser maior que 0");
		}
		this.qtdProjAprov = qtdProjAprov;
	}
	public int getQtdProj() {
		return qtdProj;
	}
	public void setQtdProj(int qtdProj) {
		if(qtdProj < 0) {
			throw new IllegalArgumentException("Quantidade inválida. Deve ser maior que 0");
		}
		this.qtdProj = qtdProj;
	}
	public void setIndiceTrabalho(double indiceTrabalho) {
		if(indiceTrabalho < 0) {
			throw new IllegalArgumentException("Indice invalido");
		}
		this.indiceTrabalho = indiceTrabalho;
	}
}
