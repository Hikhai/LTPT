/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MyFrame2;

/**
 *
 * @author ky
 */
public class Fmenu extends javax.swing.JFrame {

    /**
     * Creates new form Fmenu
     */
    public Fmenu() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        menuQuanLy = new javax.swing.JMenu();
        menuItemQLSV = new javax.swing.JMenuItem();
        menuTimKiem = new javax.swing.JMenu();
        menuItemTimLop = new javax.swing.JMenuItem();
        menuThongKe = new javax.swing.JMenu();
        menuItemThongKe = new javax.swing.JMenuItem();
        menuThoat = new javax.swing.JMenu();
        menuItemThoat = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuQuanLy.setText("Quản lý");

        menuItemQLSV.setText("Quản lý sinh viên");
        menuItemQLSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemQLSVActionPerformed(evt);
            }
        });
        menuQuanLy.add(menuItemQLSV);

        jMenuBar1.add(menuQuanLy);

        menuTimKiem.setText("Tìm kiếm");

        menuItemTimLop.setText("Tìm theo tên lớp");
        menuItemTimLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTimLopActionPerformed(evt);
            }
        });
        menuTimKiem.add(menuItemTimLop);

        jMenuBar1.add(menuTimKiem);

        menuThongKe.setText("Thống kê");

        menuItemThongKe.setText("Thống kê sinh viên");
        menuItemThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemThongKeActionPerformed(evt);
            }
        });
        menuThongKe.add(menuItemThongKe);

        jMenuBar1.add(menuThongKe);

        menuThoat.setText("Thoát");

        menuItemThoat.setText("Thoát");
        menuItemThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemThoatActionPerformed(evt);
            }
        });
        menuThoat.add(menuItemThoat);

        jMenuBar1.add(menuThoat);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 253, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemQLSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemQLSVActionPerformed
        // TODO add your handling code here:
        new FrmDanhSach().setVisible(true);

    }//GEN-LAST:event_menuItemQLSVActionPerformed

    private void menuItemThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemThongKeActionPerformed
        // TODO add your handling code here:
        new FthongKe().setVisible(true);
        

    }//GEN-LAST:event_menuItemThongKeActionPerformed

    private void menuItemTimLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTimLopActionPerformed
        // TODO add your handling code here:
        new FtimKiem().setVisible(true);

    }//GEN-LAST:event_menuItemTimLopActionPerformed

    private void menuItemThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemThoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_menuItemThoatActionPerformed

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
            java.util.logging.Logger.getLogger(Fmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuItemQLSV;
    private javax.swing.JMenuItem menuItemThoat;
    private javax.swing.JMenuItem menuItemThongKe;
    private javax.swing.JMenuItem menuItemTimLop;
    private javax.swing.JMenu menuQuanLy;
    private javax.swing.JMenu menuThoat;
    private javax.swing.JMenu menuThongKe;
    private javax.swing.JMenu menuTimKiem;
    // End of variables declaration//GEN-END:variables
}
