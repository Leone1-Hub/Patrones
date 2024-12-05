package Jframes;
import javax.swing.*;
import store.LoginAutentication;

public class Login extends javax.swing.JFrame {
    
    // Instancia de LoginAutentication
    private final LoginAutentication authenticator = LoginAutentication.getInstance();
    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("ADMINISTRADOR-SESSION");
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JLabel();
        Ingresar = new javax.swing.JButton();
        etPassword = new javax.swing.JPasswordField();
        txtSalida = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 38)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setText("Ingresa tu contraseña");
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 390, 50));

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
        jPanel1.add(Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 170, 60));

        etPassword.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        etPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        etPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        etPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(etPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 350, 40));

        txtSalida.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        txtSalida.setForeground(new java.awt.Color(255, 51, 51));
        txtSalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSalida.setToolTipText("");
        jPanel1.add(txtSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 380, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Store\\src\\store\\imagenes\\AdminPhoto.png")); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jLabel2.setMaximumSize(new java.awt.Dimension(200, 200));
        jLabel2.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void etPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etPasswordActionPerformed

    }//GEN-LAST:event_etPasswordActionPerformed

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
        char[] password = etPassword.getPassword();
        if (authenticator.authenticate(password)) {
            new Venta().setVisible(true); // Abre la siguiente ventana de Sale = Venta
            this.setVisible(false);
        } else {
            txtSalida.setText("Contraseña inválida");
            etPassword.setText(null);
        }
    }//GEN-LAST:event_IngresarActionPerformed

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtSalida;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
