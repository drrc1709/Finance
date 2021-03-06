/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.Customers_Controller;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import utils.CellRenderer;
import utils.HeaderRenderer;
import utils.paneColor;

/**
 *
 * @author Daniel
 */
public class CustomersPanel extends javax.swing.JPanel {
    private final paneColor pc = new paneColor();

    /**
     * Creates new form CustomersPanel
     */
    public CustomersPanel() {
        initComponents();

        T_Customers.setBackground(new Color(44,62,80));
        JTableHeader h = T_Customers.getTableHeader();
        h.setDefaultRenderer(new HeaderRenderer());
        T_Customers.setTableHeader(h);

        T_Customers.getColumnModel().getColumn(0).setCellRenderer(new CellRenderer("numerico"));
        T_Customers.getColumnModel().getColumn(1).setCellRenderer(new CellRenderer("texto"));
        T_Customers.getColumnModel().getColumn(2).setCellRenderer(new CellRenderer("numerico"));
        T_Customers.getColumnModel().getColumn(3).setCellRenderer(new CellRenderer("texto"));
        T_Customers.getColumnModel().getColumn(4).setCellRenderer(new CellRenderer("texto"));
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tF_Id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tF_Name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tF_Phone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tF_Address = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tF_Mail = new javax.swing.JTextField();
        B_Save = new javax.swing.JButton();
        B_Clear = new javax.swing.JButton();
        B_Cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        T_Customers = new javax.swing.JTable();

        setBackground(new java.awt.Color(44, 62, 80));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 134, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CUSTOMERS");

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Register", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id");

        tF_Id.setBackground(new java.awt.Color(44, 62, 80));
        tF_Id.setForeground(new java.awt.Color(255, 255, 255));
        tF_Id.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(0, 3, 1, 0)));
        tF_Id.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");

        tF_Name.setBackground(new java.awt.Color(44, 62, 80));
        tF_Name.setForeground(new java.awt.Color(255, 255, 255));
        tF_Name.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(0, 3, 1, 0)));
        tF_Name.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phone");

        tF_Phone.setBackground(new java.awt.Color(44, 62, 80));
        tF_Phone.setForeground(new java.awt.Color(255, 255, 255));
        tF_Phone.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(0, 3, 1, 0)));
        tF_Phone.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");

        tF_Address.setBackground(new java.awt.Color(44, 62, 80));
        tF_Address.setForeground(new java.awt.Color(255, 255, 255));
        tF_Address.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(0, 3, 1, 0)));
        tF_Address.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mail");

        tF_Mail.setBackground(new java.awt.Color(44, 62, 80));
        tF_Mail.setForeground(new java.awt.Color(255, 255, 255));
        tF_Mail.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(0, 3, 1, 0)));
        tF_Mail.setCaretColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tF_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(tF_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tF_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tF_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tF_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tF_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tF_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tF_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tF_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tF_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
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
        B_Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ClearActionPerformed(evt);
            }
        });

        B_Cancel.setBackground(new java.awt.Color(255, 0, 0));
        B_Cancel.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        B_Cancel.setForeground(new java.awt.Color(255, 255, 255));
        B_Cancel.setText("Cancel");
        B_Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CancelActionPerformed(evt);
            }
        });

        T_Customers.setBackground(new java.awt.Color(44, 62, 80));
        T_Customers.setForeground(new java.awt.Color(51, 255, 51));
        T_Customers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Phone", "Address", "Mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        T_Customers.setFillsViewportHeight(true);
        T_Customers.setGridColor(new java.awt.Color(44, 62, 80));
        T_Customers.setSelectionBackground(new java.awt.Color(44, 62, 80));
        T_Customers.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(T_Customers);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(443, 443, 443)
                .addComponent(B_Save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(B_Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B_Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(559, 559, 559))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void B_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_SaveActionPerformed
        try {
            int id = Integer.parseInt(tF_Id.getText());
            String name = tF_Name.getText();
            long phone = Long.parseLong(tF_Phone.getText());
            String address = tF_Address.getText();
            String mail = tF_Mail.getText();

            Customers_Controller cc = new Customers_Controller();
            cc.RegisterCustomers(id, name, phone, address, mail);
            DefaultTableModel mCustomer = (DefaultTableModel) T_Customers.getModel();
            mCustomer.addRow((Object[]) cc.loadCustomers());
            T_Customers.setModel(mCustomer);

            tF_Address.setText(null);
            tF_Id.setText(null);
            tF_Mail.setText(null);
            tF_Name.setText(null);
            tF_Phone.setText(null);
        } catch (NumberFormatException e) {
            pc.getPanel(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_B_SaveActionPerformed

    private void B_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ClearActionPerformed
        tF_Address.setText(null);
        tF_Id.setText(null);
        tF_Mail.setText(null);
        tF_Name.setText(null);
        tF_Phone.setText(null);
    }//GEN-LAST:event_B_ClearActionPerformed

    private void B_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_B_CancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Cancel;
    private javax.swing.JButton B_Clear;
    private javax.swing.JButton B_Save;
    private javax.swing.JTable T_Customers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tF_Address;
    private javax.swing.JTextField tF_Id;
    private javax.swing.JTextField tF_Mail;
    private javax.swing.JTextField tF_Name;
    private javax.swing.JTextField tF_Phone;
    // End of variables declaration//GEN-END:variables
}
