import java.time.LocalDate;

public class Linha {

	private String username;
	private String address;
	private LocalDate dataInstall;
	private int tipoLinha;
	private String telefoneUser;
	
	
	public int getTipoLinha() {
		return tipoLinha;
	}
	public void setTipoLinha(int tipoLinha) {
		this.tipoLinha = tipoLinha;
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		if(username == null || username.isEmpty()) {
			throw new IllegalArgumentException("Digite o nome do dono da linha.");
		}
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		if(address == null || address.isEmpty()) {
		throw new IllegalArgumentException("Digite o endereço.");
	}
		this.address = address;
	}
	public LocalDate getDataInstall() {
		return dataInstall;
	}
	public void setDataInstall(LocalDate dataInstall) {
		this.dataInstall = dataInstall;
	}

	public String getTelefoneUser() {
		return telefoneUser;
	}
	public void setTelefoneUser(String telefoneUser) {
		if(telefoneUser == null || telefoneUser.isEmpty()) {
			throw new IllegalArgumentException("Digite o número de telefone.");
		}
		this.telefoneUser = telefoneUser;
	}
	
	
}
