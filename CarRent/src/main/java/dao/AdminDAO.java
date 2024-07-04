package dao;

import util.DatabaseManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDAO {
	
	// ESISTE UN AMMINISTRATORE 
    public boolean esisteUnAdmin(String username, String password) {
        String query = "SELECT * FROM admin WHERE username = ? AND password = ?";
        try (Connection con = DatabaseManager.getConnection();
             PreparedStatement w = con.prepareStatement(query)) {

            w.setString(1, username);
            w.setString(2, password);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}