/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import FactoryMethod.Admin;
import FactoryMethod.Funcionario;
import com.mysql.jdbc.PreparedStatement;
import conection.MakeConnectionSingleton2;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Renan
 */
public class FuncionarioDAO {

    public void create(Funcionario f) throws ClassNotFoundException{
        MakeConnectionSingleton2 conSing = MakeConnectionSingleton2.getInstancy();
        Connection con = conSing.getConnection();
        //Connection con = MakeConnectionSingleton2.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO funcionario (IdFuncionario, senha, tipo, nome, cpf, rua, bairro, cep, cidade, estado, telefone, email) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1, f.getIdFuncionario());
            stmt.setString(2, f.getSenha());
            stmt.setString(3, f.getTipo());
            stmt.setString(4, f.getNome());
            stmt.setString(5, f.getCPF());
            stmt.setString(6, f.getRua());
            stmt.setString(7, f.getBairro());
            stmt.setString(8, f.getCep());
            stmt.setString(9, f.getCidade());
            stmt.setString(10, f.getEstado());
            stmt.setString(11, f.getTelefone());
            stmt.setString(12, f.getEmail());

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuario já cadastrado!");
        }finally{
            MakeConnectionSingleton2.closeConnection(con, stmt);
        }
    }
    
    public boolean chekLogin(String login, String senha) throws ClassNotFoundException{
        MakeConnectionSingleton2 conSing = MakeConnectionSingleton2.getInstancy();
        Connection con = conSing.getConnection();
        //Connection con = MakeConnectionSingleton2.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM funcionario WHERE idFuncionario = ? AND senha = ?");
            
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();   
            
            if(rs.next()){
                check = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuario já cadastrado!");
        }finally{
            MakeConnectionSingleton2.closeConnection(con, stmt, rs);
        }
        
        return check;
    }
}
