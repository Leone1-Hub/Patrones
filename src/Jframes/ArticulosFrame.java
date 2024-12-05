
package Jframes;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import store.Articulos;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArticulosFrame extends javax.swing.JFrame {

    private Articulos articulo1;
    private Articulos articulo2;
    private Articulos articulo3;
    private Articulos articulo4;

    private JLabel precioLabel1;
    private JLabel precioLabel2;
    private JLabel precioLabel3;
    private JLabel precioLabel4;

    private JTextField precioField1;
    private JTextField precioField2;
    private JTextField precioField3;
    private JTextField precioField4;

    public ArticulosFrame() {

        // Inicializar los artículos con sus precios
        articulo1 = new Articulos("Aceite vegetal", 8.70);
        articulo2 = new Articulos("Leche de vaca", 6.00);
        articulo3 = new Articulos("Atún en lata", 5.60);
        articulo4 = new Articulos("Refresco en lata", 5.20);

        // Configurar el JFrame
        setTitle("Gestión de Artículos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        initPriceComponents();
        initButtons();
        
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void initPriceComponents() {
        // Artículo 1
        precioLabel1 = new JLabel("Precio Aceite: " + articulo1.getPrecio()+" soles");
        precioLabel1.setFont(new Font("Calibri Light", Font.BOLD, 12)); 
        precioLabel1.setBounds(20, 20, 250, 25);
        add(precioLabel1);

        precioField1 = new JTextField();
        precioField1.setBounds(270, 20, 100, 25);
        precioField1.setFont(new Font("Calibri Light", Font.BOLD, 11));
        add(precioField1);

        // Artículo 2
        precioLabel2 = new JLabel("Precio Leche: " + articulo2.getPrecio()+" soles");
        precioLabel2.setFont(new Font("Calibri Light", Font.BOLD, 12)); 
        precioLabel2.setBounds(20, 60, 250, 25);
        add(precioLabel2);

        precioField2 = new JTextField();
        precioField2.setBounds(270, 60, 100, 25);
        precioField2.setFont(new Font("Calibri Light", Font.BOLD, 11));
        add(precioField2);

        // Artículo 3
        precioLabel3 = new JLabel("Precio Atún: " + articulo3.getPrecio()+" soles");
        precioLabel3.setFont(new Font("Calibri Light", Font.BOLD, 12)); 
        precioLabel3.setBounds(20, 100, 250, 25);
        add(precioLabel3);

        precioField3 = new JTextField();
        precioField3.setBounds(270, 100, 100, 25);
        precioField3.setFont(new Font("Calibri Light", Font.BOLD, 11));
        add(precioField3);

        // Artículo 4
        precioLabel4 = new JLabel("Precio Refresco: " + articulo4.getPrecio()+" soles");
        precioLabel4.setFont(new Font("Calibri Light", Font.BOLD, 12));
        precioLabel4.setBounds(20, 140, 250, 25);
        add(precioLabel4);

        precioField4 = new JTextField();
        precioField4.setBounds(270, 140, 100, 25);
        precioField4.setFont(new Font("Calibri Light", Font.BOLD, 11));
        add(precioField4);
    }

    private void initButtons() {
        // Botón para cambiar precios
        JButton cambiarPrecioButton = new JButton("Cambiar Precio");
        cambiarPrecioButton.setBounds(20, 180, 150, 50);
        cambiarPrecioButton.setFont(new Font("Calibri Light", Font.BOLD, 13));
        cambiarPrecioButton.setBackground(Color.YELLOW); 

        cambiarPrecioButton.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarPrecios();
            }
        });
        add(cambiarPrecioButton);

        // Botón para restaurar precios
        JButton restaurarPrecioButton = new JButton("Restaurar Precio");
        restaurarPrecioButton.setBounds(200, 180, 150, 50);
        restaurarPrecioButton.setFont(new Font("Calibri Light", Font.BOLD, 13));
        restaurarPrecioButton.setBackground(Color.YELLOW); 
        restaurarPrecioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                restaurarPrecios();
            }
        });
        add(restaurarPrecioButton);
    }
    
    private void cambiarPrecios() {
    try {
       
        if (!precioField1.getText().isEmpty()) {
            double nuevoPrecio1 = Double.parseDouble(precioField1.getText());
            articulo1.setPrecio(nuevoPrecio1);
            precioLabel1.setText("Precio Aceite: " + articulo1.getPrecio()+" soles");
            precioField1.setText(""); // Limpiar el campo de texto
        }

        // Cambiar precio del artículo 2
        if (!precioField2.getText().isEmpty()) {
            double nuevoPrecio2 = Double.parseDouble(precioField2.getText());
            articulo2.setPrecio(nuevoPrecio2);
            precioLabel2.setText("Precio Leche: " + articulo2.getPrecio()+" soles");
            precioField2.setText(""); // Limpiar el campo de texto
        }

        // Cambiar precio del artículo 3
        if (!precioField3.getText().isEmpty()) {
            double nuevoPrecio3 = Double.parseDouble(precioField3.getText());
            articulo3.setPrecio(nuevoPrecio3);
            precioLabel3.setText("Precio Atún: " + articulo3.getPrecio()+" soles");
            precioField3.setText(""); // Limpiar el campo de texto
        }

        // Cambiar precio del artículo 4
        if (!precioField4.getText().isEmpty()) {
            double nuevoPrecio4 = Double.parseDouble(precioField4.getText());
            articulo4.setPrecio(nuevoPrecio4);
            precioLabel4.setText("Precio Refresco: " + articulo4.getPrecio()+" soles");
            precioField4.setText(""); // Limpiar el campo de texto
        }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un precio válido.");
        }
    }

    private void restaurarPrecios() {

        // Restaurar precios originales
        articulo1.setPrecio(8.70);
        articulo2.setPrecio(6.00);
        articulo3.setPrecio(5.60);
        articulo4.setPrecio(5.20);

        // Actualizar las etiquetas de precio
        precioLabel1.setText("Precio Aceite: " + articulo1.getPrecio()+" soles");
        precioLabel2.setText("Precio Leche: " + articulo2.getPrecio()+" soles");
        precioLabel3.setText("Precio Atún: " + articulo3.getPrecio()+" soles");
        precioLabel4.setText("Precio Refresco: " + articulo4.getPrecio()+" soles");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ArticulosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArticulosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArticulosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArticulosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             ArticulosFrame frame = new ArticulosFrame();
            frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
