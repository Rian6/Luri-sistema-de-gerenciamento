package view;

import Controller.ControlePrincipal;
import Model.AtacadoDAO;
import Model.Produto;
import Model.ProdutoDAO;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaControleEstoque extends javax.swing.JFrame {

    ControlePrincipal c;
    public void setControler(ControlePrincipal c) {
        this.c = c;
    }
    public TelaControleEstoque() {
        initComponents();
        setResizable(false);
        this.setLocationRelativeTo(null);
                              try{
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        model.setNumRows(0);
        
          String nome;
          int quantidade;
          String preco;
          String codigo;
          
          int i=0;
          ProdutoDAO produtoDAO=new ProdutoDAO();
                while(i < produtoDAO.select().size()) {
                    
                    
                    nome    =produtoDAO.select().get(i).getNome();
                    quantidade =produtoDAO.select().get(i).getQuantidade();
                    preco =produtoDAO.select().get(i).getPreco();
                    codigo =produtoDAO.select().get(i).getCodigo();

                    model.addRow(new Object[]{nome,quantidade,preco,codigo});
                    
                    i++;
                }
                      }catch(NullPointerException e){
            
            
            }
        setDefaultCloseOperation(TelaControleEstoque.DO_NOTHING_ON_CLOSE);addWindowListener(new WindowAdapter(){public void windowClosing (WindowEvent e){int resposta = JOptionPane.showConfirmDialog(null,"Deseja sair?","Finalizar",JOptionPane.YES_NO_OPTION);if (resposta == 0){System.exit(0);}}});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        JTFquantidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTFnome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JTFpreco = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        JTFcodigo = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/luriMedio_2.PNG"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/menuicon2.png"))); // NOI18N
        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabela.setBackground(new java.awt.Color(255, 204, 102));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Quantidade", "Preço", "Codigo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setResizable(false);
            tabela.getColumnModel().getColumn(1).setResizable(false);
            tabela.getColumnModel().getColumn(2).setResizable(false);
            tabela.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jLabel2.setText("Controle de estoque");

        jButton2.setBackground(new java.awt.Color(102, 255, 153));
        jButton2.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/flecha1.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 153, 153));
        jButton3.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/flecha2.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        JTFquantidade.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        JTFquantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFquantidadeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jLabel3.setText("Quantidade:");

        jLabel4.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jLabel4.setText("Novo Produto");

        jLabel5.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jLabel5.setText("Nome:");

        JTFnome.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        JTFnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFnomeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jLabel6.setText("Preco (R$):");

        JTFpreco.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        JTFpreco.setForeground(new java.awt.Color(0, 153, 51));
        JTFpreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFprecoActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 204, 102));
        jButton4.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jButton4.setText("Cadastrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 204, 204));
        jButton5.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jButton5.setText("Digitar quantidade");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jLabel7.setText("Codigo:");

        JTFcodigo.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sprite-0002.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFnome, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(JTFquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JTFpreco, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(170, 170, 170)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFcodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(255, 255, 255))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(11, 11, 11)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFpreco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTFquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)
                        .addComponent(JTFnome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTFcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFquantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFquantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFquantidadeActionPerformed

    private void JTFnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFnomeActionPerformed

    private void JTFprecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFprecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFprecoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String nome=JTFnome.getText();
        int quantidade=Integer.parseInt(JTFquantidade.getText());
        String preco=JTFpreco.getText();
        String codigo=JTFcodigo.getText();
            try {
                c.cadastrarProduto(nome, quantidade, preco,codigo);
            } catch (Exception ex) {
                Logger.getLogger(TelaControleEstoque.class.getName()).log(Level.SEVERE, null, ex);
            }
                                   try{
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        model.setNumRows(0);

          int i=0;
          ProdutoDAO produtoDAO=new ProdutoDAO();
                while(i < produtoDAO.select().size()) {
                    
                    
                    nome    =produtoDAO.select().get(i).getNome();
                    quantidade =produtoDAO.select().get(i).getQuantidade();
                    preco =produtoDAO.select().get(i).getPreco();
                    codigo =produtoDAO.select().get(i).getCodigo();
                    

                    model.addRow(new Object[]{nome,quantidade,preco,codigo});
                    
                    i++;
                }
                      }catch(NullPointerException e){
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        c.chamarTelaMenu();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (tabela.getSelectedRowCount() != 1){
           JOptionPane.showMessageDialog(null, "Selecione uma linha.");
           return;
       }
       DefaultTableModel model = (DefaultTableModel) tabela.getModel();
       int quantidade = (int) model.getValueAt(tabela.getSelectedRow(), 1);
            int idpreco=tabela.getSelectedRow()+1;
            try {
                c.updateMaisProdutoQuantidade(idpreco);
            } catch (Exception ex) {
                Logger.getLogger(TelaControleEstoque.class.getName()).log(Level.SEVERE, null, ex);
            }
try{
        model.setNumRows(0);
        
          String nome;
          String preco;
          String codigo;
          
          int i=0;
          ProdutoDAO produtoDAO=new ProdutoDAO();
                while(i < produtoDAO.select().size()) {
                    
                    
                    nome    =produtoDAO.select().get(i).getNome();
                    quantidade =produtoDAO.select().get(i).getQuantidade();
                    preco =produtoDAO.select().get(i).getPreco();
                    codigo =produtoDAO.select().get(i).getCodigo();

                    model.addRow(new Object[]{nome,quantidade,preco,codigo});
                    
                    i++;
                }
                      }catch(NullPointerException e){
            
            
            }
        JTFnome.setText("");
        JTFquantidade.setText("");
        JTFpreco.setText("");
        JTFcodigo.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (tabela.getSelectedRowCount() != 1){
           JOptionPane.showMessageDialog(null, "Selecione uma linha.");
           return;
       }
       DefaultTableModel model = (DefaultTableModel) tabela.getModel();
       int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de "+(String) model.getValueAt(tabela.getSelectedRow(), 0)));
            int idpreco=tabela.getSelectedRow()+1;
            try {
                c.updateMaisProdutoQuantidadeDig(idpreco,quantidade);
            } catch (Exception ex) {
                Logger.getLogger(TelaControleEstoque.class.getName()).log(Level.SEVERE, null, ex);
            }
try{
        model.setNumRows(0);
        
          String nome;
          String preco;
          String codigo;
          int i=0;
          ProdutoDAO produtoDAO=new ProdutoDAO();
                while(i < produtoDAO.select().size()) {
                    
                    
                    nome    =produtoDAO.select().get(i).getNome();
                    quantidade =produtoDAO.select().get(i).getQuantidade();
                    preco =produtoDAO.select().get(i).getPreco();
                    codigo =produtoDAO.select().get(i).getCodigo();

                    model.addRow(new Object[]{nome,quantidade,preco,codigo});
                    
                    i++;
                }
                      }catch(NullPointerException e){
            
            
            }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                if (tabela.getSelectedRowCount() != 1){
           JOptionPane.showMessageDialog(null, "Selecione uma linha.");
           return;
       }
       DefaultTableModel model = (DefaultTableModel) tabela.getModel();
       int quantidade = (int) model.getValueAt(tabela.getSelectedRow(), 1);
            int idpreco=tabela.getSelectedRow()+1;
            try {
                c.updateMenosProdutoQuantidade(idpreco);
            } catch (Exception ex) {
                Logger.getLogger(TelaControleEstoque.class.getName()).log(Level.SEVERE, null, ex);
            }
try{
        model.setNumRows(0);
        
          String nome;
          String preco;
          String codigo;
          
          int i=0;
          ProdutoDAO produtoDAO=new ProdutoDAO();
                while(i < produtoDAO.select().size()) {
                    
                    
                    nome    =produtoDAO.select().get(i).getNome();
                    quantidade =produtoDAO.select().get(i).getQuantidade();
                    preco =produtoDAO.select().get(i).getPreco();
                    codigo =produtoDAO.select().get(i).getCodigo();

                    model.addRow(new Object[]{nome,quantidade,preco,codigo});
                    
                    i++;
                }
                      }catch(NullPointerException e){
            
            
            }
        JTFnome.setText("");
        JTFquantidade.setText("");
        JTFpreco.setText("");
        JTFcodigo.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTFcodigo;
    private javax.swing.JTextField JTFnome;
    private javax.swing.JTextField JTFpreco;
    private javax.swing.JTextField JTFquantidade;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
