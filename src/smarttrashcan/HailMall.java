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
public class HailMall extends javax.swing.JFrame {

    /**
     * Creates new form HailMall
     */
    int per;
    public HailMall() {
        initComponents();
        per = Integer.parseInt(number.getText());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        locButton = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        signout = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        about = new javax.swing.JLabel();
        contactUs = new javax.swing.JLabel();
        mapIcon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        locButton1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        number = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        locButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/go to location.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(390, 844));
        jPanel1.setLayout(null);

        signout.setText("Sign Out");
        signout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signoutMouseClicked(evt);
            }
        });
        jPanel1.add(signout);
        signout.setBounds(160, 10, 49, 30);

        profile.setText("Profile");
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
        });
        jPanel1.add(profile);
        profile.setBounds(220, 10, 41, 30);

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

        mapIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Mask Group 2.jpg"))); // NOI18N
        jPanel1.add(mapIcon);
        mapIcon.setBounds(30, 120, 50, 50);

        jPanel2.setBackground(new java.awt.Color(240, 254, 222));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Hail Mall");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 30, 100, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("2.1 km");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(321, 40, 50, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 210, 390, 0);

        jPanel3.setMaximumSize(new java.awt.Dimension(390, 310));
        jPanel3.setPreferredSize(new java.awt.Dimension(390, 310));
        jPanel3.setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Map.jpg"))); // NOI18N
        jPanel3.add(jLabel6);
        jLabel6.setBounds(0, 0, 390, 310);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 340, 390, 310);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Fill Level:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 660, 70, 30);

        locButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/go to location.jpg"))); // NOI18N
        locButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                locButton1MouseClicked(evt);
            }
        });
        jPanel1.add(locButton1);
        locButton1.setBounds(100, 710, 180, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back-arrow.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 80, 40);

        number.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        number.setText("100");
        jPanel1.add(number);
        number.setBounds(90, 660, 40, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("%");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(130, 670, 41, 16);

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

    private void signoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signoutMouseClicked
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_signoutMouseClicked

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
        this.dispose();
        new ThrowProf().setVisible(true);
    }//GEN-LAST:event_profileMouseClicked

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
        this.dispose();

        About a = new About();
        a.setVisible(true);
    }//GEN-LAST:event_aboutMouseClicked

    private void contactUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactUsMouseClicked
        this.dispose();

        new ContactUs().setVisible(true);
    }//GEN-LAST:event_contactUsMouseClicked

    private void locButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locButton1MouseClicked
       
        if(per>=90){
            this.dispose();
            HailMallLoc hml = new HailMallLoc();
            hml.setVisible(true);
            
        } 
        else{
            new NotFullNotif().setVisible(true);
        }
    }//GEN-LAST:event_locButton1MouseClicked

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
            java.util.logging.Logger.getLogger(HailMall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HailMall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HailMall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HailMall.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HailMall().setVisible(true);
            }
        });
    }
    
    public void setPercent(int percent){
        per = percent;
    }
    
    public int getPercent(){
        
        return per;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel about;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel contactUs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel locButton;
    private javax.swing.JLabel locButton1;
    private javax.swing.JLabel mapIcon;
    private javax.swing.JLabel number;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel signout;
    // End of variables declaration//GEN-END:variables
}
