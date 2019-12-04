import java.util.ArrayList;

public class Vendedor {

	private String nome;
	private ArrayList<Viagem> viagens = new ArrayList();
	
	public Vendedor (String nome) {
		this.setNome(nome);
	}
	
	
	public void addViagem(int dias, double kmRodados, double valor) {
		Viagem v = new Viagem(dias, kmRodados, valor);
		this.viagens.add(v);
	}
	
	public double getTotalKmRodados() {
		double totalKmRodados = 0;
		for(Viagem v : viagens) {
			totalKmRodados += v.getKmRodados();
		}
		return totalKmRodados;
	}
	
	public double getValorPorKmRodado(double totalKmRodados) {
		if(totalKmRodados > 1600) {
			return 0.75;
		}else if(totalKmRodados < 1600 && totalKmRodados > 801) {
			return 0.78;
		}
		return 0.8;
	}

	public double getValorASerPago() {
		double totalKm = this.getTotalKmRodados();
		double valorKm = this.getValorPorKmRodado(totalKm);
		return totalKm * valorKm;
	}
	
	public double getTotalVendas() {
		double totalVendas = 0;
		for(Viagem v : viagens) {
			totalVendas += v.getVenda();
		}
		return totalVendas;
	}
	
	public double getValorTotal() {
		double valorViagem = this.getValorASerPago();
		double valorVenda = this.getTotalVendas();
		return valorViagem + valorVenda;
	}
	
	public double getMenorKm() {
		double menorKm = Double.MAX_VALUE;
		for(Viagem v : viagens) {
			if(v.getKmRodados() < menorKm) {
				menorKm = v.getKmRodados();
			}
		}
		return menorKm;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
