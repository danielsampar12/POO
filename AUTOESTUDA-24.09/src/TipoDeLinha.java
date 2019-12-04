import java.util.ArrayList;

public class TipoDeLinha {

	private int idTipo;
	private ArrayList<Linha> todasLinhas = new ArrayList<Linha>();
	private ArrayList<Linha> linhasResidencias = new ArrayList<Linha>();
	private ArrayList<Linha> linhasComerciais = new ArrayList<Linha>();
	private ArrayList<Linha> linhasEspecializadas = new ArrayList<Linha>();
	
	public TipoDeLinha() {
		this.setIdTipo(idTipo);
	}
	
	public void cadastraLinha(Linha l) {
		this.todasLinhas.add(l);
	}
	
	public void addTipoDeLinha(Linha l){
		if(l.getTipoLinha() == -1) {
			this.linhasResidencias.add(l);
		}
		if(l.getTipoLinha() == 0) {
			this.linhasComerciais.add(l);
		}
		if(l.getTipoLinha() == 1) {
			this.linhasEspecializadas.add(l);
		}
	}



	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}
	
	
}
