/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import classes.Semente;
import static com.sun.glass.ui.Cursor.setVisible;
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

/**
 *
 * @author ramyllo
 */
public class SementeDAO {

    public ArrayList<Semente> arraySementes = new ArrayList();

    public boolean salvar(Semente s) throws ClassNotFoundException, SQLException {

        Connection con = MakeConnection.getConnection();
        PreparedStatement stmt = null;
        boolean result = false;

        try {
            stmt = con.prepareStatement(
                    "INSERT INTO sementes (nome, especie, quant, raridade, dia_col, mes_col, ano_col, "
                    + "dia_val, mes_val, ano_val, preco_compra, preco_venda, origem, fornecedor, condicoes_plantil, observacoes) "
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            /////////////////////////////////

            ///////////////////////////////////
            stmt.setString(1, s.getNome());
            stmt.setString(2, s.getEspecie());
            stmt.setInt(3, s.getQuant());
            stmt.setString(4, s.getRaridade());
            stmt.setInt(5, s.getDia_col());
            stmt.setInt(6, s.getMes_col());
            stmt.setInt(7, s.getAno_col());
            stmt.setInt(8, s.getDia_val());
            stmt.setInt(9, s.getMes_val());
            stmt.setInt(10, s.getAno_val());

            stmt.setFloat(11, s.getPreco_compra());
            stmt.setFloat(12, s.getPreco_venda());

            stmt.setString(13, s.getOrigem());
            stmt.setString(14, s.getFornecedor());
            stmt.setString(15, s.getCondicoes_plantil());
            stmt.setString(16, s.getObservacoes());

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
    public List<Semente> read(String sql) throws ClassNotFoundException {

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
                Semente semente = new Semente();
                ///////////////////////////////////
                semente.setNome(rs.getString("nome"));
                semente.setEspecie(rs.getString("especie"));
                semente.setQuant(rs.getInt("quant"));
                semente.setRaridade(rs.getString("raridade"));
                semente.setDia_col(rs.getInt("dia_col"));
                semente.setMes_col(rs.getInt("mes_col"));
                semente.setAno_col(rs.getInt("ano_col"));
                semente.setDia_val(rs.getInt("dia_val"));
                semente.setMes_val(rs.getInt("mes_val"));
                semente.setAno_val(rs.getInt("ano_val"));

                semente.setPreco_compra(rs.getFloat("preco_compra"));
                semente.setPreco_venda(rs.getFloat("preco_venda"));

                semente.setOrigem(rs.getString("origem"));
                semente.setFornecedor(rs.getString("fornecedor"));
                semente.setCondicoes_plantil(rs.getString("condicoes_plantil"));
                semente.setObservacoes(rs.getString("observacoes"));

                arraySementes.add(semente);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SementeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            MakeConnection.closeConnection(con, stmt, rs);
        }

        //return pessoasSql;
        return arraySementes;
    }

    public boolean Alterar(Semente s) throws ClassNotFoundException, SQLException {

        Connection con = MakeConnection.getConnection();
        PreparedStatement stmt = null;
        boolean result = false;

        try {
            stmt = con.prepareStatement(
                    "UPDATE sementes SET nome = ?, especie = ?, quant = ?, raridade = ?, dia_col = ?, mes_col = ?, ano_col = ?, "
                    + "dia_val = ?, mes_val = ?, ano_val = ?, preco_compra = ?, preco_venda = ?, origem = ?, fornecedor = ?, condicoes_plantil = ?, observacoes = ? WHERE idsemente = ?");
            /////////////////////////////////

            ///////////////////////////////////
            stmt.setString(1, s.getNome());
            stmt.setString(2, s.getEspecie());
            stmt.setInt(3, s.getQuant());
            stmt.setString(4, s.getRaridade());
            stmt.setInt(5, s.getDia_col());
            stmt.setInt(6, s.getMes_col());
            stmt.setInt(7, s.getAno_col());
            stmt.setInt(8, s.getDia_val());
            stmt.setInt(9, s.getMes_val());
            stmt.setInt(10, s.getAno_val());

            stmt.setFloat(11, s.getPreco_compra());
            stmt.setFloat(12, s.getPreco_venda());

            stmt.setString(13, s.getOrigem());
            stmt.setString(14, s.getFornecedor());
            stmt.setString(15, s.getCondicoes_plantil());
            stmt.setString(16, s.getObservacoes());

            stmt.setInt(17, s.getIdsemente());
            
            stmt.executeUpdate();
            result = true;
            JOptionPane.showMessageDialog(null, "Dados alterados com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar: " + ex);
            result = false;
            System.out.println(ex);
        } finally {
            MakeConnection.closeConnection(con, stmt);
        }
        return result;
    }

    public boolean excluir(int id) throws ClassNotFoundException, SQLException {

        Connection con = MakeConnection.getConnection();
        PreparedStatement stmt = null;
        PreparedStatement stmts = null;
        boolean result = false;
        //stmt.executeUpdate();


        try {
            
            stmt = con.prepareStatement("DELETE FROM sementes WHERE idsemente = ?");

            /////////////////////////////////
            stmt.setInt(1, id);

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            result = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dao: " + ex);
            System.out.println(ex);
            result = false;
        } finally {
            MakeConnection.closeConnection(con, stmt);
        }
        return result;
    }

    public void read() throws ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    public int getLastId() throws SQLException, ClassNotFoundException{
        //String sql = "SELECT MAX(idsemente) as idsemente FROM sementes";
        String sql = "SELECT * FROM sementes ORDER BY idsemente DESC LIMIT 1";
        Connection con = MakeConnection.getConnection();
        PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        int lastId = rs.getInt("idsemente");

	rs.close();
	stmt.close();

	return lastId;
}
}
