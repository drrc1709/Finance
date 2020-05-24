/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.Banks_Controller;
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
public class BankPanel extends javax.swing.JPanel {

    private final paneColor pc = new paneColor();

    /**
     * Creates new form BankPanel
     */
    public BankPanel() {
        initComponents();

        JTableHeader h = T_Bank.getTableHeader();
        h.setDefaultRenderer(new HeaderRenderer());
        T_Bank.setTableHeader(h);

        for (int i = 0; i < T_Bank.getColumnCount(); i++) {
            T_Bank.getColumnModel().getColumn(i).setCellRenderer(new CellRenderer("texto"));
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

        jScrollPane1 = new javax.swing.JScrollPane();
        T_Bank = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tF_Id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tF_Name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tF_Number = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tF_Manager = new javax.swing.JTextField();
        Address = new javax.swing.JLabel();
        tF_Address = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tF_Website = new javax.swing.JTextField();
        B_Save = new javax.swing.JButton();
        B_Clear = new javax.swing.JButton();
        B_Cancel = new javax.swing.JButton();

        setBackground(new java.awt.Color(44, 62, 80));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        T_Bank.setBackground(new java.awt.Color(44, 62, 80));
        T_Bank.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Number", "Account"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        T_Bank.setFillsViewportHeight(true);
        T_Bank.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(T_Bank);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 134, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BANKS");

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
        jLabel4.setText("Number");

        tF_Number.setBackground(new java.awt.Color(44, 62, 80));
        tF_Number.setForeground(new java.awt.Color(255, 255, 255));
        tF_Number.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(0, 3, 1, 0)));
        tF_Number.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Manager");

        tF_Manager.setBackground(new java.awt.Color(44, 62, 80));
        tF_Manager.setForeground(new java.awt.Color(255, 255, 255));
        tF_Manager.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(0, 3, 1, 0)));
        tF_Manager.setCaretColor(new java.awt.Color(255, 255, 255));

        Address.setForeground(new java.awt.Color(255, 255, 255));
        Address.setText("Address");

        tF_Address.setBackground(new java.awt.Color(44, 62, 80));
        tF_Address.setForeground(new java.awt.Color(255, 255, 255));
        tF_Address.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(0, 3, 1, 0)));
        tF_Address.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("WebSite");

        tF_Website.setBackground(new java.awt.Color(44, 62, 80));
        tF_Website.setForeground(new java.awt.Color(255, 255, 255));
        tF_Website.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(0, 3, 1, 0)));
        tF_Website.setCaretColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tF_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tF_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tF_Number, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tF_Manager, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tF_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tF_Website, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(tF_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tF_Manager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Address)
                    .addComponent(jLabel7)
                    .addComponent(tF_Website, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tF_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(B_Save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(B_Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(B_Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(240, 240, 240))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void B_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_SaveActionPerformed
        try {
            Banks_Controller bc = new Banks_Controller();

            int id = Integer.parseInt(tF_Id.getText());
            String name = tF_Name.getText();
            int number = Integer.parseInt(tF_Number.getText());
            String manager = tF_Manager.getText().trim();
            String address = tF_Address.getText().trim();
            String website = tF_Website.getText().trim();

            bc.BanksRegister(id, name, number, manager, address, website);

            DefaultTableModel mBank = (DefaultTableModel) T_Bank.getModel();
            mBank.addRow((Object[]) bc.BankLoad());
            T_Bank.setModel(mBank);

            tF_Id.setText(null);
            tF_Name.setText(null);
            tF_Number.setText(null);
            tF_Manager.setText(null);
            tF_Address.setText(null);
            tF_Website.setText(null);

        } catch (NumberFormatException e) {
            pc.getPanel(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_B_SaveActionPerformed

    private void B_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ClearActionPerformed
        tF_Id.setText(null);
        tF_Name.setText(null);
        tF_Number.setText(null);
        tF_Manager.setText(null);
        tF_Address.setText(null);
        tF_Website.setText(null);
    }//GEN-LAST:event_B_ClearActionPerformed

    private void B_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_B_CancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JButton B_Cancel;
    private javax.swing.JButton B_Clear;
    private javax.swing.JButton B_Save;
    private javax.swing.JTable T_Bank;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tF_Address;
    private javax.swing.JTextField tF_Id;
    private javax.swing.JTextField tF_Manager;
    private javax.swing.JTextField tF_Name;
    private javax.swing.JTextField tF_Number;
    private javax.swing.JTextField tF_Website;
    // End of variables declaration//GEN-END:variables
}
