
package store;
import java.text.DecimalFormat;
import store.CaracteristicaArticulo;
import store.Descuentos;
import store.Articulos;

public class VentaDetalles extends javax.swing.JFrame {
    
    private static final double PORCENTAJE_DESCUENTO = 10.0;
    
    private Articulos articulo1;
    private Articulos articulo2;
    private Articulos articulo3;
    private Articulos articulo4;
    
    private double calcularTotalConDescuento(Articulos articulo, int cantidad, double porcentajeDescuento) {
        double precioUnitarioConIVA = articulo.getPrecio() * 1.18; // Aplicar IGV
        double total = precioUnitarioConIVA * cantidad;
        if (cantidad > 0) {
            double descuento = total * (porcentajeDescuento / 100);
            total -= descuento; // Aplica el descuento total al artículo
        }
        return total;
    }
   
    public VentaDetalles(){
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Detalles de Venta");
        this.setResizable(false);
        
        //Inicializar los artículos con sus precios
           articulo1 = new Articulos("Aceite vegetal", 8.70);
           articulo2 = new Articulos("Leche de vaca", 6.00);
           articulo3 = new Articulos("Atún en lata", 5.60);
           articulo4 = new Articulos("Refresco en lata", 5.20);
            
        // Aplicar descuentos
            CaracteristicaArticulo descuento6 = new Descuentos(50);
            articulo2.setCaracteristica(descuento6);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtArticulo1 = new javax.swing.JLabel();
        txtArticulo2 = new javax.swing.JLabel();
        txtArticulo3 = new javax.swing.JLabel();
        txtArticulo4 = new javax.swing.JLabel();
        txtCantidad1 = new javax.swing.JLabel();
        txtCantidad2 = new javax.swing.JLabel();
        txtCantidad3 = new javax.swing.JLabel();
        txtCantidad4 = new javax.swing.JLabel();
        txtPrecioSinIVA1 = new javax.swing.JLabel();
        txtPrecioSinIVA2 = new javax.swing.JLabel();
        txtPrecioSinIVA3 = new javax.swing.JLabel();
        txtPrecioSinIVA4 = new javax.swing.JLabel();
        txtPrecio1 = new javax.swing.JLabel();
        txtPrecio2 = new javax.swing.JLabel();
        txtPrecio3 = new javax.swing.JLabel();
        txtDescuento1 = new javax.swing.JLabel();
        txtDescuento2 = new javax.swing.JLabel();
        txtDescuento3 = new javax.swing.JLabel();
        txtDescuento4 = new javax.swing.JLabel();
        txtPagar1 = new javax.swing.JLabel();
        txtPagar2 = new javax.swing.JLabel();
        txtPagar3 = new javax.swing.JLabel();
        txtPagar4 = new javax.swing.JLabel();
        btRegresar = new javax.swing.JButton();
        btPagar = new javax.swing.JButton();
        txtTotalPagar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtPrecio4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 3, 34)); // NOI18N
        jLabel1.setText("Detalles de Venta");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 320, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Artículo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Cantidad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Precio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Precio + IGV");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Descuento");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total a pagar");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, -1, -1));

        txtArticulo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtArticulo1.setText("Aceite vegetal");
        getContentPane().add(txtArticulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 130, -1));

        txtArticulo2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtArticulo2.setText("Leche de vaca");
        getContentPane().add(txtArticulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 130, -1));

        txtArticulo3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtArticulo3.setText("Atún en lata");
        getContentPane().add(txtArticulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 130, -1));

        txtArticulo4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtArticulo4.setText("Refresco en lata");
        getContentPane().add(txtArticulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 130, -1));

        txtCantidad1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtCantidad1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCantidad1.setText("0");
        getContentPane().add(txtCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 50, -1));

        txtCantidad2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtCantidad2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCantidad2.setText("0");
        getContentPane().add(txtCantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 50, -1));

        txtCantidad3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtCantidad3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCantidad3.setText("0");
        getContentPane().add(txtCantidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 50, -1));

        txtCantidad4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtCantidad4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCantidad4.setText("0");
        getContentPane().add(txtCantidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 50, -1));

        txtPrecioSinIVA1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecioSinIVA1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecioSinIVA1.setText("S/0");
        getContentPane().add(txtPrecioSinIVA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 60, -1));

        txtPrecioSinIVA2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecioSinIVA2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecioSinIVA2.setText("S/0");
        getContentPane().add(txtPrecioSinIVA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 60, -1));

        txtPrecioSinIVA3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecioSinIVA3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecioSinIVA3.setText("S/0");
        getContentPane().add(txtPrecioSinIVA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 60, -1));

        txtPrecioSinIVA4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecioSinIVA4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecioSinIVA4.setText("S/0");
        getContentPane().add(txtPrecioSinIVA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 60, -1));

        txtPrecio1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecio1.setText("S/0");
        getContentPane().add(txtPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 90, -1));

        txtPrecio2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecio2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecio2.setText("S/0");
        getContentPane().add(txtPrecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 90, -1));

        txtPrecio3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecio3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecio3.setText("S/0");
        getContentPane().add(txtPrecio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 90, -1));

        txtDescuento1.setBackground(new java.awt.Color(255, 255, 255));
        txtDescuento1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDescuento1.setForeground(new java.awt.Color(255, 255, 255));
        txtDescuento1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDescuento1.setText("S/0");
        getContentPane().add(txtDescuento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 90, -1));

        txtDescuento2.setBackground(new java.awt.Color(255, 255, 255));
        txtDescuento2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDescuento2.setForeground(new java.awt.Color(255, 255, 255));
        txtDescuento2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDescuento2.setText("S/0");
        getContentPane().add(txtDescuento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 90, -1));

        txtDescuento3.setBackground(new java.awt.Color(255, 255, 255));
        txtDescuento3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDescuento3.setForeground(new java.awt.Color(255, 255, 255));
        txtDescuento3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDescuento3.setText("S/0");
        getContentPane().add(txtDescuento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 90, -1));

        txtDescuento4.setBackground(new java.awt.Color(255, 255, 255));
        txtDescuento4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDescuento4.setForeground(new java.awt.Color(255, 255, 255));
        txtDescuento4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDescuento4.setText("S/0");
        getContentPane().add(txtDescuento4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 90, -1));

        txtPagar1.setBackground(new java.awt.Color(255, 255, 255));
        txtPagar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPagar1.setForeground(new java.awt.Color(255, 255, 255));
        txtPagar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPagar1.setText("S/0");
        getContentPane().add(txtPagar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 80, -1));

        txtPagar2.setBackground(new java.awt.Color(255, 255, 255));
        txtPagar2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPagar2.setForeground(new java.awt.Color(255, 255, 255));
        txtPagar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPagar2.setText("S/0");
        getContentPane().add(txtPagar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 80, -1));

        txtPagar3.setBackground(new java.awt.Color(255, 255, 255));
        txtPagar3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPagar3.setForeground(new java.awt.Color(255, 255, 255));
        txtPagar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPagar3.setText("S/0");
        getContentPane().add(txtPagar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 80, -1));

        txtPagar4.setBackground(new java.awt.Color(255, 255, 255));
        txtPagar4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPagar4.setForeground(new java.awt.Color(255, 255, 255));
        txtPagar4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPagar4.setText("S/0");
        getContentPane().add(txtPagar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 80, -1));

        btRegresar.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btRegresar.setText("Regresar");
        btRegresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 130, 40));

        btPagar.setBackground(new java.awt.Color(255, 255, 0));
        btPagar.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btPagar.setText("Pagar");
        btPagar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPagarActionPerformed(evt);
            }
        });
        getContentPane().add(btPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 140, 40));

        txtTotalPagar.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        txtTotalPagar.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalPagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalPagar.setText("S/0");
        getContentPane().add(txtTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 140, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPrecio4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecio4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecio4.setText("S/0");
        jPanel1.add(txtPrecio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 90, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 440, 370));

        jPanel2.setBackground(new java.awt.Color(56, 133, 214));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 20));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/store/imagenes/ventanaPago.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 800, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPagarActionPerformed
        // TODO add your handling code here:
        Cambio ventana4 = new Cambio();
        this.setVisible(false);
        ventana4.setVisible(true);
        String totales = txtTotalPagar.getText();
        ventana4.Cambio(totales);
        ventana4.setVisible(true); 
    }//GEN-LAST:event_btPagarActionPerformed

    private void btRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegresarActionPerformed
        // TODO add your handling code here:
        Venta ventana2 = new Venta();
        this.setVisible(false);
        ventana2.setVisible(true);
    }//GEN-LAST:event_btRegresarActionPerformed

    public void setTotalPagar(String total) {
        txtTotalPagar.setText(total);
    }
    
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
            java.util.logging.Logger.getLogger(VentaDetalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentaDetalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentaDetalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentaDetalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentaDetalles().setVisible(true);
            }
        });
    }

    public void cantidades(String cantidad1, String cantidad2, String cantidad3, String cantidad4) {
     DecimalFormat df = new DecimalFormat("#.##");

     // Asignar cantidades
     int cant1 = Integer.parseInt(cantidad1);
     int cant2 = Integer.parseInt(cantidad2);
     int cant3 = Integer.parseInt(cantidad3);
     int cant4 = Integer.parseInt(cantidad4);

     txtCantidad1.setText(cantidad1);
     txtCantidad2.setText(cantidad2);
     txtCantidad3.setText(cantidad3);
     txtCantidad4.setText(cantidad4);

     // Precios sin IGV
     double precio1SinIGV = articulo1.getPrecio();
     double precio2SinIGV = articulo2.getPrecio();
     double precio3SinIGV = articulo3.getPrecio();
     double precio4SinIGV = articulo4.getPrecio();

     txtPrecioSinIVA1.setText("S/" + df.format(precio1SinIGV));
     txtPrecioSinIVA2.setText("S/" + df.format(precio2SinIGV));
     txtPrecioSinIVA3.setText("S/" + df.format(precio3SinIGV));
     txtPrecioSinIVA4.setText("S/" + df.format(precio4SinIGV));

     // Precios con IGV
    double precioConIGV1 = precio1SinIGV * 1.18;
    double precioConIGV2 = precio2SinIGV * 1.18;
    double precioConIGV3 = precio3SinIGV * 1.18;
    double precioConIGV4 = precio4SinIGV * 1.18;

    txtPrecio1.setText("S/" + df.format(precioConIGV1));
    txtPrecio2.setText("S/" + df.format(precioConIGV2 * cant2)); // Actualizado para mostrar el precio con IGV multiplicado por la cantidad
    txtPrecio3.setText("S/" + df.format(precioConIGV3));
    txtPrecio4.setText("S/" + df.format(precioConIGV4));

     // Calcular los precios a pagar para cada artículo
     double pagar1 = cant1 * precioConIGV1;
     double pagar3 = cant3 * precioConIGV3;
     double pagar4 = cant4 * precioConIGV4;

     txtPagar1.setText("S/" + df.format(pagar1));
     txtPagar3.setText("S/" + df.format(pagar3));
     txtPagar4.setText("S/" + df.format(pagar4));

     // Aplicar descuento solo en el segundo artículo si está seleccionado
     if (cant2 > 0) {
         double descuento2 = 0;
         if (articulo2.getCaracteristica() instanceof Descuentos) {
             Descuentos descuento = (Descuentos) articulo2.getCaracteristica();
             double totalArticulo2 = precioConIGV2 * cant2;
             descuento2 = totalArticulo2 * (descuento.getPorcentajeDescuento() / 100);
             double precioConDescuento2 = totalArticulo2 - descuento2;

             txtDescuento2.setText("S/" + df.format(descuento2));
             txtPagar2.setText("S/" + df.format(precioConDescuento2));
         } else {
             txtDescuento2.setText("S/0");
             txtPagar2.setText("S/" + df.format(precioConIGV2 * cant2));
         }
     } else {
         txtDescuento2.setText("S/0");
         txtPagar2.setText("S/0");
     }

     // Mostrar descuentos como S/0 si no hay
     txtDescuento1.setText("S/0");
     txtDescuento3.setText("S/0");
     txtDescuento4.setText("S/0");

     // Calcular los totales
     double total1 = cant1 * precioConIGV1;
     double total2 = cant2 > 0 ? calcularTotalConDescuento(articulo2, cant2, ((Descuentos) articulo2.getCaracteristica()).getPorcentajeDescuento()) : 0;
     double total3 = cant3 * precioConIGV3;
     double total4 = cant4 * precioConIGV4;

     // Calcular el total a pagar con descuento aplicado
     double totalPagarConDescuento = total1 + total2 + total3 + total4;

     // Mostrar total a pagar
     txtTotalPagar.setText("S/ " + df.format(totalPagarConDescuento));
 }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPagar;
    private javax.swing.JButton btRegresar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtArticulo1;
    private javax.swing.JLabel txtArticulo2;
    private javax.swing.JLabel txtArticulo3;
    private javax.swing.JLabel txtArticulo4;
    private javax.swing.JLabel txtCantidad1;
    private javax.swing.JLabel txtCantidad2;
    private javax.swing.JLabel txtCantidad3;
    private javax.swing.JLabel txtCantidad4;
    private javax.swing.JLabel txtDescuento1;
    private javax.swing.JLabel txtDescuento2;
    private javax.swing.JLabel txtDescuento3;
    private javax.swing.JLabel txtDescuento4;
    private javax.swing.JLabel txtPagar1;
    private javax.swing.JLabel txtPagar2;
    private javax.swing.JLabel txtPagar3;
    private javax.swing.JLabel txtPagar4;
    private javax.swing.JLabel txtPrecio1;
    private javax.swing.JLabel txtPrecio2;
    private javax.swing.JLabel txtPrecio3;
    private javax.swing.JLabel txtPrecio4;
    private javax.swing.JLabel txtPrecioSinIVA1;
    private javax.swing.JLabel txtPrecioSinIVA2;
    private javax.swing.JLabel txtPrecioSinIVA3;
    private javax.swing.JLabel txtPrecioSinIVA4;
    private javax.swing.JLabel txtTotalPagar;
    // End of variables declaration//GEN-END:variables
}
