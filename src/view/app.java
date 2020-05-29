/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import org.json.JSONException;
import utils.explode;

/**
 *
 * @author Daniel
 */
public class app extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    private final CashReceiptPanel crp = new CashReceiptPanel();
    private final PettyCashPanel pcp = new PettyCashPanel();
    private final AccountPanel ap = new AccountPanel();
    private final BankPanel bp = new BankPanel();
    private final CustomersPanel cp = new CustomersPanel();
    private final ProvidersPanel pp = new ProvidersPanel();
    private final appPanel appp = new appPanel();
    private final Quotation q = new Quotation();
    private final Quotation1 q1 = new Quotation1();
    private Glosary g = null;

    /**
     * Creates new form app
     * @throws java.io.FileNotFoundException
     * @throws org.json.JSONException
     */
    public app() throws FileNotFoundException, JSONException {
        try {
            initComponents();
            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            new explode(appPl, appp).play();

            g = new Glosary();
        } catch (IOException ex) {
            Logger.getLogger(app.class.getName()).log(Level.SEVERE, null, ex);
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

        appPl = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MStart = new javax.swing.JMenu();
        MMenu = new javax.swing.JMenu();
        MInvoice = new javax.swing.JMenu();
        MI_Quotation = new javax.swing.JMenuItem();
        MChash = new javax.swing.JMenu();
        MPetty = new javax.swing.JMenu();
        MAccount = new javax.swing.JMenu();
        MBank = new javax.swing.JMenu();
        MCustomers = new javax.swing.JMenu();
        MProviders = new javax.swing.JMenu();
        MHelp = new javax.swing.JMenu();
        Glosary = new javax.swing.JMenuItem();
        jMI_Quotation = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FINANCE");
        setBackground(new java.awt.Color(44, 62, 80));

        appPl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout appPlLayout = new javax.swing.GroupLayout(appPl);
        appPl.setLayout(appPlLayout);
        appPlLayout.setHorizontalGroup(
            appPlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );
        appPlLayout.setVerticalGroup(
            appPlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );

        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        MStart.setBackground(new java.awt.Color(0, 0, 0));
        MStart.setText("Start");
        MStart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MStartMouseClicked(evt);
            }
        });
        jMenuBar1.add(MStart);

        MMenu.setText("Menu");
        MMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        MInvoice.setText("Networks");
        MInvoice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        MI_Quotation.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        MI_Quotation.setText("Quotation");
        MI_Quotation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MI_Quotation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MI_QuotationMouseClicked(evt);
            }
        });
        MI_Quotation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_QuotationActionPerformed(evt);
            }
        });
        MInvoice.add(MI_Quotation);

        MMenu.add(MInvoice);

        jMenuBar1.add(MMenu);

        MChash.setText("Cash Receipt");
        MChash.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MChash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MChashMouseClicked(evt);
            }
        });
        jMenuBar1.add(MChash);

        MPetty.setText("Petty Cash");
        MPetty.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MPetty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MPettyMouseClicked(evt);
            }
        });
        jMenuBar1.add(MPetty);

        MAccount.setText("Account");
        MAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MAccountMouseClicked(evt);
            }
        });
        jMenuBar1.add(MAccount);

        MBank.setText("Bank");
        MBank.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MBank.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MBankMouseClicked(evt);
            }
        });
        jMenuBar1.add(MBank);

        MCustomers.setText("Customers");
        MCustomers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MCustomersMouseClicked(evt);
            }
        });
        jMenuBar1.add(MCustomers);

        MProviders.setText("Providers");
        MProviders.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MProviders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MProvidersMouseClicked(evt);
            }
        });
        jMenuBar1.add(MProviders);

        MHelp.setText("Help");
        MHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MHelpActionPerformed(evt);
            }
        });

        Glosary.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        Glosary.setText("Glosary");
        Glosary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Glosary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GlosaryActionPerformed(evt);
            }
        });
        MHelp.add(Glosary);

        jMI_Quotation.setText("Quotation");
        jMI_Quotation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMI_Quotation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_QuotationActionPerformed(evt);
            }
        });
        MHelp.add(jMI_Quotation);

        jMenuBar1.add(MHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appPl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appPl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MChashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MChashMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            new explode(appPl, crp).play();
        }
    }//GEN-LAST:event_MChashMouseClicked

    private void MPettyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MPettyMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            new explode(appPl, pcp).play();
        }
    }//GEN-LAST:event_MPettyMouseClicked

    private void MAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MAccountMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            new explode(appPl, ap).play();
        }
    }//GEN-LAST:event_MAccountMouseClicked

    private void MBankMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MBankMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            new explode(appPl, bp).play();
        }
    }//GEN-LAST:event_MBankMouseClicked

    private void MCustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MCustomersMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            new explode(appPl, cp).play();
        }
    }//GEN-LAST:event_MCustomersMouseClicked

    private void MProvidersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MProvidersMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            new explode(appPl, pp).play();
        }
    }//GEN-LAST:event_MProvidersMouseClicked

    private void MStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MStartMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            new explode(appPl, appp).play();
        }
    }//GEN-LAST:event_MStartMouseClicked

    private void MI_QuotationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MI_QuotationMouseClicked
    }//GEN-LAST:event_MI_QuotationMouseClicked

    private void MI_QuotationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_QuotationActionPerformed
        new explode(appPl, q).play();
    }//GEN-LAST:event_MI_QuotationActionPerformed

    private void GlosaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GlosaryActionPerformed
        try {
            new explode(appPl, g).play();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_GlosaryActionPerformed

    private void MHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MHelpActionPerformed
        
    }//GEN-LAST:event_MHelpActionPerformed

    private void jMI_QuotationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_QuotationActionPerformed
        new explode(appPl, q1).play();
    }//GEN-LAST:event_jMI_QuotationActionPerformed

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
                if ("FlatLaf Dark".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new app().setVisible(true);
            } catch (FileNotFoundException | JSONException ex) {
                Logger.getLogger(app.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Glosary;
    private javax.swing.JMenu MAccount;
    private javax.swing.JMenu MBank;
    private javax.swing.JMenu MChash;
    private javax.swing.JMenu MCustomers;
    private javax.swing.JMenu MHelp;
    private javax.swing.JMenuItem MI_Quotation;
    private javax.swing.JMenu MInvoice;
    private javax.swing.JMenu MMenu;
    private javax.swing.JMenu MPetty;
    private javax.swing.JMenu MProviders;
    private javax.swing.JMenu MStart;
    private javax.swing.JPanel appPl;
    private javax.swing.JMenuItem jMI_Quotation;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
