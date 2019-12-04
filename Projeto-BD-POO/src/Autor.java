	
public class Autor extends Producao implements Validador{
	private int cdAutor;
	private String nmAutor;
	private int indiceAutor;
	
	public Autor() {
		
	}
	
	public Autor(String nmAutor) {
		this.setNmAutor(nmAutor);
	
	}
	
	@Override
	public int verifica(String nmAutor) {
		cdAutor = -1;
		for(Autor a : autores) {
			if(!a.getNmAutor().equalsIgnoreCase(nmAutor)) {
				indiceAutor++;
				this.setCdAutor(indiceAutor);
			}else {
				cdAutor = a.getCdAutor();
				break;
			}
		}
		return cdAutor;
	}
	
	public int getCdAutor() {
		return cdAutor;
	}
	public void setCdAutor(int cdAutor) {
		this.cdAutor = cdAutor;
	}
	public String getNmAutor() {
		return nmAutor;
	}
	public void setNmAutor(String nmAutor) {
		this.nmAutor = nmAutor;
	}
}
