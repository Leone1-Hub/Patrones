
package Jframes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Interfaces.ArticlesPrototype; 
import java.util.ArrayList;
import java.util.List;
import javax.swing.border.BevelBorder;
import store.Articulos;
import store.CloneCommand;

public class CommandFrame extends javax.swing.JFrame {
    private JTextArea messageArea;
    private CloneCommand cloneCommand;
    private List<Articulos> articulosList;

    public CommandFrame(ArticlesPrototype prototype) {
        
        this.setLocationRelativeTo(null);
        this.setTitle("Clonación de productos");
        this.setResizable(false);
        
        cloneCommand = new CloneCommand(prototype);
        articulosList = new ArrayList<>();

        inicializarArticulos();

        setTitle("Command");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear componentes
        messageArea = new JTextArea();
        messageArea.setEditable(false);
        messageArea.setFont(new Font("Calibri Light", Font.BOLD, 12)); 
        JScrollPane scrollPane = new JScrollPane(messageArea);
        
        JButton cloneButton = new JButton("Clonar Objeto");
        JButton undoButton = new JButton("Deshacer Clonación");

        cloneButton.setBorder(new BevelBorder(BevelBorder.RAISED));
        undoButton.setBorder(new BevelBorder(BevelBorder.RAISED));
        cloneButton.setBackground(Color.YELLOW); 
        undoButton.setBackground(Color.YELLOW);

        // Aumentar el tamaño de los botones
        cloneButton.setPreferredSize(new Dimension(150, 40)); 
        undoButton.setPreferredSize(new Dimension(150, 40));
        cloneButton.setFont(new Font("Calibri Light", Font.BOLD, 14));
        undoButton.setFont(new Font("Calibri Light", Font.BOLD, 14));

        // Agregar acción para el botón de clonación
        cloneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cloneCommand.execute();
                updateMessageArea();
            }
        });

        undoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cloneCommand.undo();
                updateMessageArea();
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(cloneButton);
        buttonPanel.add(undoButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        add(panel);

        mostrarArticulos();
    }

    private void inicializarArticulos() {
        articulosList.add(new Articulos("Aceite vegetal", 8.70));
        articulosList.add(new Articulos("Leche de vaca", 6.00));
        articulosList.add(new Articulos("Atún en lata", 5.60));
        articulosList.add(new Articulos("Refresco en lata", 5.20));
    }

    private void mostrarArticulos() {
        messageArea.append("Artículos disponibles:\n");
        for (Articulos articulo : articulosList) {
            messageArea.append(articulo.toString() + "\n");
        }
        messageArea.append("\n"); 
    }

    private void updateMessageArea() {
        messageArea.append("Acciones recientes:\n");
        for (String message : cloneCommand.getMessages()) {
            messageArea.append(message + "\n"); 
        }
        messageArea.append("\n"); 
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
            java.util.logging.Logger.getLogger(CommandFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommandFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommandFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommandFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
        ArticlesPrototype prototype = new Articulos("Leche de vaca", 6.00); // Clonar
        CommandFrame commandFrame = new CommandFrame(prototype);
        commandFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
