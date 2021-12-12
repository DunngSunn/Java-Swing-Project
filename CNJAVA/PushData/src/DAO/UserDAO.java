package DAO;

import java.sql.*;

public class UserDAO {
    public boolean checkUserWithNamePass(String name, String pass){
        Connection cn = JDBCConnection.getJDBCConnetion();
        String query = "SELECT * FROM `users` WHERE `name` = ? AND `password` = ?";
        
        try {
            PreparedStatement statement = cn.prepareStatement(query);
            statement.setString(1, name);
            statement.setString(2, pass);
            ResultSet rs = statement.executeQuery();
            
            return rs.next();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        
        return false;
    }
}
