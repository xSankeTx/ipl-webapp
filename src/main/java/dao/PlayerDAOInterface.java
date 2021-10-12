package dao;

import java.sql.SQLException;
import java.util.List;
import model.Player;

public interface PlayerDAOInterface {
    void insertPlayer(Player player) throws SQLException;
    
	List<Player> getAllPlayers();
}
