/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.google.gson.Gson;
import control.Product_Controller;
import control.Quotation_Controller;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import model.Customer;
import model.Products;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import utils.CellRenderer;
import utils.CustomUI;
import utils.HeaderRenderer;
import utils.paneColor;

/**
 *
 * @author Daniel
 */
public final class QuoationForm extends javax.swing.JDialog {

    private final Product_Controller pc = new Product_Controller();
    private final paneColor pco = new paneColor();
    private final DefaultTableModel m_QF;
    private final Quotation_Controller qc = new Quotation_Controller();
    private Quotation Q;

    /**
     * Creates new form QuoationForm
     *
     * @param parent
     * @param modal
     * @throws java.io.IOException
     * @throws org.json.JSONException
     */
    public QuoationForm(java.awt.Frame parent, boolean modal) throws IOException, JSONException {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        m_QF = (DefaultTableModel) T_QF.getModel();
        JTextField tf = ((JSpinner.DefaultEditor) spin.getEditor()).getTextField();
        tf.setBackground(new Color(44, 62, 80));
        tf.setForeground(Color.green);
        tf.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0,
                new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(0, 3, 1, 6)));

        combo.setModel(new DefaultComboBoxModel());
        combo.setUI(CustomUI.createUI(combo));
        DefaultComboBoxModel model = (DefaultComboBoxModel) combo.getModel();
        JSONArray array = request();

        for (int i = 0; i < array.length(); i++) {
            JSONObject object = array.getJSONObject(i);
            Gson gson = new Gson();
            Products p = gson.fromJson(object.toString(), Products.class);
            model.addElement(p);
        }

        combo.addItemListener((ItemEvent e) -> {
            TF_UP.setValue((((Products) model.getElementAt(combo.getSelectedIndex())).getPrice()));
        });

        JTableHeader h = T_QF.getTableHeader();
        h.setDefaultRenderer(new HeaderRenderer());
        T_QF.setTableHeader(h);

        T_QF.getColumnModel().getColumn(0).setCellRenderer(new CellRenderer("texto"));
        T_QF.getColumnModel().getColumn(1).setCellRenderer(new CellRenderer("currency"));
        T_QF.getColumnModel().getColumn(2).setCellRenderer(new CellRenderer("numerico"));
        T_QF.getColumnModel().getColumn(3).setCellRenderer(new CellRenderer("currency"));

    }

    public static JSONArray request() throws IOException, JSONException {
        JSONArray array;
        String path = "C:\\products.json";
        StringBuffer response;
        try (
                BufferedReader in = new BufferedReader(new FileReader(path))) {
            String inputLine;
            response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
        }
        JSONObject myResponse = new JSONObject(response.toString());
        array = myResponse.getJSONArray("products");
        return array;
    }
    
    public void setQ(Quotation quotation) {
        this.Q = quotation;
    }

    public int totalSum() {
        int sum = 0;
        for (int i = 0; i < T_QF.getRowCount(); i++) {
            sum = sum + Integer.parseInt(T_QF.getValueAt(i, 3).toString());
        }
        return sum;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        combo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spin = new javax.swing.JSpinner();
        TF_T = new javax.swing.JFormattedTextField();
        TF_UP = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        tF_Id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tF_Name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tF_Mail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tF_Address = new javax.swing.JTextField();
        tF_Phone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        B_Add = new javax.swing.JButton();
        B_Remove = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        tF_No = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        T_QF = new javax.swing.JTable();
        Save = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        TF_T1 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(44, 62, 80));

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 134, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUOTATION");

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        combo.setBackground(new java.awt.Color(44, 62, 80));
        combo.setForeground(new java.awt.Color(255, 255, 255));
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(0, 3, 1, 0)));
        combo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboItemStateChanged(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Unit Price");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cant.");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total Product");

        spin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spin.setBorder(null);
        spin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        spin.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinStateChanged(evt);
            }
        });

        TF_T.setEditable(false);
        TF_T.setBackground(new java.awt.Color(44, 62, 80));
        TF_T.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 3)));
        TF_T.setForeground(new java.awt.Color(255, 255, 0));
        TF_T.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤#,##0"))));
        TF_T.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        TF_UP.setEditable(false);
        TF_UP.setBackground(new java.awt.Color(44, 62, 80));
        TF_UP.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 3)));
        TF_UP.setForeground(new java.awt.Color(255, 255, 0));
        TF_UP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤#,##0"))));
        TF_UP.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Id");

        tF_Id.setBackground(new java.awt.Color(44, 62, 80));
        tF_Id.setForeground(new java.awt.Color(255, 255, 255));
        tF_Id.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(0, 3, 1, 0)));
        tF_Id.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Name");

        tF_Name.setBackground(new java.awt.Color(44, 62, 80));
        tF_Name.setForeground(new java.awt.Color(255, 255, 255));
        tF_Name.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(0, 3, 1, 0)));
        tF_Name.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Phone");

        tF_Mail.setBackground(new java.awt.Color(44, 62, 80));
        tF_Mail.setForeground(new java.awt.Color(255, 255, 255));
        tF_Mail.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(0, 3, 1, 0)));
        tF_Mail.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");

        tF_Address.setBackground(new java.awt.Color(44, 62, 80));
        tF_Address.setForeground(new java.awt.Color(255, 255, 255));
        tF_Address.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(0, 3, 1, 0)));
        tF_Address.setCaretColor(new java.awt.Color(255, 255, 255));

        tF_Phone.setBackground(new java.awt.Color(44, 62, 80));
        tF_Phone.setForeground(new java.awt.Color(255, 255, 255));
        tF_Phone.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(0, 3, 1, 0)));
        tF_Phone.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Product");

        B_Add.setBackground(new java.awt.Color(0, 0, 255));
        B_Add.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        B_Add.setForeground(new java.awt.Color(255, 255, 255));
        B_Add.setText("Add");
        B_Add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Add.setPreferredSize(new java.awt.Dimension(83, 22));
        B_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_AddActionPerformed(evt);
            }
        });

        B_Remove.setBackground(new java.awt.Color(255, 153, 153));
        B_Remove.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        B_Remove.setForeground(new java.awt.Color(255, 255, 255));
        B_Remove.setText("Remove");
        B_Remove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_RemoveActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("No.");

        tF_No.setBackground(new java.awt.Color(44, 62, 80));
        tF_No.setForeground(new java.awt.Color(255, 255, 255));
        tF_No.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(0, 3, 1, 0)));
        tF_No.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mail");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tF_No, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tF_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tF_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tF_Mail))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TF_UP, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spin, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(TF_T, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(B_Add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B_Remove)))
                        .addGap(58, 58, 58))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tF_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tF_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tF_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(tF_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tF_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(tF_No, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tF_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tF_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(TF_T, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Remove)
                    .addComponent(spin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_UP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(67, 67, 67))
        );

        T_QF.setBackground(new java.awt.Color(44, 62, 80));
        T_QF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Unit Price", "Cant", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        T_QF.setFillsViewportHeight(true);
        jScrollPane1.setViewportView(T_QF);

        Save.setBackground(new java.awt.Color(76, 201, 91));
        Save.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Save.setForeground(new java.awt.Color(255, 255, 255));
        Save.setText("Save");
        Save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Clear.setBackground(new java.awt.Color(0, 153, 153));
        Clear.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("Clear");
        Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Cancel.setBackground(new java.awt.Color(255, 0, 0));
        Cancel.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Cancel.setForeground(new java.awt.Color(255, 255, 255));
        Cancel.setText("Cancel");
        Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Total");

        TF_T1.setEditable(false);
        TF_T1.setBackground(new java.awt.Color(44, 62, 80));
        TF_T1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 3)));
        TF_T1.setForeground(new java.awt.Color(255, 255, 0));
        TF_T1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤#,##0"))));
        TF_T1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(29, 29, 29)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TF_T1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(Save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addComponent(Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(294, 294, 294))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Save)
                    .addComponent(Clear)
                    .addComponent(Cancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboItemStateChanged

    }//GEN-LAST:event_comboItemStateChanged

    private void spinStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinStateChanged
        int price = (int) TF_UP.getValue();
        int cant = (int) spin.getValue();
        int r = price * cant;
        TF_T.setValue(r);
    }//GEN-LAST:event_spinStateChanged

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        try {
            int no = Integer.parseInt(tF_No.getText());
            int id = Integer.parseInt(tF_Id.getText());
            String name = tF_Name.getText();
            long phone = Long.parseLong(tF_Mail.getText());
            String address = tF_Address.getText();
            String mail = tF_Phone.getText();
            int t = (int) TF_T1.getValue();
            int p = T_QF.getRowCount();

            Customer c = new Customer();

            c.setId(id);
            c.setName(name);
            c.setPhone(phone);
            c.setAddress(address);
            c.setEmail(mail);

            qc.registerQuotation(no, c, t, p);

            this.updatTable();

            tF_No.setText(null);
            TF_UP.setText(null);
            TF_UP.setValue(null);
            combo.setSelectedIndex(0);
            JTextField tf = ((JSpinner.DefaultEditor) spin.getEditor()).getTextField();
            tf.setText(0 + "");
            TF_T.setText(null);
            TF_T.setValue(null);
            TF_T1.setText(null);
            TF_T1.setValue(null);
            tF_Address.setText(null);
            tF_Id.setText(null);
            tF_Phone.setText(null);
            tF_Name.setText(null);
            tF_Mail.setText(null);
            m_QF.setRowCount(0);
            this.dispose();
        } catch (NumberFormatException e) {
            pco.getPanel(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SaveActionPerformed

    public void updatTable() {
        DefaultTableModel mQuotation = (DefaultTableModel) Q.T_Quotation.getModel();
        mQuotation.addRow((Object[]) qc.loadQuotation());
        Q.T_Quotation.setModel(mQuotation);
    }

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        tF_No.setText(null);
        TF_UP.setText(null);
        TF_UP.setValue(null);
        combo.setSelectedIndex(0);
        JTextField tf = ((JSpinner.DefaultEditor) spin.getEditor()).getTextField();
        tf.setText(0 + "");
        TF_T.setText(null);
        TF_T.setValue(null);
        TF_T1.setText(null);
        TF_T1.setValue(null);
        tF_Address.setText(null);
        tF_Id.setText(null);
        tF_Phone.setText(null);
        tF_Name.setText(null);
        tF_Mail.setText(null);
        m_QF.setRowCount(0);
    }//GEN-LAST:event_ClearActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        tF_No.setText(null);
        TF_UP.setText(null);
        TF_UP.setValue(null);
        combo.setSelectedIndex(0);
        JTextField tf = ((JSpinner.DefaultEditor) spin.getEditor()).getTextField();
        tf.setText(0 + "");
        TF_T.setText(null);
        TF_T.setValue(null);
        TF_T1.setText(null);
        TF_T1.setValue(null);
        tF_Address.setText(null);
        tF_Id.setText(null);
        tF_Phone.setText(null);
        tF_Name.setText(null);
        tF_Mail.setText(null);
        m_QF.setRowCount(0);
        this.dispose();
    }//GEN-LAST:event_CancelActionPerformed

    private void B_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_AddActionPerformed
        try {
            String product = combo.getSelectedItem().toString();
            int unitPrice = (int) TF_UP.getValue();
            int cant = (int) spin.getValue();
            int total = (int) TF_T.getValue();

            pc.register(product, unitPrice, cant, total);

            m_QF.addRow((Object[]) pc.show());
            T_QF.setModel(m_QF);
            TF_T1.setValue(totalSum());

            TF_UP.setText(null);
            TF_UP.setValue(null);
            combo.setSelectedIndex(0);
            JTextField tf = ((JSpinner.DefaultEditor) spin.getEditor()).getTextField();
            tf.setText(0 + "");
            TF_T.setText(null);
            TF_T.setValue(null);
        } catch (Exception e) {
            pco.getPanel(rootPane, "Please, Select a product", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_B_AddActionPerformed

    private void B_RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_RemoveActionPerformed
        DefaultTableModel model_QF = (DefaultTableModel) T_QF.getModel();
        if (T_QF.getSelectedRow() < 0) {
            pco.getPanel(rootPane, "Please, Select a row to remove", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            model_QF.removeRow(T_QF.getSelectedRow());
            TF_T1.setValue(totalSum());
        }
    }//GEN-LAST:event_B_RemoveActionPerformed

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
            java.util.logging.Logger.getLogger(QuoationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuoationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuoationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuoationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                QuoationForm dialog = new QuoationForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            } catch (IOException | JSONException ex) {
                Logger.getLogger(QuoationForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Add;
    private javax.swing.JButton B_Remove;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Save;
    private javax.swing.JFormattedTextField TF_T;
    private javax.swing.JFormattedTextField TF_T1;
    private javax.swing.JFormattedTextField TF_UP;
    private javax.swing.JTable T_QF;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spin;
    private javax.swing.JTextField tF_Address;
    private javax.swing.JTextField tF_Id;
    private javax.swing.JTextField tF_Mail;
    private javax.swing.JTextField tF_Name;
    private javax.swing.JTextField tF_No;
    private javax.swing.JTextField tF_Phone;
    // End of variables declaration//GEN-END:variables
}
