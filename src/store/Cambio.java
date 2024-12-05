
package store;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;

public class Cambio extends javax.swing.JFrame {
    
    // Instancia de CambioCalculador
    private final CambioCalculador calculador = new CambioCalculador();
    private ProcesadorDePago procesadorDePago;

    public Cambio() {
        initComponents();
        setupFrame();
            btnCerrar.setEnabled(false);    
            String[] monedas = {"Soles", "Dolares"};
            cboMoney.setModel(new javax.swing.DefaultComboBoxModel<>(monedas));
            cboMoney.addActionListener(new ActionListener() {
            String monedaAnterior = "";
            boolean cambioDeMoneda = false;
    @Override
    public void actionPerformed(ActionEvent e) {
        // Obtener la moneda seleccionada
        String moneda = (String) cboMoney.getSelectedItem();
        // Verificar si se cambió de moneda
        if (!moneda.equals(monedaAnterior)) {
            if (moneda.equals("Soles") && monedaAnterior.equals("Dolares") && !etCambio.getText().isEmpty()) {
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro de cambiar de moneda? Se borrará el campo de cambio.", "Advertencia", JOptionPane.YES_NO_OPTION);
                    if (respuesta == JOptionPane.YES_OPTION) {
                        txtCambio.setText(""); // Limpia el campo txtCambio
                        txtCambio.updateUI(); // Actualiza la interfaz gráfica
                        // Agrega esta línea para borrar el campo txtCambio
                        txtCambio.setText("");
                    } else {
                        // Si el usuario no confirma, no cambia la moneda
                        cboMoney.setSelectedItem(monedaAnterior);
                        return; // Salir del método actionPerformed
                    }
                 }
        }
        // Actualizar la moneda anterior
        monedaAnterior = moneda;
        // Realizar el cálculo según la moneda seleccionada
        if (moneda.equals("Soles")) {
            txtCambio.setText(""); // Limpia el campo txtCambio antes de calcular
            calcularCambioEnSoles();
        } else if (moneda.equals("Dolares")) {
            txtCambio.setText(""); // Limpia el campo txtCambio antes de calcular
            calcularCambioEnDolares();
        }
            }
        });
    }
    
    private void setupFrame() {
        this.setLocationRelativeTo(null);
        this.setTitle("Cambio");
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        txtTotal = new javax.swing.JLabel();
        btCalcular = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCambio = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        etCambio = new javax.swing.JTextField();
        cboMoney = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setText("Total a pagar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel5.setText("Recibido");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel6.setText("Cambio");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setBackground(new java.awt.Color(255, 153, 153));
        btnCerrar.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        btnCerrar.setText("CERRAR VENTA");
        btnCerrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 220, 50));

        txtTotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotal.setText("0");
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 230, -1));

        btCalcular.setBackground(new java.awt.Color(255, 153, 153));
        btCalcular.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btCalcular.setText("CALCULAR");
        btCalcular.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(btCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 110, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("S/");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        txtCambio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtCambio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 150, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("S/");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        etCambio.setBackground(new java.awt.Color(102, 204, 255));
        etCambio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etCambio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        etCambio.setBorder(null);
        etCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etCambioActionPerformed(evt);
            }
        });
        jPanel1.add(etCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 90, -1));

        cboMoney.setBackground(new java.awt.Color(255, 153, 153));
        cboMoney.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboMoney.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccionar>", "Soles", "Dolares" }));
        cboMoney.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cboMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMoneyActionPerformed(evt);
            }
        });
        jPanel1.add(cboMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
        if (cboMoney.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(this, "Seleccione una moneda", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (cboMoney.equals("Soles")) {
             // Cálculo en soles
             calcularCambioEnSoles();
         } else if (cboMoney.equals("Dolares")) {
             // Cálculo en dólares
             calcularCambioEnDolares();
         }    
        if (etCambio.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese al menos un valor para calcular la compra", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }  try {
                NumberFormat nf = NumberFormat.getInstance();
                String totalText = txtTotal.getText().replaceAll("[^0-9,\\.]", "");
                String recibidoText = etCambio.getText().replaceAll("[^0-9,\\.]", "");
                Number totalNumber = nf.parse(totalText);
                Number recibidoNumber = nf.parse(recibidoText);

                // Verificar que los campos no estén vacíos
                if (totalNumber == null || recibidoNumber == null) {
                    JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacíos.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                // Convertir número a double
                double total = totalNumber.doubleValue();
                double recibido = recibidoNumber.doubleValue();
                // Calcular cambio
                double cambio = calculador.calcularCambio(total, recibido);
                DecimalFormat df = new DecimalFormat("#.##"); // Formato con un máximo de 2 decimales
                //IF para agregar JPANEL y activar el botón de aceptar Venta
                if (cambio < 0) {
                    JOptionPane.showMessageDialog(this, "Falta " + df.format(Math.abs(cambio)) + " para completar la venta", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    // Desactivar el botón 
                    btnCerrar.setEnabled(false);
                } else {
                    String cambioString = df.format(cambio);
                    txtCambio.setText(cambioString);
                    // Activar el botón 
                     btnCerrar.setEnabled(true);
                }
            } catch (Exception e) {
                System.err.println("Error al calcular el cambio:");
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al calcular el cambio.", "Error", JOptionPane.ERROR_MESSAGE);
              }
    }//GEN-LAST:event_btCalcularActionPerformed

    private void etCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etCambioActionPerformed
        
    }//GEN-LAST:event_etCambioActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        try {
            // Reemplazar coma por punto para asegurar la conversión correcta
            String totalText = txtTotal.getText().replace(",", ".");
            totalText = totalText.replaceAll("[^0-9\\.]", ""); // Eliminar cualquier caracter no numérico o espacio en blanco
            String recibidoText = etCambio.getText().replace(",", ".");
            recibidoText = recibidoText.replaceAll("[^0-9\\.]", ""); // Eliminar cualquier caracter no numérico o espacio en blanco

            // Validar que los valores de texto sean válidos
            if (totalText.isEmpty() || recibidoText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double total = Double.parseDouble(totalText);
            double recibido = Double.parseDouble(recibidoText);
            // Obtener la moneda seleccionada
            String moneda = (String) cboMoney.getSelectedItem();
            // Realizar la comparación con los valores
                if (recibido > 0) {
                    JOptionPane.showMessageDialog(this, "Venta realizada con éxito");
                    new Venta().setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(this, "FALTA DINERO PARA COMPLETAR LA VENTA", "Error", JOptionPane.ERROR_MESSAGE);
                }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Por favor, ingrese valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void cboMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMoneyActionPerformed
       
    }//GEN-LAST:event_cboMoneyActionPerformed
     private boolean isNumeric(String str) {
            try {
             Float.parseFloat(str);
             return true;
         } catch (NumberFormatException e) {
             return false;
         }
    }
        
        private void calcularCambioEnSoles() {
        double total = Double.parseDouble(txtTotal.getText().replace("S/", "").replace(" ", "").replace(",", "."));
        double recibido = Double.parseDouble(etCambio.getText().replace("S/", "").replace(" ", "").replace(",", "."));
         // Calcular el cambio
         double cambio = total - recibido;
         // Verificar si el cambio es negativo
            if (cambio < 0) {
                JOptionPane.showMessageDialog(this, "Falta " + Math.abs(cambio) + " para completar la venta", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                txtCambio.setText("");
            } else {
                // Mostrar el cambio con un máximo de 2 decimales
                DecimalFormat df = new DecimalFormat("#.##");
                txtCambio.setText("S/ " + df.format(cambio));
                }
           }

       private void calcularCambioEnDolares() {
        // Cálculo en soles
        String totalStr = txtTotal.getText().replace(",", ".");
        totalStr = totalStr.replaceAll("[^0-9\\.]", ""); // Eliminar cualquier caracter no numérico o espacio en blanco
        double total = Double.parseDouble(totalStr);
        String recibidoStr = etCambio.getText().replace(",", ".");
        recibidoStr = recibidoStr.replaceAll("[^0-9\\.]", ""); // Eliminar cualquier caracter no numérico o espacio en blanco
        double recibido = Double.parseDouble(recibidoStr);

        // Obtener la moneda seleccionada
        String moneda = (String) cboMoney.getSelectedItem();
        double cambio;
            if (moneda.equals("Dolares")) {
                // Convertir el recibido a soles
                double tasaDeCambio = 3.71;
                double recibidoEnSoles = recibido * tasaDeCambio;
                // Calcular el cambio
                cambio = recibidoEnSoles - total;
            } else {
                // Calcular el cambio en soles
                cambio = recibido - total;
        }

        // Mostrar el cambio en el campo de texto
        DecimalFormat df = new DecimalFormat("#.##");
        txtCambio.setText(df.format(cambio));

        // Verificar si el cambio es negativo
        if (cambio < 0) {
            // Crear un JPanel para mostrar el mensaje
            JPanel panel = new JPanel();
            JOptionPane.showMessageDialog(panel, "Saldo insuficiente, no se podrá realizar la compra.", "Error", JOptionPane.ERROR_MESSAGE);

            // Desactivar el botón btnCerrar
            btnCerrar.setEnabled(false);
        } else {
            // Activar el botón btnCerrar si el saldo es suficiente
            btnCerrar.setEnabled(true);
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cambio().setVisible(true);
            }
        });
    }
    public void Cambio(String totales){
     txtTotal.setText(totales.replace("S/", "S/ "));
 }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcular;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JComboBox<String> cboMoney;
    private javax.swing.JTextField etCambio;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtCambio;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
