package controller;

import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import dao.PlayerDAO;
import dao.LoginDAO;
//import model.Player;

@WebServlet("/home")
public class HomePage extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
 
    public HomePage() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("un");
		String pwd=request.getParameter("pw");
		PrintWriter out=response.getWriter();
		if(LoginDAO.validate(user, pwd)){
			RequestDispatcher rd=request.getRequestDispatcher("homepage.jsp");
			rd.forward(request, response);
		} 
		else{
			out.print("Sorry username or password error");  
		} 
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
