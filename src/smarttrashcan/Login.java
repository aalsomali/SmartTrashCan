/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttrashcan;

/**
 *
 * @author milo
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public int per = 50;
    public Login() {
        initComponents();
        errormsg.setVisible(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        errormsg = new javax.swing.JLabel();
        loginButton = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        UserPic = new javax.swing.JLabel();
        about = new javax.swing.JLabel();
        contactUs = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(390, 844));
        jPanel1.setLayout(null);

        jLabel1.setText("User Name:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 380, 70, 16);

        jLabel2.setText("Password:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 430, 70, 16);

        errormsg.setForeground(new java.awt.Color(255, 0, 0));
        errormsg.setText("Incorrect User Name or Password");
        jPanel1.add(errormsg);
        errormsg.setBounds(110, 470, 200, 16);

        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login Button.jpg"))); // NOI18N
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        jPanel1.add(loginButton);
        loginButton.setBounds(130, 510, 140, 60);
        jPanel1.add(userName);
        userName.setBounds(120, 380, 160, 22);

        password.setText("jPasswordField1");
        jPanel1.add(password);
        password.setBounds(120, 430, 160, 22);

        UserPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Mask Group 7.jpg"))); // NOI18N
        jPanel1.add(UserPic);
        UserPic.setBounds(120, 180, 150, 150);

        about.setText("About");
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMouseClicked(evt);
            }
        });
        jPanel1.add(about);
        about.setBounds(270, 10, 41, 30);

        contactUs.setText("Contact Us");
        contactUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactUsMouseClicked(evt);
            }
        });
        jPanel1.add(contactUs);
        contactUs.setBounds(320, 10, 70, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back-arrow.jpg"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 10, 80, 40);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 1.jpg"))); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(0, 0, 390, 844);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
       this.dispose();
        
        About a = new About();
        a.setVisible(true);
    }//GEN-LAST:event_aboutMouseClicked

    private void contactUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactUsMouseClicked
        this.dispose();
        
        new ContactUs().setVisible(true);
    }//GEN-LAST:event_contactUsMouseClicked

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
       if(userName.getText().equalsIgnoreCase("throw") && password.getText().equalsIgnoreCase("123")){
           this.dispose();
           new ThrowMain().setVisible(true);
           
           ThrowProf tp = new ThrowProf();
           tp.setUserName("throw");
           tp.setPassword("123");
       }else if(userName.getText().equalsIgnoreCase("collect") && password.getText().equalsIgnoreCase("123")){
           this.dispose();
           new CollectMain().setVisible(true);
           
           CollectProf cp = new CollectProf();
           cp.setUserName("collect");
           cp.setPassword("123");
       }else{
           errormsg.setVisible(true);
       }
    }//GEN-LAST:event_loginButtonMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
       new MainPage().setVisible(true);
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UserPic;
    private javax.swing.JLabel about;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel contactUs;
    private javax.swing.JLabel errormsg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loginButton;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
