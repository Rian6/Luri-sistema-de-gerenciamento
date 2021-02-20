
package view;

import Conexao.*;
import Controller.ControlePrincipal;
import Model.AtacadoDAO;
import Model.Model;
import Model.ProdutoDAO;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TelaVendas extends javax.swing.JFrame {
    ControlePrincipal c;
    Model m;
     CriarPlanilha p;
     ArrayList<String> nomes;
     String add;
     String nome;
     boolean cont=true;
     ParametroArquivo arquivo;
     
 
     public String getNome(){
      return nome;
    }
    
    public void setNome(String nome) {
        if(nome==null){
            Vendedor.setText("erro");
        }else{
            Vendedor.setText(nome);
            this.nome=nome;
        }
    }
     
     public TelaVendas() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        model.setNumRows(0);  
        setResizable(false);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(TelaVendas.DO_NOTHING_ON_CLOSE);
        ArrayList<String> cl = new ArrayList<String>(); 
        try{
          
          int i=0;
          ProdutoDAO produtoDAO=new ProdutoDAO();
                while(i < produtoDAO.select().size()) {
                    
                    cl.add(produtoDAO.select().get(i).getNome());               
                    i++;
                }
                      }catch(NullPointerException e){
            }    
        nomes =new ArrayList<String>();
        
        nomes.addAll(cl);
        
        addWindowListener(new WindowAdapter(){
            
            public void windowClosing (WindowEvent e){
                int resposta = JOptionPane.showConfirmDialog(null,"Deseja sair?","Finalizar",JOptionPane.YES_NO_OPTION);
                if (resposta == 0){System.exit(0);
                }
            }
        }
        );
    
    }
    public void setControler(ControlePrincipal c) {
        this.c = c;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        totalF = new javax.swing.JLabel();
        texto123 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Vendedor = new javax.swing.JLabel();
        menssagem = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        limpar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 51, 51));

        jLabel7.setFont(new java.awt.Font("Silkscreen", 0, 18)); // NOI18N
        jLabel7.setText("Vendas");

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/menuicon2.png"))); // NOI18N
        jButton4.setText("Menu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tabela.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Preço", "Codigo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setResizable(false);
            tabela.getColumnModel().getColumn(1).setResizable(false);
            tabela.getColumnModel().getColumn(2).setResizable(false);
        }

        jButton5.setBackground(new java.awt.Color(204, 255, 102));
        jButton5.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvar.png"))); // NOI18N
        jButton5.setText("      Finalizar Venda");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jLabel8.setText("TOTAL:  R$");

        jComboBox2.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 51, 51));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dinheiro" }));

        jLabel9.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jLabel9.setText("Tipo de pagamento:");

        jLabel10.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jLabel10.setText("Adicionar novo produto a venda");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        totalF.setFont(new java.awt.Font("Silkscreen", 0, 14)); // NOI18N
        totalF.setForeground(new java.awt.Color(0, 102, 51));
        totalF.setText("0.0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(totalF, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(totalF))
        );

        texto123.setBackground(new java.awt.Color(255, 255, 51));
        texto123.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        texto123.setForeground(new java.awt.Color(102, 102, 102));
        texto123.setText("Digite o codigo do produto aki!");
        texto123.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                texto123MouseClicked(evt);
            }
        });
        texto123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto123ActionPerformed(evt);
            }
        });
        texto123.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                texto123KeyPressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/produto.png"))); // NOI18N

        jButton2.setBackground(new java.awt.Color(51, 204, 255));
        jButton2.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jButton2.setText("Adicionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jLabel2.setText("Vendedor:");

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));

        Vendedor.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        Vendedor.setText("Erro");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Vendedor))
        );

        menssagem.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/flecha1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/flecha2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sprite-0002.png"))); // NOI18N
        limpar.setToolTipText("Limpar todos os produtos");
        limpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limparMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                limparMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                limparMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(limpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(limpar)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(texto123, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(menssagem, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(53, 53, 53))
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(720, 720, 720)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(72, 72, 72)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(menssagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(texto123, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
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

    private void limparMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limparMouseEntered
        
    }//GEN-LAST:event_limparMouseEntered

    private void limparMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limparMouseExited
       
    }//GEN-LAST:event_limparMouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        c.chamarTelaMenu();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void texto123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto123ActionPerformed
        
    }//GEN-LAST:event_texto123ActionPerformed

    private void texto123KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texto123KeyPressed

        for(int i=0;i<nomes.size();i++){
        int nNomes=nomes.size();
        String a = nomes.get(i);
        
                a = nomes.get(i).substring (0, a.length() - 1);
 
            
            if(texto123.getText().equals(a)){
                texto123.setBackground(new Color(102,255,102));
                texto123.setForeground(new Color(0,0,0));
                i=0;
                a=nomes.get(i);
                add=a;
                break;
               
            }else{
                a=nomes.get(i);
                texto123.setBackground(new Color(255,102,102));
                texto123.setForeground(new Color(0,0,0));
            }
        }
    }//GEN-LAST:event_texto123KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
        try{
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        
          String barra=texto123.getText();
          String nome;
          String preco;
          String codigo;
          
          int i=0;
          ProdutoDAO produtoDAO=new ProdutoDAO();
                while(i < produtoDAO.select3(barra).size()) {
                    
                    nome       =produtoDAO.select3(barra).get(i).getNome();
                    preco      =produtoDAO.select3(barra).get(i).getPreco();
                    codigo     =produtoDAO.select3(barra).get(i).getCodigo();

                    model.addRow(new Object[]{nome,preco,codigo});
                    i++;
                }
             double total=0;
             
             for(int j=0;j<model.getRowCount();j++){
             String texto="";
         
             texto=""+model.getValueAt(j, 1);
             total=total+Double.parseDouble(texto);
            }
            totalF.setText(total+"");
                      }catch(NullPointerException e){   
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void limparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limparMouseClicked
        int a=JOptionPane.showConfirmDialog(null, "Deseja realmente limpar a venda?","Limpar",JOptionPane.YES_OPTION, JOptionPane.NO_OPTION);
        if(a==JOptionPane.YES_OPTION){
        
        double total=0;
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        model.setNumRows(0); 
             for(int j=0;j<model.getRowCount();j++){
             String texto="";
         
             texto=""+model.getValueAt(j, 1);
             total=total+Double.parseDouble(texto);
            }
            totalF.setText(total+"");
            texto123.setText("Digite o nome do produto aki!");
            texto123.setBackground(new Color(255,255,51));
            texto123.setForeground(new Color(102,102,102));
            cont=true;
          }else{}
    }//GEN-LAST:event_limparMouseClicked

    private void texto123MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_texto123MouseClicked
        if(cont){
            texto123.setText("");
            cont=false;
        }else{}
    }//GEN-LAST:event_texto123MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            int a=JOptionPane.showConfirmDialog(null, "Deseja realmente finalizar a venda?\n(isso vai limpar a venda atual e substituir todo arquivo 'nota.xls')","Finalizar venda",JOptionPane.YES_OPTION, JOptionPane.NO_OPTION);
        if(a==JOptionPane.YES_OPTION){
        
       menssagem.setText("Iniciando...");

       ParametroArquivo arq=new ParametroArquivo();

       String hist[]=new String[3];
       


       String nomeArquivo="nota";
       String vendedor=Vendedor.getText();
       String pagamento="dinheiro";
       String nome1[];
       String preco[];
       String codigo[];
       int row = tabela.getRowCount();
        
       Hora data=new Hora();

        menssagem.setText("Iniciando vetores...");
        nome1=new String[row];   
        preco=new String[row];
        codigo=new String[row];
        
        menssagem.setText("Reunindo tabela...");
        for(int i=0;i<row;i++){
            nome1[i] = ""+tabela.getValueAt(i, 0);
            preco[i] = ""+tabela.getValueAt(i, 1);
            codigo[i] = ""+tabela.getValueAt(i, 2);
        }
        String total=totalF.getText();
        menssagem.setText("Criando nova planilha...");
        p=new CriarPlanilha(vendedor, pagamento, nome1, preco, codigo, total); 
                
            hist[0]= vendedor;
            hist[1]=data.getHora();
            hist[2]=total;

        arq.escreverSemApagar("historico.bin", hist);
        menssagem.setText("Finalizado!");
        JOptionPane.showMessageDialog(null,"Venda finalizada com sucesso!");
        double total2=0;
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        model.setNumRows(0); 
             for(int j=0;j<model.getRowCount();j++){
             String texto="";
         
             texto=""+model.getValueAt(j, 1);
             total2=total2+Double.parseDouble(texto);
            }
            totalF.setText(total2+"");
            texto123.setText("Digite o nome do produto aki!");
            texto123.setBackground(new Color(255,255,51));
            texto123.setForeground(new Color(102,102,102));
            cont=true;
            menssagem.setText("");
      }else{} 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
       DefaultTableModel model = (DefaultTableModel) tabela.getModel();        
        if (tabela.getSelectedRowCount() != 1){
           JOptionPane.showMessageDialog(null, "Selecione uma linha.");
           return;
       }
                model.removeRow(tabela.getSelectedRow());
                               double total=0;
             
             for(int j=0;j<model.getRowCount();j++){
             String texto="";
         
             texto=""+model.getValueAt(j, 1);
             total=total+Double.parseDouble(texto);
            }
            totalF.setText(total+"");
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        if (tabela.getSelectedRowCount() != 1){
           JOptionPane.showMessageDialog(null, "Selecione uma linha.");
           return;
       }       
        
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
                String nome=(String) model.getValueAt(tabela.getSelectedRow(), 0);
                String preco=(String) model.getValueAt(tabela.getSelectedRow(), 1);
                String codigo=(String) model.getValueAt(tabela.getSelectedRow(), 2);
                
                 model.addRow(new Object[]{nome,preco,codigo});
               double total=0;
             
             for(int j=0;j<model.getRowCount();j++){
             String texto="";
         
             texto=""+model.getValueAt(j, 1);
             total=total+Double.parseDouble(texto);
            }
            totalF.setText(total+"");
            
            
    }//GEN-LAST:event_jPanel4MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Vendedor;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel limpar;
    private javax.swing.JLabel menssagem;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField texto123;
    private javax.swing.JLabel totalF;
    // End of variables declaration//GEN-END:variables
}
