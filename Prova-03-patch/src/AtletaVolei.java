
public class AtletaVolei extends Atleta {
	private double saque;
	private double bloqueio;
	private double ataque;
	
	
	@Override
	public double getDesempenho() {
		double mediaArit = this.ataque + this.bloqueio + this.saque / 3;
		return mediaArit/this.getImc();
		
	}
	
	public double getSaque() {
		return saque;
	}
	public void setSaque(double saque) {
		this.saque = saque;
	}
	public double getBloqueio() {
		return bloqueio;
	}
	public void setBloqueio(double bloqueio) {
		this.bloqueio = bloqueio;
	}
	public double getAtaque() {
		return ataque;
	}
	public void setAtaque(double ataque) {
		this.ataque = ataque;
	}
}
