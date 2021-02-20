package view;

import Conexao.ConectorLinux;
import Controller.ControlePrincipal;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaMenu extends javax.swing.JFrame {
ControlePrincipal c;
String nome;    
    public TelaMenu(){
        
        initComponents();
        p1.setBackground(new Color(0,0,0, 160));
        p2.setBackground(new Color(0,0,0, 160));
        p3.setBackground(new Color(0,0,0, 160));
        p4.setBackground(new Color(0,0,0, 160));
        p5.setBackground(new Color(0,0,0, 160));
        
        b1.setBackground(new Color(255,255,255, 160));
        b2.setBackground(new Color(255,255,255, 160));
        b3.setBackground(new Color(255,255,255, 160));
        b4.setBackground(new Color(255,255,255, 160));
        b5.setBackground(new Color(255,255,255, 160));
        
        jPanel2.setBackground(new Color(0,0,0, 130));
        ImageIcon conteudo = new ImageIcon("fundo.gif");
        setSize(1270, 532);
        jLabel10.setIcon(new ImageIcon(conteudo.getImage().getScaledInstance(1270, 550, Image.SCALE_DEFAULT)));
        setResizable(false);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(TelaMenu.DO_NOTHING_ON_CLOSE);addWindowListener(new WindowAdapter(){public void windowClosing (WindowEvent e){int resposta = JOptionPane.showConfirmDialog(null,"Deseja sair?","Finalizar",JOptionPane.YES_NO_OPTION);if (resposta == 0){System.exit(0);}}});
        
    }
    public void setControler(ControlePrincipal c) {
        this.c = c;
      }
    public String getNome(){
      return nome;
    }
    
    public void setNome(String nome) {
        if(nome==null){
            nomeP.setText("erro");
        }else{
            nomeP.setText(nome);
            this.nome=nome;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomeP = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        p4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        p1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        p5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        p3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Silkscreen", 0, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("<html>Cadastro de novos usuarios ao banco de dados como controle de entrada.</html>");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 190, 160));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/luriMedio_1.PNG"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 70, 80));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/usuario_2.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 10, 40, -1));

        nomeP.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        nomeP.setForeground(new java.awt.Color(255, 255, 255));
        nomeP.setText("Erro");
        jPanel1.add(nomeP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 30, 110, 20));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LURI- RIAN & LUIS Sistema de gerenciamento");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));

        jLabel1.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Versao: 1.01");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 490, -1, -1));

        b3.setBackground(new java.awt.Color(153, 255, 204));
        b3.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        b3.setText("Entrar");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel1.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 240, 120));

        b4.setBackground(new java.awt.Color(153, 255, 204));
        b4.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        b4.setText("Entrar");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel1.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 370, 240, 120));

        b2.setBackground(new java.awt.Color(153, 255, 204));
        b2.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        b2.setText("Entrar");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 240, 120));

        b5.setBackground(new java.awt.Color(153, 255, 204));
        b5.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        b5.setText("Entrar");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel1.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 370, 250, 120));

        b1.setBackground(new java.awt.Color(255, 255, 51));
        b1.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        b1.setText("Entrar");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 240, 120));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/W_Book05.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 40, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/I_Scroll.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 40, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/I_GoldBar.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 40, 40));

        p2.setBackground(new java.awt.Color(255, 255, 204));
        p2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cadastrar usuario");
        p2.add(jLabel7);

        jPanel1.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 240, 370));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/I_GoldCoin.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 160, -1, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/I_Chest02.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 160, 40, 30));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Silkscreen", 0, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("<html>Controle sua empresa por meio de graficos deixando tudo mais claro!</html>");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 210, 200, 140));

        jLabel20.setFont(new java.awt.Font("Silkscreen", 0, 10)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("<html>Tela de vendas para saida de produtos ja cadastrados no banco DE DADOS.</html>");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(782, 190, 190, 180));

        p4.setBackground(new java.awt.Color(204, 255, 153));
        p4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Vendas");
        p4.add(jLabel9);

        jPanel1.add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, 240, 370));

        jLabel22.setFont(new java.awt.Font("Silkscreen", 0, 10)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("<html>ALTERE, CADASTRE, PESQUISE PRODUTOS NO SEU BANCO DE DADOS!</html>");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 190, 200, 180));

        jLabel23.setFont(new java.awt.Font("Silkscreen", 0, 10)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("<html>Controle de atacado, pesquisa de atacados ja existentes ou cadastro de novos atacados.</html>");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 200, 50));

        p1.setBackground(new java.awt.Color(204, 204, 255));
        p1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Atacado");
        p1.add(jLabel4);

        jPanel1.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 240, 370));

        p5.setBackground(new java.awt.Color(204, 255, 204));
        p5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Controle de estoque");
        p5.add(jLabel11);

        jPanel1.add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 120, 250, 370));

        p3.setBackground(new java.awt.Color(255, 204, 204));
        p3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Gastos");
        p3.add(jLabel8);

        jPanel1.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 240, 370));

        jLabel3.setFont(new java.awt.Font("Silkscreen", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Sair");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 73, 40, 20));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 100));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        c.chamarTelaVendas();
    }//GEN-LAST:event_b4ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        c.chamarTelaCadastrarUsuario();
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        c.chamarTelaAtacado();
    }//GEN-LAST:event_b1ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        c.chamarTelaControleEstoque();
    }//GEN-LAST:event_b5ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed

        c.chamarTelaGastos();
        
    }//GEN-LAST:event_b3ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        int a=JOptionPane.showConfirmDialog(null, "Deseja realmente sair?","Sair",JOptionPane.YES_OPTION, JOptionPane.NO_OPTION);
        if(a==JOptionPane.YES_OPTION){
        c.Iniciar();
        }else{}
    }//GEN-LAST:event_jLabel3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nomeP;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel p5;
    // End of variables declaration//GEN-END:variables

}
