/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestdeal.esprit.gui;
import bestdeal.esprit.dao.AdministrateurDAO;
import bestdeal.esprit.entities.Administrateur;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author nesrin
 */
public class AuthentifAdmin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public AuthentifAdmin() {
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

        jTextFieldLogin = new javax.swing.JTextField();
        jTextFieldPwd = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Best Deal - Authentification Administrateur");
        setPreferredSize(new java.awt.Dimension(370, 300));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(jTextFieldLogin);
        jTextFieldLogin.setBounds(121, 80, 180, 40);
        getContentPane().add(jTextFieldPwd);
        jTextFieldPwd.setBounds(121, 140, 180, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestdeal/esprit/image/login.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 80, 50, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestdeal/esprit/image/motpasse.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 140, 50, 40);

        jButton1.setText("Se connecter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(130, 220, 130, 25);

        jLabel3.setText("Mot de passe oublié ?");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(230, 270, 140, 16);

        jLabel5.setText("Vous avez un compte ? Connectez-vous");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(61, 30, 250, 16);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestdeal/esprit/image/bkg-7.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 380, 300);

        jMenu1.setText("Fichier");

        jMenuItem1.setText("Quitter");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Aide");

        jMenuItem2.setText("A propos de BestDeal");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-386)/2, (screenSize.height-338)/2, 386, 338);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   AdministrateurDAO admin = new AdministrateurDAO(); 
        
       for (int i = 0; i < admin.DisplayAllAdmins().size(); i++)
       { 
           if(admin.DisplayAllAdmins().get(i).getLogin_admin().equals(jTextFieldLogin.getText()) && admin.DisplayAllAdmins().get(i).getPwd_admin().equals(jTextFieldPwd.getText())) { 
               System.out.print("dzdzd");
              MenuAdmin m=new MenuAdmin();
               this.setVisible(false);
              m.setVisible(true);
        } 
           else
           { 
               
           System.out.print("aaaa");
           JOptionPane.showMessageDialog(this, "Login ou Mot de passe invalide !!!!");
           jTextFieldLogin.setText("");
           jTextFieldPwd.setText("");
           }
 }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       AuthentifAdmin.this.setVisible(false);
        
        Accueil a =new Accueil();
        a.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       Apropos ap=new Apropos();
        ap.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setVisible(false);
        RecuperationMP rec =new RecuperationMP();
                rec.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(AuthentifAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuthentifAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuthentifAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuthentifAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AuthentifAdmin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldPwd;
    // End of variables declaration//GEN-END:variables
}