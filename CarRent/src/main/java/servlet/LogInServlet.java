package servlet;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import util.DatabaseManager;

import java.io.IOException;
import java.sql.SQLException;

import dao.LogInDAO;
import dao.UtenteDAO;

public class LogInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private UtenteDAO utenteDao;

       
    public LogInServlet() {
        super();
        
    }
    public void init() throws ServletException {
        try {
            DatabaseManager dbManager = new DatabaseManager();
            utenteDao = new UtenteDAO(dbManager.getConnection());
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
