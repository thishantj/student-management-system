/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp;
import java.util.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dhanushka
 */
public class Fee extends javax.swing.JFrame {

    /**
     * Creates new form Fee
     */
    public Fee() {
        initComponents();
        show_fees();
    }
    public ArrayList<feeModel> feeList() {
        ArrayList<feeModel> feeList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=tinytot;user=admin;password=123456");
            
            String query = "select * from fees";
            
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(query);
        
            feeModel fee;
            while(rs.next())
            {
               fee = new feeModel(rs.getInt("ID"),rs.getString("Name"),rs.getInt("PaymentID"), rs.getString("Date"), rs.getInt("Fee") );
               feeList.add(fee);
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        return feeList;
    }
    
    public void show_fees()
    {
        ArrayList<feeModel> list = feeList();
        DefaultTableModel model = (DefaultTableModel)feeTable.getModel();
        
        Object[] row = new Object[5];
        
        for(int i=0; i<list.size(); i++)
        {
            row[0]=list.get(i).getID(); 
            row[1]=list.get(i).getName(); 
            row[2]=list.get(i).getPaymentID(); 
            row[3]=list.get(i).getDate(); 
            row[4]=list.get(i).getFee(); 
            model.addRow(row); 
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

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        feefield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        namefield = new javax.swing.JTextField();
        paymentfield = new javax.swing.JTextField();
        studentidfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        feeTable = new javax.swing.JTable();
        btn_clear = new javax.swing.JButton();
        btn_submit = new javax.swing.JButton();
        datePicker = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(129, 219, 58));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 700, 10));

