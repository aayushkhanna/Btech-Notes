/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author realinfo
 */
public class changepassword extends javax.swing.JInternalFrame {

    /**
     * Creates new form changepassword
     */
    String username;

    public changepassword(String username) {
        initComponents();
        this.username = username;
        setResizable(true);
        setMaximizable(true);
        setIconifiable(true);
        setClosable(true);
        setSize(1920, 1080);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtoldpass = new javax.swing.JTextField();
        txtnewpass = new javax.swing.JTextField();
        txtconfirmpass = new javax.swing.JTextField();
        btnupdate = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Change Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        jLabel2.setText("Old Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        jLabel3.setText("New Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        jLabel4.setText("Confirm Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));
        getContentPane().add(txtoldpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 140, -1));
        getContentPane().add(txtnewpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 140, -1));
        getContentPane().add(txtconfirmpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 140, -1));

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed

        try {
            String oldpassword = txtoldpass.getText();
            String newpassword = txtnewpass.getText();
            String confirmpassword = txtconfirmpass.getText();

            if (newpassword.equals(confirmpassword)) {
                Class.forName("oracle.jdbc.OracleDriver");
                String str = "jdbc:oracle:thin:@localhost:1521:";
                Connection con = DriverManager.getConnection(str, "project", "12345");

                String sql1 = "select * from admin where username=?";
                PreparedStatement ps1 = con.prepareStatement(sql1);
                ps1.setString(1, username);

                ResultSet rs = ps1.executeQuery();
                String op = "";
                if (rs.next()) {
                    op = rs.getString("password");
                }

                if(op.equals(oldpassword))
                {
                String sql = "update admin set password=? where username=?";
                PreparedStatement ps = con.prepareStatement(sql);

                ps.setString(1, newpassword);
                ps.setString(2, username);

                int count = ps.executeUpdate();
                if (count > 0) {
                    JOptionPane.showMessageDialog(this, "passowrd changed !!!");

                }
                }
                else {
                JOptionPane.showMessageDialog(this, "old password is incorrect!!");

            }
            } else {
                JOptionPane.showMessageDialog(this, "password doesn't match!!");

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,"Error " + ex.getMessage());
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnupdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtconfirmpass;
    private javax.swing.JTextField txtnewpass;
    private javax.swing.JTextField txtoldpass;
    // End of variables declaration//GEN-END:variables
}
