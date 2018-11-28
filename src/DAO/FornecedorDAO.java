/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import classes.Fornecedor;
import classes.Semente;
import com.mysql.jdbc.MysqlDataTruncation;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import conection.MakeConnectionSingleton2;
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
 * @author douglas
 */
public class FornecedorDAO {

    public ArrayList<Fornecedor> arrayFornecedor = new ArrayList();

    public boolean salvar(Fornecedor f) throws ClassNotFoundException, SQLException {

        MakeConnectionSingleton2 conSing = MakeConnectionSingleton2.getInstancy();
        Connection con = conSing.getConnection();
//        Connection con = MakeConnectionSingleton2.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(
                    "INSERT INTO fornecedores (nome, cnpj, rua, numero, bairro, cep, cidade, estado, telefone, celular, email, obs) "
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
            /////////////////////////////////

            ///////////////////////////////////
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getCnpj());
            stmt.setString(3, f.getRua());
            stmt.setInt(4, f.getNumero());
            stmt.setString(5, f.getBairro());
            stmt.setString(6, f.getCep());
            stmt.setString(7, f.getCidade());
            stmt.setString(8, f.getEstado());
            stmt.setString(9, f.getTelefone());
            stmt.setString(10, f.getCelular());
            stmt.setString(11, f.getEmail());
            stmt.setString(12, f.getObs());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Fornecedor cadastrado com sucesso!");
            return true;

        } catch (SQLException ex) {
            //Tratamento para campo NOME nulo
            if ("com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException: Column 'nome' cannot be null".equals(ex.toString())) {
                // JOptionPane.showMessageDialog(null, "O campo 'Nome' não pode estar vazio!");
                System.out.println(ex);

            } //Tratamento para campo CNPJ nulo
            if ("com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException: Column 'cnpj' cannot be null".equals(ex.toString())) {
                // JOptionPane.showMessageDialog(null, "O campo 'CNPJ' não pode estar vazio!");
                System.out.println(ex);

            }

            return false;

        } finally {
            MakeConnectionSingleton2.closeConnection(con, stmt);
        }

    }

    public List<Fornecedor> read(String sql) throws ClassNotFoundException {

        MakeConnectionSingleton2 conSing = MakeConnectionSingleton2.getInstancy();
        Connection con = conSing.getConnection();
        //Connection con = MakeConnectionSingleton2.getConnection();
        PreparedStatement stmt = null;

        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                /////////////////////////////////
                Fornecedor f = new Fornecedor();
                ///////////////////////////////////
                f.setIdfornecedor(rs.getInt("idfornecedor"));
                f.setNome(rs.getString("nome"));
                f.setCnpj(rs.getString("cnpj"));
                f.setRua(rs.getString("rua"));
                f.setNumero(rs.getInt("numero"));
                f.setBairro(rs.getString("bairro"));
                f.setCep(rs.getString("cep"));
                f.setCidade(rs.getString("cidade"));
                f.setEstado(rs.getString("estado"));
                f.setTelefone(rs.getString("telefone"));
                f.setCelular(rs.getString("celular"));
                f.setEmail(rs.getString("email"));
                f.setObs(rs.getString("obs"));

                arrayFornecedor.add(f);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            MakeConnectionSingleton2.closeConnection(con, stmt, rs);
        }

        return arrayFornecedor;
    }

    public boolean alterar(Fornecedor f) throws ClassNotFoundException, SQLException {

        MakeConnectionSingleton2 conSing = MakeConnectionSingleton2.getInstancy();
        Connection con = conSing.getConnection();
        //Connection con = MakeConnectionSingleton2.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(
                    "UPDATE fornecedores SET nome = ?, cnpj = ?, rua = ?, numero = ?, bairro = ?, cep = ?, cidade = ?, estado = ?, telefone = ?,"
                    + " celular = ?, email = ?, obs = ? WHERE idfornecedor = ?");
            /////////////////////////////////

            ///////////////////////////////////
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getCnpj());
            stmt.setString(3, f.getRua());
            stmt.setInt(4, f.getNumero());
            stmt.setString(5, f.getBairro());
            stmt.setString(6, f.getCep());
            stmt.setString(7, f.getCidade());
            stmt.setString(8, f.getEstado());
            stmt.setString(9, f.getTelefone());
            stmt.setString(10, f.getCelular());
            stmt.setString(11, f.getEmail());
            stmt.setString(12, f.getObs());

            stmt.setInt(13, f.getIdfornecedor());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Dados alterados com sucesso com sucesso!");
            return true;

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Fornecedor: " + ex);      com.mysql.jdbc.MysqlDataTruncation
            JOptionPane.showMessageDialog(null,"Dados não alterados, campos vazios ou valores inválidos!");
            System.out.println(ex);

            return false;

        } finally {
            MakeConnectionSingleton2.closeConnection(con, stmt);
        }

    }

    public boolean excluir(int id) throws ClassNotFoundException {

        
        MakeConnectionSingleton2 conSing = MakeConnectionSingleton2.getInstancy();
        Connection con = conSing.getConnection();
        //Connection con = MakeConnectionSingleton2.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM fornecedores WHERE idfornecedor = ?");

            /////////////////////////////////
            stmt.setInt(1, id);

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");

            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dao: " + ex);
            System.out.println(ex);
            return false;
        } finally {
            MakeConnectionSingleton2.closeConnection(con, stmt);
        }
    }
}
