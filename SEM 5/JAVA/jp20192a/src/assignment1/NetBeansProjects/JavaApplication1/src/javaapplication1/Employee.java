/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author uday mahajan
 */
public class Employee extends javax.swing.JInternalFrame {

    /**
     * Creates new form student
     */
    public Employee() {
        initComponents();
        setResizable(true);
        setMaximizable(true);
        setIconifiable(true);
        setClosable(true);
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

        empid = new javax.swing.JLabel();
        txteid = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        gender = new javax.swing.JLabel();
        rbmale = new javax.swing.JRadioButton();
        rbfemale = new javax.swing.JRadioButton();
        salary = new javax.swing.JLabel();
        txtsal = new javax.swing.JTextField();
        address = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtadd = new javax.swing.JTextArea();
        designation = new javax.swing.JLabel();
        idesignation = new javax.swing.JComboBox();
        country = new javax.swing.JLabel();
        icountry = new javax.swing.JComboBox();
        department = new javax.swing.JLabel();
        idepartment = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        Delete = new javax.swing.JButton();
        save = new javax.swing.JButton();
        modify = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        empid.setText("EmpId");
        getContentPane().add(empid, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, 20));
        getContentPane().add(txteid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 110, -1));

        name.setText("Name");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, 20));
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 110, -1));

        gender.setText("Gender");
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        rbmale.setText("Male");
        getContentPane().add(rbmale, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        rbfemale.setText("Female");
        getContentPane().add(rbfemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        salary.setText("Salary");
        getContentPane().add(salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));
        getContentPane().add(txtsal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 110, -1));

        address.setText("Address");
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        txtadd.setColumns(20);
        txtadd.setRows(5);
        jScrollPane1.setViewportView(txtadd);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 210, -1));

        designation.setText("Designation");
        getContentPane().add(designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, -1, -1));

        idesignation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Project Manager", "Team Leader", "Team Member" }));
        getContentPane().add(idesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, -1, -1));

        country.setText("Country");
        getContentPane().add(country, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, -1, -1));

        icountry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "USA", "India", "Australia", "Canada", "Japan", " " }));
        icountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icountryActionPerformed(evt);
            }
        });
        getContentPane().add(icountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, -1, -1));

        department.setText("Department");
        getContentPane().add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, -1, -1));

        idepartment.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Technical", "HR", "Security", " " }));
        getContentPane().add(idepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, -1, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 190, 540, 320));

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, -1, -1));

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, -1, -1));

        modify.setText("Modify");
        modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyActionPerformed(evt);
            }
        });
        getContentPane().add(modify, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        deleteData();
    }

    private void btnModify1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        modifyData();
    }

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        saveData();
    }

    private void rbMaleActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtMarksActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void icountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_icountryActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code hint row = table.getSelectedRow();
        TableModel z =table.getModel();
        
        int row = table.getSelectedRow();
        String eid = (String) z.getValueAt(row, 0);
        String name = (String) z.getValueAt(row, 1);
        String sal = (String) z.getValueAt(row, 2);
        String gender = (String) z.getValueAt(row, 3);
        String address = (String) z.getValueAt(row, 4);
        String designation = (String) z.getValueAt(row, 5);
        String country = (String) z.getValueAt(row, 6);
        String department = (String) z.getValueAt(row, 7);

        txteid.setText(eid);
        txtname.setText(name);
        txtsal.setText(sal);
        if (gender.equalsIgnoreCase("male")) {
            rbmale.setSelected(true);
        } else {
            rbfemale.setSelected(true);
        }
        txtadd.setText(address);
        idesignation.setSelectedItem(designation);
        icountry.setSelectedItem(country);
        idepartment.setSelectedItem(department);
    }//GEN-LAST:event_tableMouseClicked

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        saveData();        // TODO add your handling code here:
    }//GEN-LAST:event_saveActionPerformed

    private void modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyActionPerformed
        modifyData();        // TODO add your handling code here:
    }//GEN-LAST:event_modifyActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        deleteData();        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteActionPerformed

    void showData() {

        try {

            Vector h = new Vector();
            h.add("EmpId");
            h.add("Name");
            h.add("Salary");
            h.add("Gender");
            h.add("Address");
            h.add("Designation");
            h.add("Country");
            h.add("Department");

            Class.forName("oracle.jdbc.OracleDriver");
            String str = "jdbc:oracle:thin:@localhost:1521:";
            Connection x = DriverManager.getConnection(str, "uday", "12345");
            String q = "select * from employee";
            PreparedStatement y = x.prepareStatement(q);
            ResultSet rs = y.executeQuery();

            Vector d = new Vector();

            String eid, name, sal, gender, address, designation, country, department;
            while (rs.next()) {
                eid = rs.getString("EmpId");
                name = rs.getString("Name");
                sal = rs.getString("Salary");
                gender = rs.getString("Gender");
                address = rs.getString("Address");
                designation = rs.getString("Designation");
                country = rs.getString("Country");
                department = rs.getString("Department");

                Vector r = new Vector();
                r.add(eid);
                r.add(name);
                r.add(sal);
                r.add(gender);
                r.add(address);
                r.add(designation);
                r.add(country);
                r.add(department);

                //inserted into data
                d.add(r);
            }
            y.close();
            x.close();

            DefaultTableModel z = new DefaultTableModel(d, h);
            table.setModel(z);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error " + ex.getMessage());
            ex.printStackTrace();
        }

    }

    void saveData() {
        try {
            String eid, name, sal, gender, address, designation, country, department;
            eid = txteid.getText();
            name = txtname.getText();
            sal = txtsal.getText();

            if (rbmale.isSelected()) {
                gender = "male";
            } else {
                gender = "female";
            }
            address = txtadd.getText();
            designation = (String) idesignation.getSelectedItem();
            country = (String) icountry.getSelectedItem();
            department = (String) idepartment.getSelectedItem();

          

            Class.forName("oracle.jdbc.OracleDriver");
            String str = "jdbc:oracle:thin:@localhost:1521:";
            Connection x = DriverManager.getConnection(str, "uday", "12345");

            String q = "insert into Employee values(?,?,?,?,?,?,?,?)";

            PreparedStatement y = x.prepareStatement(q);

            y.setString(1, eid);
            y.setString(2, name);
            y.setString(3, gender);
            y.setString(4, sal);
            y.setString(5, address);
            y.setString(6, designation);
            y.setString(7, country);
            y.setString(8, department);

            int n = y.executeUpdate();
            String d = n + " data inserted";

            y.close();

            x.close();

            JOptionPane.showMessageDialog(this, d);

            showData();
            clearData();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error " + ex.getMessage());

            ex.printStackTrace();
        }
    }

    void modifyData() {
        try {
            String eid, name, sal, gender, address, designation, country, department;
            eid = txteid.getText();
            name = txtname.getText();
            sal = txtsal.getText();

            if (rbmale.isSelected()) {
                gender = "male";
            } else {
                gender = "female";
            }
            address = txtadd.getText();
            designation = (String) idesignation.getSelectedItem();
            country = (String) icountry.getSelectedItem();
            department = (String) idepartment.getSelectedItem();


           

            Class.forName("oracle.jdbc.OracleDriver");
            String str = "jdbc:oracle:thin:@localhost:1521:";
            Connection x = DriverManager.getConnection(str, "uday", "12345");

            String q = "update Employee set name=?,salary=?,gender=?,address=?,designation=?,country=?,department=? where empid=?";

            PreparedStatement y = x.prepareStatement(q);

            y.setString(1, name);
            y.setString(2, sal);
            y.setString(3, gender);
            y.setString(4, address);
            y.setString(5, designation);
            y.setString(5, country);
            y.setString(5, department);

            int n = y.executeUpdate();
            String d = n + " data updated";

            y.close();

            x.close();

            JOptionPane.showMessageDialog(this, d);

            showData();
            clearData();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error " + ex.getMessage());

            ex.printStackTrace();
        }
    }

    void deleteData() {
        try {
            String eid;
            eid = txteid.getText();

            

            Class.forName("oracle.jdbc.OracleDriver");
            String str = "jdbc:oracle:thin:@localhost:1521:";
            Connection x = DriverManager.getConnection(str, "uday", "12345");

            String q = "delete from student where eid=?";

            PreparedStatement y = x.prepareStatement(q);

            y.setString(1, eid);

            int n = y.executeUpdate();
            String d = n + " data deleted";

            y.close();

            x.close();

            JOptionPane.showMessageDialog(this, d);

            showData();
            clearData();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error " + ex.getMessage());

            ex.printStackTrace();
        }
    }

    void clearData() {
        txteid.setText("");
        txtname.setText("");
        txtsal.setText("");
        txtadd.setText("");
        rbmale.setSelected(true);
        icountry.setSelectedIndex(0);
        idepartment.setSelectedIndex(0);
        idesignation.setSelectedIndex(0);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JLabel address;
    private javax.swing.JLabel country;
    private javax.swing.JLabel department;
    private javax.swing.JLabel designation;
    private javax.swing.JLabel empid;
    private javax.swing.JLabel gender;
    private javax.swing.JComboBox icountry;
    private javax.swing.JComboBox idepartment;
    private javax.swing.JComboBox idesignation;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modify;
    private javax.swing.JLabel name;
    private javax.swing.JRadioButton rbfemale;
    private javax.swing.JRadioButton rbmale;
    private javax.swing.JLabel salary;
    private javax.swing.JButton save;
    private javax.swing.JTable table;
    private javax.swing.JTextArea txtadd;
    private javax.swing.JTextField txteid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtsal;
    // End of variables declaration//GEN-END:variables
}
