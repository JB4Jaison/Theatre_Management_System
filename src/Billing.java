/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaison J
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
;

public class Billing extends javax.swing.JFrame {
    public static int u;
    public static int t;
        public static final String DBURL="jdbc:oracle:thin:@JB4ROGUE:1521:XE";
      public static final String DBUSER="system";
       public static final String DBPASS="student";

    /**
     * Creates new form Billing
     */
    public Billing() {
        initComponents();
    }
       public Billing(int a,int b) {
        initComponents();
        u=a;
        t=b;
        try{
            Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

 

        Statement statement = con.createStatement();
        
         ResultSet rs = statement.executeQuery(" select user_id,movie_id,count(*) from movie_seat group by user_id,movie_id having user_id='"+u+"' and movie_id='"+seat.b+"' ");
         if(rs.next())
         { int st=rs.getInt(3)*250;
             jLabel15.setText(String.valueOf(st));
                jLabel16.setText(String.valueOf(t));
               double s=(st+t)*(0.2);
               jLabel17.setText(String.valueOf(s));
            
               double total =s+st+ seat.b;
               jLabel18.setText(String.valueOf(total));
               
        
               
         
         
         }
        
        
        
        }
        catch(Exception e)
        {e.printStackTrace();}
        
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
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jTextField5 = new javax.swing.JTextField();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 680));
        setMinimumSize(new java.awt.Dimension(800, 680));
        getContentPane().setLayout(null);

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel15.setText("Ticket Cost:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(300, 240, 120, 25);

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel16.setText("Ticket Cost:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(300, 270, 120, 25);

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel17.setText("Ticket Cost:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(300, 300, 120, 25);

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel18.setText("Ticket Cost:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(300, 330, 120, 25);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/mastercard_1_82737.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(140, 400, 70, 60);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/Rupay-Cards-Big.jpg"))); // NOI18N
        jLabel10.setText("jLabel9");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(370, 410, 70, 39);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/21558844_2173448309347840_2-765x510.jpg"))); // NOI18N
        jLabel11.setText("jLabel9");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(490, 410, 60, 40);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/acceptingdiscover.jpg"))); // NOI18N
        jLabel12.setText("jLabel9");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(260, 410, 60, 40);

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel13.setText("Enter Card No");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(40, 480, 130, 23);

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel14.setText("Enter CVV");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(570, 480, 90, 23);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Pay Amount");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(330, 550, 130, 25);

        jTextField4.setColumns(4);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(670, 480, 50, 30);

        buttonGroup1.add(jRadioButton1);
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(460, 420, 25, 25);

        buttonGroup1.add(jRadioButton2);
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(340, 420, 25, 25);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setSelected(true);
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(110, 420, 25, 25);

        jTextField5.setColumns(4);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(170, 480, 390, 30);

        buttonGroup1.add(jRadioButton4);
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(230, 420, 25, 25);

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel7.setText("Total Cost");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(110, 330, 120, 23);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel8.setText("Tax");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(110, 300, 120, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/3eed8b8c.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 810, 170);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel6.setText("Select Payment Card");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(110, 370, 190, 23);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel5.setText("Refreshment Cost");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(110, 270, 170, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel3.setText("Ticket Cost:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 240, 120, 25);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 240, 120, 0);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/geometric-white-hexagonal-vector-seamless-pattern-tile-45608163.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 170, 800, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jButton1ActionPerformed
public static boolean isNumeric(String str)  
    {  
  try  
  {  
    double d = Double.parseDouble(str);  
  }  
  catch(NumberFormatException nfe)  
  {  
    return false;  
  }  
  return true;  
    }
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        try{
             Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

 
         if(! isNumeric(jTextField5.getText()) ||jTextField5.getText().length() != 10 )
         {
             JOptionPane.showMessageDialog(null, "Please Enter Valid Card No", "INVALID", JOptionPane.INFORMATION_MESSAGE);
         }
        else if(! isNumeric(jTextField4.getText()) ||jTextField4.getText().length() != 3)
        {
                JOptionPane.showMessageDialog(null, "Please Enter Valid CVV", "INVALID", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
        Statement statement = con.createStatement();
            
            
            statement.executeUpdate("insert into bill1(payment_id,movie_id,user_id,r_cost,t_cost,total) values(payment_id.nextval,'"+seat.b+"','"+u+"','"+jLabel16.getText()+"','"+jLabel15.getText()+"','"+jLabel18.getText()+"' )");
        
            JOptionPane.showMessageDialog(null, "Thank You for Booking The Seat!!", "Success", JOptionPane.INFORMATION_MESSAGE);
         MovieBooking f = new MovieBooking(MovieBooking.u);
         f.show();
         this.hide();
         }
        }
        catch(Exception e)
        {e.printStackTrace();}
        
         
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
