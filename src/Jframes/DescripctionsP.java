
package Jframes;
import Jframes.Venta;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import store.Descriptions;

public class DescripctionsP extends javax.swing.JFrame {

    public DescripctionsP()  {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        agregarProductosAlPanel();
        setTitle("Información de Productos");
    }
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        MiTiendita1 = new javax.swing.JLabel();
        btPagar = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        btRetroceder = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        MiTiendita2 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        MiTiendita1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        MiTiendita1.setText(" MI TIENDA VIRTUAL");
        jPanel2.add(MiTiendita1);

        btPagar.setBackground(new java.awt.Color(255, 255, 0));
        btPagar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btPagar.setText("Proceder al pago");
        btPagar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPagarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, -1, -1));

        jPanel3.setBackground(new java.awt.Color(56, 133, 213));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(255, 255, 204));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 182, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, 200));

        jPanel11.setBackground(new java.awt.Color(255, 255, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 182, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, 200));

        jPanel10.setBackground(new java.awt.Color(255, 255, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 174, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 200));

        btRetroceder.setBackground(new java.awt.Color(255, 51, 51));
        btRetroceder.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        btRetroceder.setText("Regresar");
        btRetroceder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetrocederActionPerformed(evt);
            }
        });
        jPanel3.add(btRetroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 330, 60));

        jPanel14.setBackground(new java.awt.Color(255, 255, 204));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, -1, 200));

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        MiTiendita2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        MiTiendita2.setText("INFORMACIÓN PRODUCTOS");
        jPanel4.add(MiTiendita2);

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 850, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPagarActionPerformed
 
    }//GEN-LAST:event_btPagarActionPerformed

    private void btRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRetrocederActionPerformed
        new Venta().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btRetrocederActionPerformed

 private void agregarProducto(Descriptions producto, JPanel panel) {
    panel.setLayout(new GridLayout(6, 1, 10, 10));

    JLabel labelNombre = new JLabel("Producto: "+producto.getNombreProducto());
    labelNombre.setFont(new Font("Calibri light", Font.BOLD, 14)); 
    labelNombre.setHorizontalAlignment(JLabel.CENTER);
    panel.add(labelNombre);

    JLabel labelTipo = new JLabel("Tipo de producto: "+producto.getTipoProducto());
    labelTipo.setFont(new Font("Calibri light", Font.BOLD, 14));
    labelTipo.setHorizontalAlignment(JLabel.CENTER); 
    panel.add(labelTipo);

    JLabel labelPeso = new JLabel("Peso: " + producto.getPeso());
    labelPeso.setFont(new Font("Calibri light", Font.BOLD, 14)); 
    labelPeso.setHorizontalAlignment(JLabel.CENTER);
    panel.add(labelPeso);

    JLabel labelTamaño = new JLabel("Tamaño: " + producto.getTamaño());
    labelTamaño.setFont(new Font("Calibri light", Font.BOLD, 14)); 
    labelTamaño.setHorizontalAlignment(JLabel.CENTER);
    panel.add(labelTamaño);

    JLabel labelColor = new JLabel("Color: " + producto.getColor());
    labelColor.setFont(new Font("Calibri light", Font.BOLD, 14)); 
    labelColor.setHorizontalAlignment(JLabel.CENTER);
    panel.add(labelColor);

    JLabel labelPrecio = new JLabel("Precio: " + producto.getPrecio()+" soles");
    labelPrecio.setFont(new Font("Calibri light", Font.BOLD, 14));
    labelPrecio.setHorizontalAlignment(JLabel.CENTER); 
    panel.add(labelPrecio);
}

    private void agregarProductosAlPanel() {
       Descriptions primerProducto = Descriptions.PrimerProducto();
       Descriptions segundoProducto = Descriptions.SegundoProducto();
       Descriptions tercerProducto = Descriptions.TercerProducto();
       Descriptions cuartoProducto = Descriptions.CuartoProducto();

       jPanel10.setPreferredSize(new Dimension(200, 200));
       jPanel11.setPreferredSize(new Dimension(200, 200));
       jPanel12.setPreferredSize(new Dimension(200, 200));
       jPanel14.setPreferredSize(new Dimension(200, 200));

       agregarProducto(primerProducto, jPanel10);
       agregarProducto(segundoProducto, jPanel11);
       agregarProducto(tercerProducto, jPanel12);
       agregarProducto(cuartoProducto, jPanel14);
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
            java.util.logging.Logger.getLogger(DescripctionsP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DescripctionsP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DescripctionsP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DescripctionsP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DescripctionsP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MiTiendita1;
    private javax.swing.JLabel MiTiendita2;
    private javax.swing.JButton btPagar;
    private javax.swing.JButton btRetroceder;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
