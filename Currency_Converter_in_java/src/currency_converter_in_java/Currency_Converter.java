/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package currency_converter_in_java;

import javax.swing.JOptionPane;

/**
 *
 * @author Sohan
 */
public class Currency_Converter extends javax.swing.JFrame {

    public Currency_Converter() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtFrom = new javax.swing.JComboBox<>();
        txtTo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 120, 80));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText(" CURRENCY CONVERTER");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Amount");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("From");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("To");

        txtAmount.setBackground(new java.awt.Color(204, 204, 204));
        txtAmount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtAmount.setForeground(new java.awt.Color(0, 0, 204));
        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(95, 255, 101));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtFrom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BDT Taka", "INR Rupee", "USD Dollar", "BTC–Bitcoin", "BHD–Bahraini Dinar", "BRL–Brazilian Real", "KWD–Kuwaiti Dinar", "KRW–South Korean Won", "PKR–Pakistani Rupee", "TRY–Turkish Lira" }));

        txtTo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BDT Taka", "INR Rupee", "USD Dollar", "BTC–Bitcoin", "BHD–Bahraini Dinar", "BRL–Brazilian Real", "KWD–Kuwaiti Dinar", "KRW–South Korean Won", "PKR–Pakistani Rupee", "TRY–Turkish Lira" }));
        txtTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/currency_converter_in_java/20230524_221546.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215)
                        .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        Double convert;
        Double amount = Double.valueOf(txtAmount.getText());

        if (txtFrom.getSelectedItem().toString() == "USD Dollar" && txtTo.getSelectedItem().toString() == "BDT Taka") {
            convert = amount * 107.27;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " BD Taka");
        } else if (txtFrom.getSelectedItem().toString() == "USD Dollar" && txtTo.getSelectedItem().toString() == "INR Rupee") {
            convert = amount * 82.86;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " INR Rupee");
        } else if (txtFrom.getSelectedItem().toString() == "USD Dollar" && txtTo.getSelectedItem().toString() == "BTC–Bitcoin") {
            convert = amount * 0.000037;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " BTC–Bitcoin");
        } else if (txtFrom.getSelectedItem().toString() == "USD Dollar" && txtTo.getSelectedItem().toString() == "BHD–Bahraini Dinar") {
            convert = amount * 0.38;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BHD–Bahraini Dinar");
        } else if (txtFrom.getSelectedItem().toString() == "USD Dollar" && txtTo.getSelectedItem().toString() == "BRL–Brazilian Real") {
            convert = amount * 4.96679;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BRL–Brazilian Real");
        } else if (txtFrom.getSelectedItem().toString() == "USD Dollar" && txtTo.getSelectedItem().toString() == "KWD–Kuwaiti Dinar") {
            convert = amount * 0.31;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "KWD–Kuwaiti Dinar");
        } else if (txtFrom.getSelectedItem().toString() == "USD Dollar" && txtTo.getSelectedItem().toString() == "KRW–South Korean Won") {
            convert = amount * 1318.72;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "KRW–South Korean Won");
        } else if (txtFrom.getSelectedItem().toString() == "USD Dollar" && txtTo.getSelectedItem().toString() == "PKR–Pakistani Rupee") {
            convert = amount * 287.03;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "PKR–Pakistani Rupee");
        } else if (txtFrom.getSelectedItem().toString() == "USD Dollar" && txtTo.getSelectedItem().toString() == "TRY–Turkish Lira") {
            convert = amount * 19.86;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "TRY–Turkish Lira");
        } else if (txtFrom.getSelectedItem().toString() == "TRY–Turkish Lira" && txtTo.getSelectedItem().toString() == "USD Dollar") {
            convert = amount * 0.050;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "USD Dollar");
        } else if (txtFrom.getSelectedItem().toString() == "PKR–Pakistani Rupee" && txtTo.getSelectedItem().toString() == "USD Dollar") {
            convert = amount * 0.0035;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "USD Dollar");
        } else if (txtFrom.getSelectedItem().toString() == "KRW–South Korean Won" && txtTo.getSelectedItem().toString() == "USD Dollar") {
            convert = amount * 0.00076;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "USD Dollar");
        } else if (txtFrom.getSelectedItem().toString() == "KWD–Kuwaiti Dinar" && txtTo.getSelectedItem().toString() == "USD Dollar") {
            convert = amount * 3.25;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "USD Dollar");
        } else if (txtFrom.getSelectedItem().toString() == "BRL–Brazilian Real" && txtTo.getSelectedItem().toString() == "USD Dollar") {
            convert = amount * 0.20;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "USD Dollar");
        } else if (txtFrom.getSelectedItem().toString() == "BHD–Bahraini Dinar" && txtTo.getSelectedItem().toString() == "USD Dollar") {
            convert = amount * 2.65;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "USD Dollar");
        } else if (txtFrom.getSelectedItem().toString() == "BTC–Bitcoin" && txtTo.getSelectedItem().toString() == "USD Dollar") {
            convert = amount * 27324.97;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " USD Dollar");
        } else if (txtFrom.getSelectedItem().toString() == "INR Rupee" && txtTo.getSelectedItem().toString() == "USD Dollar") {
            convert = amount * 0.012;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " USD Dollar");
        } else if (txtFrom.getSelectedItem().toString() == "BDT Taka" && txtTo.getSelectedItem().toString() == "INR Rupee") {
            convert = amount * 0.77;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "INR Rupee");
        } else if (txtFrom.getSelectedItem().toString() == "BDT Taka" && txtTo.getSelectedItem().toString() == "USD Dollar") {
            convert = amount * 0.0093;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " USD Dollar");
        } else if (txtFrom.getSelectedItem().toString() == "BDT Taka" && txtTo.getSelectedItem().toString() == "BTC–Bitcoin") {
            convert = amount * 2944980.00;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " BTC–Bitcoin");
        } else if (txtFrom.getSelectedItem().toString() == "BDT Taka" && txtTo.getSelectedItem().toString() == "BHD–Bahraini Dinar") {
            convert = amount * 0.0035;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " BHD–Bahraini Dinar");
        } else if (txtFrom.getSelectedItem().toString() == "BDT Taka" && txtTo.getSelectedItem().toString() == "BRL–Brazilian Real") {
            convert = amount * 0.046;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " BRL–Brazilian Real");
        } else if (txtFrom.getSelectedItem().toString() == "BDT Taka" && txtTo.getSelectedItem().toString() == "KWD–Kuwaiti Dinar") {
            convert = amount * 0.0028;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " KWD–Kuwaiti Dinar");
        } else if (txtFrom.getSelectedItem().toString() == "BDT Taka" && txtTo.getSelectedItem().toString() == "KRW–South Korean Won") {
            convert = amount * 12.19;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "KRW–South Korean Won");
        } else if (txtFrom.getSelectedItem().toString() == "BDT Taka" && txtTo.getSelectedItem().toString() == "PKR–Pakistani Rupee") {
            convert = amount * 2.65;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "PKR–Pakistani Rupee");
        } else if (txtFrom.getSelectedItem().toString() == "BDT Taka" && txtTo.getSelectedItem().toString() == "TRY–Turkish Lira") {
            convert = amount * 0.18;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "TRY–Turkish Lira");
        } else if (txtFrom.getSelectedItem().toString() == "INR Rupee" && txtTo.getSelectedItem().toString() == "BTC–Bitcoin") {
            convert = amount * 0.000000442;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BTC–Bitcoin");
        } else if (txtFrom.getSelectedItem().toString() == "INR Rupee" && txtTo.getSelectedItem().toString() == "BHD–Bahraini Dinar") {
            convert = amount * 0.0045;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BHD–Bahraini Dinar");
        } else if (txtFrom.getSelectedItem().toString() == "INR Rupee" && txtTo.getSelectedItem().toString() == "BRL–Brazilian Real") {
            convert = amount * 0.060;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BRL–Brazilian Real");
        } else if (txtFrom.getSelectedItem().toString() == "INR Rupee" && txtTo.getSelectedItem().toString() == "KWD–Kuwaiti Dinar") {
            convert = amount * 0.0037;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "KWD–Kuwaiti Dinar");
        } else if (txtFrom.getSelectedItem().toString() == "INR Rupee" && txtTo.getSelectedItem().toString() == "KRW–South Korean Won") {
            convert = amount * 15.93;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "KRW–South Korean Won");
        } else if (txtFrom.getSelectedItem().toString() == "INR Rupee" && txtTo.getSelectedItem().toString() == "PKR–Pakistani Rupee") {
            convert = amount * 3.46;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "PKR–Pakistani Rupee");
        } else if (txtFrom.getSelectedItem().toString() == "INR Rupee" && txtTo.getSelectedItem().toString() == "TRY–Turkish Lira") {
            convert = amount * 0.24;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "TRY–Turkish Lira");
        } else if (txtFrom.getSelectedItem().toString() == "BTC–Bitcoin" && txtTo.getSelectedItem().toString() == "TRY–Turkish Lira") {
            convert = amount * 541518.75;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "TRY–Turkish Lira");
        } else if (txtFrom.getSelectedItem().toString() == "BTC–Bitcoin" && txtTo.getSelectedItem().toString() == "BHD–Bahraini Dinar") {
            convert = amount * 10266.01;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BHD–Bahraini Dinar");
        } else if (txtFrom.getSelectedItem().toString() == "BTC–Bitcoin" && txtTo.getSelectedItem().toString() == "BRL–Brazilian Real") {
            convert = amount * 135007.60;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "  BRL–Brazilian Real   ");
        } else if (txtFrom.getSelectedItem().toString() == "BTC–Bitcoin" && txtTo.getSelectedItem().toString() == "KWD–Kuwaiti Dinar") {
            convert = amount * 8381.81;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "  KWD–Kuwaiti Dinar  ");
        } else if (txtFrom.getSelectedItem().toString() == "BTC–Bitcoin" && txtTo.getSelectedItem().toString() == "KRW–South Korean Won") {
            convert = amount * 35999541.81;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "  KRW–South Korean Won  ");
        } else if (txtFrom.getSelectedItem().toString() == "BTC–Bitcoin" && txtTo.getSelectedItem().toString() == "PKR–Pakistani Rupee") {
            convert = amount * 7817123.62;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "PKR–Pakistani Rupee");
        } else if (txtFrom.getSelectedItem().toString() == "BHD–Bahraini Dinar" && txtTo.getSelectedItem().toString() == "BDT Taka") {
            convert = amount * 287.18;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "  BDT Taka ");
        } else if (txtFrom.getSelectedItem().toString() == "BHD–Bahraini Dinar" && txtTo.getSelectedItem().toString() == "INR Rupee") {
            convert = amount * 219.76;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "  INR Rupee ");
        } else if (txtFrom.getSelectedItem().toString() == "  BHD–Bahraini Dinar  " && txtTo.getSelectedItem().toString() == "  USD Dollar   ") {
            convert = amount * 2.65;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "  USD Dollar ");
        } else if ((txtFrom.getSelectedItem().toString() == "BHD–Bahraini Dinar") && (txtTo.getSelectedItem().toString() == "BRL–Brazilian Real")) {
            convert = amount * 13.15;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BRL–Brazilian Real");
        } else if ((txtFrom.getSelectedItem().toString() == "BHD–Bahraini Dinar") && (txtTo.getSelectedItem().toString() == "KWD–Kuwaiti Dinar")) {
            convert = amount * 0.82;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "KWD–Kuwaiti Dinar");
        } else if ((txtFrom.getSelectedItem().toString() == "BHD–Bahraini Dinar") && (txtTo.getSelectedItem().toString() == "KRW–South Korean Won")) {
            convert = amount * 3501.56;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "KRW–South Korean Won");
        } else if ((txtFrom.getSelectedItem().toString() == "BHD–Bahraini Dinar") && (txtTo.getSelectedItem().toString() == "PKR–Pakistani Rupee")) {
            convert = amount * 760.32;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "PKR–Pakistani Rupee");
        } else if ((txtFrom.getSelectedItem().toString() == "BHD–Bahraini Dinar") && (txtTo.getSelectedItem().toString() == "TRY–Turkish Lira")) {
            convert = amount * 52.68;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "TRY–Turkish Lira");
        } else if (txtFrom.getSelectedItem().toString() == "TRY–Turkish Lira" && txtTo.getSelectedItem().toString() == "BHD–Bahraini Dinar") {
            convert = amount * 0.019;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BHD–Bahraini Dinar");
        } else if (txtFrom.getSelectedItem().toString() == "PKR–Pakistani Rupee" && txtTo.getSelectedItem().toString() == "BHD–Bahraini Dinar") {
            convert = amount * 0.0013;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BHD–Bahraini Dinar");
        } else if (txtFrom.getSelectedItem().toString() == "KRW–South Korean Won" && txtTo.getSelectedItem().toString() == "BHD–Bahraini Dinar") {
            convert = amount * 0.00029;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BHD–Bahraini Dinar");
        } else if (txtFrom.getSelectedItem().toString() == "KWD–Kuwaiti Dinar" && txtTo.getSelectedItem().toString() == "BHD–Bahraini Dinar") {
            convert = amount * 1.23;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BHD–Bahraini Dinar");
        } else if (txtFrom.getSelectedItem().toString() == "BRL–Brazilian Real" && txtTo.getSelectedItem().toString() == "BHD–Bahraini Dinar") {
            convert = amount * 0.075;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BHD–Bahraini Dinar");
        } else if (txtFrom.getSelectedItem().toString() == "BDT Taka" && txtTo.getSelectedItem().toString() == "BHD–Bahraini Dinar") {
            convert = amount * 0.0035;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BHD–Bahraini Dinar");
        } else if (txtFrom.getSelectedItem().toString() == "PKR–Pakistani Rupee" && txtTo.getSelectedItem().toString() == "BTC–Bitcoin") {
            convert = amount * 1.3e-7;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BTC–Bitcoin");
        } else if (txtFrom.getSelectedItem().toString() == "KRW–South Korean Won" && txtTo.getSelectedItem().toString() == "BTC–Bitcoin") {
            convert = amount * 2.8e-8;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BTC–Bitcoin");
        } else if (txtFrom.getSelectedItem().toString() == "KWD–Kuwaiti Dinar" && txtTo.getSelectedItem().toString() == "BTC–Bitcoin") {
            convert = amount * 0.00012;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BTC–Bitcoin");
        } else if (txtFrom.getSelectedItem().toString() == "BRL–Brazilian Real" && txtTo.getSelectedItem().toString() == "BTC–Bitcoin") {
            convert = amount * 0.0000074;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BTC–Bitcoin");
        } else if (txtFrom.getSelectedItem().toString() == "BHD–Bahraini Dinar" && txtTo.getSelectedItem().toString() == "BTC–Bitcoin") {
            convert = amount * 0.000097;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BTC–Bitcoin");
        } else if (txtFrom.getSelectedItem().toString() == "TRY–Turkish Lira" && txtTo.getSelectedItem().toString() == "BTC–Bitcoin") {
            convert = amount * 1.8491e-6;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BTC–Bitcoin");
        } else if (txtFrom.getSelectedItem().toString() == "PKR–Pakistani Rupee" && txtTo.getSelectedItem().toString() == "INR Rupee") {
            convert = amount * 0.29;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "INR Rupee");
        } else if (txtFrom.getSelectedItem().toString() == "KRW–South Korean Won" && txtTo.getSelectedItem().toString() == "INR Rupee") {
            convert = amount * 0.063;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "INR Rupee");
        } else if (txtFrom.getSelectedItem().toString() == "KWD–Kuwaiti Dinar" && txtTo.getSelectedItem().toString() == "INR Rupee") {
            convert = amount * 259.64;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "INR Rupee");
        } else if (txtFrom.getSelectedItem().toString() == "BRL–Brazilian Real" && txtTo.getSelectedItem().toString() == "INR Rupee") {
            convert = amount * 16.71;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "INR Rupee");
        } else if (txtFrom.getSelectedItem().toString() == "BHD–Bahraini Dinar" && txtTo.getSelectedItem().toString() == "INR Rupee") {
            convert = amount * 219.84;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "INR Rupee");
        } else if (txtFrom.getSelectedItem().toString() == "BTC–Bitcoin" && txtTo.getSelectedItem().toString() == "INR Rupee") {
            convert = amount * 2.26361109e-6;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "INR Rupee");
        } else if (txtFrom.getSelectedItem().toString() == "TRY–Turkish Lira" && txtTo.getSelectedItem().toString() == "INR Rupee") {
            convert = amount * 4.17;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "INR Rupee ");
        } else if (txtFrom.getSelectedItem().toString() == "TRY–Turkish Lira" && txtTo.getSelectedItem().toString() == "BDT Taka") {
            convert = amount * 5.45;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BDT Taka ");
        } else if (txtFrom.getSelectedItem().toString() == "PKR–Pakistani Rupee" && txtTo.getSelectedItem().toString() == "BDT Taka") {
            convert = amount * 0.38;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BDT Taka ");
        } else if (txtFrom.getSelectedItem().toString() == "KRW–South Korean Won" && txtTo.getSelectedItem().toString() == "BDT Taka") {
            convert = amount * 0.082;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BDT Taka ");
        } else if (txtFrom.getSelectedItem().toString() == "KWD–Kuwaiti Dinar" && txtTo.getSelectedItem().toString() == "BDT Taka") {
            convert = amount * 352.17;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BDT Taka ");
        } else if (txtFrom.getSelectedItem().toString() == "BHD–Bahraini Dinar" && txtTo.getSelectedItem().toString() == "BDT Taka") {
            convert = amount * 287.08;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BDT Taka ");
        } else if (txtFrom.getSelectedItem().toString() == "BTC–Bitcoin" && txtTo.getSelectedItem().toString() == "BDT Taka") {
            convert = amount * 3.394812241003436e-7;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BDT Taka ");
        } else if (txtFrom.getSelectedItem().toString() == "INR Rupee" && txtTo.getSelectedItem().toString() == "BDT Taka") {
            convert = amount * 1.29;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BDT Taka");
        } else if ((txtFrom.getSelectedItem().toString() == "BRL–Brazilian Real") && (txtTo.getSelectedItem().toString() == "BDT Taka")) {
            convert = amount * 21.75;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BDT Taka");
        } else if ((txtFrom.getSelectedItem().toString() == "BRL–Brazilian Real") && (txtTo.getSelectedItem().toString() == "INR Rupee")) {
            convert = amount * 16.64;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "INR Rupee");
        } else if ((txtFrom.getSelectedItem().toString() == "BRL–Brazilian Real") && (txtTo.getSelectedItem().toString() == "KWD–Kuwaiti Dinar")) {
            convert = amount * 0.062;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "KWD–Kuwaiti Dinar");
        } else if ((txtFrom.getSelectedItem().toString() == "BRL–Brazilian Real") && (txtTo.getSelectedItem().toString() == "KRW–South Korean Won")) {
            convert = amount * 264.78;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "KRW–South Korean Won");
        } else if ((txtFrom.getSelectedItem().toString() == "BRL–Brazilian Real") && (txtTo.getSelectedItem().toString() == "PKR–Pakistani Rupee")) {
            convert = amount * 57.77;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "PKR–Pakistani Rupee");
        } else if ((txtFrom.getSelectedItem().toString() == "BRL–Brazilian Real") && (txtTo.getSelectedItem().toString() == "TRY–Turkish Lira")) {
            convert = amount * 4.00;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "TRY–Turkish Lira");
        } else if ((txtFrom.getSelectedItem().toString() == "KWD–Kuwaiti Dinar") && (txtTo.getSelectedItem().toString() == "KRW–South Korean Won")) {
            convert = amount * 4283.76;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "KRW–South Korean Won");
        } else if ((txtFrom.getSelectedItem().toString() == "KWD–Kuwaiti Dinar") && (txtTo.getSelectedItem().toString() == "PKR–Pakistani Rupee")) {
            convert = amount * 934.95;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "PKR–Pakistani Rupee");
        } else if ((txtFrom.getSelectedItem().toString() == "KWD–Kuwaiti Dinar") && (txtTo.getSelectedItem().toString() == "TRY–Turkish Lira")) {
            convert = amount * 64.71;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "TRY–Turkish Lira");
        } else if ((txtFrom.getSelectedItem().toString() == "KRW–South Korean Won") && (txtTo.getSelectedItem().toString() == "PKR–Pakistani Rupee")) {
            convert = amount * 0.22;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "PKR–Pakistani Rupee");
        } else if ((txtFrom.getSelectedItem().toString() == "KRW–South Korean Won") && (txtTo.getSelectedItem().toString() == "TRY–Turkish Lira")) {
            convert = amount * 0.015;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "TRY–Turkish Lira");
        } else if ((txtFrom.getSelectedItem().toString() == "PKR–Pakistani Rupee") && (txtTo.getSelectedItem().toString() == "TRY–Turkish Lira")) {
            convert = amount * 0.069;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "TRY–Turkish Lira");
        } else if ((txtFrom.getSelectedItem().toString() == "PKR–Pakistani Rupee") && (txtTo.getSelectedItem().toString() == "KRW–South Korean Won")) {
            convert = amount * 4.58;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "KRW–South Korean Won");
        } else if ((txtFrom.getSelectedItem().toString() == "TRY–Turkish Lira") && (txtTo.getSelectedItem().toString() == "PKR–Pakistani Rupee")) {
            convert = amount * 14.45;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "PKR–Pakistani Rupee");
        } else if ((txtFrom.getSelectedItem().toString() == "TRY–Turkish Lira") && (txtTo.getSelectedItem().toString() == "KRW–South Korean Won")) {
            convert = amount * 66.20;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "KRW–South Korean Won");
        } else if ((txtFrom.getSelectedItem().toString() == "KPKR–Pakistani Rupee") && (txtTo.getSelectedItem().toString() == "KRW–South Korean Won")) {
            convert = amount * 4.58;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "KRW–South Korean Won");
        } else if ((txtFrom.getSelectedItem().toString() == "TRY–Turkish Lira") && (txtTo.getSelectedItem().toString() == "KWD–Kuwaiti Dinar")) {
            convert = amount * 0.015;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "KWD–Kuwaiti Dinar");
        } else if ((txtFrom.getSelectedItem().toString() == "PKR–Pakistani Rupee") && (txtTo.getSelectedItem().toString() == "KWD–Kuwaiti Dinar")) {
            convert = amount * 0.0011;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "KWD–Kuwaiti Dinar");
        } else if ((txtFrom.getSelectedItem().toString() == "KRW–South Korean Won") && (txtTo.getSelectedItem().toString() == "KWD–Kuwaiti Dinar")) {
            convert = amount * 0.00023;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "KWD–Kuwaiti Dinar");
        } else if ((txtFrom.getSelectedItem().toString() == "TRY–Turkish Lira") && (txtTo.getSelectedItem().toString() == "BRL–Brazilian Real")) {
            convert = amount * 0.25;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BRL–Brazilian Real");
        } else if ((txtFrom.getSelectedItem().toString() == "PKR–Pakistani Rupee") && (txtTo.getSelectedItem().toString() == "BRL–Brazilian Real")) {
            convert = amount * 0.017;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BRL–Brazilian Real");
        } else if ((txtFrom.getSelectedItem().toString() == "KRW–South Korean Won") && (txtTo.getSelectedItem().toString() == "BRL–Brazilian Real")) {
            convert = amount * 0.0038;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BRL–Brazilian Real");
        } else if ((txtFrom.getSelectedItem().toString() == "KWD–Kuwaiti Dinar") && (txtTo.getSelectedItem().toString() == "BRL–Brazilian Real")) {
            convert = amount * 16.19;
            JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + "BRL–Brazilian Real");
        } else {
            JOptionPane.showMessageDialog(this, "Your selected option are not right");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtToActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed

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
            java.util.logging.Logger.getLogger(Currency_Converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Currency_Converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Currency_Converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Currency_Converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Currency_Converter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JComboBox<String> txtFrom;
    private javax.swing.JComboBox<String> txtTo;
    // End of variables declaration//GEN-END:variables
}
