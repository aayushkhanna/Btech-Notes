
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sunny
 */
public class tx1 extends javax.swing.JFrame {

    /**
     * Creates new form tx1
     */
    public tx1() {
        initComponents();
        showData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        n1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Data");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 180, -1));

        jLabel2.setText("Roll No.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 180, -1));

        jLabel3.setText("Marks");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 180, -1));

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jButton2.setText("Modify");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        n1.setModel(new javax.swing.table.DefaultTableModel(
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
        n1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(n1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 360, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        saveData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            // TODO add your handling code here:
        modifyData();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        deleteData();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void n1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n1MouseClicked
        // TODO add your handling code here:
        int row=n1.getSelectedRow();
        TableModel k1=n1.getModel();
        String a=(String)k1.getValueAt(row, 0);
        String b=(String)k1.getValueAt(row, 1);
        String c=(String)k1.getValueAt(row, 2);
        t1.setText(a);
        t2.setText(b);
        t3.setText(c);
    }//GEN-LAST:event_n1MouseClicked

    void showData() {

        try {
            
            Vector h=new Vector();
            h.add("Roll");
            h.add("Name");
            h.add("Marks");
            
            Class.forName("oracle.jdbc.OracleDriver");
            String str = "jdbc:oracle:thin:@localhost:1521:";
            Connection x = DriverManager.getConnection(str, "jp20192", "123456");
            String q = "select * from student";
            PreparedStatement y = x.prepareStatement(q);
            ResultSet rs = y.executeQuery();
            
            Vector d=new Vector(); 
            
            String a, b, c;
            while (rs.next()) {
                a = rs.getString("rollno");
                b = rs.getString("name");
                c = rs.getString("marks");
                Vector r=new Vector();
                r.add(a);
                r.add(b);
                r.add(c);
                //inserted into data
                d.add(r);
            }
            y.close();
            x.close();
            
            DefaultTableModel z= new DefaultTableModel(d,h);
            n1.setModel(z);
            
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error " + ex.getMessage());
            ex.printStackTrace();
        }

    }
    
    
    void saveData()
    {
        try {
            String name, rollno, marks;
            rollno = t1.getText();
            name = t2.getText();
            marks = t3.getText();

            if (rollno.trim().length() == 0) {
                JOptionPane.showMessageDialog(this, "Roll Number cannot be empty");
                return;
            }

            if (name.trim().length() == 0) {
                JOptionPane.showMessageDialog(this, "Name cannot be empty");
                return;
            }

            if (marks.trim().length() == 0) {
                JOptionPane.showMessageDialog(this, "Marks cannot be empty");
                return;
            }

            Class.forName("oracle.jdbc.OracleDriver");
            String str = "jdbc:oracle:thin:@localhost:1521:";
            Connection x = DriverManager.getConnection(str, "jp20192", "123456");

            String q = "insert into student values(?,?,?)";

            PreparedStatement y = x.prepareStatement(q);

            y.setString(1, rollno);
            y.setString(2, name);
            y.setString(3, marks);

            int n = y.executeUpdate();
            String d = n + " data inserted";

            y.close();

            x.close();

            JOptionPane.showMessageDialog(this, d);

            t1.setText("");
            t2.setText("");
            t3.setText("");
            
            showData();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error " + ex.getMessage());

            ex.printStackTrace();
        }
    }
    
    void modifyData()
    {
        try {
            String name, rollno, marks;
            rollno = t1.getText();
            name = t2.getText();
            marks = t3.getText();

            if (rollno.trim().length() == 0) {
                JOptionPane.showMessageDialog(this, "Roll Number cannot be empty");
                return;
            }

            if (name.trim().length() == 0) {
                JOptionPane.showMessageDialog(this, "Name cannot be empty");
                return;
            }

            if (marks.trim().length() == 0) {
                JOptionPane.showMessageDialog(this, "Marks cannot be empty");
                return;
            }

            Class.forName("oracle.jdbc.OracleDriver");
            String str = "jdbc:oracle:thin:@localhost:1521:";
            Connection x = DriverManager.getConnection(str, "jp20192", "123456");

            String q = "update student set name=?,marks=? where rollno=?";

            PreparedStatement y = x.prepareStatement(q);

            y.setString(3, rollno);
            y.setString(1, name);
            y.setString(2, marks);

            int n = y.executeUpdate();
            String d = n + " data updated";

            y.close();

            x.close();

            JOptionPane.showMessageDialog(this, d);

                        
            showData();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error " + ex.getMessage());

            ex.printStackTrace();
        }
    }
    
    void deleteData()
    {
        try {
            String rollno;
            rollno = t1.getText();
            
            if (rollno.trim().length() == 0) {
                JOptionPane.showMessageDialog(this, "Roll Number cannot be empty");
                return;
            }

            Class.forName("oracle.jdbc.OracleDriver");
            String str = "jdbc:oracle:thin:@localhost:1521:";
            Connection x = DriverManager.getConnection(str, "jp20192", "123456");

            String q = "delete from student where rollno=?";

            PreparedStatement y = x.prepareStatement(q);

            y.setString(1, rollno);
            
            int n = y.executeUpdate();
            String d = n + " data deleted";

            y.close();

            x.close();

            JOptionPane.showMessageDialog(this, d);

                        
            showData();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error " + ex.getMessage());

            ex.printStackTrace();
        }
    }
    
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
            java.util.logging.Logger.getLogger(tx1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tx1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tx1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tx1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tx1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable n1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    // End of variables declaration//GEN-END:variables
}
