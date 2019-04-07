package Knitting;

import java.awt.Container;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Receive_knitting extends javax.swing.JFrame {

    public Receive_knitting() {
        initComponents();
        m3();
        m1();
        m2();
        sizes();
        sizem();
        sizel();
        sizexl();
        add();
    
    }

    public void m1() {
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project-prime_sweater", "root", "apcl123456");
            String s = "select * from order_list";
            PreparedStatement ps = c.prepareStatement(s);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                jComboBox2.addItem(String.valueOf(rs.getInt(2)));
            }
        } catch (SQLException e) {
        }
    }

    public void m3() {
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project-prime_sweater", "root", "apcl123456");
            String s = "select * from order_knitting";
            PreparedStatement ps = c.prepareStatement(s);
            ResultSet rs = ps.executeQuery();
            jComboBox3.removeAllItems();
            while (rs.next()) {
                jComboBox3.addItem(String.valueOf(rs.getInt(3)));
            }
        } catch (SQLException e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jText_l = new javax.swing.JTextField();
        jTex_s = new javax.swing.JTextField();
        jText_m = new javax.swing.JTextField();
        jText_q = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jsl = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jorder_id = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        JReceive = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jorder_id2 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jTex_s8 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jTex_m9 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jTex_l10 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jTex_xl11 = new javax.swing.JTextField();
        jTex_s12 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prime Sweater Ltd.");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        jLabel16.setText("Employee ID");

        jLabel17.setText(":");

        jLabel18.setText("Lot No");

        jLabel19.setText(":");

        jLabel20.setText("Size");

        jLabel21.setText(":");

        jLabel22.setText("Quantity");

        jLabel23.setText(":");

        jLabel24.setText("Style No");

        jLabel25.setText(":");

        jLabel26.setText("Machine No");

        jLabel27.setText(":");

        jLabel30.setText("Receive Date");

        jLabel31.setText(":");

        jCheckBox5.setText("S");

        jCheckBox6.setText("M");

        jCheckBox7.setText("L");

        jCheckBox8.setText("XL");

        jLabel34.setText("S.L");

        jLabel35.setText(":");

        jComboBox3.setEditable(true);
        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });

        jLabel36.setText(":");

        jLabel37.setText("Order_id");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel50.setText("Instruction");

        jLabel51.setText(":");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(153, 102, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Receive from machine");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox5)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox6)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox7)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox8))
                            .addComponent(jsl)
                            .addComponent(jorder_id)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTex_s)
                            .addComponent(jText_m)
                            .addComponent(jText_l)
                            .addComponent(jText_q))
                        .addGap(0, 18, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jsl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jLabel36)
                    .addComponent(jorder_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jTex_s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jText_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jText_l, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox8)
                    .addComponent(jLabel21))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jText_q, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel50)
                            .addComponent(jLabel51)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        JReceive.setText("Receive And Send Linking Section");
        JReceive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JReceiveActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Knitting Distribution Section Information");

        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(153, 102, 255));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("All Receive Knitting Section");

        jLabel60.setText(":");

        jLabel61.setText("Order_id");

        jLabel62.setText(":");

        jLabel63.setText("Style No");

        jLabel64.setText("Size S");

        jLabel65.setText(":");

        jLabel66.setText(":");

        jLabel67.setText("Size M");

        jLabel68.setText("Size L");

        jLabel69.setText(":");

        jLabel70.setText("Size XL");

        jLabel71.setText(":");

        jLabel72.setText(":");

        jLabel73.setText("Total ");

        jLabel74.setText("Date");

        jLabel75.setText(":");

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, 215, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTex_s8)
                                    .addComponent(jTex_m9)
                                    .addComponent(jTex_l10)
                                    .addComponent(jTex_xl11)
                                    .addComponent(jTex_s12)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jorder_id2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59)
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(jLabel60)
                    .addComponent(jorder_id2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(jLabel62)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(jLabel75)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(jLabel65)
                    .addComponent(jTex_s8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(jLabel66)
                    .addComponent(jTex_m9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(jLabel69)
                    .addComponent(jTex_l10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(jLabel71)
                    .addComponent(jTex_xl11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(jLabel72)
                    .addComponent(jTex_s12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(JReceive)
                                .addGap(208, 208, 208)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JReceive)
                            .addComponent(jButton2))
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 96, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project-prime_sweater", "root", "apcl123456");
            String s = "select * from order_knitting where e_id = ?";
            PreparedStatement ps = c.prepareStatement(s);
            ps.setInt(1, Integer.parseInt(jComboBox3.getSelectedItem().toString()));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                jsl.setText(String.valueOf(rs.getInt(1)));
                jorder_id.setText(String.valueOf(rs.getInt(2)));
                jTex_s.setText(String.valueOf(rs.getInt(4)));
                jText_m.setText(String.valueOf(rs.getInt(5)));
                jText_l.setText(String.valueOf(rs.getInt(6)));
                String size = rs.getString(7);
                if (size.matches("S")) {
                    jCheckBox5.setSelected(true);
                    jCheckBox6.setSelected(false);
                    jCheckBox7.setSelected(false);
                    jCheckBox8.setSelected(false);
                } else if (size.matches("M")) {
                    jCheckBox5.setSelected(false);
                    jCheckBox6.setSelected(true);
                    jCheckBox7.setSelected(false);
                    jCheckBox8.setSelected(false);
                } else if (size.matches("L")) {
                    jCheckBox5.setSelected(false);
                    jCheckBox6.setSelected(false);
                    jCheckBox7.setSelected(true);
                    jCheckBox8.setSelected(false);
                } else if (size.matches("XL")) {
                    jCheckBox5.setSelected(false);
                    jCheckBox6.setSelected(false);
                    jCheckBox7.setSelected(false);
                    jCheckBox8.setSelected(true);
                }

                jText_q.setText(String.valueOf(rs.getInt(9)));
            }
        } catch (NumberFormatException | SQLException e) {
//            System.out.println(e);
        }
    }//GEN-LAST:event_jComboBox3ItemStateChanged
    public void send() {
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project-prime_sweater", "root", "apcl123456");
            String s = "insert into total_order_linking (order_id,style_no,lot_no,size,qty,instruction) values (?,?,?,?,?,?)";
            PreparedStatement ps = c.prepareStatement(s);
            ps.setInt(1, Integer.parseInt(jorder_id.getText()));
            ps.setInt(2, Integer.parseInt(jTex_s.getText()));
            ps.setInt(3, Integer.parseInt(jText_l.getText()));

            String size = "";
            if (jCheckBox5.isSelected()) {
                size = jCheckBox5.getText();
            } else if (jCheckBox6.isSelected()) {
                size = jCheckBox6.getText();
            } else if (jCheckBox7.isSelected()) {
                size = jCheckBox7.getText();
            } else if (jCheckBox8.isSelected()) {
                size = jCheckBox8.getText();
            }
            ps.setString(4, size);
            ps.setInt(5, Integer.parseInt(jText_q.getText()));
            ps.setString(6, jTextArea1.getText());
            int i = ps.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Send Successfully");
            }
        } catch (SQLException e) {
        }
    }
    private void JReceiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JReceiveActionPerformed
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project-prime_sweater", "root", "apcl123456");
            String s = "insert into daily_receive(order_id,e_id, style_no, machine_no, lot_no, size, date, qty ) values (?,?,?,?,?,?,?,?)";
            PreparedStatement ps = c.prepareStatement(s);
            ps.setInt(1, Integer.parseInt(jorder_id.getText()));
            ps.setInt(2, Integer.parseInt(jComboBox3.getSelectedItem().toString()));
            ps.setInt(3, Integer.parseInt(jTex_s.getText()));
            ps.setInt(4, Integer.parseInt(jText_m.getText()));
            ps.setInt(5, Integer.parseInt(jText_l.getText()));

            String size = "";
            if (jCheckBox5.isSelected()) {
                size = jCheckBox5.getText();
            } else if (jCheckBox6.isSelected()) {
                size = jCheckBox6.getText();
            } else if (jCheckBox7.isSelected()) {
                size = jCheckBox7.getText();
            } else if (jCheckBox8.isSelected()) {
                size = jCheckBox8.getText();
            }
            ps.setString(6, size);
            java.util.Date ju = jDateChooser2.getDate();
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            String sd = df.format(ju);
            java.util.Date ud = df.parse(sd);
            java.sql.Date date = new java.sql.Date(ud.getTime());
            ps.setDate(7, date);
            ps.setInt(8, Integer.parseInt(jText_q.getText()));
            int i = ps.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Receive Success");
            }
            send();
            delete();
            m3();
