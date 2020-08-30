/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinavirtual;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class FrameMaquinaVirtual extends javax.swing.JFrame {

    /**
     * Creates new form MaquinaVirtualFrame
     */
    Programa prog;
    public FrameMaquinaVirtual() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        abrirArqDialog = new javax.swing.JDialog();
        nomeArqTxtField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ErroDialog = new javax.swing.JDialog();
        msgErroLabel = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        saidaTxtArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        enviarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        codigoTxtArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        memoriaTxtArea = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        bugTxtArea = new javax.swing.JTextArea();
        addParadaBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        debugMenu = new javax.swing.JMenu();
        runMenu = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        abrirArqDialog.setTitle("Abrir Aqruivo");

        jButton2.setText("OK");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Digite o nome e o caminho  do arquivo que vc deseja abrir:");

        javax.swing.GroupLayout abrirArqDialogLayout = new javax.swing.GroupLayout(abrirArqDialog.getContentPane());
        abrirArqDialog.getContentPane().setLayout(abrirArqDialogLayout);
        abrirArqDialogLayout.setHorizontalGroup(
            abrirArqDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abrirArqDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abrirArqDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(abrirArqDialogLayout.createSequentialGroup()
                        .addComponent(nomeArqTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        abrirArqDialogLayout.setVerticalGroup(
            abrirArqDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abrirArqDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(abrirArqDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nomeArqTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        ErroDialog.setTitle("Erro");

        javax.swing.GroupLayout ErroDialogLayout = new javax.swing.GroupLayout(ErroDialog.getContentPane());
        ErroDialog.getContentPane().setLayout(ErroDialogLayout);
        ErroDialogLayout.setHorizontalGroup(
            ErroDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ErroDialogLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(msgErroLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        ErroDialogLayout.setVerticalGroup(
            ErroDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ErroDialogLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(msgErroLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 13, Short.MAX_VALUE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Máquina Virtual");
        setName("maquinaVirtualFrame"); // NOI18N
        setResizable(false);

        saidaTxtArea.setEditable(false);
        saidaTxtArea.setColumns(20);
        saidaTxtArea.setRows(5);
        jScrollPane3.setViewportView(saidaTxtArea);

        jLabel3.setText("Entrada");

        jLabel4.setText("Saída");

        enviarBtn.setText("Enviar");
        enviarBtn.setEnabled(false);

        codigoTxtArea.setEditable(false);
        codigoTxtArea.setColumns(20);
        codigoTxtArea.setRows(5);
        jScrollPane1.setViewportView(codigoTxtArea);

        memoriaTxtArea.setEditable(false);
        memoriaTxtArea.setColumns(20);
        memoriaTxtArea.setRows(5);
        jScrollPane2.setViewportView(memoriaTxtArea);

        bugTxtArea.setColumns(20);
        bugTxtArea.setRows(5);
        jScrollPane6.setViewportView(bugTxtArea);

        addParadaBtn.setText("Adicionar parada");
        addParadaBtn.setEnabled(false);
        addParadaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addParadaBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Linha |  Código");

        jLabel2.setText("Memória");

        jLabel6.setText("Número da linha de parada");

        jMenu1.setText("Arquivo");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });

        jMenu3.setText("Abrir Arquivo");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Executar");

        debugMenu.setText("Debug");
        debugMenu.setEnabled(false);
        debugMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                debugMenuMouseClicked(evt);
            }
        });
        jMenu2.add(debugMenu);

        runMenu.setText("Run");
        runMenu.setEnabled(false);
        jMenu2.add(runMenu);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(enviarBtn)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane6)
                                .addComponent(jLabel6)
                                .addComponent(addParadaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enviarBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addParadaBtn)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
     abrirArqDialog.setVisible(true);
     abrirArqDialog.setSize(350, 150);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        try {
            //C:/Users/Dell/Documents/NetBeansProjects/MaquinaVirtual/src/maquinavirtual/programa.asm
            prog = new Programa(nomeArqTxtField.getText());
            codigoTxtArea.setText(prog.arq.imprimir());

            debugMenu.setEnabled(true);
            runMenu.setEnabled(true);
            enviarBtn.setEnabled(true);
            addParadaBtn.setEnabled(true);
            nomeArqTxtField.setText("");
            abrirArqDialog.setVisible(false);
        } catch (FileNotFoundException ex) {
            ErroDialog.setVisible(true);
            ErroDialog.setSize(350, 150);
            msgErroLabel.setText("Arquivo não encontrado! Tente novamente.");
            saidaTxtArea.setText("Arquivo não encontrado! Tente novamente.");
        } catch (IOException ex) {
            Logger.getLogger(FrameMaquinaVirtual.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void debugMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_debugMenuMouseClicked
        // TODO add your handling code here:
        
        memoriaTxtArea.setText(prog.debug(prog.i).toString());
        //prog.debug(prog.i);
    }//GEN-LAST:event_debugMenuMouseClicked

    private void addParadaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addParadaBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addParadaBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameMaquinaVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMaquinaVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMaquinaVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMaquinaVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMaquinaVirtual().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog ErroDialog;
    private javax.swing.JDialog abrirArqDialog;
    private javax.swing.JButton addParadaBtn;
    private javax.swing.JTextArea bugTxtArea;
    private javax.swing.JTextArea codigoTxtArea;
    private javax.swing.JMenu debugMenu;
    private javax.swing.JButton enviarBtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea memoriaTxtArea;
    private javax.swing.JLabel msgErroLabel;
    private javax.swing.JTextField nomeArqTxtField;
    private javax.swing.JMenu runMenu;
    private javax.swing.JTextArea saidaTxtArea;
    // End of variables declaration//GEN-END:variables
}
