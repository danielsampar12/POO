import java.util.ArrayList;

public class Detran {
	String uf;
	private ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
	
	public float addVeiculo(Veiculo v) {
		if(v == null) {
			throw new IllegalArgumentException("Veiculo inválido.");
		}
		this.veiculos.add(v); 
		return v.getValorIPVA();
	}
	
	public String toString() {
		String retorno = "";
		for(Veiculo v : veiculos) {
			retorno += v.getDescricao() + ", " + Integer.toString(v.getAno()) + ", no valor de "
						+ Float.toString(v.getValor()) 
						+ (v.isImportado()? "Importado (" + v.getCodigoVeiculo() + "):" : "Nacional (" + v.getCodigoVeiculo() + "):")
						+ " IPVA de " + Float.toString(v.getValorIPVA());
		}
		return retorno;
	}
	
	public String listarVeiculos() {
		String str = "Detran do estado de: " + this.uf;
		for(Veiculo v : veiculos) {
			str += "\n" + v.toString();
		}
		return str;
	}
	
	public ArrayList<Veiculo> quaisVeiculosFaixa(float limInf , float limSup){
		ArrayList<Veiculo> veiculosFaixa = new ArrayList<Veiculo>();
		for(Veiculo v : veiculos) {
			if(v.getValorIPVA() >= limInf && v.getValorIPVA() <= limSup) {
				veiculosFaixa.add(v);
			}
		}
		return veiculosFaixa;
	}
	
	
	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		if(uf == null || uf.isEmpty()) {
			throw new IllegalArgumentException("UF inválido.");
		}
		this.uf = uf;
	}
	
}
