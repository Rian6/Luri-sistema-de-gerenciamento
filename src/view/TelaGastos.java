package view;

import Conexao.ConectorWindows;
import Controller.ControlePrincipal;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.text.Normalizer.Form;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Conexao.*;
import java.awt.FileDialog;
import java.awt.Image;
import static java.awt.Image.SCALE_DEFAULT;
import javax.swing.JFileChooser;

public class TelaGastos extends javax.swing.JFrame {
    ControlePrincipal c;
            ImageIcon conteudo = null;
        String caminho = null;
        ParametroArquivo pa;
        String links[];
    public TelaGastos() {
        initComponents();
        
                pa=new ParametroArquivo();
        links=pa.ler("graficos.bin", 3);
        caminho=links[0];
        conteudo = new ImageIcon(caminho);
        imagem1.setIcon(conteudo);
        imagem1.setIcon(new ImageIcon(conteudo.getImage().getScaledInstance(250, 150, Image.SCALE_DEFAULT)));
        imagem1.setText("");
        
        caminho=links[1];
        conteudo = new ImageIcon(caminho);
        imagem2.setIcon(conteudo);
        imagem2.setIcon(new ImageIcon(conteudo.getImage().getScaledInstance(250, 150, Image.SCALE_DEFAULT)));
        imagem2.setText("");
        
        caminho=links[2];
        conteudo = new ImageIcon(caminho);
        imagem3.setIcon(conteudo);
        imagem3.setIcon(new ImageIcon(conteudo.getImage().getScaledInstance(250, 150, Image.SCALE_DEFAULT)));
        imagem3.setText("");
        
        setResizable(false);
     this.setLocationRelativeTo(null);
        setDefaultCloseOperation(TelaGastos.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter(){
            public void windowClosing (WindowEvent e){
                int resposta = JOptionPane.showConfirmDialog(null,"Deseja sair?","Finalizar",JOptionPane.YES_NO_OPTION);
                if (resposta == 0){
                    System.exit(0);
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
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        imagem1 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        imagem3 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        imagem2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jButton1.setText("Menu");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 430, 10));

        jPanel12.setBackground(new java.awt.Color(0, 102, 153));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        imagem1.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        imagem1.setText("Sem imagem");
        imagem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagem1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagem1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagem1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        imagem3.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        imagem3.setText("Sem imagem");
        imagem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagem3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagem3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagem3, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );

        jButton12.setBackground(new java.awt.Color(255, 153, 153));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/I_Scroll.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jPanel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        imagem2.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        imagem2.setText("Sem imagem");
        imagem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagem2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagem2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagem2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(176, 176, 176))
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 980, 170));

        jLabel1.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jLabel1.setText("Favoritos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Fipps", 0, 18)); // NOI18N
        jLabel2.setText("Menu gastos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone grafico.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 153, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jLabel3.setText("Gerar grafico");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel3)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 250, 50));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone grafico.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 204, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jLabel5.setText("Controle de freezers");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 250, 50));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone grafico.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jLabel4.setText("Historico de vendas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 250, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            c.chamarTelaMenu();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null,"Limpar tudo?","Limpar",JOptionPane.YES_NO_OPTION);
        if (resposta == 0){
                     pa=new ParametroArquivo();
        
        String links[]=pa.ler("graficos.bin", 3);
        
        for(int i=0;i<3;i++){
        links[i]=".\\src\\Imagens\\teste.gif";
                         try {
                             pa.Escrever(3, links, "graficos");
                         } catch (IOException ex) {
                             Logger.getLogger(TelaGastos.class.getName()).log(Level.SEVERE, null, ex);
                         }
        }
        caminho=links[0];
        conteudo = new ImageIcon(caminho);
        imagem1.setIcon(conteudo);
        imagem1.setIcon(new ImageIcon(conteudo.getImage().getScaledInstance(250, 150, Image.SCALE_DEFAULT)));
        imagem1.setText("");
        
        caminho=links[1];
        conteudo = new ImageIcon(caminho);
        imagem2.setIcon(conteudo);
        imagem2.setIcon(new ImageIcon(conteudo.getImage().getScaledInstance(250, 150, Image.SCALE_DEFAULT)));
        imagem2.setText("");
        
        caminho=links[2];
        conteudo = new ImageIcon(caminho);
        imagem3.setIcon(conteudo);
        imagem3.setIcon(new ImageIcon(conteudo.getImage().getScaledInstance(250, 150, Image.SCALE_DEFAULT)));
        imagem3.setText("");
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        c.chamarFORMParamCustoMes();
    }//GEN-LAST:event_jPanel2MouseClicked

    private void imagem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagem1MouseClicked
         try {
            JFileChooser jFileChooser = new JFileChooser();

            int ok = jFileChooser.showOpenDialog(null);

            if (ok == JFileChooser.APPROVE_OPTION) {

                caminho = jFileChooser.getCurrentDirectory().getPath() + "/" + jFileChooser.getSelectedFile().getName(); // caminho do arquivo

                conteudo = new ImageIcon(caminho);
                imagem1.setIcon(new ImageIcon(conteudo.getImage().getScaledInstance(250, 150, Image.SCALE_DEFAULT)));
                imagem1.setText("");
                links[0]=caminho;
                pa.Escrever(3, links, "graficos");
            } else {
                jFileChooser.cancelSelection();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_imagem1MouseClicked

    private void imagem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagem2MouseClicked
          try {
            JFileChooser jFileChooser = new JFileChooser();

            int ok = jFileChooser.showOpenDialog(null);

            if (ok == JFileChooser.APPROVE_OPTION) {

                caminho = jFileChooser.getCurrentDirectory().getPath() + "/" + jFileChooser.getSelectedFile().getName(); // caminho do arquivo

                conteudo = new ImageIcon(caminho);
                imagem2.setIcon(new ImageIcon(conteudo.getImage().getScaledInstance(250, 150, Image.SCALE_DEFAULT)));
                imagem2.setText("");
                links[1]=caminho;
                pa.Escrever(3, links, "graficos");
            } else {
                jFileChooser.cancelSelection();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_imagem2MouseClicked

    private void imagem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagem3MouseClicked

        try {
            JFileChooser jFileChooser = new JFileChooser();

            int ok = jFileChooser.showOpenDialog(null);

            if (ok == JFileChooser.APPROVE_OPTION) {

                caminho = jFileChooser.getCurrentDirectory().getPath() + "/" + jFileChooser.getSelectedFile().getName(); // caminho do arquivo

                conteudo = new ImageIcon(caminho);
                imagem3.setIcon(new ImageIcon(conteudo.getImage().getScaledInstance(250, 150, Image.SCALE_DEFAULT)));
                imagem3.setText("");
                links[2]=caminho;
                pa.Escrever(3, links, "graficos");
            } else {
                jFileChooser.cancelSelection();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_imagem3MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        c.chamarTelaHistoricoVendas();
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        c.chamarTelaControleFreezers();
    }//GEN-LAST:event_jLabel5MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagem1;
    private javax.swing.JLabel imagem2;
    private javax.swing.JLabel imagem3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
