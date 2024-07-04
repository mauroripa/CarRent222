package bean;

public class Cliente {
	private int id_cliente;
	private String nome;
	private String cognome;
	private String email;
	private String telefono;
	private String username;
	private String password;

	public Cliente(int id_cliente, String nome, String cognome, String email, String telefono, String username, String password) {
		this.id_cliente = id_cliente;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.telefono = telefono;
		this.username = username;
		this.password = password;
	}


	public int getId_cliente() {
		return id_cliente;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}


	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}




}
