
public class Obra {

	private String autor;
	private String titulo;
	private Parecer[] pareceres = new Parecer[3];
	private byte indice = 0;
	
	public void addParecer(Parecer p) {
		if(this.indice < this.pareceres.length) {
			this.pareceres[this.indice] = p;
			this.indice++;
		}else {
			throw new IllegalArgumentException("Quantidade máxima de pareceres registrada.");
		}
	}
	
	public byte getQtdPareceres() {
		return this.indice;
	}
	
	
	public String exibir() {
		String retornoString = "Obra: " + this.getTitulo()
										+"\nAutor: " + this.getAutor()
										+"\nPareceres";
		
		for(Parecer p : pareceres) {
			retornoString += "\n" + p.exibir();
		}
		return retornoString;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		if(autor == null) {
			throw new IllegalArgumentException("Autor inválido.");
		}
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		if(titulo != null && !titulo.isEmpty()) {
			this.titulo = titulo;	
		}else {
			throw new IllegalArgumentException("Título inválido.");
		}
	}
	
	
}
