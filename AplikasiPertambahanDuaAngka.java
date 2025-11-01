import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AplikasiPertambahanDuaAngka extends JFrame {

    private JTextField txtAngka1, txtAngka2, txtHasil;
    private JButton btnTambah, btnHapus, btnKeluar;

    public AplikasiPertambahanDuaAngka() {
        setTitle("Aplikasi Pertambahan Dua Angka");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // posisi tengah layar

        // Panel utama dengan warna lembut
        JPanel panel = new JPanel();
        panel.setBackground(new Color(240, 248, 255)); // biru muda lembut
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel lblJudul = new JLabel("Aplikasi Pertambahan Dua Angka");
        lblJudul.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblJudul.setForeground(new Color(25, 25, 112));

        JLabel lblAngka1 = new JLabel("Angka Pertama:");
        JLabel lblAngka2 = new JLabel("Angka Kedua:");
        JLabel lblHasil = new JLabel("Hasil:");

        txtAngka1 = new JTextField(10);
        txtAngka2 = new JTextField(10);
        txtHasil = new JTextField(10);
        txtHasil.setEditable(false);

        // Tombol dengan warna menarik
        btnTambah = new JButton("Tambah");
        btnTambah.setBackground(new Color(60, 179, 113)); // hijau
        btnTambah.setForeground(Color.WHITE);

        btnHapus = new JButton("Hapus");
        btnHapus.setBackground(new Color(255, 140, 0)); // oranye
        btnHapus.setForeground(Color.WHITE);

        btnKeluar = new JButton("Keluar");
        btnKeluar.setBackground(new Color(220, 20, 60)); // merah
        btnKeluar.setForeground(Color.WHITE);

        // Tambahkan event tombol
        btnTambah.addActionListener(e -> tambahAngka());
        btnHapus.addActionListener(e -> hapusInput());
        btnKeluar.addActionListener(e -> System.exit(0));

        // Batasi input hanya angka
        KeyAdapter angkaOnly = new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE) {
                    e.consume();
                    JOptionPane.showMessageDialog(null, "Masukkan hanya angka!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        };
        txtAngka1.addKeyListener(angkaOnly);
        txtAngka2.addKeyListener(angkaOnly);

        // FocusListener untuk membersihkan field saat fokus
        FocusListener clearOnFocus = new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                ((JTextField)e.getSource()).setText("");
            }
        };
        txtAngka1.addFocusListener(clearOnFocus);
        txtAngka2.addFocusListener(clearOnFocus);

        // Tata letak komponen
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2;
        panel.add(lblJudul, gbc);

        gbc.gridwidth = 1;
        gbc.gridy++;
        panel.add(lblAngka1, gbc);
        gbc.gridx = 1;
        panel.add(txtAngka1, gbc);

        gbc.gridx = 0; gbc.gridy++;
        panel.add(lblAngka2, gbc);
        gbc.gridx = 1;
        panel.add(txtAngka2, gbc);

        gbc.gridx = 0; gbc.gridy++;
        panel.add(lblHasil, gbc);
        gbc.gridx = 1;
        panel.add(txtHasil, gbc);

        gbc.gridx = 0; gbc.gridy++;
        gbc.gridwidth = 2;
        JPanel panelButton = new JPanel();
        panelButton.setBackground(panel.getBackground());
        panelButton.add(btnTambah);
        panelButton.add(btnHapus);
        panelButton.add(btnKeluar);
        panel.add(panelButton, gbc);

        add(panel);
        setVisible(true);
    }

    private void tambahAngka() {
        try {
            double angka1 = Double.parseDouble(txtAngka1.getText());
            double angka2 = Double.parseDouble(txtAngka2.getText());
            double hasil = angka1 + angka2;
            txtHasil.setText(String.valueOf(hasil));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Input tidak valid! Pastikan hanya angka yang dimasukkan.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void hapusInput() {
        txtAngka1.setText("");
        txtAngka2.setText("");
        txtHasil.setText("");
        txtAngka1.requestFocus();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AplikasiPertambahanDuaAngka());
    }
}
