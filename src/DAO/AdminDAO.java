/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import FactoryMethod.Admin;
import com.mysql.jdbc.PreparedStatement;
import conection.MakeConnection;
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
 * 
 * private String tipo = "admin";
    private int idAdmin;
    private String senha;
    private String nome;
    private String CPF;    
    private String email;
 */
public class AdminDAO {
    public void create(Admin a) throws ClassNotFoundException{
        Connection con = MakeConnection.getConnection();
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
            MakeConnection.closeConnection(con, stmt);
        }
    }
/*    
    public void update (Usuario u){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String sql = "UPDATE usuario SET NomeUsuario = ?, Senha = ? WHERE NomeUsuario = ?";
        try {
            stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setString(1, u.getNomeUser());
            stmt.setString(2, u.getSenha());
            stmt.setString(1, u.getNomeUser());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registro alterado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar, tente novamente." + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Usuario> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List <Usuario> usuarios = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM usuario");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario u = new Usuario();
                u.setNomeUser(rs.getString("NomeUsuario"));
                u.setSenha(rs.getString("senha"));
                usuarios.add(u);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuario já cadastrado!");
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
    }
    
    public boolean chekLogin(String login, String senha){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM usuario WHERE NomeUsuario = ? AND Senha = ?");
            
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();   
            
            if(rs.next()){
                check = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuario já cadastrado!");
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return check;
    }
*/
}
