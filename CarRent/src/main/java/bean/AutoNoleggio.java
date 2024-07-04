package bean;

public class AutoNoleggio {
	private int id_auto;
	private String marca;
	private String modello;
	private int anno;
	private double prezzo_giornaliero;
	private boolean disponibilita;

	public AutoNoleggio(int id_auto, String marca, String modello, int anno, double prezzo_giornaliero, boolean disponibilita) {
		this.id_auto = id_auto;
		this.marca = marca;
		this.modello = modello;
		this.anno = anno;
		this.prezzo_giornaliero = prezzo_giornaliero;
		this.disponibilita = disponibilita;
	}
	public int getId_auto() {
		return id_auto;
	}

	public String getMarca() {
		return marca;
	}

	public String getModello() {
		return modello;
	}

	public int getAnno() {
		return anno;
	}

	public double getPrezzo_giornaliero() {
		return prezzo_giornaliero;
	}

	public boolean isDisponibilita() {
		return disponibilita;
	}


	public void setId_auto(int id_auto) {
		this.id_auto = id_auto;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public void setPrezzo_giornaliero(double prezzo_giornaliero) {
		this.prezzo_giornaliero = prezzo_giornaliero;
	}

	public void setDisponibilita(boolean disponibilita) {
		this.disponibilita = disponibilita;
	}

}
