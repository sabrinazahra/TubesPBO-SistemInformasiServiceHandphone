/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raihan09
 */
public class Win1_Frame extends javax.swing.JFrame {
    
    

    /**
     * Creates new form Win1_Frame
     */
    public Win1_Frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1_frame1 = new javax.swing.JPanel();
        panel2_frame1 = new javax.swing.JPanel();
        SERVICE = new javax.swing.JLabel();
        SDS = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        label_nama_pelanggan = new javax.swing.JLabel();
        txt_nama_pelanggan = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        label_nomor_pelanggan = new javax.swing.JLabel();
        txt_nomor_pelanggan = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        label_tipehp = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_kendala = new javax.swing.JTextArea();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_tipehp = new javax.swing.JTextArea();
        label_kendala = new javax.swing.JLabel();
        button_next1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel1_frame1.setBackground(new java.awt.Color(18, 51, 74));
        panel1_frame1.setForeground(new java.awt.Color(18, 51, 74));

        panel2_frame1.setBackground(new java.awt.Color(4, 39, 28));
        panel2_frame1.setForeground(new java.awt.Color(4, 39, 28));

        SERVICE.setFont(new java.awt.Font("Code Bold", 1, 48)); // NOI18N
        SERVICE.setForeground(new java.awt.Color(238, 242, 245));
        SERVICE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SERVICE.setText("SERVICE");

        SDS.setFont(new java.awt.Font("Code Bold", 1, 48)); // NOI18N
        SDS.setForeground(new java.awt.Color(238, 242, 245));
        SDS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SDS.setText("SDS");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));

        javax.swing.GroupLayout panel2_frame1Layout = new javax.swing.GroupLayout(panel2_frame1);
        panel2_frame1.setLayout(panel2_frame1Layout);
        panel2_frame1Layout.setHorizontalGroup(
            panel2_frame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2_frame1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(panel2_frame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SERVICE, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(SDS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel2_frame1Layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        panel2_frame1Layout.setVerticalGroup(
            panel2_frame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2_frame1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(SDS, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SERVICE, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel2_frame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(135, 135, 135))
        );

        label_nama_pelanggan.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        label_nama_pelanggan.setForeground(new java.awt.Color(238, 242, 245));
        label_nama_pelanggan.setText("Nama");

        txt_nama_pelanggan.setBackground(new java.awt.Color(18, 51, 74));
        txt_nama_pelanggan.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txt_nama_pelanggan.setForeground(new java.awt.Color(255, 255, 255));
        txt_nama_pelanggan.setBorder(null);
        txt_nama_pelanggan.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_nama_pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nama_pelangganActionPerformed(evt);
            }
        });

        label_nomor_pelanggan.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        label_nomor_pelanggan.setForeground(new java.awt.Color(238, 242, 245));
        label_nomor_pelanggan.setText("No. Telepon");

        txt_nomor_pelanggan.setBackground(new java.awt.Color(18, 51, 74));
        txt_nomor_pelanggan.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txt_nomor_pelanggan.setForeground(new java.awt.Color(255, 255, 255));
        txt_nomor_pelanggan.setBorder(null);
        txt_nomor_pelanggan.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_nomor_pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomor_pelangganActionPerformed(evt);
            }
        });

        label_tipehp.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        label_tipehp.setForeground(new java.awt.Color(238, 242, 245));
        label_tipehp.setText("Merek dan Tipe HP");

        txt_kendala.setBackground(new java.awt.Color(21, 40, 54));
        txt_kendala.setColumns(20);
        txt_kendala.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txt_kendala.setForeground(new java.awt.Color(255, 255, 255));
        txt_kendala.setRows(5);
        txt_kendala.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(txt_kendala);

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txt_tipehp.setBackground(new java.awt.Color(21, 40, 54));
        txt_tipehp.setColumns(20);
        txt_tipehp.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txt_tipehp.setForeground(new java.awt.Color(255, 255, 255));
        txt_tipehp.setRows(5);
        txt_tipehp.setToolTipText("Contoh : Samsung Galaxy S20 Ultra");
        txt_tipehp.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(txt_tipehp);

        label_kendala.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        label_kendala.setForeground(new java.awt.Color(238, 242, 245));
        label_kendala.setText("Kendala Kerusakan");

        button_next1.setText("Save & Next");
        button_next1.setBorder(null);

        javax.swing.GroupLayout panel1_frame1Layout = new javax.swing.GroupLayout(panel1_frame1);
        panel1_frame1.setLayout(panel1_frame1Layout);
        panel1_frame1Layout.setHorizontalGroup(
            panel1_frame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1_frame1Layout.createSequentialGroup()
                .addComponent(panel2_frame1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(67, 67, 67)
                .addGroup(panel1_frame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1_frame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panel1_frame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label_nama_pelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_nama_pelanggan)
                            .addComponent(jSeparator1)
                            .addComponent(label_nomor_pelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_nomor_pelanggan)
                            .addComponent(jSeparator2)
                            .addComponent(label_tipehp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(jSeparator4)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(label_kendala, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(button_next1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );
        panel1_frame1Layout.setVerticalGroup(
            panel1_frame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2_frame1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel1_frame1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(label_nama_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nama_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_nomor_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nomor_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_kendala, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_tipehp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(button_next1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1_frame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1_frame1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nama_pelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nama_pelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nama_pelangganActionPerformed

    private void txt_nomor_pelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomor_pelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomor_pelangganActionPerformed

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
            java.util.logging.Logger.getLogger(Win1_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Win1_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Win1_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Win1_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Win1_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SDS;
    private javax.swing.JLabel SERVICE;
    private javax.swing.JButton button_next1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel label_kendala;
    private javax.swing.JLabel label_nama_pelanggan;
    private javax.swing.JLabel label_nomor_pelanggan;
    private javax.swing.JLabel label_tipehp;
    private javax.swing.JPanel panel1_frame1;
    private javax.swing.JPanel panel2_frame1;
    private javax.swing.JTextArea txt_kendala;
    private javax.swing.JTextField txt_nama_pelanggan;
    private javax.swing.JTextField txt_nomor_pelanggan;
    private javax.swing.JTextArea txt_tipehp;
    // End of variables declaration//GEN-END:variables
}
