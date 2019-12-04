

public abstract class Veiculo {
	private String descricao;
	private int ano;
	private float valor;
	private String codigo;
	
	public Veiculo(String descricao, int ano, float valor) {
		this.setDescricao(descricao);
		this.setAno(ano);
		this.setValor(valor);
	}
	
	public abstract float getValorIPVA();
	public abstract boolean isImportado();
	public abstract String getCodigo();

	public void setCodigo(String codigo) {
		this.codigo = codigo;
		
	}

	public String getCodigoVeiculo() {
		return this.codigo;
	}
	
	public boolean validaAno() {
		 
		if(this.ano < 1900 || this.ano > 2019) {
			throw new IllegalArgumentException("Ano inválido.");
		}
		return true;
	}


	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		if(descricao == null || descricao.isEmpty()) {
			throw new IllegalArgumentException("Descrição inválida");
		}
		this.descricao = descricao;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		if(this.validaAno()) {
			this.ano = ano;
		}
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}




	
}
