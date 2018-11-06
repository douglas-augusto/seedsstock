/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import DAO.SementeDAO;
import classes.Semente;
import conection.MakeConnection;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jframes.TesteTabela;

/**
 *
 * @author Douglas
 */
public class TelaVenderSemente extends javax.swing.JInternalFrame {
    
    float totalVendas = 0;
    int quantidade = 0;
    ArrayList<String> listaVenda = new ArrayList();
    
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize();

    public void setPosition() {
        this.setLocation((d.width - this.getSize().width) /2, (d.height - this.getSize().height) / 6);
    }

    /**
     * Creates new form TelaVenderSemente
     * 
     
     */
    
    DefaultTableModel dtmBusca;
    ArrayList<Semente> arraySementesVenda = new ArrayList();
    
    public TelaVenderSemente() {
        initComponents();
        
          try {
            carregaArray();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteTabela.class.getName()).log(Level.SEVERE, null, ex);
        }
        carregaTabela();
        
        setTitle("Vender Sementes");
        setBounds(100, 100, 800, 600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoPesquisaVendas = new javax.swing.JTextField();
        botaoAddAoCarrinho = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        campoQuantidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoTotalVenda = new javax.swing.JTextField();
        botaoFinalizarCompra = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVendas = new javax.swing.JTable();
        botaoZerarCarrinho = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jLabel5.setText("jLabel5");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Search.png"))); // NOI18N
        jLabel1.setText("Pesquisar:");

        campoPesquisaVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaVendasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoPesquisaVendas)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoPesquisaVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botaoAddAoCarrinho.setText("Adicionar ao carrinho");
        botaoAddAoCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAddAoCarrinhoActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Quantidade:");

        jLabel4.setText("Total da compra:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(campoTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        botaoFinalizarCompra.setText("Finalizar venda");
        botaoFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFinalizarCompraActionPerformed(evt);
            }
        });

        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tabelaVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título 1", "Título 2", "Título 3", "Título 4"
            }
        ));
        jScrollPane1.setViewportView(tabelaVendas);

        botaoZerarCarrinho.setText("Limpar carrinho ");
        botaoZerarCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoZerarCarrinhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoAddAoCarrinho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoFinalizarCompra)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoZerarCarrinho))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(botaoAddAoCarrinho)
                                .addGap(8, 8, 8)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoFinalizarCompra)
                            .addComponent(botaoZerarCarrinho))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFinalizarCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoFinalizarCompraActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void campoPesquisaVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaVendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPesquisaVendasActionPerformed

    private void botaoAddAoCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAddAoCarrinhoActionPerformed
        // TODO add your handling code here:
        try{
        adicionarAoCarrinho();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Selecione um ítem para o carrinho", "Ação inválida", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_botaoAddAoCarrinhoActionPerformed

    private void botaoZerarCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoZerarCarrinhoActionPerformed
        // TODO add your handling code here:
        zerarCarrinho();
    }//GEN-LAST:event_botaoZerarCarrinhoActionPerformed

    
    public void carregaArray() throws ClassNotFoundException {
        Connection con = MakeConnection.getConnection();
        PreparedStatement stmt = null;

        ResultSet rs = null;

        int cont = 0;
       
       // sementeDAO sDao = new sementeDAO();
        try {
            stmt = con.prepareStatement("SELECT * FROM sementes ORDER BY nome ASC");
            rs = stmt.executeQuery();

            arraySementesVenda.clear();
            while (rs.next()) {
                /////////////////////////////////
                Semente semente = new Semente();
                ///////////////////////////////////
                semente.setIdsemente(rs.getInt("idsemente"));
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

                arraySementesVenda.add(semente);

                //Preenchendo tabela
            }

        } catch (SQLException ex) {
            Logger.getLogger(SementeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            MakeConnection.closeConnection(con, stmt, rs);
        }
    }
    
    public void carregaTabela() {
        DefaultTableModel dtmBusca;

        String[] colunas = {"Id Semente", "Nome", "Espécie", "Preço Compra", "Preço Venda"};
        String[] linha = new String[5];

        dtmBusca = new DefaultTableModel(null, colunas);

        //String sql = "SELECT * FROM sementes";
        String sql = "SELECT * FROM sementes ORDER BY nome ASC";

        dtmBusca = new DefaultTableModel(null, colunas);

        Connection con = null;
        try {
            con = MakeConnection.getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteTabela.class.getName()).log(Level.SEVERE, null, ex);
        }

        Statement stmt;
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                linha[0] = rs.getString("idsemente");
                linha[1] = rs.getString("nome");
                linha[2] = rs.getString("especie");
                linha[3] = rs.getString("preco_compra");
                linha[4] = rs.getString("preco_venda");
                dtmBusca.addRow(linha);
            }
            tabelaVendas.setModel(dtmBusca);
            dtmBusca.fireTableDataChanged();
        } catch (SQLException ex) {
            //  Logger.getLogger(dtmBusca.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    
    public void adicionarAoCarrinho(){
        
        totalVendas = totalVendas + Float.parseFloat((String) tabelaVendas.getValueAt(tabelaVendas.getSelectedRow(), 4));
        quantidade++;
        listaVenda.add((String) tabelaVendas.getValueAt(tabelaVendas.getSelectedRow(), 1));
        
        campoTotalVenda.setText(String.valueOf(totalVendas));
        campoQuantidade.setText(String.valueOf(quantidade));
           
    }
    
    public void zerarCarrinho(){
        
        totalVendas = 0;
        quantidade = 0;
        
        campoTotalVenda.setText("0");
        campoQuantidade.setText("0");
        
    }
    
    public void finalizarVenda(){
        
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAddAoCarrinho;
    private javax.swing.JButton botaoFinalizarCompra;
    private javax.swing.JButton botaoZerarCarrinho;
    private javax.swing.JTextField campoPesquisaVendas;
    private javax.swing.JTextField campoQuantidade;
    private javax.swing.JTextField campoTotalVenda;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaVendas;
    // End of variables declaration//GEN-END:variables
}





