package bean;

public class Prenotazioni {
	private int id_prenotazione;
	private int id_cliente;
	private int id_auto;
	private Date data_inizio;
	private Date data_fine;

	public Prenotazioni(int id_prenotazione, int id_cliente, int id_auto, Date data_inizio, Date data_fine) {
		this.id_prenotazione = id_prenotazione;
		this.id_cliente = id_cliente;
		this.id_auto = id_auto;
		this.data_inizio = data_inizio;
		this.data_fine = data_fine;
	}
	public int getId_prenotazione() {
		return id_prenotazione;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public int getId_auto() {
		return id_auto;
	}

	public Date getData_inizio() {
		return data_inizio;
	}

	public Date getData_fine() {
		return data_fine;
	}


	public void setId_prenotazione(int id_prenotazione) {
		this.id_prenotazione = id_prenotazione;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public void setId_auto(int id_auto) {
		this.id_auto = id_auto;
	}

	public void setData_inizio(Date data_inizio) {
		this.data_inizio = data_inizio;
	}

	public void setData_fine(Date data_fine) {
		this.data_fine = data_fine;
	}

}
