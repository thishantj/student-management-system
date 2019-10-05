package itp;


import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import com.sun.nio.fs.WindowsUserPrincipals.User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHARUKH
 */
public final class PayrollN extends javax.swing.JFrame {

    /**
     * Creates new form PayrollN
     */
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
  
    public PayrollN() {
        super("Payroll");
        initComponents();
        show_payroll();
        //conn = databaseConnection.connection();
        }
    
    
    
    public ArrayList<TPayroll> teacherList(){
        
        ArrayList<TPayroll> teacherList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=tinytot;user=admin;password=123456");
            String query1 = "SELECT * FROM PayrollN";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query1);
            TPayroll payroll;
            while(rs.next()){
                        payroll = new TPayroll( rs.getString("Name") , rs.getString("Id") ,   rs.getInt("Year")    ,  rs.getString("Ordinary") , rs.getString("Advanced") , rs.getString("Diploma") , rs.getString("Language") , rs.getString("Others"));
                        teacherList.add(payroll);
            }                         
        } catch(Exception e){
                 JOptionPane.showMessageDialog(null,e);
                        }
        return teacherList;
    }
    

    public void  show_payroll(){
         ArrayList<TPayroll> list = teacherList() ;
        DefaultTableModel model = (DefaultTableModel)Pt1.getModel();
        
        Object[] row = new Object[8];
            for(int i=0 ; i<list.size() ; i++){
                
                row[0]=list.get(i).getName();
                row[1]=list.get(i).getId();
                row[2]=list.get(i).getYear();
                row[3]=list.get(i).getOrdinary();
                row[4]=list.get(i).getAdvanced();
                row[5]=list.get(i).getDiploma();
                row[6]=list.get(i).getLanguage();
                row[7]=list.get(i).getOthers();
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

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        Others = new javax.swing.JTextField();
        Languages = new javax.swing.JTextField();
        Diploma = new javax.swing.JTextField();
        ordinary = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        advanced = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PDELETE = new javax.swing.JButton();
        PUPDATE = new javax.swing.JButton();
        PINSERT = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Id = new javax.swing.JTextField();
        Pid = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        Pname = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Pt1 = new javax.swing.JTable();
        PTOPIC = new javax.swing.JLabel();
        PSALARY = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home-30.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(270, 680, 60, 30);
        jPanel1.add(Others);
        Others.setBounds(870, 250, 190, 30);

        Languages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LanguagesActionPerformed(evt);
            }
        });
        jPanel1.add(Languages);
        Languages.setBounds(870, 200, 190, 30);
        jPanel1.add(Diploma);
        Diploma.setBounds(870, 150, 190, 30);

        ordinary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ordinaryKeyTyped(evt);
            }
        });
        jPanel1.add(ordinary);
        ordinary.setBounds(150, 200, 190, 30);

        year.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                yearKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                yearKeyTyped(evt);
            }
        });
        jPanel1.add(year);
        year.setBounds(150, 150, 190, 30);

        advanced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advancedActionPerformed(evt);
            }
        });
        advanced.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                advancedKeyTyped(evt);
            }
        });
        jPanel1.add(advanced);
        advanced.setBounds(150, 250, 190, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Others");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(700, 250, 110, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Languages");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(700, 190, 130, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Diploma");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(700, 150, 110, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Advanced");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 250, 120, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ordinary");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 200, 120, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Year");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 150, 60, 30);

        PDELETE.setBackground(new java.awt.Color(153, 153, 255));
        PDELETE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete-30.png"))); // NOI18N
        PDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDELETEActionPerformed(evt);
            }
        });
        jPanel1.add(PDELETE);
        PDELETE.setBounds(180, 680, 63, 30);

        PUPDATE.setBackground(new java.awt.Color(153, 153, 255));
        PUPDATE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update-30.png"))); // NOI18N
        PUPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PUPDATEActionPerformed(evt);
            }
        });
        jPanel1.add(PUPDATE);
        PUPDATE.setBounds(90, 680, 60, 30);

        PINSERT.setBackground(new java.awt.Color(153, 153, 255));
        PINSERT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/insert-30.png"))); // NOI18N
        PINSERT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PINSERTActionPerformed(evt);
            }
        });
        jPanel1.add(PINSERT);
        PINSERT.setBounds(10, 680, 60, 30);

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/color-home-30.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1010, 670, 60, 40);

        Id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IdKeyTyped(evt);
            }
        });
        jPanel1.add(Id);
        Id.setBounds(870, 100, 190, 30);

        Pid.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Pid.setForeground(new java.awt.Color(255, 255, 255));
        Pid.setText("Id");
        jPanel1.add(Pid);
        Pid.setBounds(700, 100, 60, 30);
        jPanel1.add(name);
        name.setBounds(150, 100, 190, 30);

        Pname.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Pname.setForeground(new java.awt.Color(255, 255, 255));
        Pname.setText("Name");
        jPanel1.add(Pname);
        Pname.setBounds(10, 100, 100, 29);

        Pt1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Year", "Ordinary Level(O/l)", "Advanced Level(A/L)", "Dip. in MOntessori Teaching", "Languages", "Others"
            }
        ));
        jScrollPane1.setViewportView(Pt1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 300, 1060, 340);

        PTOPIC.setFont(new java.awt.Font("Tahoma", 1, 43)); // NOI18N
        PTOPIC.setForeground(new java.awt.Color(255, 255, 255));
        PTOPIC.setText("Teacher Wages For Month Of September 2019");
        jPanel1.add(PTOPIC);
        PTOPIC.setBounds(30, 10, 1020, 58);

        PSALARY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.jpg"))); // NOI18N
        jPanel1.add(PSALARY);
        PSALARY.setBounds(0, 0, 1080, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PUPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PUPDATEActionPerformed
        // TODO add your handling code here:
       String name1 = name.getText();
       String id1 = Id.getText();
       String year1 = year.getText();
       String ordinary1 = ordinary.getText();
       String advanced1 = advanced.getText();
       String diploma1 = Diploma.getText();
       String languages1 = Languages.getText();
       String others1 = Others.getText();
        
       
       if(name1.equals("")){
           JOptionPane.showMessageDialog(null,"Name field is empty");
       }
        else if(id1.equals("")){
           JOptionPane.showMessageDialog(null,"ID field is empty");
       }
       else if(year1.equals("")){
           JOptionPane.showMessageDialog(null,"Year field is empty");
       }
       else if(ordinary1.equals("")){
           JOptionPane.showMessageDialog(null,"Ordinary field is empty");
       }
       else if(advanced1.equals("")){
           JOptionPane.showMessageDialog(null,"Advanced field is empty");
       }
       else if(diploma1.equals("")){
           JOptionPane.showMessageDialog(null,"Diploma field is empty");
       }
       else if(languages1.equals("")){
           JOptionPane.showMessageDialog(null,"Language field is empty");
       }
       else if(others1.equals("")){
           JOptionPane.showMessageDialog(null,"Other field is empty");
       }
       else{
        
        
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=tinytot;user=admin;password=123456");
            int row = Pt1.getSelectedRow();
            String value = (Pt1.getModel().getValueAt(row, 0).toString());
            String query = "UPDATE PayrollN set Name=? , Id=? ,Year=? , Ordinary=? , advanced=?  , Diploma=? , Language=? , Others=?"+value;
            PreparedStatement pst = conn.prepareStatement(query); 
            
                    pst.setString(1 ,name.getText());
                    pst.setString(2 ,Id.getText());
                    pst.setString(3 ,year.getText());
                    pst.setString(4 ,ordinary.getText());
                    pst.setString(5 ,advanced.getText());
                    pst.setString(6 ,Diploma.getText());
                    pst.setString(7 ,Languages.getText());
                    pst.setString(8 ,Others.getText());
                    
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)Pt1.getModel();
            model.setRowCount(0);
            show_payroll();
            JOptionPane.showMessageDialog(null,"Inserted Successfully!");
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
          }
       }
    }//GEN-LAST:event_PUPDATEActionPerformed

    
    
    private void PDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDELETEActionPerformed
        // TODO add your handling code here:
        
        int x = JOptionPane.showConfirmDialog(null, "DO you really want to delete?");
        
        if(x==0){
              String id1 = Id.getText();
               
                if(id1.equals("")){
                        JOptionPane.showConfirmDialog(null, "ID is required");
                }
                else{
                    String sql = "DELETE from PayrollN where name1 = '" + id1 +"'";
               
        
        
        
        
        
         try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=tinytot;user=admin;password=123456");
     
            int row = Pt1.getSelectedRow();
            String value = (Pt1.getModel().getValueAt(row,0).toString());
            String query = "DELETE FROM PayrollN where salary"+value;
            PreparedStatement pst = conn.prepareStatement(query);
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)Pt1.getModel();
            model.setRowCount(0);
            show_payroll();
            JOptionPane.showMessageDialog(null,"Delete Successfully!");
        
          }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
          }
        }
      }
    }//GEN-LAST:event_PDELETEActionPerformed

    
  
    
    
    private void PINSERTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PINSERTActionPerformed
        // TODO add your handling code here:
        
       String name1 = name.getText();
       String id1 = Id.getText();
       String year1 = year.getText();
       String ordinary1 = ordinary.getText();
       String advanced1 = advanced.getText();
       String diploma1 = Diploma.getText();
       String languages1 = Languages.getText();
       String others1 = Others.getText();
        
       
       if(name1.equals("")){
           JOptionPane.showMessageDialog(null,"Name field is empty");
       }
        else if(id1.equals("")){
           JOptionPane.showMessageDialog(null,"ID field is empty");
       }
       else if(year1.equals("")){
           JOptionPane.showMessageDialog(null,"Year field is empty");
       }
       else if(ordinary1.equals("")){
           JOptionPane.showMessageDialog(null,"Ordinary field is empty");
       }
       else if(advanced1.equals("")){
           JOptionPane.showMessageDialog(null,"Advanced field is empty");
       }
      
       else if(diploma1.equals("")){
           JOptionPane.showMessageDialog(null,"Diploma field is empty");
       }
       else if(languages1.equals("")){
           JOptionPane.showMessageDialog(null,"Language field is empty");
       }
       else if(others1.equals("")){
           JOptionPane.showMessageDialog(null,"Other field is empty");
       }
       else{
        
        
          try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=tinytot;user=admin;password=123456");
            
            String query ="insert into PayrollN(Name,Id,Year,Ordinary,Advanced,Diploma,Language,Others)values(?,?,?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(query);
            
                    pst.setString(1 ,name.getText());
                    pst.setString(2 ,Id.getText());
                    pst.setString(3 ,year.getText());
                    pst.setString(4 ,ordinary.getText());
                    pst.setString(5 ,advanced.getText());
                    pst.setString(6 ,Diploma.getText());
                    pst.setString(7 ,Languages.getText());
                    pst.setString(8 ,Others.getText());
                    
                  pst.executeUpdate();
                  DefaultTableModel model = (DefaultTableModel)Pt1.getModel();
                  model.setRowCount(0);
                  show_payroll();
                  JOptionPane.showMessageDialog(null,"Inserted Successfully!");
                 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
         }
       }
    }//GEN-LAST:event_PINSERTActionPerformed

    private void advancedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_advancedActionPerformed
        // TODO add your handling code here:
         PayrollN p = new PayrollN();
        p.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_advancedActionPerformed

    private void LanguagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LanguagesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LanguagesActionPerformed

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
//        HomeN home = new HomeN();
//        home.setVisible(true);
//        this.setVisible(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void yearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearKeyPressed

    private void yearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLetter(c) && !evt.isAltDown() )
        {
            evt.consume();
        }
    }//GEN-LAST:event_yearKeyTyped

    private void IdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdKeyTyped
       char c = evt.getKeyChar();
        if(Character.isLetter(c) && !evt.isAltDown() )
        {
            evt.consume();
        }
    }//GEN-LAST:event_IdKeyTyped

    private void ordinaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ordinaryKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c) && !evt.isAltDown() )
        {
            evt.consume();
        }
    }//GEN-LAST:event_ordinaryKeyTyped

    private void advancedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_advancedKeyTyped
        // TODO add your handling code here:char c = evt.getKeyChar();
       char c = evt.getKeyChar();
        if(Character.isLetter(c) && !evt.isAltDown() )
        {
            evt.consume();
        }
    }//GEN-LAST:event_advancedKeyTyped

    
    
  
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
            java.util.logging.Logger.getLogger(PayrollN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayrollN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayrollN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayrollN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PayrollN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Diploma;
    private javax.swing.JTextField Id;
    private javax.swing.JTextField Languages;
    private javax.swing.JTextField Others;
    private javax.swing.JButton PDELETE;
    private javax.swing.JButton PINSERT;
    private javax.swing.JLabel PSALARY;
    private javax.swing.JLabel PTOPIC;
    private javax.swing.JButton PUPDATE;
    private javax.swing.JLabel Pid;
    private javax.swing.JLabel Pname;
    private javax.swing.JTable Pt1;
    private javax.swing.JTextField advanced;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField ordinary;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}