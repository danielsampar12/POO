import java.time.LocalDate;
import java.util.ArrayList;

public class Veiculo {

	private String placa;
	private String modelo;
	private LocalDate data;
	private ArrayList<Manutencao> manutencoes = new ArrayList();
	
    public void addManutencao(Manutencao m){
        this.manutencoes.add(m);
    }
	
    public int comparaCom(Veiculo outro) {
    	double indThis = this.getIndiceSucateamento();
    	double indOutro = outro.getIndiceSucateamento();
    	if(indThis > indOutro) {
    		return 1; 
    	}
    	if(indThis < indOutro) {
    		return -1;
    	}
    	return 0;
    }
    
    public double getIndiceSucateamento() {
    	int totalTempoParado = 0;
    	for(Manutencao m : manutencoes) {
    		totalTempoParado += m.getTempoParado();
    	}
      
        if (totalTempoParado < 21){
            return 0;
        }
        if (totalTempoParado < 51){
            return 0.5f;
        }
        if (totalTempoParado < 81){
            return 1;
        }
        if (totalTempoParado < 121){
            return 1.5f;
        }
        return 2;
    }
    
    public int getQtdServicos(String descricao) {
    	int total = 0;
    	for(Manutencao m : manutencoes) {
    		if(m.getDescricao().equals(descricao)){
    			total++;
    		}
    	}
    	return total;
    }
    
    public double getCustoMedioManutencoes() {
    	int total = 0;
    	for(Manutencao m : manutencoes) {
    		total += m.getCusto();
    	}
    	return total/manutencoes.size();
    }
    
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		if(placa == null || placa.isEmpty()) {
			throw new IllegalArgumentException("Placa nula");
		}
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		if(modelo == null || modelo.isEmpty()) {
			throw new IllegalArgumentException("Modelo nula");
		}
		this.modelo = modelo;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
}
