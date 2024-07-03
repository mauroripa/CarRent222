package dao;

import java.sql.Connection;

public class UtenteDAO {
	private Connection connection;
	public UtenteDAO(Connection connection) {
	    this.connection = connection;
	}
}
