/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EqeS
 */
public class Iletisim extends javax.swing.JFrame {

    DefaultTableModel model;

    /**
     * Creates new form Iletisim
     */
    public Iletisim() {
        initComponents();
        GirisIslem giris = new GirisIslem();
        //Giriş yapan kullanıcının mesajlarını kontrol eder ve gelen mesajları tabloya yazdırır.
        try (Scanner scan = new Scanner(new FileReader("C:\\db\\mesajlar\\" + giris.oturumKullaniciAdi() + "mesajı.txt"));) {
            while (scan.hasNextLine()) {
                model = (DefaultTableModel) mesajTablo.getModel();
                String arr = scan.nextLine();
                String[] arr2 = arr.split(",");
                model.addRow(arr2);
            }
        } catch (FileNotFoundException ex) {

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mesajTablo = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(71, 70, 68));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/logo.jpg"))); // NOI18N
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("GUI/Bundle"); // NOI18N
        jLabel1.setText(bundle.getString("Iletisim.jLabel1.text")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/geritusu.jpg"))); // NOI18N
        jLabel2.setText(bundle.getString("Iletisim.jLabel2.text")); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        mesajTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Gönderen İsmi", "Mesaj", "Gönderen E-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        mesajTablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesajTabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(mesajTablo);
        if (mesajTablo.getColumnModel().getColumnCount() > 0) {
            mesajTablo.getColumnModel().getColumn(0).setResizable(false);
            mesajTablo.getColumnModel().getColumn(0).setHeaderValue(bundle.getString("Iletisim.mesajTablo.columnModel.title0")); // NOI18N
            mesajTablo.getColumnModel().getColumn(1).setResizable(false);
            mesajTablo.getColumnModel().getColumn(1).setHeaderValue(bundle.getString("Iletisim.mesajTablo.columnModel.title1_1")); // NOI18N
            mesajTablo.getColumnModel().getColumn(2).setResizable(false);
            mesajTablo.getColumnModel().getColumn(2).setHeaderValue(bundle.getString("Iletisim.mesajTablo.columnModel.title2_1")); // NOI18N
        }

        jLabel3.setFont(new java.awt.Font("Neo Sans TR", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 51));
        jLabel3.setText(bundle.getString("Iletisim.jLabel3.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Kullanıcı arayüzüne geri dönme işlemi yapar.
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        KullaniciArayuzu kullaniciArayuzu = new KullaniciArayuzu();
        kullaniciArayuzu.setVisible(true);
        kullaniciArayuzu.setBounds(600, 200, 758, 550);
        this.hide();
    }//GEN-LAST:event_jLabel2MouseClicked
    
    
    private void mesajTabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesajTabloMouseClicked
        int selected = mesajTablo.getSelectedRow();
        GirisIslem girisIslem = new GirisIslem();
                //Mesaj tablosuntan veriler alınır ve ekrana isim, mesaj ve iletişim bilgisi getirlir.
                String iletisim = String.valueOf(model.getValueAt(selected, 2));
                String kullanici = String.valueOf(model.getValueAt(selected, 0));
                String mesaj = String.valueOf(model.getValueAt(selected, 1));
                String cümle = "İsim : " + kullanici + "\n" + "Mesaj : " + mesaj + "\n" + " İletişim Bilgisi : " + iletisim;
                JOptionPane.showMessageDialog(null, cümle);
            

    }//GEN-LAST:event_mesajTabloMouseClicked

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
            java.util.logging.Logger.getLogger(Iletisim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Iletisim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Iletisim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Iletisim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Iletisim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mesajTablo;
    // End of variables declaration//GEN-END:variables
}
