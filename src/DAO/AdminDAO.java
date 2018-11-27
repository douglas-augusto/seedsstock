/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import FactoryMethod.Admin;
import com.mysql.jdbc.PreparedStatement;
import conection.MakeConnectionSingleton2;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Renan
 * 
 */ 

public class AdminDAO {
    public void create(Admin a) throws ClassNotFoundException{
        
        MakeConnectionSingleton2 conSing = MakeConnectionSingleton2.getInstancy();
        Connection con = conSing.getConnection();
        //ConnectionSingleton con = MakeConnectionSingleton2.getInstancy();
        PreparedStatement stmt = null;
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO Admin (IdAdmin, tipo, senha, nome, cpf, email) VALUES (?,?,?,?,?,?)");
            stmt.setInt(1, a.getIdAdmin());
            stmt.setString(2, a.getTipo());
            stmt.setString(3, a.getSenha());
            stmt.setString(4, a.getNome());
            stmt.setString(5, a.getCPF());
            stmt.setString(6, a.getEmail());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuario já cadastrado!");
        }finally{
            MakeConnectionSingleton2.closeConnection(con, stmt);
        }
    }
}
