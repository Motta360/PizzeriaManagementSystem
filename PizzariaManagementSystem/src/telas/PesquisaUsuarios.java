/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package telas;
import java.sql.*;
import conexaodatabase.ModuloConexao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author lucas
 */
public class PesquisaUsuarios extends javax.swing.JInternalFrame {
        Connection conexao = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
    /**
     * Creates new form GerenciarUsuarios
     */
    public PesquisaUsuarios() {
        initComponents();
        conexao = ModuloConexao.connector();
        try {
            Integer i =0;
            String sql = "select * from usuarios";
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                i+=1;
            }
            String num = i.toString();
            gerenciadorNumero.setText(num);
            
        } catch (SQLException e) {
        }
        try {
            String sql = "select * from usuarios ";
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                String[] nomes = {rs.getString(2)};
                DefaultTableModel table = (DefaultTableModel)jTable1.getModel();
                table.addRow(nomes);
            }
        } catch (Exception e) {
        }
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        gerenciaName = new javax.swing.JTextField();
        gerenciaSenha = new javax.swing.JTextField();
        gerenciaCargo = new javax.swing.JTextField();
        gerenciadorBusca = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        gerenciadorNumero = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Gerenciar Usuarios");

        jLabel2.setText("Nome");

        jLabel3.setText("Senha");

        jLabel4.setText("Cargo");

        gerenciadorBusca.setText("Pesquisar");
        gerenciadorBusca.setToolTipText("Pesquisar");
        gerenciadorBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciadorBuscaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Número de Usuários atuais:");

        gerenciadorNumero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gerenciadorNumero.setText("jLabel6");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setEnabled(false);
        jTable1.setFocusable(false);
        jTable1.setOpaque(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(gerenciaCargo))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(gerenciaSenha))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(gerenciaName, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gerenciadorNumero)
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(gerenciadorBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(gerenciadorNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(gerenciaName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(gerenciaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(gerenciaCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(gerenciadorBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gerenciadorBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciadorBuscaActionPerformed
        conexao = ModuloConexao.connector();
        try {
            String id = gerenciaName.getText();
            String sql = "select * from usuarios where Nome = ?";
            pst = conexao.prepareStatement(sql);
            pst.setString(1,id);
            rs = pst.executeQuery();
            if(rs.next()){
                gerenciaName.setText(rs.getString(2));
                gerenciaSenha.setText(rs.getString(3));
                gerenciaCargo.setText(rs.getString(4));
            }
            else{
                JOptionPane.showMessageDialog(null,"Usuário não existe");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_gerenciadorBuscaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField gerenciaCargo;
    private javax.swing.JTextField gerenciaName;
    private javax.swing.JTextField gerenciaSenha;
    private javax.swing.JButton gerenciadorBusca;
    private javax.swing.JLabel gerenciadorNumero;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
