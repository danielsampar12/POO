
public class Motocicleta extends Veiculo{
	private int cilindradas;
	private static int nrMotos = 0;
	

	public Motocicleta(String descricao, int ano, float valor,  int cilindradas) {
		super(descricao, ano, valor);
		this.setCilindradas(cilindradas);
		nrMotos++;
		this.setCodigo("MOT" + Integer.toString(nrMotos));
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Generalização Embarcação: "+this.getCodigo());
		super.finalize();
	}  

	@Override
	public float getValorIPVA() {
		if(this.cilindradas <= 150 && this.getAno() <= 2005) {
			return 0;
		}
		return 0.02f;
	}
	
	@Override
	public String getCodigo() {
		return "MOT";
	}
	
	public int getCilindradas() {
		return cilindradas;
	}


	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}


	public int getNrMotos() {
		return nrMotos;
	}



	@Override
	public boolean isImportado() {
		
		return false;
	}

	
}
