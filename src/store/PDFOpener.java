
package store;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class PDFOpener {

    public void openPDF(String filePath) {
        try {
            File pdfFile = new File(filePath);
            if (pdfFile.exists()) {
                Desktop.getDesktop().open(pdfFile);
            } else {
                System.err.println("El archivo PDF no existe: " + filePath);
            }
        } catch (IOException e) {
            System.err.println("Error al intentar abrir el PDF: " + e.getMessage());
        }
    }
}