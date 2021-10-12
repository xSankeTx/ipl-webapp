package dao;

//import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Player;
import utility.ConnectionManager;

public class PlayerDAO implements PlayerDAOInterface {
    //private static final String INSERT_BLOG_SQL = "INSERT INTO blog(blogId, blogTitle, blogDescription, postedOn)values(blog_seq.nextval,?,?,?)";
	private static final String GET_ALL_PLAYERS = "SELECT * FROM player";
	// public void insertBlog(Blog blog) throws SQLException {
	// 	System.out.println("Insert blog Invoked");
	// 	try(Connection con=ConnectionManager.getConnection();
	// 			PreparedStatement ps=con.prepareStatement(INSERT_BLOG_SQL)){
	// 		ps.setString(1, blog.getBlogTitle());
	// 		ps.setString(2,blog.getBlogDescription());
	// 		ps.setDate(3, java.sql.Date.valueOf(blog.getPostedOn()));
	// 		ps.executeUpdate();
			
	// 	} catch (SQLException e) {
	// 		e.printStackTrace();
	// 	} catch (ClassNotFoundException e) {
			
	// 		e.printStackTrace();
	// 	} catch (IOException e) {
	// 		e.printStackTrace();
	// 	} 
	// }
		
	//@Override
	public List<Player> getAllPlayers() {
		Player player;
		List<Player> playerList = new ArrayList<Player>();
		try(
            Connection con=ConnectionManager.getConnection();
			PreparedStatement ps=con.prepareStatement(GET_ALL_PLAYERS);){
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				player =  new Player();
				player.setPlayer_name(rs.getString("player_name"));
		        player.setPlayer_team_name(rs.getString("player_team_name"));
                player.setPlayer_number(rs.getInt("player_number"));
		        player.setPlayer_salary_in_cr(rs.getInt("player_salary_in_cr"));
		        player.setNumber_of_ads(rs.getInt("number_of_ads"));
                player.setNumber_of_matches(rs.getInt("number_of_matches"));
				playerList.add(player);
			}
		}
        catch(Exception e) {
			e.printStackTrace();
		}
		return playerList;
    }   
}
