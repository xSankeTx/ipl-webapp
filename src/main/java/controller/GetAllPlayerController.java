package controller;

import java.io.IOException;
//import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PlayerDAO;
import model.Player;

@WebServlet("/view")
public class GetAllPlayerController extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
 
    public GetAllPlayerController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Get all players");
		PlayerDAO playerdao = new PlayerDAO();
		Player player=new Player();
		List<Player> playerlist = playerdao.getAllPlayers();
		for(Player playerlists:playerlist) {
			System.out.println(playerlists.getPlayer_number());
		}
		request.setAttribute("playerlist", playerlist);
		request.setAttribute("id", player.getPlayer_number());
		RequestDispatcher rd=request.getRequestDispatcher("view.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
