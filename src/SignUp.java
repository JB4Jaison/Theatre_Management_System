;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class SignUp extends javax.swing.JFrame {
     public static final String DBURL="jdbc:oracle:thin:@JB4ROGUE:1521:XE";
      public static final String DBUSER="system";
       public static final String DBPASS="student";

    /**
     * Creates new form SignUp
     */
    public SignUp() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 507));
        setMinimumSize(new java.awt.Dimension(800, 507));
        getContentPane().setLayout(null);

        jLabel8.setFont(new java.awt.Font("Source Sans Pro ExtraLight", 1, 18)); // NOI18N
        jLabel8.setText("Mobile No.");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(470, 230, 140, 20);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 0);

        jLabel3.setFont(new java.awt.Font("Source Sans Pro ExtraLight", 1, 18)); // NOI18N
        jLabel3.setText("Confirm Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 300, 160, 20);

        jLabel5.setFont(new java.awt.Font("Source Sans Pro ExtraLight", 1, 18)); // NOI18N
        jLabel5.setText("Password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 270, 110, 16);

        jLabel9.setFont(new java.awt.Font("Source Sans Pro ExtraLight", 1, 18)); // NOI18N
        jLabel9.setText("City");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 370, 140, 20);

        jLabel10.setFont(new java.awt.Font("Source Sans Pro ExtraLight", 1, 18)); // NOI18N
        jLabel10.setText("Gender");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 340, 140, 20);

        jLabel6.setFont(new java.awt.Font("Source Sans Pro ExtraLight", 1, 18)); // NOI18N
        jLabel6.setText("Username");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 230, 130, 20);

        jRadioButton1.setText("Female");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(220, 330, 71, 25);

        jRadioButton2.setText("Male");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(310, 330, 55, 25);

        jButton1.setText("SIgn Up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(290, 430, 77, 25);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(200, 360, 240, 30);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(560, 220, 230, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(200, 300, 240, 22);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(200, 220, 250, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(200, 260, 250, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/3eed8b8c.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 800, 170);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/1157b6fd85f1ff2.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 170, 800, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try{ Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
         
         Statement statement = con.createStatement();
         if(jTextField1.getText().isEmpty())
         {
             JOptionPane.showMessageDialog(null, "Please Enter a username", "INVALID", JOptionPane.INFORMATION_MESSAGE);
         }
         else if(jTextField3.getText().equals(jTextField2.getText()))
        {
            JOptionPane.showMessageDialog(null, "Please Enter the same password", "INVALID", JOptionPane.INFORMATION_MESSAGE);
        }
          else if(! isNumeric(jTextField6.getText()))
        {
            JOptionPane.showMessageDialog(null, "Please Enter Valid Mobile No", "INVALID", JOptionPane.INFORMATION_MESSAGE);
        }
          else if(jTextField5.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please Enter the city", "INVALID", JOptionPane.INFORMATION_MESSAGE);
        }
          else{
         if(jRadioButton2.isSelected()==true){
         
         statement.executeUpdate("insert into user_login(user_id,name,password,gender,city,mob_num) values(wseq.nextval,'"+jTextField1.getText()+"','"+jTextField2.getText()+"','male','"+jTextField5.getText()+"','"+jTextField6.getText()+"')");   
         }
         
            
         else if(jRadioButton1.isSelected()==true)
         { statement.executeUpdate("insert into user_login(user_id,name,password,gender,city,mob_num) values(wseq.nextval,'"+jTextField1.getText()+"','"+jTextField2.getText()+"','female','"+jTextField5.getText()+"','"+jTextField6.getText()+"')");
                 }
         }
         UserLogin f = new UserLogin();
         f.show();
         this.hide();
                 
                 
         }
        catch(Exception e)
        {e.printStackTrace();}
          
           
                   
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
