package conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MakeConnection {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost/banco_sementes"; // jdbc://localhost:3306/  |    jdbc:mysql://localhost/bdtweets2
    private static final String USER = "root";
    private static final String PASS = "root";
    //private static final String PASS = "";

    public static Connection getConnection() throws ClassNotFoundException {

        try {
            Class.forName(DRIVER);

            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            throw new RuntimeException("Erro na conexão com o Banco  de Dados!", ex);
            }

    }

    public static void closeConnection(Connection con) {

        try {
            if (con != null) {
                con.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(MakeConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt) {

        closeConnection(con); 
        try {
            
            if (stmt != null) {
                stmt.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(MakeConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {

        closeConnection(con, stmt); 
        try {
            
          if( rs != null){
              rs.close();
          }

        } catch (SQLException ex) {
            Logger.getLogger(MakeConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

