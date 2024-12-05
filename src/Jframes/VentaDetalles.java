
package Jframes;
import Interfaces.ArticlesPrototype;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import store.Articulos;
import store.ArticulosConCantidad;
import Interfaces.CaracteristicaArticulo;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import store.DescuentosMFactory;
import store.InventarioMemory;
import store.UsuarioReal;
import store.ProductosD;

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
   
    public VentaDetalles(UsuarioReal usuarioReal,  boolean disableInventario){
         initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Detalles de Venta");
        this.setResizable(false);

        // Inicializar los artículos con sus precios y características
        articulo1 = new Articulos("Aceite vegetal", 8.70);
        articulo2 = new Articulos("Leche de vaca", 6.00);
        articulo3 = new Articulos("Atún en lata", 5.60);
        articulo4 = new Articulos("Refresco en lata", 5.20);

        // Aplicar descuentos
        articulo1.setCaracteristica(new DescuentosMFactory(0)); // Sin descuento
        articulo2.setCaracteristica(new DescuentosMFactory(50)); // Descuento del 50%
        articulo3.setCaracteristica(new DescuentosMFactory(0)); // Sin descuento
        articulo4.setCaracteristica(new DescuentosMFactory(0)); // Sin descuento

        // Agregar evento de selección al combo box cbo_Pedido
        cbo_Pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_PedidoActionPerformed(evt);
            }
        });

        // Configurar la visibilidad de los botones según el tipo de usuario
        if (disableInventario) {
            // Si es empleado, deshabilitar los botones
            btnInventario.setEnabled(false);
            btnClonar.setEnabled(false);
            btnPrecio.setEnabled(false);
        } else {
            // Si es admin, habilitar los botones
            btnInventario.setEnabled(true);
            btnClonar.setEnabled(true);
            btnPrecio.setEnabled(true);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtArticulo1 = new javax.swing.JLabel();
        txtArticulo2 = new javax.swing.JLabel();
        txtArticulo3 = new javax.swing.JLabel();
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
        txtPagar1 = new javax.swing.JLabel();
        txtPagar2 = new javax.swing.JLabel();
        txtPagar3 = new javax.swing.JLabel();
        txtPagar4 = new javax.swing.JLabel();
        btRegresar = new javax.swing.JButton();
        btPagar = new javax.swing.JButton();
        txtTotalPagar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtPrecio4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbo_Pedido = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        txtArticulo6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnClonar = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnPrecio = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtArticulo5 = new javax.swing.JLabel();
        txtArticulo4 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 3, 34)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Detalles de Venta");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 320, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Cantidad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Precio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Precio + IGV");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total a pagar");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        txtArticulo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtArticulo1.setText("Aceite vegetal");
        getContentPane().add(txtArticulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 130, -1));

        txtArticulo2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtArticulo2.setText("Leche de vaca");
        getContentPane().add(txtArticulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 130, -1));

        txtArticulo3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtArticulo3.setText("Atún en lata");
        getContentPane().add(txtArticulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 130, -1));

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

        txtPagar1.setBackground(new java.awt.Color(255, 255, 255));
        txtPagar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPagar1.setForeground(new java.awt.Color(255, 255, 255));
        txtPagar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPagar1.setText("S/0");
        getContentPane().add(txtPagar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 80, -1));

        txtPagar2.setBackground(new java.awt.Color(255, 255, 255));
        txtPagar2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPagar2.setForeground(new java.awt.Color(255, 255, 255));
        txtPagar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPagar2.setText("S/0");
        getContentPane().add(txtPagar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 80, -1));

        txtPagar3.setBackground(new java.awt.Color(255, 255, 255));
        txtPagar3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPagar3.setForeground(new java.awt.Color(255, 255, 255));
        txtPagar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPagar3.setText("S/0");
        getContentPane().add(txtPagar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 80, -1));

        txtPagar4.setBackground(new java.awt.Color(255, 255, 255));
        txtPagar4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPagar4.setForeground(new java.awt.Color(255, 255, 255));
        txtPagar4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPagar4.setText("S/0");
        getContentPane().add(txtPagar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 80, -1));

        btRegresar.setBackground(new java.awt.Color(255, 153, 153));
        btRegresar.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btRegresar.setText("Regresar");
        btRegresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 140, 40));

        btPagar.setBackground(new java.awt.Color(255, 255, 0));
        btPagar.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btPagar.setText("Pagar");
        btPagar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPagarActionPerformed(evt);
            }
        });
        getContentPane().add(btPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 140, 40));

        txtTotalPagar.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        txtTotalPagar.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalPagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalPagar.setText("S/0");
        getContentPane().add(txtTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 140, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPrecio4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrecio4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecio4.setText("S/0");
        jPanel1.add(txtPrecio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 90, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Artículo");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Tiempo de Envío: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        cbo_Pedido.setBackground(new java.awt.Color(153, 255, 204));
        cbo_Pedido.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cbo_Pedido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Urgente" }));
        cbo_Pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_PedidoActionPerformed(evt);
            }
        });
        jPanel1.add(cbo_Pedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 120, 50));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -40, 780, -1));
        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -40, -1, -1));

        txtArticulo6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtArticulo6.setText("Refresco en lata");
        jPanel1.add(txtArticulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 460, 350));

        jPanel2.setBackground(new java.awt.Color(56, 133, 214));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Artículo");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Artículo");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        btnClonar.setBackground(new java.awt.Color(255, 255, 102));
        btnClonar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnClonar.setText("Clonar");
        btnClonar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClonarActionPerformed(evt);
            }
        });
        getContentPane().add(btnClonar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 90, 30));

        btnInventario.setBackground(new java.awt.Color(255, 255, 102));
        btnInventario.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnInventario.setText("Inventario");
        btnInventario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 140, 40));

        btnPrecio.setBackground(new java.awt.Color(51, 255, 204));
        btnPrecio.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnPrecio.setText("Precio");
        btnPrecio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrecioActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 130, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 790, 60));

        txtArticulo5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtArticulo5.setText("Refresco en lata");
        getContentPane().add(txtArticulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 130, -1));

        txtArticulo4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtArticulo4.setForeground(new java.awt.Color(255, 255, 255));
        txtArticulo4.setText("SOLES");
        getContentPane().add(txtArticulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 130, -1));

        fondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Store\\src\\store\\imagenes\\ventanaPago.png")); // NOI18N
        fondo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void actualizarTotalPagar(String total) {
    txtTotalPagar.setText(total);
}
    
    private void btPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPagarActionPerformed
        // TODO add your handling code here:
        Cambio ventana4 = new Cambio((String) cbo_Pedido.getSelectedItem());
        this.setVisible(false);
        ventana4.setVisible(true);
        String totales = txtTotalPagar.getText();
        ventana4.Cambio(totales);
        ventana4.setVisible(true); 
    }//GEN-LAST:event_btPagarActionPerformed
    
    private void btRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegresarActionPerformed
        Venta ventana2 = new Venta();
        this.setVisible(false);
        ventana2.setVisible(true);
    }//GEN-LAST:event_btRegresarActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
         // Crear instancias de productos
        ProductosD productoAceite = new ProductosD("Aceite vegetal", 8.70, 10.0, 10);
        ProductosD productoLeche = new ProductosD("Leche de vaca", 6.00, 50.0, 20);
        ProductosD productoAtun = new ProductosD("Atún en lata", 5.60, 0.0, 15);
        ProductosD productoRefresco = new ProductosD("Refresco en lata", 5.20, 0.0, 30);

        // Crear un diálogo para mostrar el inventario
        JDialog dialogoInventario = new JDialog(this, "Inventario", true); 
        dialogoInventario.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        // Definir los nombres de las columnas
        String[] columnNames = {"Producto", "Cantidad", "Estado"};

        // Crear un modelo de datos para la tabla
        Object[][] data = {
            {productoAceite.getNombre(), productoAceite.getCantidad(), productoAceite.getEstadoDisponibilidad()},
            {productoLeche.getNombre(), productoLeche.getCantidad(), productoLeche.getEstadoDisponibilidad()},
            {productoAtun.getNombre(), productoAtun.getCantidad(), productoAtun.getEstadoDisponibilidad()},
            {productoRefresco.getNombre(), productoRefresco.getCantidad(), productoRefresco.getEstadoDisponibilidad()}
        };

        // Crear la tabla
        JTable tablaInventario = new JTable(data, columnNames);
        tablaInventario.setFillsViewportHeight(true);

        // Crear un JScrollPane para la tabla
        JScrollPane scrollPane = new JScrollPane(tablaInventario);

        // Agregar el JScrollPane al diálogo
        dialogoInventario.add(scrollPane, BorderLayout.CENTER);

        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialogoInventario.dispose();
            }
        });

        dialogoInventario.add(btnCerrar, BorderLayout.SOUTH);
        dialogoInventario.setSize(400, 300);
        dialogoInventario.setLocationRelativeTo(this);
        dialogoInventario.setVisible(true);
    }//GEN-LAST:event_btnInventarioActionPerformed
    
    private void agregarProductoALaPanel(JPanel panel, ProductosD producto) {
     panel.add(new JLabel(producto.getNombre())); 
     panel.add(new JLabel(String.valueOf(producto.getCantidad())));
     panel.add(new JLabel(producto.getEstadoDisponibilidad())); // Muestra el estado actual
    }
    
    
    private void cbo_PedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_PedidoActionPerformed
        String tipoEnvio = (String) cbo_Pedido.getSelectedItem();
        double total = 0;

        // Calcular el total según el tipo de envío
        if ("Urgente".equals(tipoEnvio)) {
            total = calcularTotalConEnvioUrgente();
        } else {
            total = calcularTotalConEnvioNormal();
        }

        // Actualizar la etiqueta con el total
        txtTotalPagar.setText("S/" + String.format("%.2f", total));
    }//GEN-LAST:event_cbo_PedidoActionPerformed

    private void btnClonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClonarActionPerformed
        ArticlesPrototype prototype = new Articulos("Leche de vaca", 6.00); 
        CommandFrame commandFrame = new CommandFrame(prototype);
        commandFrame.setVisible(true);
    }//GEN-LAST:event_btnClonarActionPerformed

    private void btnPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrecioActionPerformed
    ArticulosFrame articuloFrame = new ArticulosFrame();
    articuloFrame.setVisible(true);
    }//GEN-LAST:event_btnPrecioActionPerformed

 private JPanel diseñarPanelInventario(Map<String, Articulos> inventario) {
    JPanel panelInventario = new JPanel();
    panelInventario.setLayout(new BorderLayout());

    // Crear un panel para mostrar los títulos
    JPanel panelTitulos = new JPanel();
    panelTitulos.setLayout(new GridLayout(1, 3)); // 3 columns

    // Agregar títulos
    JLabel labelNombre = new JLabel("Producto:");
    labelNombre.setFont(new Font("Arial", Font.BOLD, 12));
    panelTitulos.add(labelNombre);

    JLabel labelPrecio = new JLabel("               Precio:");
    labelPrecio.setFont(new Font("Arial", Font.BOLD, 12));
    panelTitulos.add(labelPrecio);

    JLabel labelCantidad = new JLabel("            Cantidad:");
    labelCantidad.setFont(new Font("Arial", Font.BOLD, 12));
    panelTitulos.add(labelCantidad);

    panelInventario.add(panelTitulos, BorderLayout.NORTH);
    JPanel panelDatos = new JPanel();
    panelDatos.setLayout(new GridLayout(0, 3)); // 3 columns

    // Agregar la información del inventario al panel
    for (Map.Entry<String, Articulos> entry : inventario.entrySet()) {
        Articulos articulo = entry.getValue();
        if (articulo instanceof ArticulosConCantidad) {
            ArticulosConCantidad articuloConCantidad = (ArticulosConCantidad) articulo;

            // Crear etiquetas para cada columna
            JLabel labelNombreArticulo = new JLabel(articuloConCantidad.getNombre());
            labelNombreArticulo.setFont(new Font("Calibri", Font.BOLD, 13));
            panelDatos.add(labelNombreArticulo);

            JLabel labelPrecioArticulo = new JLabel(String.format("                S/" + "%.2f", articuloConCantidad.getPrecio()));
            labelPrecioArticulo.setFont(new Font("Calibri", Font.BOLD, 13));
            panelDatos.add(labelPrecioArticulo);

            JLabel labelCantidadArticulo = new JLabel(String.valueOf("                  " + articuloConCantidad.getCantidad()));
            labelCantidadArticulo.setFont(new Font("Calibri", Font.BOLD, 13));
            panelDatos.add(labelCantidadArticulo);
        }
    }
    panelInventario.add(panelDatos, BorderLayout.CENTER);
    return panelInventario;
}
    
    public void setTotalPagar(String total) {
        txtTotalPagar.setText(total);
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
            java.util.logging.Logger.getLogger(VentaDetalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentaDetalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentaDetalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentaDetalles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            InventarioMemory inventarioReal = new InventarioMemory();
            UsuarioReal usuarioReal = new UsuarioReal();
            boolean esAdmin = true; // CambiaAqui
            if (esAdmin) {
                VentaDetalles ventanaAdmin = new VentaDetalles(usuarioReal, false);
                ventanaAdmin.setVisible(true);
            } else {
                VentaDetalles ventanaEmpleado = new VentaDetalles(usuarioReal, true);
                ventanaEmpleado.setVisible(true);
            }
            }
        });
    }
    
    private double calcularTotalConEnvioUrgente() {
    double total = 0;
    double precioUnitarioConIVA = 0;
    double cantidad = 0;

    // Calcular el total para cada artículo
    for (int i = 1; i <= 4; i++) {
        switch (i) {
            case 1:
                precioUnitarioConIVA = articulo1.getPrecio() * 1.18; // Aplicar IGV
                cantidad = Double.parseDouble(txtCantidad1.getText());
                break;
            case 2:
               precioUnitarioConIVA = articulo2.getPrecio() * 1.18; // Aplicar IGV
                cantidad = Double.parseDouble(txtCantidad2.getText());
                // Aplicar descuento del 50% si hay descuento configurado
                if (articulo2.getCaracteristica() instanceof DescuentosMFactory) {
                    DescuentosMFactory descuento = (DescuentosMFactory) articulo2.getCaracteristica();
                    double totalArticulo2 = precioUnitarioConIVA * cantidad;
                    double descuentoAplicado = totalArticulo2 * (descuento.getPorcentajeDescuento() / 100);
                    totalArticulo2 -= descuentoAplicado; 
                    total += totalArticulo2; 
                    continue; 
                     }
                break;
            case 3:
                precioUnitarioConIVA = articulo3.getPrecio() * 1.18; // Aplicar IGV
                cantidad = Double.parseDouble(txtCantidad3.getText());
                break;
            case 4:
                precioUnitarioConIVA = articulo4.getPrecio() * 1.18; // Aplicar IGV
                cantidad = Double.parseDouble(txtCantidad4.getText());
                break;
        }

            // Calcular el total para el artículo
            double totalArticulo = precioUnitarioConIVA * cantidad;

            // Agregar el total del artículo al total general
            total += totalArticulo;
        }

        // Agregar el costo adicional por envío urgente
        total += 15.00;

        return total;
    }

    private double calcularTotalConEnvioNormal() {
        double total = 0;
        double precioUnitarioConIVA = 0;
        double cantidad = 0;

        // Calcular el total para cada artículo
        for (int i = 1; i <= 4; i++) {
            switch (i) {
                case 1:
                    precioUnitarioConIVA = articulo1.getPrecio() * 1.18; // Aplicar IGV
                    cantidad = Double.parseDouble(txtCantidad1.getText());
                    break;
                case 2:
                    precioUnitarioConIVA = articulo2.getPrecio() * 1.18; // Aplicar IGV
                    cantidad = Double.parseDouble(txtCantidad2.getText());
                    // Aplicar descuento del 50% si hay descuento configurado
                    if (articulo2.getCaracteristica() instanceof DescuentosMFactory) {
                    DescuentosMFactory descuento = (DescuentosMFactory) articulo2.getCaracteristica();
                    double totalArticulo2 = precioUnitarioConIVA * cantidad;
                    double descuentoAplicado = totalArticulo2 * (descuento.getPorcentajeDescuento() / 100);
                    totalArticulo2 -= descuentoAplicado; 
                    total += totalArticulo2; 
                    continue; 
                     }
                break;
                case 3:
                    precioUnitarioConIVA = articulo3.getPrecio() * 1.18; // Aplicar IGV
                    cantidad = Double.parseDouble(txtCantidad3.getText());
                    break;
                case 4:
                    precioUnitarioConIVA = articulo4.getPrecio() * 1.18; // Aplicar IGV
                    cantidad = Double.parseDouble(txtCantidad4.getText());
                    break;
            }

            // Calcular el total para el artículo
            double totalArticulo = precioUnitarioConIVA * cantidad;

            // Agregar el total del artículo al total general
            total += totalArticulo;
        }
        return total;
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
    txtPrecio2.setText("S/" + df.format(precioConIGV2));
    txtPrecio3.setText("S/" + df.format(precioConIGV3));
    txtPrecio4.setText("S/" + df.format(precioConIGV4));

    // Calcular los precios a pagar para cada artículo
    double pagar1 = cant1 * precioConIGV1;
    double pagar2 = 0; // Inicializar pagar2
    double pagar3 = cant3 * precioConIGV3;
    double pagar4 = cant4 * precioConIGV4;

    // Mostrar precios a pagar para los artículos sin descuentos
    txtPagar1.setText("S/" + df.format(pagar1));
    txtPagar3.setText("S/" + df.format(pagar3));
    txtPagar4.setText("S/" + df.format(pagar4));

        // Aplicar descuento solo en el segundo artículo si está seleccionado
        if (cant2 > 0) {
        double totalArticulo2 = precioConIGV2 * cant2;

        // Verificar si la característica de descuento está configurada
        if (articulo2.getCaracteristica() instanceof DescuentosMFactory) {
            DescuentosMFactory descuento = (DescuentosMFactory) articulo2.getCaracteristica();

            // Aplicar el descuento usando el método aplicarCaracteristica
            double precioConDescuento2 = descuento.aplicarCaracteristica(totalArticulo2);
            double descuento2 = totalArticulo2 - precioConDescuento2; // Calcular el descuento aplicado

            // Actualizar la interfaz con los valores calculados
            txtPagar2.setText("S/" + df.format(precioConDescuento2));
            pagar2 = precioConDescuento2; // Actualizar el total a pagar para el artículo 2
        } else {
            // Si no hay descuento, simplemente se muestra el precio sin descuento
            txtPagar2.setText("S/" + df.format(totalArticulo2));
            pagar2 = totalArticulo2; // Usar el total sin descuento
        }
    } else {
        // Si la cantidad es 0, no hay descuento y no se muestra el precio
        txtPagar2.setText("S/0");
    }

    // Mostrar descuentos como S/0 si no hay
  

    // Calcular los totales
    double total1 = pagar1; // Total del artículo 1
    double total2 = cant2 > 0 ? pagar2 : 0; // Total del artículo 2 con descuento
    double total3 = pagar3; // Total del artículo 3
    double total4 = pagar4; // Total del artículo 4

    // Calcular el total a pagar con descuento aplicado
    double totalPagarConDescuento = total1 + total2 + total3 + total4;

    // Mostrar total a pagar
    txtTotalPagar.setText("S/ " + df.format(totalPagarConDescuento));
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPagar;
    private javax.swing.JButton btRegresar;
    private javax.swing.JButton btnClonar;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnPrecio;
    private javax.swing.JComboBox<String> cbo_Pedido;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel txtArticulo1;
    private javax.swing.JLabel txtArticulo2;
    private javax.swing.JLabel txtArticulo3;
    private javax.swing.JLabel txtArticulo4;
    private javax.swing.JLabel txtArticulo5;
    private javax.swing.JLabel txtArticulo6;
    private javax.swing.JLabel txtCantidad1;
    private javax.swing.JLabel txtCantidad2;
    private javax.swing.JLabel txtCantidad3;
    private javax.swing.JLabel txtCantidad4;
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
