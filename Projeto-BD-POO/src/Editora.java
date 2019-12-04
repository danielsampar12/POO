import java.util.ArrayList;

public class Editora extends Producao implements Validador {
	private int cdEditora;
	private String nmEditora;
	private int indiceEditora;
	
	
	public Editora(String nmEditora) {
		this.setNmEditora(nmEditora);
		this.setCdEditora(this.verifica(nmEditora));
	}
	
	@Override
	public int verifica(String nmEditora) {
		for(Editora e : editoras) {
			if(e.getNmEditora().equalsIgnoreCase(nmEditora)) {
				this.cdEditora = e.getCdEditora();
				return -1;
				}
		}	
			return editoras.size() + 1;
	}
	
	@Override
	protected void finalize() throws Throwable {
	}
	
	@Override
	public void add(Editora e) {
		Producao.editoras.add(e);
	}
	
	public int getCdEditora() {
		return cdEditora;
	}
	public void setCdEditora(int cdEditora) {
		this.cdEditora = cdEditora;
	}
	public String getNmEditora() {
		return nmEditora;
	}
	public void setNmEditora(String nmEditora) {
		this.nmEditora = nmEditora;
	}
	
	
}
