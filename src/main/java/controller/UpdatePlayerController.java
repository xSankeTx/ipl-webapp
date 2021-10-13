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
import model.Player;
 
@WebServlet("/update")  
public class UpdatePlayerController extends HttpServlet {  
    private static final long serialVersionUID = 1L;
       

    public UpdatePlayerController() {
        super();
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
        String m1=request.getParameter("n1");  
        String m2=request.getParameter("n2");
        String m3=request.getParameter("n3");
        String m4=request.getParameter("n4");
        String m5=request.getParameter("n5");
        String m6=request.getParameter("n6");
        int m33=Integer.parseInt(m3);  
        int m44=Integer.parseInt(m4);   
        int m55=Integer.parseInt(m5);  
        int m56=Integer.parseInt(m6);  
       
        Player player = new Player();
		player.setPlayer_name(m1);
		player.setPlayer_team_name(m2);
		player.setPlayer_number(m33);
        player.setPlayer_salary_in_cr(m44);
        player.setNumber_of_ads(m55);
        player.setNumber_of_matches(m56);

        PlayerDAO playerDAO= new PlayerDAO();
		try {
			playerDAO.updatePlayer(player);
		} 
        catch (SQLException e) {
			e.printStackTrace();
		}
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/view");
		rd.forward(request, response);        
    }  
  
} 