//            ps.close();
//            c.close();
            sizes();
            sizem();
            sizel();
            sizexl();
            add();
        } catch (HeadlessException | NumberFormatException | SQLException | ParseException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_JReceiveActionPerformed
    public void add() {
        try {
            int s = Integer.parseInt(jTex_s8.getText());
            int m = Integer.parseInt(jTex_m9.getText());
            int l = Integer.parseInt(jTex_l10.getText());
            int xl = Integer.parseInt(jTex_xl11.getText());
            int total = s + m + l + xl;
            jTex_s12.setText(String.valueOf(total));
        } catch (Exception e) {
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project-prime_sweater", "root", "apcl123456");
            String s = "select * from order_list where style_no = ?";
            PreparedStatement ps = c.prepareStatement(s);
            ps.setInt(1, Integer.parseInt(jComboBox2.getSelectedItem().toString()));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                jorder_id2.setText(String.valueOf(rs.getInt(1)));
            }
            sizes();
            sizem();
            sizel();
            sizexl();
            add();
        
        } catch (SQLException e) {
        }

    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        sizes();
        sizem();
        sizel();
        sizexl();
        add();
    }//GEN-LAST:event_jComboBox1ItemStateChanged
    public void sizes() {
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project-prime_sweater", "root", "apcl123456");
            String s = "select sum(qty) as total from daily_receive where style_no = '" + jComboBox2.getSelectedItem().toString() + "' AND date = '" + jComboBox1.getSelectedItem().toString() + "' AND size like 'S%'";
            PreparedStatement ps = c.prepareStatement(s);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int i = rs.getInt("total");
                jTex_s8.setText(String.valueOf(i));
            }

        } catch (Exception e) {
        }
    }

    public void sizem() {
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project-prime_sweater", "root", "apcl123456");
            String s = "select sum(qty) as total from daily_receive where style_no = '" + jComboBox2.getSelectedItem().toString() + "' AND date = '" + jComboBox1.getSelectedItem().toString() + "' AND size like 'M%'";
            PreparedStatement ps = c.prepareStatement(s);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int i = rs.getInt("total");
                jTex_m9.setText(String.valueOf(i));
            }

        } catch (Exception e) {
        }
    }

    public void sizel() {
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project-prime_sweater", "root", "apcl123456");
            String s = "select sum(qty) as total from daily_receive where style_no = '" + jComboBox2.getSelectedItem().toString() + "' AND date = '" + jComboBox1.getSelectedItem().toString() + "' AND size like 'L%'";
            PreparedStatement ps = c.prepareStatement(s);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int i = rs.getInt("total");
                jTex_l10.setText(String.valueOf(i));
            }

        } catch (Exception e) {
        }
    }

    public void sizexl() {
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project-prime_sweater", "root", "apcl123456");
            String s = "select sum(qty) as total from daily_receive where style_no = '" + jComboBox2.getSelectedItem().toString() + "' AND date = '" + jComboBox1.getSelectedItem().toString() + "' AND size like 'XL%'";
            PreparedStatement ps = c.prepareStatement(s);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int i = rs.getInt("total");
                jTex_xl11.setText(String.valueOf(i));
            }

        } catch (Exception e) {
        }
    }

    public void m2() {
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project-prime_sweater", "root", "apcl123456");
            String s = "select * from daily_receive";
            PreparedStatement ps = c.prepareStatement(s);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                jComboBox1.addItem(String.valueOf(rs.getDate(7)));
            }
        } catch (SQLException e) {
        }
    }

    public void delete() {
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project-prime_sweater", "root", "apcl123456");
            String s = "delete from order_knitting where sl = ?";
            PreparedStatement ps = c.prepareStatement(s);
            ps.setInt(1, Integer.parseInt(jsl.getText()));
            int i = ps.executeUpdate();
           
            m3();
        } catch (Exception e) {
        }
    }

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
            java.util.logging.Logger.getLogger(Receive_knitting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Receive_knitting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Receive_knitting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Receive_knitting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receive_knitting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JReceive;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTex_l10;
    private javax.swing.JTextField jTex_m9;
    private javax.swing.JTextField jTex_s;
    private javax.swing.JTextField jTex_s12;
    private javax.swing.JTextField jTex_s8;
    private javax.swing.JTextField jTex_xl11;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jText_l;
    private javax.swing.JTextField jText_m;
    private javax.swing.JTextField jText_q;
    private javax.swing.JTextField jorder_id;
    private javax.swing.JTextField jorder_id2;
    private javax.swing.JTextField jsl;
    // End of variables declaration//GEN-END:variables

    private static class jDateChooser2 {

        private static Date getDate() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public jDateChooser2() {
        }
    }
}
