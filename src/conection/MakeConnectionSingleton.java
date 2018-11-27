/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joaoramyllo
 */

//o singleton deve garantir que somente haverá uma instancia de conection por vez

public class MakeConnectionSingleton {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost/banco_sementes"; // jdbc://localhost:3306/  |    jdbc:mysql://localhost/bdtweets2
    private static final String USER = "root";
    private static final String PASS = "root";
    private Connection conexao;
    private static MakeConnectionSingleton instancy;
    
    private MakeConnectionSingleton(){
        
        try {
            Class.forName(DRIVER);
            this.conexao = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            //Logger.getLogger(MakeConnectionSingleton.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Erro na conexão com o Banco  de Dados!", ex);  
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MakeConnectionSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
    }

    public static MakeConnectionSingleton getInstancy() throws ClassNotFoundException{ //classe que garantira a unica instancia
        if(instancy == null){
            instancy = new MakeConnectionSingleton();
        }
        return instancy;
    }
    
    public Connection getConnection(){
        return this.conexao;
    }
    
    //É recomendado deixar a conexao aberta, ja que o singleton trabalha com uma instancia por vez
    /*public static void closeConnection(Connection con) {

        try {
            if (con != null) {
                con.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(MakeConnectionSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }

    }*/

    public static void closeConnection(Connection con, PreparedStatement stmt) {

        //closeConnection(con);
        try {

            if (stmt != null) {
                stmt.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(MakeConnectionSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {

        //closeConnection(con, stmt);
        try {

            if (rs != null) {
                rs.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(MakeConnectionSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
