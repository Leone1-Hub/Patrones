
package Jframes;
import javax.swing.*;
import store.ComboProducto;
import store.InventarioMemoryFacade;
import store.InventarioProxy;
import store.Producto;

public class ComboCocina extends javax.swing.JFrame {
    private ComboProducto combo;

    public ComboCocina() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("COMBO COCINA");
        this.setResizable(false);
        
        // Crear el combo con los productos
        combo = new ComboProducto("Combo Cocina");
        combo.agregarProducto(new Producto("Aceite vegetal", 8.70));
        combo.agregarProducto(new Producto("Leche de vaca", 6.00));
        combo.agregarProducto(new Producto("Atún en lata", 5.50));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btCerrarSesion = new javax.swing.JButton();
        btPagar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        MiTiendita = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        precio1 = new javax.swing.JLabel();
        tAceiteVegetal = new javax.swing.JLabel();
        ivProducto1 = new javax.swing.JLabel();
        ivProducto2 = new javax.swing.JLabel();
        ivProducto3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        precio2 = new javax.swing.JLabel();
        tLeche = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        tAtun = new javax.swing.JLabel();
        precio3 = new javax.swing.JLabel();
        etCantidad2 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        etCantidad3 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        etCantidad1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(56, 133, 213));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btCerrarSesion.setBackground(new java.awt.Color(255, 153, 153));
        btCerrarSesion.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btCerrarSesion.setText("Regresar");
        btCerrarSesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarSesionActionPerformed(evt);
            }
        });
        jPanel3.add(btCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 170, 51));

        btPagar.setBackground(new java.awt.Color(255, 255, 0));
        btPagar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btPagar.setText("Proceder al pago");
        btPagar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPagarActionPerformed(evt);
            }
        });
        jPanel3.add(btPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 180, 51));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));

        MiTiendita.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        MiTiendita.setText(" MI TIENDA VIRTUAL /PACK COCINA");
        jPanel1.add(MiTiendita);

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 760, 50));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 5, -1, -1));

        precio1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        precio1.setForeground(new java.awt.Color(255, 255, 0));
        precio1.setText("S/8.70");
        jPanel2.add(precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        tAceiteVegetal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tAceiteVegetal.setForeground(new java.awt.Color(255, 255, 255));
        tAceiteVegetal.setText("Aceite vegetal");
        jPanel2.add(tAceiteVegetal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 170, 60));

        ivProducto1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Store\\src\\store\\imagenes\\aceite.jpg")); // NOI18N
        ivProducto1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel3.add(ivProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 170, 170));

        ivProducto2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Store\\src\\store\\imagenes\\leche.jpg")); // NOI18N
        ivProducto2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel3.add(ivProducto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 170, 170));

        ivProducto3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Store\\src\\store\\imagenes\\pescado.jpg")); // NOI18N
        ivProducto3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel3.add(ivProducto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 170, 170));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        precio2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        precio2.setForeground(new java.awt.Color(255, 255, 0));
        precio2.setText("S/6.00");
        jPanel5.add(precio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        tLeche.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tLeche.setForeground(new java.awt.Color(255, 255, 255));
        tLeche.setText("Leche de vaca");
        jPanel5.add(tLeche, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 170, 60));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tAtun.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tAtun.setForeground(new java.awt.Color(255, 255, 255));
        tAtun.setText("Atún en lata");
        jPanel6.add(tAtun, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        precio3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        precio3.setForeground(new java.awt.Color(255, 255, 0));
        precio3.setText("S/3.50");
        jPanel6.add(precio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 170, 60));

        etCantidad2.setEditable(false);
        etCantidad2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etCantidad2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        etCantidad2.setText("1");
        jPanel3.add(etCantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 50, 30));

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 190, 300));

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etCantidad3.setEditable(false);
        etCantidad3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etCantidad3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        etCantidad3.setText("1");
        jPanel10.add(etCantidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 50, 30));

        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 190, 300));

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etCantidad1.setEditable(false);
        etCantidad1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etCantidad1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        etCantidad1.setText("1");
        etCantidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etCantidad1ActionPerformed(evt);
            }
        });
        jPanel12.add(etCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 50, 30));

        jPanel3.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 190, 300));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPagarActionPerformed
        try {
        // Obtener las cantidades de los productos
        String cantidad1 = etCantidad1.getText();
        String cantidad2 = etCantidad2.getText();
        String cantidad3 = etCantidad3.getText();

        // Validar que las cantidades no estén vacías
        if (cantidad1.isEmpty() || cantidad2.isEmpty() || cantidad3.isEmpty()) {
            // Si hay campos vacíos, puedes optar por mostrar un mensaje en el campo de texto o en un JLabel
            // Aquí no se muestra un JOptionPane
            return; // Salir del método si hay campos vacíos
        }

        // Validar que las cantidades sean numéricas
        if (!cantidad1.matches("\\d+") || !cantidad2.matches("\\d+") || !cantidad3.matches("\\d+")) {
            // Aquí tampoco se muestra un JOptionPane
            return; // Salir si las cantidades no son válidas
        }

        int c1 = Integer.parseInt(cantidad1);
        int c2 = Integer.parseInt(cantidad2);
        int c3 = Integer.parseInt(cantidad3);

        // Actualizar las cantidades de los productos en el combo
        combo.actualizarCantidad(0, c1);
        combo.actualizarCantidad(1, c2);
        combo.actualizarCantidad(2, c3);

        // Calcular el precio total del combo
        double precioTotal = combo.getPrecio();

        // Aplicar IGV
        double descuento = 0.21; // Asegúrate de que este valor sea correcto para tu lógica
        double precioConIGV = precioTotal + descuento;

        // Asegurarse de que el precio no sea menor que cero
        if (precioConIGV < 0) {
            precioConIGV = 0;
        }

        // Procesar el pago
        this.setVisible(false);
        InventarioMemoryFacade inventarioReal = new InventarioMemoryFacade();
        InventarioProxy proxy = new InventarioProxy(inventarioReal, "administrador"); // o "empleado"

        VentaDetalles ventana3 = new VentaDetalles(proxy, true); // Pasar true para deshabilitar el botón
        ventana3.setVisible(true);
        
        // Actualizar el total a pagar en la ventana de detalles
        ventana3.actualizarTotalPagar("S/" + precioConIGV);

        ventana3.cantidades(cantidad1, cantidad2, cantidad3, "0"); // Pasar "0" para cantidad4
        } catch (NumberFormatException e) {
            // Manejo de errores, pero sin mostrar JOptionPane
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btPagarActionPerformed
    
    private void etCantidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etCantidad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etCantidad1ActionPerformed

    
    private void btCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarSesionActionPerformed
        new Venta().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btCerrarSesionActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComboCocina().setVisible(true);
            }
        });
    }
    private int suma(int cantidad){
        cantidad = cantidad +1;        
        return cantidad;
    }
    private int resta(int cantidad){
        if(cantidad>0){
            cantidad = cantidad -1;
        }
        return cantidad;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MiTiendita;
    private javax.swing.JButton btCerrarSesion;
    private javax.swing.JButton btPagar;
    private javax.swing.JTextField etCantidad1;
    private javax.swing.JTextField etCantidad2;
    private javax.swing.JTextField etCantidad3;
    private javax.swing.JLabel ivProducto1;
    private javax.swing.JLabel ivProducto2;
    private javax.swing.JLabel ivProducto3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel precio1;
    private javax.swing.JLabel precio2;
    private javax.swing.JLabel precio3;
    private javax.swing.JLabel tAceiteVegetal;
    private javax.swing.JLabel tAtun;
    private javax.swing.JLabel tLeche;
    // End of variables declaration//GEN-END:variables
}
