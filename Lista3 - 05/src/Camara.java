import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Camara {

	String cidade;
	Map<Integer, Partido> partidos = new HashMap<Integer, Partido>();
	
	public Camara(String cidade) {
		this.setCidade(cidade);
	}
	
    public void addPartido(Partido p){
        if (p == null){
            throw new IllegalArgumentException("Partido não pode ser nulo");
        }
        if (this.partidos.containsKey(p.getNumero())) {
        	throw new IllegalArgumentException("Já há partido com o número"+p.getNumero());
        }
        this.partidos.put(p.getNumero(),p);
    }

	public int getTotalProjAprov() {
		int totalProjAprov = 0;
		for(Partido p : partidos.values()) {
			totalProjAprov += p.getTotalProjAprov();
		}
		return totalProjAprov;
	}
	
	public int getTotalProjApresentados() {
		int totalProjApresentados = 0;
		for(Partido p : partidos.values()) {
			totalProjApresentados += p.getTotalProjApresentados();
		}
		return totalProjApresentados; 
	}
	
	public double getMediaDesempenho() {
		double totalMediaDesempenho = 0;
		int n = 0;
		for(Partido p : partidos.values()) {
			totalMediaDesempenho += p.getMediaDesempenho();
			n++;
		}
		return totalMediaDesempenho/n;
	}
	
    public List<Vereador> getVereadoresAcimaMedia(){
        double media = this.getMediaDesempenho();
        return this.getVereadoresDesempenhoAcima(media);
    }

    public List<Vereador> getVereadoresDesempenhoAcima(double linhaDeCorte){
        ArrayList<Vereador> lista = new ArrayList();
        for (Partido p: this.partidos.values()){
            for (Vereador v: p.getListaVereadores()){
                if (v.getDesempenho()>linhaDeCorte){
                    lista.add(v);
                }
            }
        }
        return lista;
    }  
	
	public Vereador getVereadorMaisProjAprovCamara() {
		Vereador vereadorMaisProjAprov = new Vereador();
		int totalProjAprov = Integer.MIN_VALUE;
		for(Partido p : partidos.values()) {
			if(totalProjAprov < p.getVereadorMaisProjAprov()) {
				totalProjAprov = p.getVereadorMaisProjAprov();
				vereadorMaisProjAprov = p.getVereador();
			}
		}
		return vereadorMaisProjAprov;
	}
	
	public Vereador getMenorDesempenho() {
		Vereador vereadorMenorDesempenho = new Vereador();
		double totalDesempenho = Double.MAX_VALUE;
		for(Partido p : partidos.values()) {
			if(p.getMenorDesempenhoPartido() < totalDesempenho) {
				totalDesempenho = p.getMenorDesempenhoPartido();
				vereadorMenorDesempenho = p.getVereador();
			}
		}
		return vereadorMenorDesempenho; 
	}
	
	public void setCidade(String cidade) {
		if(cidade == null || cidade.isEmpty()) {
			throw new IllegalArgumentException("Informe o nome da cidade da camara");
		}
		this.cidade = cidade;
	}
	
	public String getCidade() {
		return cidade;
	}
	
    public Partido getNumeroPartido(int numero) {
        return this.partidos.get(numero);
    }

}
