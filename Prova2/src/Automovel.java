
public class Automovel extends Veiculo {
	private boolean importado;
	private static int nrCarros = 0;
	
	public Automovel(String descricao, int ano, float valor, String codigo, boolean importado) {
		super(descricao, ano, valor);
		this.setImportado(importado);
		nrCarros++;
		this.setCodigo("AUT" + Integer.toString(nrCarros));
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Generalização Embarcação: "+this.getCodigo());
		super.finalize();
	}  

	@Override
	public float getValorIPVA() {
		if(this.importado == true) {
			return 0.04f;
		}else if(this.getAno() > 2005) {
			return 0.02f;
		}
		return 0;
	}
	
	@Override
	public String getCodigo() {
		return "AUT";
	}
	
	@Override
	public boolean isImportado() {
		return importado;
	}
	
	public void setImportado(boolean importado) {
		this.importado = importado;
	}
	public int getNrCarros() {
		return nrCarros;
	}

}
