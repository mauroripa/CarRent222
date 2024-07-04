package bean;

public class Admin {
private int id_admin;
private String nome;
private String cognome ;
private String email;
private String username;
private String password;

public Admin() {
	
}
public Admin(int id_admin, String nome, String cognome, String email, String username, String password) {
    this.id_admin = id_admin;
    this.nome = nome;
    this.cognome = cognome;
    this.email = email;
    this.username = username;
    this.password = password;
}
public int getId_admin() {
    return id_admin;
}

public void setId_admin(int id_admin) {
    this.id_admin = id_admin;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getCognome() {
    return cognome;
}

public void setCognome(String cognome) {
    this.cognome = cognome;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getUsername() {
    return username;
}

public void setUsername(String username) {
    this.username = username;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

}
