package controller;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PlayerDAO;


@WebServlet("/remove")
public class DeletePlayerController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public DeletePlayerController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String name = request.getParameter("name");

        PlayerDAO playerDAO= new PlayerDAO();
	    try {
		    playerDAO.deletePlayer(name);
	    } 
        catch (SQLException e) {
		    e.printStackTrace();
	    }
	    RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/view");
		rd.forward(request, response);
    }

}