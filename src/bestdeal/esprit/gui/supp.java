/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.gui;

import bestdeal.esprit.controllers.commentaireController;
import bestdeal.esprit.dao.CommentaireDAO;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaLookAndFeel;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author user
 */
public class supp extends javax.swing.JFrame {

    /**
     * Creates new form supp
     */
    public supp() {
        try {
            SyntheticaLookAndFeel.setWindowsDecorated(false);

        UIManager.put("Synthetica.dialog.icon.enabled", true);
      
        //Application du look SynthLookAndFeel
        //UIManager.setLookAndFeel(new SynthLookAndFeel());
     
        //Application du look MotifLookAndFeel
      //  UIManager.setLookAndFeel(new MotifLookAndFeel());
     
        //Application du look SyntheticaBlackEyeLookAndFeel   
       UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
     
        //Application du look SyntheticaStandardLookAndFeel
   //  UIManager.setLookAndFeel(new SyntheticaStandardLookAndFeel());
    
   
     //Pour ajouter un nouveau look il faut importer le jar correspondant
     //Voici des liens utiles :
     //http://www.jyloo.com/
             initComponents();
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(supp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(supp.class.getName()).log(Level.SEVERE, null, ex);
        }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tab_sup = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tab_sup.setModel(new commentaireController());
        tab_sup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tab_sup);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 105, 636, 126);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/supp.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(250, 350, 70, 50);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/quitter.png"))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(360, 350, 70, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bkg-7.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 670, 440);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-686)/2, (screenSize.height-488)/2, 686, 488);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          int x = tab_sup.getSelectedRow();
			System.out.println(x);	
				int y = Integer.parseInt(tab_sup.getValueAt(x,4) + "");
                                System.out.println(y);
				CommentaireDAO comDAO = new CommentaireDAO();
                                comDAO.delete(y);
                                
                                
        tab_sup.setModel(new commentaireController());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(supp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(supp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(supp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(supp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new supp().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tab_sup;
    // End of variables declaration//GEN-END:variables
}