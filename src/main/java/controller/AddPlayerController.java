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

@WebServlet("/add")
public class AddPlayerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AddPlayerController() {
        super();
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String player_name =  request.getParameter("player_name");
        String player_team_name =  request.getParameter("player_team_name");
        int player_number =  Integer.parseInt(request.getParameter("player_number"));
        int player_salary_in_cr =  Integer.parseInt(request.getParameter("player_salary_in_cr"));
        int number_of_ads =  Integer.parseInt(request.getParameter("number_of_ads"));
        int number_of_matches = Integer.parseInt(request.getParameter("number_of_matches"));
        
		
		System.out.println(player_name);
        System.out.println(player_team_name);
        System.out.println(player_number);
        System.out.println(player_salary_in_cr);
        System.out.println(number_of_ads);
        System.out.println(number_of_matches);

		
        Player player = new Player();
		player.setPlayer_name(player_name);
		player.setPlayer_team_name(player_team_name);
		player.setPlayer_number(player_number);
        player.setPlayer_salary_in_cr(player_salary_in_cr);
        player.setNumber_of_ads(number_of_ads);
        player.setNumber_of_matches(number_of_matches);

		
		PlayerDAO playerDAO= new PlayerDAO();
		try {
			playerDAO.insertPlayer(player);
		} 
        catch (SQLException e) {
			e.printStackTrace();
		}
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/homepage.jsp");
		rd.forward(request, response);
		
	}

}
