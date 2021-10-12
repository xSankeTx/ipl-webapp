package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Player;
import utility.ConnectionManager;

public class PlayerDAO implements PlayerDAOInterface {
	private static final String INSERT_player_SQL = "INSERT INTO player(player_name, player_team_name, player_number,player_salary_in_cr,number_of_ads,number_of_matches)values(?,?,?,?,?,?)";
	private static final String GET_ALL_PLAYERS = "SELECT * FROM player";
	public void insertPlayer(Player player) throws SQLException {
		System.out.println("Insert player details Invoked");
		try(
			Connection con=ConnectionManager.getConnection();
			PreparedStatement ps=con.prepareStatement(INSERT_player_SQL)){
			ps.setString(1, player.getPlayer_name());
			ps.setString(2, player.getPlayer_team_name());
			ps.setInt(3, player.getPlayer_number());
			ps.setInt(4, player.getPlayer_salary_in_cr());
			ps.setInt(5, player.getNumber_of_ads());
			ps.setInt(6, player.getNumber_of_matches());
			ps.executeUpdate();	
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
	}
		
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
