package DAO;

import java.sql.*;

public class JDBCConnection {
    public static Connection getJDBCConnetion(){
        final String url = "jdbc:mysql://localhost/story_app";
        final String user = "root";
        final String password = "";
        
        try{
            return DriverManager.getConnection(url, user, password);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        
        return null;
    }
}
