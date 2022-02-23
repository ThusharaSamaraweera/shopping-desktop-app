/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.shopping.app.admin.manageAdmins;

import com.mycompany.shopping.app.admin.Generator;
import com.mycompany.shopping.app.admin.HashPassword;
import com.mycompany.shopping.app.admin.dashboard.SuperAdminDashboard;
import com.mycompany.shopping.app.admin.emailSender.gmail.GmailSMTP;
import com.mycompany.shopping.app.dbConnection.SqlConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author THUSH
 */
public class ManageAdmins extends javax.swing.JFrame {

    /**
     * Creates new form ManageAdmins
     */
    String user_type = "SA";
    
    public ManageAdmins() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        loadData();
        adminTypeDropdown.setSelectedIndex(-1);
    }

    Statement st = null;
    ResultSet re = null;
    PreparedStatement pst = null;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        form = new javax.swing.JPanel();
        firstNameLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailLabel1 = new javax.swing.JLabel();
        adminTypeDropdown = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        adminsTable = new javax.swing.JTable();
        activateBtn = new javax.swing.JButton();
        deactivateBtn = new javax.swing.JButton();
        MainTitle = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1400, 750));
        setMinimumSize(new java.awt.Dimension(1400, 750));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 700));

        form.setBackground(new java.awt.Color(255, 255, 255));

        firstNameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        firstNameLabel.setText(" First Name");

        firstNameTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lastNameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lastNameLabel.setText(" Last Name");

        lastNameTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        emailTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        emailLabel.setText(" Type");

        emailLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        emailLabel1.setText(" Email");

        adminTypeDropdown.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        adminTypeDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Super Admin", "Admin" }));

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(formLayout.createSequentialGroup()
                        .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formLayout.createSequentialGroup()
                        .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(lastNameTextField)))
                .addGap(42, 42, 42)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailTextField)
                    .addComponent(adminTypeDropdown, 0, 183, Short.MAX_VALUE))
                .addGap(206, 206, 206))
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminTypeDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        adminsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "First Name", "Last Name-", "Email", "AddedAt", "Type", "Actve"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        adminsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(adminsTable);
        if (adminsTable.getColumnModel().getColumnCount() > 0) {
            adminsTable.getColumnModel().getColumn(0).setResizable(false);
            adminsTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            adminsTable.getColumnModel().getColumn(2).setResizable(false);
            adminsTable.getColumnModel().getColumn(3).setResizable(false);
            adminsTable.getColumnModel().getColumn(3).setPreferredWidth(200);
            adminsTable.getColumnModel().getColumn(4).setResizable(false);
            adminsTable.getColumnModel().getColumn(5).setResizable(false);
            adminsTable.getColumnModel().getColumn(5).setPreferredWidth(50);
            adminsTable.getColumnModel().getColumn(6).setResizable(false);
            adminsTable.getColumnModel().getColumn(6).setPreferredWidth(50);
        }

        activateBtn.setBackground(new java.awt.Color(255, 204, 0));
        activateBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        activateBtn.setText("ACTIVATE");
        activateBtn.setBorder(null);
        activateBtn.setBorderPainted(false);
        activateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        activateBtn.setMaximumSize(new java.awt.Dimension(31, 17));
        activateBtn.setMinimumSize(new java.awt.Dimension(31, 17));
        activateBtn.setPreferredSize(new java.awt.Dimension(31, 17));
        activateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                activateBtnMouseClicked(evt);
            }
        });
        activateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activateBtnActionPerformed(evt);
            }
        });

        deactivateBtn.setBackground(new java.awt.Color(255, 204, 0));
        deactivateBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deactivateBtn.setText("DEACTIVATE");
        deactivateBtn.setBorder(null);
        deactivateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deactivateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deactivateBtnMouseClicked(evt);
            }
        });
        deactivateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deactivateBtnActionPerformed(evt);
            }
        });

        MainTitle.setFont(new java.awt.Font("Bodoni MT Black", 1, 18)); // NOI18N
        MainTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MainTitle.setText("Manage Admins");

        jPanel3.setBackground(new java.awt.Color(255, 204, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );

        backBtn.setBackground(new java.awt.Color(255, 204, 51));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backBtn.setText("BACK");
        backBtn.setBorder(null);
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        header.setBackground(new java.awt.Color(255, 204, 51));
        header.setMaximumSize(new java.awt.Dimension(1000, 750));

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));
        jPanel2.setMaximumSize(new java.awt.Dimension(1000, 32767));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 143));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\edu\\Edu IT\\edu projects\\project6\\Shopping-app\\shopping-desktop-app\\asserts\\images\\Textile-shop-header4.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1069, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        addBtn.setBackground(new java.awt.Color(255, 204, 0));
        addBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addBtn.setText("ADD");
        addBtn.setBorder(null);
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
        });
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        removeBtn.setBackground(new java.awt.Color(255, 204, 0));
        removeBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        removeBtn.setText("REMOVE");
        removeBtn.setBorder(null);
        removeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeBtnMouseClicked(evt);
            }
        });
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(activateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deactivateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(129, 129, 129))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(593, 593, 593)
                .addComponent(MainTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainTitle)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(activateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(deactivateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deactivateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deactivateBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deactivateBtnActionPerformed

    private void deactivateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deactivateBtnMouseClicked
        DefaultTableModel defaultTableModel = (DefaultTableModel)adminsTable.getModel();
        int selectIndex = adminsTable.getSelectedRow();

        // validation
        if(selectIndex == -1){
            JOptionPane.showMessageDialog(null, "Select admin in table");
            return;
        }

        String active = defaultTableModel.getValueAt(selectIndex, 6).toString();
        if(active.equals("Inactive")){
            JOptionPane.showMessageDialog(null, "Already inactive");
            return;
        }

        int id = Integer.parseInt(defaultTableModel.getValueAt(selectIndex, 0).toString());

        try {
            SqlConnection sqlConnection = new SqlConnection();
            pst = sqlConnection.con.prepareStatement("UPDATE signup set active=? WHERE signup_id=?");
            pst.setString(1, "0");
            pst.setInt(2, id);

            int result = JOptionPane.showConfirmDialog(null,"Want to deactivate?", "Warning",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "Deactivate successfully");
                pst.executeUpdate();
                loadData();
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_deactivateBtnMouseClicked

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeBtnActionPerformed

    private void removeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeBtnMouseClicked
        DefaultTableModel defaultTableModel = (DefaultTableModel)adminsTable.getModel();
        int selectIndex = adminsTable.getSelectedRow();

        // validation
        if(selectIndex == -1){
            JOptionPane.showMessageDialog(null, "Select admin in table");
            return;
        }

        int id = Integer.parseInt(defaultTableModel.getValueAt(selectIndex, 0).toString());

        int result = JOptionPane.showConfirmDialog(null,"Want to delete?", "Warning",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);

        if(result == JOptionPane.YES_OPTION){
            try {
                SqlConnection sqlConnection = new SqlConnection();
                pst = sqlConnection.con.prepareStatement("DELETE from signup WHERE signup_id=?");
                pst.setInt(1, id);

                JOptionPane.showMessageDialog(null, "Category removed successfully");
                pst.executeUpdate();
                loadData();

            } catch(SQLException e){
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_removeBtnMouseClicked

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBtnActionPerformed

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        String firstName = firstNameTextField .getText();
        String lastName = lastNameTextField.getText();
        String email = emailTextField.getText();

        if(firstName.isBlank()){
            JOptionPane.showMessageDialog(null, "Enter first name");
            return;
        }else if(lastName.isBlank()){
            JOptionPane.showMessageDialog(null, "Enter  last name");
            return;
        }else if(email.isBlank()){
            JOptionPane.showMessageDialog(null, "Enter email");
            return;
        }

        Object adminType = adminTypeDropdown.getSelectedItem();
        if(adminType == null){
            JOptionPane.showMessageDialog(null, "Select admin type");
            return;
        }
        String adminTypeString = adminType.toString();
        String adminTypeShort = null;
        if(adminTypeString.equals("Super Admin")){
            adminTypeShort = "SA";
        }else if(adminTypeString.equals("Admin")){
            adminTypeShort = "A";
        }

        try {
            SqlConnection sqlConnection = new SqlConnection();
            pst = sqlConnection.con.prepareStatement("INSERT INTO signup(first_name, last_name,email, password, user_type) VALUES (?,?,?,?,?)");

            // Generate password
            String generatedPassword = Generator.generateString(8);

            // hashing password
            String hash = HashPassword.hashPassword(generatedPassword);
            //            System.out.println(HashPassword.isValidPassword(generatedPassword, hash));

            System.out.println(generatedPassword);
//            GmailSMTP.sendEmail(email, generatedPassword, adminTypeString);

            pst.setString(1, firstName);
            pst.setString(2, lastName);
            pst.setString(3, email);
            pst.setString(4, hash);
            pst.setString(5, adminTypeShort);

            JOptionPane.showMessageDialog(null, "Added "+ adminTypeString +" successfully");
            pst.executeUpdate();
            loadData();

            adminTypeDropdown.setSelectedIndex(-1);
            firstNameTextField.setText("");
            lastNameTextField.setText("");
            emailTextField.setText("");

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_addBtnMouseClicked

    private void activateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activateBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_activateBtnActionPerformed

    private void activateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activateBtnMouseClicked
        DefaultTableModel defaultTableModel = (DefaultTableModel)adminsTable.getModel();
        int selectIndex = adminsTable.getSelectedRow();

        // validation
        if(selectIndex == -1){
            JOptionPane.showMessageDialog(null, "Select admin in table");
            return;
        }

        String active = defaultTableModel.getValueAt(selectIndex, 6).toString();
        if(active.equals("Active")){
            JOptionPane.showMessageDialog(null, "Already active");
            return;
        }

        int id = Integer.parseInt(defaultTableModel.getValueAt(selectIndex, 0).toString());

        try {
            SqlConnection sqlConnection = new SqlConnection();
            pst = sqlConnection.con.prepareStatement("UPDATE signup set active=? WHERE signup_id=?");
            pst.setString(1, "1");
            pst.setInt(2, id);

            int result = JOptionPane.showConfirmDialog(null,"Want to activate?", "Warning",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "Activate successfully");
                pst.executeUpdate();
                loadData();
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_activateBtnMouseClicked

    private void adminsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminsTableMouseClicked

    }//GEN-LAST:event_adminsTableMouseClicked

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        new SuperAdminDashboard(user_type).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

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
            java.util.logging.Logger.getLogger(ManageAdmins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageAdmins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageAdmins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageAdmins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageAdmins().setVisible(true);

            }
        });
    }
    
    public void loadData(){
        int noOfColums = 7;

        try{
            SqlConnection sqlConnection = new SqlConnection();
            st = sqlConnection.con.createStatement();
            String qu = "SELECT * FROM signup WHERE user_type='A' OR user_type='SA'";
            re = st.executeQuery(qu);          
            
            DefaultTableModel defaultTableModel = (DefaultTableModel)adminsTable.getModel();
            defaultTableModel.setRowCount(0);
            
            while(re.next()){
                Vector vector = new Vector();
                for(int i=1; i<=noOfColums; i++){
                    vector.add(re.getString("signup_id"));
                    vector.add(re.getString("first_name"));
                    vector.add(re.getString("last_name"));
                    vector.add(re.getString("email"));
                    vector.add(re.getString("createdAt"));                    
                    if(re.getString("user_type").equals("SA")){
                        vector.add("Super Admin");                   
                    } else{
                        vector.add("Admin");                        
                    }

                    if(re.getString("active").equals("1")){
                        vector.add("Active");
                    }else{
                        vector.add("Inactive");
                    }
                }
                defaultTableModel.addRow(vector);

            }
            Vector vector = new Vector();
            
        } catch(SQLException e){
            System.out.println(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MainTitle;
    private javax.swing.JButton activateBtn;
    private javax.swing.JButton addBtn;
    private javax.swing.JComboBox<String> adminTypeDropdown;
    private javax.swing.JTable adminsTable;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deactivateBtn;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailLabel1;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JPanel form;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JButton removeBtn;
    // End of variables declaration//GEN-END:variables
}
