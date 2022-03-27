
import java.awt.Color;
import javax.swing.JFrame;

/*
 * GrayExample.java
 *
 * Created on 29 April, 2020, 1:44 AM
 */



/**
 *
 * @author  KaranRajpara
 */
public class GrayExample extends javax.swing.JFrame {
    
    /** Creates new form GrayExample */
    public GrayExample() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.getContentPane().setBackground(Color.CYAN);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 48));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("GRAY CODE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(530, 10, 330, 55);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capture7.PNG"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 110, 679, 522);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capture8.PNG"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(860, 110, 471, 291);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 650, 120, 50);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1230, 650, 120, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1560, 980);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new GrayTable().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GrayExample().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    
}
