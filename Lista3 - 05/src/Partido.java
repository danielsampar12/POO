import java.util.ArrayList;
import java.util.List;

public class Partido {

	int numero;
	String nome;
	ArrayList<Vereador> vereadores = new ArrayList<Vereador>();
	int n = 0;
	
	
	public Partido (String nome , int numero) {
		this.setNome(nome);
        this.setNumero(numero);
	}
	
    public void addVereador(Vereador v){
        if (v == null){
            throw new IllegalArgumentException("Vereador não pode ser nulo");
        }
        this.vereadores.add(v);
        v.setPartido(this);
    }
	
	public int getTotalProjApresentados() {
		int totalProjApresentados = 0;
		for(Vereador v : vereadores) {
			totalProjApresentados += v.getQtdProj();
		}	
		return totalProjApresentados; 
	}
	
	public int getTotalProjAprov() {
		int totalProjAprov = 0;
		for(Vereador v : vereadores) {
			totalProjAprov += v.getQtdProjAprov();
		}
		return totalProjAprov;
	}
	
	public double getMediaDesempenho() {
		double totalDesempenho = 0;
		for(Vereador v : vereadores) {
			int qtdProjAtual = v.getQtdProj();
			totalDesempenho += v.getDesempenho();
		}
		return totalDesempenho/vereadores.size();
	}
	
	
	public double getMenorDesempenhoPartido() {
		double totalDesempenho = Double.MAX_VALUE;
		for(Vereador v : vereadores) {
			if(v.getDesempenho() < totalDesempenho) {
				totalDesempenho = v.getDesempenho();
			}
		}
		return totalDesempenho;
	}
	
	public int getVereadorMaisProjAprov() {
		int totalProjAprov = Integer.MIN_VALUE;
		for(Vereador v : vereadores) {
			if(totalProjAprov < v.getQtdProjAprov()) {
				totalProjAprov = v.getQtdProjAprov();
			}
		}
		return totalProjAprov;
	}
	
	public int getTotalProjAprovEApres() {
		int totalProj = 0;
		for(Vereador v : vereadores) {
			totalProj += v.getQtdProj();
			totalProj += v.getQtdProjAprov();
		}
		return totalProj;
	}
	
	public Vereador getVereador() {
		return this.getVereador();
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		if(numero < 10 || numero > 99) {
			throw new IllegalArgumentException("Numero de partido invpalido. Deve conter 10 caracteres");
		}
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if(nome == null || nome.isEmpty()) {
			throw new IllegalArgumentException("Nome inválido. Não deve ser nulo");
		}
		this.nome = nome;
	}
	
    public List<Vereador> getListaVereadores(){
        return this.vereadores;
    }
}
