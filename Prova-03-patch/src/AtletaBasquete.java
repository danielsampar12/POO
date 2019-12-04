
public class AtletaBasquete extends Atleta {
	private int pontos;
	private int rebotes;
	
	@Override
	public double getDesempenho() {
		double aux = this.pontos/this.rebotes * 1.2;
		return this.getImc()/aux;
	}
	
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public int getRebotes() {
		return rebotes;
	}
	public void setRebotes(int rebotes) {
		this.rebotes = rebotes;
	}
}
