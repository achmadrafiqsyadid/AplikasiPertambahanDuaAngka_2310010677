import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AplikasiPertambahanDuaAngkaFrame extends JFrame {

    private JButton btnTambah, btnHapus, btnKeluar;
    private JLabel lblAngka1, lblAngka2, lblHasil, lblTitle;
    private JTextField txtAngka1, txtAngka2, txtHasil;
    private JPanel panelUtama;

    public AplikasiPertambahanDuaAngkaFrame() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Aplikasi Pertambahan Dua Angka");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 350);
        setLocationRelativeTo(null);
        setResizable(false);

        panelUtama = new JPanel();
        panelUtama.setBackground(new Color(230, 245, 255));
        panelUtama.setLayout(null);

        lblTitle = new JLabel("Aplikasi Pertambahan Dua Angka", SwingConstants.CENTER);
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblTitle.setBounds(30, 20, 340, 30);
        lblTitle.setForeground(new Color(0, 102, 204));

        lblAngka1 = new JLabel("Angka Pertama:");
        lblAngka1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        lblAngka1.setBounds(50, 80, 120, 25);

        txtAngka1 = new JTextField();
        txtAngka1.setBounds(200, 80, 130, 25);
        txtAngka1.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        lblAngka2 = new JLabel("Angka Kedua:");
        lblAngka2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        lblAngka2.setBounds(50, 120, 120, 25);

        txtAngka2 = new JTextField();
        txtAngka2.setBounds(200, 120, 130, 25);
        txtAngka2.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        lblHasil = new JLabel("Hasil:");
        lblHasil.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        lblHasil.setBounds(50, 160, 120, 25);

        txtHasil = new JTextField();
        txtHasil.setBounds(200, 160, 130, 25);
        txtHasil.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtHasil.setEditable(false);
        txtHasil.setBackground(new Color(245, 245, 245));

        btnTambah = new JButton("Tambah");
        btnTambah.setBounds(50, 220, 90, 30);
        btnTambah.setBackground(new Color(0, 153, 255));
        btnTambah.setForeground(Color.WHITE);
        btnTambah.setFocusPainted(false);
        btnTambah.setFont(new Font("Segoe UI", Font.BOLD, 13));

        btnHapus = new JButton("Hapus");
        btnHapus.setBounds(160, 220, 90, 30);
        btnHapus.setBackground(new Color(255, 153, 0));
        btnHapus.setForeground(Color.WHITE);
        btnHapus.setFocusPainted(false);
        btnHapus.setFont(new Font("Segoe UI", Font.BOLD, 13));

        btnKeluar = new JButton("Keluar");
        btnKeluar.setBounds(270, 220, 90, 30);
        btnKeluar.setBackground(new Color(255, 51, 51));
        btnKeluar.setForeground(Color.WHITE);
        btnKeluar.setFocusPainted(false);
        btnKeluar.setFont(new Font("Segoe UI", Font.BOLD, 13));

        btnTambah.addActionListener(e -> {
            try {
                double angka1 = Double.parseDouble(txtAngka1.getText());
                double angka2 = Double.parseDouble(txtAngka2.getText());
                double hasil = angka1 + angka2;
                txtHasil.setText(String.valueOf(hasil));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        btnHapus.addActionListener(e -> {
            txtAngka1.setText("");
            txtAngka2.setText("");
            txtHasil.setText("");
            txtAngka1.requestFocus();
        });

        btnKeluar.addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(this, "Yakin ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });

        panelUtama.add(lblTitle);
        panelUtama.add(lblAngka1);
        panelUtama.add(lblAngka2);
        panelUtama.add(lblHasil);
        panelUtama.add(txtAngka1);
        panelUtama.add(txtAngka2);
        panelUtama.add(txtHasil);
        panelUtama.add(btnTambah);
        panelUtama.add(btnHapus);
        panelUtama.add(btnKeluar);

        add(panelUtama);
    }

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ignored) {}

        SwingUtilities.invokeLater(() -> {
            new AplikasiPertambahanDuaAngkaFrame().setVisible(true);
        });
    }
}