        feefield.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jPanel4.add(feefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 140, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Fee");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        namefield.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        namefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namefieldActionPerformed(evt);
            }
        });
        jPanel4.add(namefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 140, -1));

        paymentfield.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        paymentfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentfieldActionPerformed(evt);
            }
        });
        jPanel4.add(paymentfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 140, -1));

        studentidfield.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        studentidfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentidfieldActionPerformed(evt);
            }
        });
        jPanel4.add(studentidfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 140, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Name");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Date");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Student ID");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setText("Payment ID");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Manage");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        feeTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        feeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Payment ID", "Date", "Fee"
            }
        ));
        feeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                feeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(feeTable);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 700, 260));

        btn_clear.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel4.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, -1));

        btn_submit.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btn_submit.setText("Submit");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });
        jPanel4.add(btn_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

        datePicker.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        datePicker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datePickerMouseClicked(evt);
            }
        });
        jPanel4.add(datePicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 220, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 700, 570));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("FEES");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        btn_delete.setBackground(new java.awt.Color(204, 255, 0));
        btn_delete.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel3.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 670, -1, -1));

        btn_edit.setBackground(new java.awt.Color(204, 255, 0));
        btn_edit.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel3.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 670, 70, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-shutdown-60.png"))); // NOI18N
        jButton9.setText("Logout");
        jButton9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 320, -1));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-student-male-60.png"))); // NOI18N
        jButton4.setText("Student");
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 320, -1));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-money-60.png"))); // NOI18N
        jButton5.setText("Fees");
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 320, -1));

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-home-60.png"))); // NOI18N
        jButton7.setText("Home");
        jButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 320, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1098, 767));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       Student fh = new Student();
        fh.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Fee fh = new Fee();
        fh.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void namefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namefieldActionPerformed

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        
        if(studentidfield.getText().isEmpty()){
    JOptionPane.showMessageDialog(null, "Fill all the fields");
             }             
    
        else if(namefield.getText().isEmpty()){
    JOptionPane.showMessageDialog(null, "Fill all the fields");
     }
    
    else if(paymentfield.getText().isEmpty()){
    JOptionPane.showMessageDialog(null, "Fill all the fields");
     }
    
    else if(feefield.getText().isEmpty()){
    JOptionPane.showMessageDialog(null, "Fill all the fields");
     }
        
        
        
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=tinytot;user=admin;password=123456");
            
             
    
            String query = "insert into fees(ID,Name,PaymentID,Date,Fee) values(?,?,?,?,?)";
             

            PreparedStatement pst = conn.prepareStatement(query);
            
            
            pst.setString(1, studentidfield.getText() );
            pst.setString(2, namefield.getText() );
            pst.setString(3, paymentfield.getText() );
            pst.setString(4, new SimpleDateFormat("MMM d, yyyy").format(datePicker.getDate() ) );
            pst.setString(5, feefield.getText() );
            
            pst.executeUpdate();
            
            DefaultTableModel model = (DefaultTableModel)feeTable.getModel();
            show_fees();
            
            JOptionPane.showMessageDialog(null, "Successfully inserted");
            
            namefield.setText("");
            datePicker.setDate(null);
            studentidfield.setText("");
            paymentfield.setText("");
            feefield.setText("");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_submitActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        
        namefield.setText("");
        datePicker.setDate(null);
        studentidfield.setText("");
        paymentfield.setText("");
        feefield.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    private void studentidfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentidfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentidfieldActionPerformed

    private void paymentfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentfieldActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=tinytot;user=admin;password=123456");
            
            int row = feeTable.getSelectedRow();
            
            String value = ( feeTable.getModel().getValueAt(row, 0).toString() );
            
            String query = "update fees set Name=?, PaymentID=?, Date=?, Fee=? where ID="+value;
            
            PreparedStatement pst = conn.prepareStatement(query);
            
            //pst.setString(1, studentidfield.getText() );
            pst.setString(1, namefield.getText() );
            pst.setString(2, paymentfield.getText() );
            pst.setString(3, new SimpleDateFormat("MMM d, yyyy").format(datePicker.getDate() ) );
            pst.setString(4, feefield.getText() );
            
            pst.executeUpdate();
            
            DefaultTableModel model = (DefaultTableModel)feeTable.getModel();
            
            model.setRowCount(0);
            show_fees();
            
            JOptionPane.showMessageDialog(null, "Successfully updated");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        int opt = JOptionPane.showConfirmDialog(null, "are you sure you want to delete ?","Delete",JOptionPane.YES_NO_OPTION);
        if (opt==0){
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=tinytot;user=admin;password=123456");
            
            int row = feeTable.getSelectedRow();
            
            String value = ( feeTable.getModel().getValueAt(row, 0).toString() );
            
            String query = "delete from fees where ID="+value;
            
            PreparedStatement pst = conn.prepareStatement(query);
            
            pst.executeUpdate();
            
            DefaultTableModel model = (DefaultTableModel)feeTable.getModel();
            
            model.setRowCount(0);
            
            show_fees();
            
            JOptionPane.showMessageDialog(null, "Deleted successfully");
            
            namefield.setText("");
            datePicker.setDate(null);
            studentidfield.setText("");
            paymentfield.setText("");
            feefield.setText("");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        }
        
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void feeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feeTableMouseClicked
        
             int i = feeTable.getSelectedRow();
             DefaultTableModel model = (DefaultTableModel)feeTable.getModel();
             
             
             
             studentidfield.setText(model.getValueAt(i, 0).toString());
             namefield.setText(model.getValueAt(i, 1).toString());
             paymentfield.setText(model.getValueAt(i, 2).toString());
             datePicker.setDateFormatString(model.getValueAt(i,3).toString());
             feefield.setText(model.getValueAt(i, 4).toString());
         
    }//GEN-LAST:event_feeTableMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        homePage home = new homePage();
            home.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void datePickerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datePickerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_datePickerMouseClicked

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
            java.util.logging.Logger.getLogger(Fee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_submit;
    private com.toedter.calendar.JDateChooser datePicker;
    private javax.swing.JTable feeTable;
    private javax.swing.JTextField feefield;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField namefield;
    private javax.swing.JTextField paymentfield;
    private javax.swing.JTextField studentidfield;
    // End of variables declaration//GEN-END:variables
}