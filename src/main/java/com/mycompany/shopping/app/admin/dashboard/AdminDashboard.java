/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopping.app.admin.dashboard;

import com.mycompany.shopping.app.admin.customer.ManageCustomers;
import com.mycompany.shopping.app.admin.login.Login;
import com.mycompany.shopping.app.admin.manageCategory.ManageCategory;
import com.mycompany.shopping.app.admin.manageProduct.ManageProduct;
import com.mycompany.shopping.app.admin.orders.ManageOrders;

/**
 *
 * @author Gayan Malinda
 */
public class AdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form homeForm
     */
    String user_type = null;
    public AdminDashboard(String user) {
        initComponents();
        user_type = user;
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
        header = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        logoutBtn = new javax.swing.JButton();
        product = new javax.swing.JPanel();
        productIcon = new javax.swing.JLabel();
        productLabel = new javax.swing.JTextField();
        category = new javax.swing.JPanel();
        categoryLabel = new javax.swing.JTextField();
        categoryIcon = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        customerIcon = new javax.swing.JLabel();
        customerLabel = new javax.swing.JTextField();
        orders = new javax.swing.JPanel();
        orderLabel = new javax.swing.JTextField();
        orderIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 584));

        header.setBackground(new java.awt.Color(255, 204, 51));

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));
        jPanel2.setMaximumSize(new java.awt.Dimension(1000, 32767));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 143));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\edu\\Edu IT\\edu projects\\project6\\Shopping-app\\shopping-desktop-app\\asserts\\images\\Textile-shop-header4.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        footer.setBackground(new java.awt.Color(255, 204, 51));

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 132, Short.MAX_VALUE)
        );

        logoutBtn.setBackground(new java.awt.Color(255, 204, 51));
        logoutBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logoutBtn.setText("Log Out");
        logoutBtn.setBorder(null);
        logoutBtn.setBorderPainted(false);
        logoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
        });
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        product.setBackground(new java.awt.Color(255, 204, 51));
        product.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productMouseClicked(evt);
            }
        });

        productIcon.setBackground(new java.awt.Color(255, 255, 255));
        productIcon.setForeground(new java.awt.Color(255, 153, 51));
        productIcon.setIcon(new javax.swing.ImageIcon("D:\\edu\\Edu IT\\edu projects\\project6\\Shopping-app\\shopping-desktop-app\\asserts\\images\\product-icon.png")); // NOI18N
        productIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productIconMouseClicked(evt);
            }
        });

        productLabel.setEditable(false);
        productLabel.setBackground(new java.awt.Color(255, 204, 51));
        productLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        productLabel.setText("PRODUCTS");
        productLabel.setBorder(null);
        productLabel.setCaretColor(new java.awt.Color(255, 255, 255));
        productLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productLabelMouseClicked(evt);
            }
        });
        productLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productLabelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout productLayout = new javax.swing.GroupLayout(product);
        product.setLayout(productLayout);
        productLayout.setHorizontalGroup(
            productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(productLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(productIcon))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        productLayout.setVerticalGroup(
            productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productLayout.createSequentialGroup()
                .addComponent(productIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        category.setBackground(new java.awt.Color(255, 204, 51));
        category.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        category.setMinimumSize(new java.awt.Dimension(159, 150));
        category.setPreferredSize(new java.awt.Dimension(150, 150));
        category.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryMouseClicked(evt);
            }
        });

        categoryLabel.setBackground(new java.awt.Color(255, 204, 51));
        categoryLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        categoryLabel.setForeground(new java.awt.Color(51, 51, 51));
        categoryLabel.setText("CATEGORY");
        categoryLabel.setBorder(null);
        categoryLabel.setCaretColor(new java.awt.Color(255, 255, 255));
        categoryLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        categoryLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryLabelMouseClicked(evt);
            }
        });
        categoryLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryLabelActionPerformed(evt);
            }
        });

        categoryIcon.setBackground(new java.awt.Color(255, 255, 255));
        categoryIcon.setForeground(new java.awt.Color(255, 153, 51));
        categoryIcon.setIcon(new javax.swing.ImageIcon("D:\\edu\\Edu IT\\edu projects\\project6\\Shopping-app\\shopping-desktop-app\\asserts\\images\\Category-icon.png")); // NOI18N
        categoryIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout categoryLayout = new javax.swing.GroupLayout(category);
        category.setLayout(categoryLayout);
        categoryLayout.setHorizontalGroup(
            categoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, categoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(categoryIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(categoryLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(categoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        categoryLayout.setVerticalGroup(
            categoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, categoryLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(categoryIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(categoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 0));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.setMinimumSize(new java.awt.Dimension(159, 150));
        jPanel4.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        customerIcon.setBackground(new java.awt.Color(255, 255, 255));
        customerIcon.setForeground(new java.awt.Color(255, 153, 51));
        customerIcon.setIcon(new javax.swing.ImageIcon("D:\\edu\\Edu IT\\edu projects\\project6\\Shopping-app\\shopping-desktop-app\\asserts\\images\\customer-icon.png")); // NOI18N
        customerIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        customerIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerIconMouseClicked(evt);
            }
        });

        customerLabel.setBackground(new java.awt.Color(255, 204, 51));
        customerLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        customerLabel.setForeground(new java.awt.Color(51, 51, 51));
        customerLabel.setText("CUSTOMER");
        customerLabel.setBorder(null);
        customerLabel.setCaretColor(new java.awt.Color(255, 255, 255));
        customerLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        customerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerLabelMouseClicked(evt);
            }
        });
        customerLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerLabelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(customerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(customerIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(customerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(customerIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(43, Short.MAX_VALUE)))
        );

        orders.setBackground(new java.awt.Color(255, 204, 0));
        orders.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        orders.setMinimumSize(new java.awt.Dimension(159, 150));
        orders.setPreferredSize(new java.awt.Dimension(150, 150));
        orders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordersMouseClicked(evt);
            }
        });

        orderLabel.setBackground(new java.awt.Color(255, 204, 51));
        orderLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        orderLabel.setText("ORDER");
        orderLabel.setBorder(null);
        orderLabel.setCaretColor(new java.awt.Color(255, 255, 255));
        orderLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        orderLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderLabelMouseClicked(evt);
            }
        });
        orderLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderLabelActionPerformed(evt);
            }
        });

        orderIcon.setBackground(new java.awt.Color(255, 255, 255));
        orderIcon.setForeground(new java.awt.Color(255, 153, 51));
        orderIcon.setIcon(new javax.swing.ImageIcon("D:\\edu\\Edu IT\\edu projects\\project6\\Shopping-app\\shopping-desktop-app\\asserts\\images\\order.png")); // NOI18N
        orderIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ordersLayout = new javax.swing.GroupLayout(orders);
        orders.setLayout(ordersLayout);
        ordersLayout.setHorizontalGroup(
            ordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordersLayout.createSequentialGroup()
                .addGroup(ordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ordersLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(orderIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ordersLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(orderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ordersLayout.setVerticalGroup(
            ordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ordersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orderIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(orders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(461, 461, 461)
                        .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(product, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(orders, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(category, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                .addGap(74, 74, 74)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1009, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void orderLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderLabelActionPerformed

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        new ManageCustomers(user_type).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel4MouseClicked

    private void customerLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerLabelActionPerformed

    private void customerLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerLabelMouseClicked
        new ManageCustomers(user_type).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_customerLabelMouseClicked

    private void categoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryMouseClicked
        new ManageCategory(user_type).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_categoryMouseClicked

    private void categoryLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryLabelActionPerformed

    private void productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productMouseClicked
        new ManageProduct(user_type).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_productMouseClicked

    private void productLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productLabelActionPerformed

    private void productLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productLabelMouseClicked
        new ManageProduct(user_type).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_productLabelMouseClicked

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtnMouseClicked

    private void productIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productIconMouseClicked
        new ManageProduct(user_type).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_productIconMouseClicked

    private void orderIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderIconMouseClicked
        new ManageOrders(user_type).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_orderIconMouseClicked

    private void orderLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderLabelMouseClicked
        new ManageOrders(user_type).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_orderLabelMouseClicked

    private void ordersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordersMouseClicked
        new ManageOrders(user_type).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ordersMouseClicked

    private void customerIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerIconMouseClicked
      new ManageCustomers(user_type).setVisible(true);
      this.dispose();
    }//GEN-LAST:event_customerIconMouseClicked

    private void categoryIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryIconMouseClicked
        new ManageCategory(user_type).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_categoryIconMouseClicked

    private void categoryLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryLabelMouseClicked
        new ManageCategory(user_type).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_categoryLabelMouseClicked

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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel category;
    private javax.swing.JLabel categoryIcon;
    private javax.swing.JTextField categoryLabel;
    private javax.swing.JLabel customerIcon;
    private javax.swing.JTextField customerLabel;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel orderIcon;
    private javax.swing.JTextField orderLabel;
    private javax.swing.JPanel orders;
    private javax.swing.JPanel product;
    private javax.swing.JLabel productIcon;
    private javax.swing.JTextField productLabel;
    // End of variables declaration//GEN-END:variables

    private static class ManageProudct {

        public ManageProudct() {
        }
    }
}
