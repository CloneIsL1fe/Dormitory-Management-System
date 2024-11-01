/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dormitory_management_system;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextField;
/**
 *
 * @author James Patrick
 */
public class Login_Window extends javax.swing.JFrame {

    /**
     * Creates new form Login_Window
     */
    public Login_Window() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Username_Login = new javax.swing.JTextField();
        Forgot_Password = new javax.swing.JLabel();
        Login_Button = new javax.swing.JButton();
        Register_Button = new javax.swing.JButton();
        Password_Login = new javax.swing.JPasswordField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setBorderPainted(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jButton1)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(563, 222));
        setResizable(false);

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        Username_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Username_LoginActionPerformed(evt);
            }
        });

        Forgot_Password.setText("Forgot Password?");
        Forgot_Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Forgot_PasswordMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Forgot_PasswordMouseReleased(evt);
            }
        });

        Login_Button.setText("Login");
        Login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ButtonActionPerformed(evt);
            }
        });

        Register_Button.setText("Register");
        Register_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Forgot_Password)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(Username_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Password_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Login_Button)
                            .addComponent(Register_Button))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Username_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Forgot_Password)
                .addGap(29, 29, 29)
                .addComponent(Login_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Register_Button)
                .addGap(22, 66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Username_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Username_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Username_LoginActionPerformed

    private void Forgot_PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Forgot_PasswordMouseClicked

    }//GEN-LAST:event_Forgot_PasswordMouseClicked

    private void Register_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Register_ButtonActionPerformed
        //Go to Register
        Registration_Window RegisterPanel = new Registration_Window();
        RegisterPanel.setVisible(true);
        RegisterPanel.pack();
        RegisterPanel.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_Register_ButtonActionPerformed

    private void Login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ButtonActionPerformed
        // Login
        String Username, Password, ConfirmPassword = null;
        int notFound = 0;
        try{
            Statement s = Database_Login.mycon().createStatement();
            if("".equals(Username_Login.getText())){
                JOptionPane.showMessageDialog(new JFrame(),"Username is required", "Error", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(Password_Login.getText())){
                JOptionPane.showMessageDialog(new JFrame(),"Password is required", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                Username     = Username_Login.getText();
                Password     = Password_Login.getText();
                
                
                ResultSet rs = s.executeQuery("SELECT * FROM register WHERE Username= '"+Username+"'");
                while(rs.next()){
                    ConfirmPassword = rs.getString("password");
                    notFound = 1;
                }
                if("admin".equals(Username) && "123".equals(Password)){
                    AdminDashboard_Window AdminPanel = new AdminDashboard_Window();
                    AdminPanel.setVisible(true);
                    AdminPanel.pack();
                    AdminPanel.setLocationRelativeTo(null);
                    this.dispose();
                }else if(notFound == 1 && Password.equals(ConfirmPassword)){
                    Placeholder holder = new Placeholder();
                    holder.setVisible(true);
                    holder.pack();
                    holder.setLocationRelativeTo(null);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(new JFrame(),"Incorrect Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
                }
                s.execute("SELECT * FROM register WHERE Username= '"+Username+"'");
                Password_Login.setText("");
                }
            
        }catch(HeadlessException e){
            System.out.println("Error: " + e.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(Registration_Window.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Login_ButtonActionPerformed

    private void Forgot_PasswordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Forgot_PasswordMouseReleased
        // Go to Reset Confirmation
        Reset_Window ResetPanel = new Reset_Window();
        ResetPanel.setVisible(true);
        ResetPanel.pack();
        ResetPanel.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_Forgot_PasswordMouseReleased

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
            java.util.logging.Logger.getLogger(Login_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Forgot_Password;
    private javax.swing.JButton Login_Button;
    private javax.swing.JPasswordField Password_Login;
    private javax.swing.JButton Register_Button;
    private javax.swing.JTextField Username_Login;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
