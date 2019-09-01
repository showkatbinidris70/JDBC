/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.view;

import com.coderbd.dao.ProductDao;
import com.coderbd.dao.SummaryDao;
import com.coderbd.daoImpl.ProductDaoImpl;
import com.coderbd.daoImpl.SummaryDaoImpl;
import com.coderbd.pojo.Product;
import com.coderbd.pojo.Summary;

import java.sql.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Dell
 */
public class ProductView extends javax.swing.JFrame {

    /**
     * Creates new form ProductView
     */
    public ProductView() {
        initComponents();
        displayProductIntoTable();
    }

    public void displayProductIntoTable() {
        clearTable();
        ProductDao pDao = new ProductDaoImpl();
        List<Product> list = pDao.getlist();
        DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();
        Object[] cols = new Object[7];
        for (int i = 0; i < list.size(); i++) {
            cols[0] = list.get(i).getId();
            cols[1] = list.get(i).getProductName();
            cols[2] = list.get(i).getProductCode();
            cols[3] = list.get(i).getQty();
            cols[4] = list.get(i).getUniteprice();
            cols[5] = list.get(i).getTotalPrice();
            cols[6] = list.get(i).getStock();

            model.addRow(cols);
        }
    }

    public void clearTable() {
        DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();
        model.setRowCount(0);

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
        btnBuy = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtProductCode = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtUniteprice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisplay = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Purchase Product");

        btnBuy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuy.setText("Buy");
        btnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyActionPerformed(evt);
            }
        });

        jLabel2.setText("Product Purchase");

        jLabel4.setText("product Name");

        jLabel5.setText("product Code");

        jLabel6.setText("Qty");

        jLabel7.setText("Unite Price");

        jLabel8.setText("Total Price");

        jLabel9.setText("Stock");

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        tblDisplay.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Id", "ProductName", "ProductCode", "Qty", "UnitePrice", "TotalPrice", "Stock"
                }
        ));
        jScrollPane1.setViewportView(tblDisplay);

        jLabel10.setText("Display");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(btnBuy))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(294, 294, 294)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(txtProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(txtUniteprice, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(29, 29, 29)
                                                                .addComponent(btnSave)))
                                                .addGap(83, 83, 83)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnBuy)
                                        .addComponent(jLabel1))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(txtProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(txtUniteprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel8)
                                                        .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel9)
                                                        .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(btnSave))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addContainerGap(141, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Date date = new Date(System.currentTimeMillis());
        ProductDao pDao = new ProductDaoImpl();

        String productName = txtProductName.getText();
        String productCode = txtProductCode.getText();
        int qty = Integer.parseInt(txtQty.getText());
        double unitPrice = Double.parseDouble(txtUniteprice.getText());
        double totalPrice = Double.parseDouble(txtTotalPrice.getText());
        int stock = Integer.parseInt(txtStock.getText().trim());

        Product product = new Product(productName, productCode, qty, unitPrice, totalPrice, stock, date);
        pDao.save(product);


        SummaryDao summaryDao = new SummaryDaoImpl();
        try {
            Summary summary = summaryDao.getSummaryByProductCode(txtProductCode.getText().trim());

            if (summary.getProductCode() != null) {

                int totalQty = summary.getTotalQty() + Integer.parseInt(txtQty.getText().trim());
                int availableqty = summary.getAvailableQty() + Integer.parseInt(txtQty.getText().trim());

                Summary summaryUp = new Summary(summary.getProductCode(), totalQty, summary.getSoldQty(), availableqty);
                summaryDao.update(summaryUp);
                JOptionPane.showMessageDialog(null, "Purchase Again success");
            } else {

                Product product1 = pDao.getProductByProductCode(product.getProductCode());
                Summary summary2 = new Summary(txtProductName.getText().trim(), txtProductCode.getText().trim(), Integer.parseInt(txtQty.getText().trim()), 0, Integer.parseInt(txtQty.getText().trim()), product1);
                summaryDao.save(summary2);
                JOptionPane.showMessageDialog(null, "Purchase success");
            }
        } catch (Exception e) {
            Product product1 = pDao.getProductByProductCode(product.getProductCode());
            Summary summary = new Summary(txtProductName.getText().trim(), txtProductCode.getText().trim(), Integer.parseInt(txtQty.getText().trim()), 0, Integer.parseInt(txtQty.getText().trim()), product1);
            summaryDao.save(summary);
            JOptionPane.showMessageDialog(null, "Purchase success");
        }

        displayProductIntoTable();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyActionPerformed
        // TODO add your handling code here:
        new ProductSalesView().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnBuyActionPerformed

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
            java.util.logging.Logger.getLogger(ProductView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDisplay;
    private javax.swing.JTextField txtProductCode;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTotalPrice;
    private javax.swing.JTextField txtUniteprice;
    // End of variables declaration//GEN-END:variables
}