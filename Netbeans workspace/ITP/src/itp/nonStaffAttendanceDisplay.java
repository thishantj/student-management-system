package itp;


import com.itextpdf.text.PageSize;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class nonStaffAttendanceDisplay extends javax.swing.JFrame {

    /**
     * Creates new form nonStaffAttendanceDisplay
     */
    public nonStaffAttendanceDisplay() throws SQLException {
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

        jPanel7 = new javax.swing.JPanel();
        btn_home = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        btn_genAS = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_nonstfdis = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        show_button = new javax.swing.JButton();
        date = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1024, 720));
        getContentPane().setLayout(null);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(null);

        btn_home.setBackground(new java.awt.Color(255, 255, 255));
        btn_home.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-home-page-40.png"))); // NOI18N
        btn_home.setText("   Home");
        btn_home.setBorder(null);
        btn_home.setBorderPainted(false);
        btn_home.setContentAreaFilled(false);
        btn_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_home.setFocusPainted(false);
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });
        jPanel7.add(btn_home);
        btn_home.setBounds(50, 40, 130, 40);

        btn_exit.setBackground(new java.awt.Color(255, 255, 255));
        btn_exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-ios-40.png"))); // NOI18N
        btn_exit.setText("   Exit");
        btn_exit.setBorder(null);
        btn_exit.setBorderPainted(false);
        btn_exit.setContentAreaFilled(false);
        btn_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_exit.setFocusPainted(false);
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        jPanel7.add(btn_exit);
        btn_exit.setBounds(70, 210, 100, 40);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel7.add(jLayeredPane1);
        jLayeredPane1.setBounds(160, 30, 100, 100);

        btn_genAS.setBackground(new java.awt.Color(255, 255, 255));
        btn_genAS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_genAS.setText("Generate Report");
        btn_genAS.setBorder(null);
        btn_genAS.setBorderPainted(false);
        btn_genAS.setContentAreaFilled(false);
        btn_genAS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_genAS.setFocusPainted(false);
        btn_genAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_genASActionPerformed(evt);
            }
        });
        jPanel7.add(btn_genAS);
        btn_genAS.setBounds(20, 100, 220, 40);

        btn_back.setBackground(new java.awt.Color(255, 255, 255));
        btn_back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-back-arrow-46.png"))); // NOI18N
        btn_back.setText("   Back");
        btn_back.setBorder(null);
        btn_back.setBorderPainted(false);
        btn_back.setContentAreaFilled(false);
        btn_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_back.setFocusPainted(false);
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel7.add(btn_back);
        btn_back.setBounds(50, 150, 140, 40);

        getContentPane().add(jPanel7);
        jPanel7.setBounds(0, 0, 260, 720);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable_nonstfdis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "EmpID", "Time IN", "Time OUT", "Leave"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_nonstfdis);
        if (jTable_nonstfdis.getColumnModel().getColumnCount() > 0) {
            jTable_nonstfdis.getColumnModel().getColumn(2).setResizable(false);
            jTable_nonstfdis.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(260, 120, 760, 600);

        jPanel1.setBackground(new java.awt.Color(153, 0, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Non-Academic Staff Attendance Display");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(260, 0, 770, 50);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Date    :");

        show_button.setBackground(new java.awt.Color(204, 204, 255));
        show_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        show_button.setText("Show");
        show_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_buttonActionPerformed(evt);
            }
        });

        date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        date.setMaxSelectableDate(new java.util.Date(2201020200000L));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 328, Short.MAX_VALUE)
                .addComponent(show_button, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(show_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(260, 50, 770, 70);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        this.setVisible(false);
        homePage home = new homePage();
        home.setVisible(true);
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        NonStaffAttendance ns = new NonStaffAttendance();
        ns.setVisible(true);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void show_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_buttonActionPerformed
        // TODO add your handling code here:
        
        
        
        String date2 = new SimpleDateFormat("MMM d, yyyy").format(date.getDate() );
        try {
        ArrayList<nonstaffAttDis> attendanceList = new ArrayList<>();
        
        dbConnection db = new dbConnection();
        Connection conn = db.getConnection();
        
        String query3 = "SELECT * FROM attendanceEmp where date = '" + date2+"'";
        
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query3);
        nonstaffAttDis attendanceDis;
        
        while(rs.next()){
            attendanceDis = new nonstaffAttDis(rs.getString("date"),rs.getString("empID"), rs.getString("time_in"),  rs.getString("time_out"), rs.getString("leave"));
            attendanceList.add(attendanceDis);
            
            DefaultTableModel model = (DefaultTableModel)jTable_nonstfdis.getModel();
            Object[] row = new Object[5];
           
            for(int i=0; i <attendanceList.size();i++){
                row[0]=attendanceList.get(i).getDate();
                row[1]=attendanceList.get(i).getEmpIDD();
                row[2]=attendanceList.get(i).getTime_in();
                row[3]=attendanceList.get(i).getTime_out();
                row[4]=attendanceList.get(i).getLeave();
         
                model.addRow(row);
            }
            

        }
        } catch (SQLException ex) {
            Logger.getLogger(nonStaffAttendanceDisplay.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_show_buttonActionPerformed

    private void btn_genASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_genASActionPerformed
        int rowno = 0;
        try {
            dbConnection db = new dbConnection();
            Connection conn = db.getConnection();

            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery("Select * from attendanceEmp");

            ResultSetMetaData rsmd = rs.getMetaData();
            int colno = rsmd.getColumnCount();

            while(rs.next())
            {
                rowno = rowno+1;
            }
            rs.first();

            com.itextpdf.text.Document d = new com.itextpdf.text.Document(PageSize.A4.rotate(), 0, 0, 0, 0);
            try {
                try {
                    PdfWriter.getInstance(d, new FileOutputStream("Non Academic Staff Attendance Detials.pdf"));
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(nonStaffAttendanceDisplay.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (DocumentException ex) {
                Logger.getLogger(nonStaffAttendanceDisplay.class.getName()).log(Level.SEVERE, null, ex);
            }

            PdfPTable pt = new PdfPTable(colno);

            d.open();

            try {
                d.add(new Paragraph("\n\n Non Academic Staff Attendance Detials \n\n\n"));
            } catch (DocumentException ex) {
                Logger.getLogger(nonStaffAttendanceDisplay.class.getName()).log(Level.SEVERE, null, ex);
            }

            pt.addCell("Date");
            pt.addCell("Employee ID");
            pt.addCell("Time IN");
            pt.addCell("Time OUT");
            pt.addCell("Leave");

            for(int i=0; i<rowno;i++){
                pt.addCell(""+rs.getString(1));
                pt.addCell(""+rs.getString(2));
                pt.addCell(""+rs.getString(3));
                pt.addCell(""+rs.getString(4));
                pt.addCell(""+rs.getString(5));
                rs.next();
            }

            try {
                d.add(pt);
            } catch (DocumentException ex) {
                Logger.getLogger(nonStaffAttendanceDisplay.class.getName()).log(Level.SEVERE, null, ex);
            }

            d.close();
            
            JOptionPane.showMessageDialog(null, "Report Gegerated Successfully!");

        } catch (SQLException ex) {
            Logger.getLogger(nonStaffAttendanceDisplay
                    .class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_genASActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new NonStaffAttendance().setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

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
            java.util.logging.Logger.getLogger(nonStaffAttendanceDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nonStaffAttendanceDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nonStaffAttendanceDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nonStaffAttendanceDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new nonStaffAttendanceDisplay().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(nonStaffAttendanceDisplay.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_genAS;
    private javax.swing.JButton btn_home;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_nonstfdis;
    private javax.swing.JButton show_button;
    // End of variables declaration//GEN-END:variables
}
