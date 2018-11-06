/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import classes.Semente;
import conection.MakeConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import classes.Venda;

/**
 *
 * @author Douglas
 */
public class VendaDAO {
    
    public ArrayList<Venda> arrayVendas = new ArrayList();

    public boolean salvar(Venda v) throws ClassNotFoundException, SQLException {

        Connection con = MakeConnection.getConnection();
        PreparedStatement stmt = null;
        boolean result = false;
        
        try {
            stmt = con.prepareStatement(
                    "INSERT INTO vendas (data, valor_total, quantidade, semente)"
                    + "VALUES(?,?,?,?)");
            /////////////////////////////////

            ///////////////////////////////////
            stmt.setDate(1, v.getDataVenda());
            stmt.setFloat(2, v.getValorTotal());
            stmt.setInt(3, v.getQuantidade());
            stmt.setString(4, v.getSementes());
            
            stmt.executeUpdate();
            result = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar: " + ex);
            System.out.println(ex);
           result = false; 
        } finally {
            MakeConnection.closeConnection(con, stmt);
        }
        return result;
    }

    //List<Semente>
    public List<Venda> read(String sql) throws ClassNotFoundException {

        Connection con = MakeConnection.getConnection();
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        //boolean result = false;
        //List<Pessoa> pessoasSql = new ArrayList<>();
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                /////////////////////////////////
                Venda v = new Venda();
                ///////////////////////////////////
                v.setDataVenda(rs.getDate("data"));
                v.setValorTotal(rs.getFloat("valor_total"));
                v.setQuantidade(rs.getInt("quantidade"));
                v.setSementes(rs.getString("semente"));
                
                arrayVendas.add(v);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SementeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            MakeConnection.closeConnection(con, stmt, rs);
        }

        //return pessoasSql;
        return arrayVendas;
    }
    public Venda readId(int id) throws ClassNotFoundException, SQLException {

        Connection con = MakeConnection.getConnection();
        PreparedStatement stmt = null;
        Venda v = new Venda();
        id = getLastId();
        ResultSet rs = null;
        String sql = Integer.toString(id);        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                stmt = con.prepareStatement(
                    "SELECT data, valor_total, quantidade, semente"
                    + "FROM vendas WHERE idvenda = id");
            }
            rs.getInt(v.getIdVenda());
            JOptionPane.showInputDialog( rs.getInt(v.getIdVenda()));
            ///COMPLETAR
            
        } catch (SQLException ex) {
            Logger.getLogger(SementeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            MakeConnection.closeConnection(con, stmt, rs);
        }
        return v;
    }


    public boolean excluir(int id) throws ClassNotFoundException {

        Connection con = MakeConnection.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("DELETE FROM vendas WHERE idvenda = ?");

            stmt.setInt(1, id);

            stmt.executeUpdate();
          
            JOptionPane.showMessageDialog(null, "Venda concelada com sucesso!");
            
            return true;
      
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cancelar: " + ex);
            System.out.println(ex);
            return false;
        
        } finally {
            MakeConnection.closeConnection(con, stmt);
        }
    
    }

    public void read() throws ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    public int getLastId() throws SQLException, ClassNotFoundException{
        //String sql = "SELECT MAX(idsemente) as idsemente FROM sementes";
        String sql = "SELECT * FROM vendas ORDER BY idvenda DESC LIMIT 1";
        Connection con = MakeConnection.getConnection();
        PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        int lastId = rs.getInt("idvenda");

	rs.close();
	stmt.close();

	return lastId;
}
    
}
