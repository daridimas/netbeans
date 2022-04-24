/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasiarsipsuratv2;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dimas
 */
public class FormSuratMasuk extends javax.swing.JFrame {

    /**
     * Creates new form FormSuratMasuk
     */
    
    // Session
    String user_id = UserSession.getU_uid();
    int id_level = UserSession.getId_level();
    String level_id = String.valueOf(id_level);
    Timer t;
    
    Statement st;
    ResultSet rs;
    koneksi koneksi;
    
    // Untuk Operasi Upload File Surat
    JFileChooser jfc;
    File File;
    
    
    public FormSuratMasuk() {
        initComponents();
        koneksi = new koneksi();
        DataTable(); // Tabel Data Surat Masuk
        KdSuratOtomatis(); // panggil method untuk Penomoran Otomatis
        LoadSifatSurat(); // panggil method untuk ComboBox Sifat Surat
    }

    // Tampilkan Data ke Table
    private void DataTable() {
        // jLabelGambar.setText(user_id);
        Object header[] = {
            "KODE SURAT", "TIPE SURAT", "SIFAT SURAT", "NAMA PENGARSIP",
            "NOMOR SURAT", "TANGGAL SURAT", "DARI", "KEPADA",
            "PERIHAL", "DESKRIPSI", "FILE SURAT"
        };
        DefaultTableModel data = new DefaultTableModel(null, header);
        jTableSurat.setModel(data);
        String sql = "SELECT tbl_surat.KD_SURAT, tbl_type_surat.TYPE_SURAT, " + 
                "tbl_sifat_surat.SIFAT_SURAT, tbl_user.NAMA_USER, " + 
                "tbl_surat.NO_SURAT, tbl_surat.TGL_SURAT, tbl_surat.DARI, " +
                "tbl_surat.KEPADA, tbl_surat.PERIHAL, tbl_surat.DESKRIPSI, " +
                "tbl_surat.FILE_SURAT\n" +
                "FROM tbl_surat INNER JOIN tbl_type_surat ON " + 
                "tbl_surat.ID_TYPE_SURAT=tbl_type_surat.ID_TYPE_SURAT\n" +
                "INNER JOIN tbl_sifat_surat ON " + 
                "tbl_sifat_surat.ID_SIFAT_SURAT=tbl_surat.ID_SIFAT_SURAT\n" +
                "INNER JOIN tbl_user ON tbl_user.ID_USER=tbl_surat.ID_USER WHERE tbl_surat.ID_USER='" + 
                user_id + "' AND tbl_surat.ID_TYPE_SURAT=1";
        
        try {
            st = koneksi.con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                String k1 = rs.getString(1); // field kolom ke 1 dari hasil query
                String k2 = rs.getString(2);
                String k3 = rs.getString(3);
                String k4 = rs.getString(4);
                String k5 = rs.getString(5);
                String k6 = rs.getString(6);
                String k7 = rs.getString(7);
                String k8 = rs.getString(8);
                String k9 = rs.getString(9);
                String k10 = rs.getString(10);
                String k11 = rs.getString(11);
                
                String k[] = {k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11};
                data.addRow(k);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    // --------- Kode Surat Otomatis -------------
    private void KdSuratOtomatis() {
        try {
            st = koneksi.con.createStatement();
            String sql_kd = "SELECT * FROM tbl_surat WHERE ID_TYPE_SURAT=1 " + 
                    "ORDER BY KD_SURAT DESC";
            rs = st.executeQuery(sql_kd);
            if (rs.next()) {
                String KD_SURAT = rs.getString("KD_SURAT").substring(3); // substring SRM
                String AN = ""+(Integer.parseInt(KD_SURAT)+1); // Automatic Number +1
                String Nol = ""; // Jumlah NOL (SRM000001) Nol 5 digit
                if (AN.length() == 1) { // Jika Kode Surat SRM000001
                    Nol = "00000";
                } else if (AN.length() == 2) { // Jika Kode Surat SRM000010
                    Nol = "0000";
                } else if (AN.length() == 3) { // Jika Kode Surat SRM000100
                    Nol = "000";
                }else if (AN.length() == 4) { // Jika Kode Surat SRM001000
                    Nol = "00";
                }else if (AN.length() == 5) { // Jika Kode Surat SRM001000
                    Nol = "0";
                }
                jTextFieldKodeSurat.setText("SRM"+Nol+AN);
            } else {
                jTextFieldKodeSurat.setText("SRM000001");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    // Load ComboBox Sifat Surat dari data di tabel Sifat Surat
    public void LoadSifatSurat() {
        try {
            st = koneksi.con.createStatement();
            String sql_load_combo = "SELECT * FROM tbl_sifat_surat";
            rs = st.executeQuery(sql_load_combo);
            while (rs.next()) {
                jComboBoxSifatSurat.addItem(rs.getString("SIFAT_SURAT")); // kolom
            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
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
        jLabelSuratMasuk = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldKodeSurat = new javax.swing.JTextField();
        jTextFieldTypeSurat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxSifatSurat = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldDari = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldPerihal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxKepada = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDeskripsi = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jButtonNew = new javax.swing.JButton();
        jButtonArsipkan = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonHapusArsipkan = new javax.swing.JButton();
        jButtonReport = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldNamaGambar = new javax.swing.JTextField();
        jButtonFileSurat = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabelGambar = new javax.swing.JLabel();
        jTextFieldNomorSurat = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldCari = new javax.swing.JTextField();
        jButtonCari = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableSurat = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Arsip Surat Masuk");
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabelSuratMasuk.setFont(new java.awt.Font("sansserif", 3, 18)); // NOI18N
        jLabelSuratMasuk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSuratMasuk.setText("ARSIP SURAT MASUK");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Input Data Surat Masuk"));

        jLabel2.setText("Kode Surat :");

        jTextFieldKodeSurat.setEditable(false);

        jTextFieldTypeSurat.setEditable(false);
        jTextFieldTypeSurat.setText("SURAT MASUK");

        jLabel3.setText("Type Surat :");

        jLabel4.setText("Sifat Surat :");

        jLabel5.setText("Nomor Surat :");

        jLabel6.setText("Tanggal Surat :");

        jLabel7.setText("Dari :");

        jLabel8.setText("Kepada :");

        jLabel9.setText("Perihal :");

        jLabel10.setText("Deskripsi :");

        jComboBoxKepada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perusahaan", "Manager", "Staff", "Pegawai" }));

        jTextAreaDeskripsi.setColumns(20);
        jTextAreaDeskripsi.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDeskripsi);

        jButtonNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/New-file-icon.png"))); // NOI18N
        jButtonNew.setText("NEW");
        jPanel3.add(jButtonNew);

        jButtonArsipkan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Save-as-icon.png"))); // NOI18N
        jButtonArsipkan.setText("ARSIPKAN");
        jPanel3.add(jButtonArsipkan);

        jButtonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit-icon.png"))); // NOI18N
        jButtonEdit.setText("EDIT");
        jPanel3.add(jButtonEdit);

        jButtonHapusArsipkan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Delete-file-icon.png"))); // NOI18N
        jButtonHapusArsipkan.setText("HAPUS ARSIPKAN");
        jPanel3.add(jButtonHapusArsipkan);

        jButtonReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Documents-Library-icon.png"))); // NOI18N
        jButtonReport.setText("REPORT");
        jPanel3.add(jButtonReport);

        jLabel11.setText("File Scan Surat :");

        jButtonFileSurat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/open-file-icon.png"))); // NOI18N
        jButtonFileSurat.setText("FILE SURAT");
        jButtonFileSurat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFileSuratActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelGambar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabelGambar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelGambar, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelGambar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Arsip Surat Masuk"));

        jLabel13.setText("Cari Arsip Surat :");

        jButtonCari.setText("Cari");

        jTableSurat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableSurat);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCari)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextFieldKodeSurat, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                                .addComponent(jLabel11))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldTypeSurat)
                                    .addComponent(jComboBoxSifatSurat, 0, 353, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                                    .addComponent(jComboBoxKepada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPerihal, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNomorSurat, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(60, 60, 60)
                                .addComponent(jTextFieldDari)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNamaGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonFileSurat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldKodeSurat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldNamaGambar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldTypeSurat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonFileSurat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBoxSifatSurat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldNomorSurat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxKepada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPerihal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSuratMasuk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelSuratMasuk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("File");

        jMenuItemExit.setText("Exit");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem2.setText("About");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        // TODO add your handling code here:
        int Exit = JOptionPane.showOptionDialog(
                this, "Keluar dari form Surat Masuk?", "Pesan Keluar",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, null, null);
        
        if (Exit == JOptionPane.YES_OPTION) {
            new FormUtama().show();
            this.dispose();
        }
        
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void jButtonFileSuratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFileSuratActionPerformed
        // TODO add your handling code here:
        
        jfc = new JFileChooser();
        if (jfc.showOpenDialog(jLabelGambar) == JFileChooser.APPROVE_OPTION) {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Image image = toolkit.getImage(jfc.getSelectedFile().getAbsolutePath());
            Image imagedResized = image.getScaledInstance(214, 217, Image.SCALE_DEFAULT);
            ImageIcon imageicon = new ImageIcon(imagedResized);
            
            jLabelGambar.setIcon(imageicon);
            jTextFieldNamaGambar.setText(jfc.getSelectedFile().getName());
            
            File = new File(jfc.getSelectedFile().getPath());
            
        }
        
    }//GEN-LAST:event_jButtonFileSuratActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        int Exit = JOptionPane.showOptionDialog(
                this, "Keluar dari form Surat Masuk?", "Pesan Keluar",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, null, null);
        
        if (Exit == JOptionPane.YES_OPTION) {
            new FormUtama().show();
            this.dispose();
        }
        
    }//GEN-LAST:event_formWindowClosing

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
        
        userInteraction();
        
    }//GEN-LAST:event_formMouseMoved
    
        // ---------- Automatic Logout System ----------
    public void logout() {
        this.setVisible(false);
        new FormLogin().setVisible(true);
        stopTimer();
    }
    
    public void session() {
        stopTimer();
        t = new Timer(600000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logout();
            }
        });
        t.start();
    }
    
    public void stopTimer() {
        if (t != null) {
            t.stop();
        }
    }
    
    public void userInteraction() {
        session();
    }
    
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FormSuratMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FormSuratMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FormSuratMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FormSuratMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FormSuratMasuk().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonArsipkan;
    private javax.swing.JButton jButtonCari;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonFileSurat;
    private javax.swing.JButton jButtonHapusArsipkan;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonReport;
    private javax.swing.JComboBox<String> jComboBoxKepada;
    private javax.swing.JComboBox<String> jComboBoxSifatSurat;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelGambar;
    private javax.swing.JLabel jLabelSuratMasuk;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableSurat;
    private javax.swing.JTextArea jTextAreaDeskripsi;
    private javax.swing.JTextField jTextFieldCari;
    private javax.swing.JTextField jTextFieldDari;
    private javax.swing.JTextField jTextFieldKodeSurat;
    private javax.swing.JTextField jTextFieldNamaGambar;
    private javax.swing.JTextField jTextFieldNomorSurat;
    private javax.swing.JTextField jTextFieldPerihal;
    private javax.swing.JTextField jTextFieldTypeSurat;
    // End of variables declaration//GEN-END:variables
}
