package Latihan1Remake;



/**
 *
 * @author Achmad Rafiq Syaddid
 */
public class AplikasiPertambahanDuaAngkaPerbaikan extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AplikasiPertambahanDuaAngkaPerbaikan.class.getName());

   
    public AplikasiPertambahanDuaAngkaPerbaikan() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelAngka1 = new javax.swing.JLabel();
        jLabelAngka2 = new javax.swing.JLabel();
        jLabelHasil = new javax.swing.JLabel();
        jFieldAngka1 = new javax.swing.JTextField();
        jFieldAngka2 = new javax.swing.JTextField();
        jFieldHasil3 = new javax.swing.JTextField();
        jButtonHapus = new javax.swing.JButton();
        jButtonTambah = new javax.swing.JButton();
        jButtonKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Pertambahan Dua Angka");

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabelAngka1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelAngka1.setText("Angka 1");

        jLabelAngka2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelAngka2.setText("Angka 2");

        jLabelHasil.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelHasil.setText("Hasil");

        jFieldAngka1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFieldAngka1FocusGained(evt);
            }
        });
        jFieldAngka1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFieldAngka1KeyTyped(evt);
            }
        });

        jFieldAngka2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFieldAngka2FocusGained(evt);
            }
        });
        jFieldAngka2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFieldAngka2KeyTyped(evt);
            }
        });

        jFieldHasil3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jFieldHasil3.setEnabled(false);
        jFieldHasil3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFieldHasil3ActionPerformed(evt);
            }
        });

        jButtonHapus.setBackground(new java.awt.Color(255, 255, 153));
        jButtonHapus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonHapus.setText("Hapus");
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });

        jButtonTambah.setBackground(new java.awt.Color(255, 255, 153));
        jButtonTambah.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonTambah.setText("Tambah");
        jButtonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahActionPerformed(evt);
            }
        });

        jButtonKeluar.setBackground(new java.awt.Color(255, 255, 153));
        jButtonKeluar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonKeluar.setText("Keluar");
        jButtonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelAngka2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelAngka1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelHasil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jFieldAngka1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(jFieldAngka2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jFieldHasil3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jButtonTambah)
                .addGap(18, 18, 18)
                .addComponent(jButtonHapus)
                .addGap(18, 18, 18)
                .addComponent(jButtonKeluar)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAngka1)
                    .addComponent(jFieldAngka1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAngka2)
                    .addComponent(jFieldAngka2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHasil)
                    .addComponent(jFieldHasil3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonHapus)
                    .addComponent(jButtonKeluar)
                    .addComponent(jButtonTambah))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahActionPerformed
      
    }//GEN-LAST:event_jButtonTambahActionPerformed
    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
    
    }//GEN-LAST:event_jButtonHapusActionPerformed

    private void jButtonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKeluarActionPerformed
    
    }//GEN-LAST:event_jButtonKeluarActionPerformed

    private void jFieldAngka1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFieldAngka1KeyTyped
    
    }//GEN-LAST:event_jFieldAngka1KeyTyped
    private void jFieldAngka2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFieldAngka2KeyTyped
 
    }//GEN-LAST:event_jFieldAngka2KeyTyped
    private void jFieldAngka1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFieldAngka1FocusGained
  
    }//GEN-LAST:event_jFieldAngka1FocusGained
    private void jFieldAngka2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFieldAngka2FocusGained
  
    }//GEN-LAST:event_jFieldAngka2FocusGained
    private void jFieldHasil3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFieldHasil3ActionPerformed
     
    }//GEN-LAST:event_jFieldHasil3ActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new AplikasiPertambahanDuaAngkaPerbaikan().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonKeluar;
    private javax.swing.JButton jButtonTambah;
    private javax.swing.JTextField jFieldAngka1;
    private javax.swing.JTextField jFieldAngka2;
    private javax.swing.JTextField jFieldHasil3;
    private javax.swing.JLabel jLabelAngka1;
    private javax.swing.JLabel jLabelAngka2;
    private javax.swing.JLabel jLabelHasil;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
