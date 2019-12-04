
public class Entidade extends Producao implements Validador {

	private int cdEntidade;
	private String nmEntidade;
	private int indiceEntidade;
	
	public Entidade(String nmEntidade) {
		this.setNmEntidade(nmEntidade);
		this.setCdEntidade(this.verifica(nmEntidade));
	}
	
	@Override
	public int verifica(String nmEntidade) {
		cdEntidade = -1;
		for(Entidade e : entidades) {
			if(!e.getNmEntidade().equalsIgnoreCase(nmEntidade)) {
				indiceEntidade++;
				cdEntidade = indiceEntidade;
			}else {
				cdEntidade = e.getCdEntidade();
				break;
			}
		}
		return cdEntidade;
	}

	public int getCdEntidade() {
		return cdEntidade;
	}

	public void setCdEntidade(int cdEntidade) {
		this.cdEntidade = cdEntidade;
	}

	public String getNmEntidade() {
		return nmEntidade;
	}

	public void setNmEntidade(String nmEntidade) {
		this.nmEntidade = nmEntidade;
	}
	
}
