
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaison J
 */
public class UpcomingMovies extends javax.swing.JFrame {
    public static String imagelist[]={"C:/Users/Jaison John/Documents/NetBeansProjects/TheatreManagement/src/theatremanagement/MPW-121006.jpg","C:/Users/Jaison John/Documents/NetBeansProjects/TheatreManagement/src/theatremanagement/avengers-infinity-war-imax.jpg","C:/Users/Jaison John/Documents/NetBeansProjects/TheatreManagement/src/theatremanagement/download.jpg","C:/Users/Jaison John/Documents/NetBeansProjects/TheatreManagement/src/theatremanagement/6175504_sa.jpg"};

    /**
     * Creates new form UpcomingMovies
     */
    public static int upcming_id;
    public UpcomingMovies() {
        initComponents();
          ImageIcon image5 = new ImageIcon(imagelist[0]);
              jButton2.setIcon(image5);
              ImageIcon image6 = new ImageIcon(imagelist[1]);
              jButton3.setIcon(image6);
              ImageIcon image7 = new ImageIcon(imagelist[2]);
              jButton4.setIcon(image7);
              ImageIcon image8 = new ImageIcon(imagelist[3]);
              jButton5.setIcon(image8);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 680));
        setMinimumSize(new java.awt.Dimension(800, 680));
        setPreferredSize(new java.awt.Dimension(800, 680));
        getContentPane().setLayout(null);

        jButton6.setBackground(new java.awt.Color(0, 102, 102));
        jButton6.setText("View Currently Booked Movies");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(560, 230, 220, 25);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/3eed8b8c.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 810, 170);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/MPW-113357.jpg"))); // NOI18N
        jButton5.setText("jButton2");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(600, 310, 190, 300);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/MPW-113357.jpg"))); // NOI18N
        jButton4.setText("jButton2");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(400, 310, 190, 300);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/MPW-113357.jpg"))); // NOI18N
        jButton3.setText("jButton2");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(200, 310, 190, 300);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel6.setText("Screen4");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(660, 280, 120, 23);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel5.setText("Screen3");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(460, 280, 120, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel3.setText("Screen2");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 280, 120, 25);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel1.setText("Screen1 ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 280, 120, 25);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/MPW-113357.jpg"))); // NOI18N
        jButton2.setText("jButton2");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(0, 310, 190, 300);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Currently Showing", "Upoming Movies" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(630, 190, 150, 22);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/geometric-white-hexagonal-vector-seamless-pattern-tile-45608163.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 170, 800, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        MovieDescription m = new MovieDescription();
        m.show();
        this.hide();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        MovieDescription m = new MovieDescription();
        m.show();
        this.hide();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MovieDescription2 m = new MovieDescription2();
        m.show();
        this.hide();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        //        seat s=new seat(100,1001);
        //       s.setVisible(true);
        //        this.dispose();
        MovieDescription m = new MovieDescription();
        m.show();
        this.hide();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MovieDescription2 m = new MovieDescription2();
        m.show();
        this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        if(jComboBox1.getSelectedItem().toString()=="Currently Showing")
        {
            MovieBooking f = new MovieBooking(MovieBooking.u);
            f.show();
            this.hide();
            
        }
        else
        {
             UpcomingMovies f = new UpcomingMovies();
            f.show();
            this.hide();
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(UpcomingMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpcomingMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpcomingMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpcomingMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpcomingMovies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
