package view;

import Conexao.ParametroArquivo;
import Controller.ControlePrincipal;
import Model.FreezerDAO;
import Model.ProdutoDAO;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaControleFreezers extends javax.swing.JFrame {
    ControlePrincipal c;
    ParametroArquivo a;
        String tempo="0";
    public void setControler(ControlePrincipal c) {
        this.c = c;
    }

    public TelaControleFreezers() {
        initComponents();
        setResizable(false);
        this.setLocationRelativeTo(null);
        
        setDefaultCloseOperation(TelaControleFreezers.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter(){
            public void windowClosing (WindowEvent e){    
                setVisible(false);
        }
    }
);
    
                a= new ParametroArquivo();
               String camp=(a.lerTudoSemQuebrarLinha("valKWH.bin"));
               vk.setText(camp);
    String nome;
    String kwh;
    String status;
        
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        model.setNumRows(0);          
        
        int i=0;
          FreezerDAO freezerDAO=new FreezerDAO();
                while(i < freezerDAO.select().size()) {
                    
                    nome    =freezerDAO.select().get(i).getNome();
                    kwh =freezerDAO.select().get(i).getKwh();
                    status =freezerDAO.select().get(i).getStatus();
                    tempo =freezerDAO.select().get(i).getTempo();
                    
                    model.addRow(new Object[]{status, kwh, nome,tempo});            
                    i++;
            }
            double total=0;    
            double tdw=0;
String verif;
        for(int t=0; t<tabela.getRowCount() ;t++){
            verif=""+tabela.getValueAt(t, 2);
            if(verif.equals("inativo")){       
            }else{
                tdw=(Double.parseDouble(""+tabela.getValueAt(t, 1))*Double.parseDouble(""+tabela.getValueAt(t,3)))+tdw;
            }
        }
        total=tdw*Double.parseDouble(vk.getText());  
    ct.setText(""+total*30); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        vk = new javax.swing.JLabel();
        ct = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Fipps", 0, 14)); // NOI18N
        jLabel3.setText("Controle de freezers");

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jButton1.setText("Desligar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 255, 153));
        jButton2.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jButton2.setText("Ligar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 255, 153));
        jButton3.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jButton3.setText("Adicionar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 153, 153));
        jButton4.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jButton4.setText("Remover");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "kW", "Status", "Tempo"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        jLabel2.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jLabel2.setText("valor( R$ ) KWH:");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jLabel5.setText("Custo total:");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setText("Voltar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        vk.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        vk.setForeground(new java.awt.Color(255, 102, 102));
        vk.setText("0");

        ct.setBackground(new java.awt.Color(255, 153, 153));
        ct.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        ct.setForeground(new java.awt.Color(255, 102, 102));
        ct.setText("0");

        jButton5.setBackground(new java.awt.Color(255, 255, 153));
        jButton5.setFont(new java.awt.Font("Silkscreen", 0, 11)); // NOI18N
        jButton5.setText("Editar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(vk, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ct, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(9, 9, 9)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(vk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    String nome = JOptionPane.showInputDialog(null,"Digite um nome ao freezer");
    String kwh = JOptionPane.showInputDialog(null,"Potencia em kW");
    tempo = JOptionPane.showInputDialog(null,"Tempo de funcionamento em Hora");
    
    if(nome==null){nome="ERRO";}
    if(tempo==null){tempo="0";}
    if(kwh==null){kwh="0";}
    
    String status="inativo";
    
        try {
            c.cadastrarFreezer(status, kwh, nome, tempo);
        } catch (Exception ex) {
            Logger.getLogger(TelaControleFreezers.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            model.setNumRows(0);          
        int i=0;
          FreezerDAO freezerDAO=new FreezerDAO();
                while(i < freezerDAO.select().size()) {
                    
                    nome    =freezerDAO.select().get(i).getNome();
                    kwh =freezerDAO.select().get(i).getKwh();
                    status =freezerDAO.select().get(i).getStatus();
                    tempo =freezerDAO.select().get(i).getTempo();
                    
                    model.addRow(new Object[]{status, kwh, nome,tempo});            
                    i++;
            }
           double total=0;    
            double tdw=0;
String verif;
        for(int t=0; t<tabela.getRowCount() ;t++){
            verif=""+tabela.getValueAt(t, 2);
            if(verif.equals("inativo")){       
            }else{
                tdw=(Double.parseDouble(""+tabela.getValueAt(t, 1))*Double.parseDouble(""+tabela.getValueAt(t,3)))+tdw;
            }
        }
        total=tdw*Double.parseDouble(vk.getText());  
    ct.setText(""+total*30); 
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tabela.getSelectedRowCount() != 1){
           JOptionPane.showMessageDialog(null, "Selecione uma linha.");
           return;
       }
       DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            int id=tabela.getSelectedRow()+1;
        try {
            
            c.desativarFreezer(id);
            tabela.setValueAt("inativo", tabela.getSelectedRow(),2);
        } catch (Exception ex) {
            Logger.getLogger(TelaControleFreezers.class.getName()).log(Level.SEVERE, null, ex);
        }                                        
           double total=0;    
            double tdw=0;
String verif;
        for(int t=0; t<tabela.getRowCount() ;t++){
            verif=""+tabela.getValueAt(t, 2);
            if(verif.equals("inativo")){       
            }else{
                tdw=(Double.parseDouble(""+tabela.getValueAt(t, 1))*Double.parseDouble(""+tabela.getValueAt(t,3)))+tdw;
            }
        }
        total=tdw*Double.parseDouble(vk.getText());  
    ct.setText(""+total*30); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                if (tabela.getSelectedRowCount() != 1){
           JOptionPane.showMessageDialog(null, "Selecione uma linha.");
           return;
       }
       DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            int id=tabela.getSelectedRow()+1;
        try {
            
            c.ativarFreezer(id);
            tabela.setValueAt("ativo", tabela.getSelectedRow(),2);
        } catch (Exception ex) {
            Logger.getLogger(TelaControleFreezers.class.getName()).log(Level.SEVERE, null, ex);
        }
            double total=0;    
            double tdw=0;
String verif;
        for(int t=0; t<tabela.getRowCount() ;t++){
            verif=""+tabela.getValueAt(t, 2);
            if(verif.equals("inativo")){       
            }else{
                tdw=(Double.parseDouble(""+tabela.getValueAt(t, 1))*Double.parseDouble(""+tabela.getValueAt(t,3)))+tdw;
            }
        }
        total=tdw*Double.parseDouble(vk.getText());  
    ct.setText(""+total*30); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     if (tabela.getSelectedRowCount() != 1){
           JOptionPane.showMessageDialog(null, "Selecione uma linha.");
           return;
       }

     DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            String id=""+tabela.getValueAt(tabela.getSelectedRow(), 0);    
        try {
            c.removerFreezer(id);
        } catch (Exception ex) {
            Logger.getLogger(TelaControleFreezers.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    String nome;
    String kwh;
    String status;

            model.setNumRows(0);          
        int i=0;
          FreezerDAO freezerDAO=new FreezerDAO();
                while(i < freezerDAO.select().size()) {
                    
                    nome    =freezerDAO.select().get(i).getNome();
                    kwh =freezerDAO.select().get(i).getKwh();
                    status =freezerDAO.select().get(i).getStatus();
                    tempo =freezerDAO.select().get(i).getTempo();
                    
                    model.addRow(new Object[]{status, kwh, nome});            
                    i++;
            }
           double total=0;    
            double tdw=0;
                 String verif;
        for(int t=0; t<tabela.getRowCount() ;t++){
            verif=""+tabela.getValueAt(t, 2);
            if(verif.equals("inativo")){       
            }else{
                tdw=(Double.parseDouble(""+tabela.getValueAt(t, 1))*Double.parseDouble(""+tabela.getValueAt(t,3)))+tdw;
            }
        }
        total=tdw*Double.parseDouble(vk.getText());  
    ct.setText(""+total*30);         
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        double kwh=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do KWH:"));
        vk.setText(kwh+"");
        
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
           double total=0;    
            double tdw=0;
String verif;
        for(int t=0; t<tabela.getRowCount() ;t++){
            verif=""+tabela.getValueAt(t, 2);
            if(verif.equals("inativo")){       
            }else{
                tdw=(Double.parseDouble(""+tabela.getValueAt(t, 1))*Double.parseDouble(""+tabela.getValueAt(t,3)))+tdw;
            }
        }
        total=tdw*Double.parseDouble(vk.getText());  
    ct.setText(""+total*30);  
        
        String esc[] = {ct.getText()};
        
        try {
            
            a.Escrever(1, esc, "valKWH");
        
        } catch (IOException ex) {
            Logger.getLogger(TelaControleFreezers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ct;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JLabel vk;
    // End of variables declaration//GEN-END:variables
}
