import java.time.LocalDate;

public class Telefone {
	private String nomeUsuario;
	private String endereco;
	private LocalDate dataInst;
	private String numero;
	
	

	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
        if (nomeUsuario == null
                || nomeUsuario.length()<5){
                throw new IllegalArgumentException("Nome do usu�rio inv�lido");
            }
            this.nomeUsuario = nomeUsuario;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public LocalDate getDataInst() {
		return dataInst;
	}
	public void setDataInst(LocalDate dataInst) {
		this.dataInst = dataInst;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		if(numero == null || numero.length()!=10) {
			throw new IllegalArgumentException("N�mero do telefone inv�lido - n�o cont�m 10 d�gitos");
		}
        try {
        	// outro forma de testar se a String tem 10 d�gitos: numero.matches("[0-9]{10}")
        	Long.parseLong(numero);  // para verificar se todos os caracteres s�o d�gitos
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("N�mero do telefone inv�lido - n�o cont�m 10 d�gitos");        	
        }
		this.numero = numero;
	}
}
