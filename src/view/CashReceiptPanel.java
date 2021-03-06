/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.CashReceipt_Controller;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import model.Account;
import model.Customer;
import utils.CellRenderer;
import utils.HeaderRenderer;
import utils.paneColor;

/**
 *
 * @author Daniel
 */
public class CashReceiptPanel extends javax.swing.JPanel {

    private static final long serialVersionUID = 1L;
    private final CashReceipt_Controller crcc = new CashReceipt_Controller();
    private final Account a = new Account();
    private final Customer c = new Customer();
    private final paneColor pc = new paneColor();

    /**
     * Creates new form CashReceiptPanel
     */
    public CashReceiptPanel() {
        initComponents();

        JTableHeader h = TableCashReceipts.getTableHeader();
        h.setDefaultRenderer(new HeaderRenderer());
        TableCashReceipts.setTableHeader(h);

        TableCashReceipts.getColumnModel().getColumn(0).setCellRenderer(new CellRenderer("numerico"));
        TableCashReceipts.getColumnModel().getColumn(1).setCellRenderer(new CellRenderer("texto"));
        TableCashReceipts.getColumnModel().getColumn(2).setCellRenderer(new CellRenderer("texto"));
        TableCashReceipts.getColumnModel().getColumn(3).setCellRenderer(new CellRenderer("texto"));
        TableCashReceipts.getColumnModel().getColumn(4).setCellRenderer(new CellRenderer("currency"));
        TableCashReceipts.getColumnModel().getColumn(5).setCellRenderer(new CellRenderer("texto"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableCashReceipts = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tF_No = new javax.swing.JTextField();
        tF_Customer = new javax.swing.JTextField();
        tF_Account = new javax.swing.JTextField();
        tF_Concept = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jDate = new com.toedter.calendar.JDateChooser();
        tF_Sum = new javax.swing.JTextField();
        B_Save = new javax.swing.JButton();
        B_Clear = new javax.swing.JButton();
        B_Cancel = new javax.swing.JButton();

        setBackground(new java.awt.Color(44, 62, 80));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 134, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CASH REGISTER RECEIPTS");

        TableCashReceipts.setBackground(new java.awt.Color(44, 62, 80));
        TableCashReceipts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Date", "Customer", "Account", "Sum", "Concept"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableCashReceipts.setFillsViewportHeight(true);
        TableCashReceipts.setFocusCycleRoot(true);
        TableCashReceipts.setFocusTraversalPolicyProvider(true);
        TableCashReceipts.setSurrendersFocusOnKeystroke(true);
        TableCashReceipts.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TableCashReceipts);

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Register", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setToolTipText("");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Customer");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Account");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Concept");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No.");

        tF_No.setBackground(new java.awt.Color(44, 62, 80));
        tF_No.setForeground(new java.awt.Color(255, 255, 255));
        tF_No.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(0, 3, 1, 0)));
        tF_No.setCaretColor(new java.awt.Color(255, 255, 255));

        tF_Customer.setBackground(new java.awt.Color(44, 62, 80));
        tF_Customer.setForeground(new java.awt.Color(255, 255, 255));
        tF_Customer.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(0, 3, 1, 0)));
        tF_Customer.setCaretColor(new java.awt.Color(255, 255, 255));

        tF_Account.setBackground(new java.awt.Color(44, 62, 80));
        tF_Account.setForeground(new java.awt.Color(255, 255, 255));
        tF_Account.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(0, 3, 1, 0)));
        tF_Account.setCaretColor(new java.awt.Color(255, 255, 255));

        tF_Concept.setBackground(new java.awt.Color(44, 62, 80));
        tF_Concept.setForeground(new java.awt.Color(255, 255, 255));
        tF_Concept.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(0, 3, 1, 0)));
        tF_Concept.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sum    $");

        tF_Sum.setBackground(new java.awt.Color(44, 62, 80));
        tF_Sum.setForeground(new java.awt.Color(255, 255, 255));
        tF_Sum.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(0, 3, 1, 0)));
        tF_Sum.setCaretColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tF_No, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tF_Customer, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(7, 7, 7)
                        .addComponent(tF_Account, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tF_Sum))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(10, 10, 10)
                        .addComponent(tF_Concept)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tF_Customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tF_No, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tF_Account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tF_Sum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8))
                    .addComponent(tF_Concept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        B_Save.setBackground(new java.awt.Color(76, 201, 91));
        B_Save.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        B_Save.setForeground(new java.awt.Color(255, 255, 255));
        B_Save.setText("Save");
        B_Save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_SaveActionPerformed(evt);
            }
        });

        B_Clear.setBackground(new java.awt.Color(0, 153, 153));
        B_Clear.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        B_Clear.setForeground(new java.awt.Color(255, 255, 255));
        B_Clear.setText("Clear");
        B_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ClearActionPerformed(evt);
            }
        });

        B_Cancel.setBackground(new java.awt.Color(255, 0, 0));
        B_Cancel.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        B_Cancel.setForeground(new java.awt.Color(255, 255, 255));
        B_Cancel.setText("Cancel");
        B_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(B_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 64, Short.MAX_VALUE)
                .addGap(67, 67, 67)
                .addComponent(B_Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(72, 72, 72)
                .addComponent(B_Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(355, 355, 355))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void B_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_SaveActionPerformed
        try {
            int no = Integer.parseInt(tF_No.getText().trim());

            Date date = jDate.getDate();
            a.setOwner(tF_Account.getText().trim());
            c.setName(tF_Customer.getText().trim());
            int sum = Integer.parseInt(tF_Sum.getText().trim());
            String concept = tF_Concept.getText().trim();

            crcc.CashRegisterReceipts(no, date, c, a, sum, concept);

            DefaultTableModel modelCashReceipt = (DefaultTableModel) TableCashReceipts.getModel();
            modelCashReceipt.addRow((Object[]) crcc.loadCash());
            TableCashReceipts.setModel(modelCashReceipt);

            tF_No.setText(null);
            tF_Account.setText(null);
            tF_Concept.setText(null);
            tF_Customer.setText(null);
            tF_Sum.setText(null);
            jDate.setDate(null);

        } catch (Exception e) {
            pc.getPanel(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_B_SaveActionPerformed

    private void B_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ClearActionPerformed
        tF_No.setText(null);
        tF_Account.setText(null);
        tF_Concept.setText(null);
        tF_Customer.setText(null);
        tF_Sum.setText(null);
        jDate.setDate(null);
    }//GEN-LAST:event_B_ClearActionPerformed

    private void B_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_B_CancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Cancel;
    private javax.swing.JButton B_Clear;
    private javax.swing.JButton B_Save;
    private javax.swing.JTable TableCashReceipts;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tF_Account;
    private javax.swing.JTextField tF_Concept;
    private javax.swing.JTextField tF_Customer;
    private javax.swing.JTextField tF_No;
    private javax.swing.JTextField tF_Sum;
    // End of variables declaration//GEN-END:variables
}
