package store;
import javax.swing.*;

public class Login extends javax.swing.JFrame {

    private final LoginAutaenticacion authenticator = new LoginAutaenticacion();
    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Inicio de sesión");
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JLabel();
        etPassword = new javax.swing.JPasswordField();
        txtSalida = new javax.swing.JLabel();
        Ingresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setText("Ingresa tu contraseña");
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 390, 50));

        etPassword.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        etPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        etPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        etPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(etPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 330, 40));

        txtSalida.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        txtSalida.setForeground(new java.awt.Color(255, 255, 255));
        txtSalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSalida.setToolTipText("");
        getContentPane().add(txtSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 380, 30));

        Ingresar.setBackground(new java.awt.Color(255, 51, 51));
        Ingresar.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        Ingresar.setText("INGRESAR");
        Ingresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });
        getContentPane().add(Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 180, 60));

        jPanel1.setBackground(new java.awt.Color(56, 133, 214));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 770, 70));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/login.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -50, 780, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
         char[] password = etPassword.getPassword();
            if (authenticator.authenticate(password)) {
                new Venta().setVisible(true);
                this.setVisible(false);
            } else {
                txtSalida.setText("Contraseña inválida");
                etPassword.setText(null);
            }
    }//GEN-LAST:event_IngresarActionPerformed

    private void etPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etPasswordActionPerformed
    }//GEN-LAST:event_etPasswordActionPerformed

    public static void main(String args[]) {
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ingresar;
    private javax.swing.JPasswordField etPassword;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtSalida;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
