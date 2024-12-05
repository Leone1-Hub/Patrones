
package store;

import com.lowagie.text.*;
import com.lowagie.text.pdf.*;

import java.io.FileOutputStream;
import java.io.IOException;

public class PDFGenerator {

    public void createPDF(String filePath, double total, double recibido, double cambio, String moneda, String tipoEnvio, String empresaEnvio, String direccion) {
        Document document = new Document();
         try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filePath));
            writer.setPageEvent(new HeaderFooterPageEvent());
            document.open();

            // Añadir un título centrado
            Paragraph title = new Paragraph("Detalle de la Venta", new Font(Font.BOLD, 18));
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);

            // Espacio antes de la tabla
            document.add(new Paragraph(" "));

            // Crear tabla con columnas de ancho específico
            float[] columnWidths = {2f, 1f};
            PdfPTable table = new PdfPTable(columnWidths);
            table.setWidthPercentage(100); // Ancho de la tabla al 100%

            // Agregar encabezados a la tabla
            Font headerFont = new Font(Font.BOLD, 12);
            PdfPCell headerCell;

            headerCell = new PdfPCell(new Phrase("Descripción", headerFont));
            headerCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerCell.setVerticalAlignment(Element.ALIGN_MIDDLE); // Alineación vertical
            table.addCell(headerCell);

            headerCell = new PdfPCell(new Phrase("Valor", headerFont));
            headerCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerCell.setVerticalAlignment(Element.ALIGN_MIDDLE); // Alineación vertical
            table.addCell(headerCell);

            // Agregar datos a la tabla con alineación centrada
            addRowToTable(table, "Total a Pagar:", total + " " + moneda);
            addRowToTable(table, "Recibido:", recibido + " " + moneda);
            addRowToTable(table, "Cambio:", cambio + " " + "Soles");
            addRowToTable(table, "Tipo de Envío:", tipoEnvio);
            addRowToTable(table, "Empresa de Envío:", empresaEnvio);
            addRowToTable(table, "Dirección:", direccion);

            // Agregar la tabla al documento
            document.add(table);

            // Mensaje de agradecimiento centrado
            document.add(new Paragraph(" "));
            Paragraph thankYou = new Paragraph("Gracias por su compra!", new Font(Font.BOLD, 14));
            thankYou.setAlignment(Element.ALIGN_CENTER);
            document.add(thankYou);

        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
        System.out.println("PDF generado en: " + filePath);
     }

    private void addRowToTable(PdfPTable table, String description, String value) {
        PdfPCell cellDescription = new PdfPCell(new Phrase(description));
        cellDescription.setHorizontalAlignment(Element.ALIGN_CENTER); // Alineación centrada
        cellDescription.setVerticalAlignment(Element.ALIGN_MIDDLE); // Alineación vertical
        table.addCell(cellDescription);

        PdfPCell cellValue = new PdfPCell(new Phrase(value));
        cellValue.setHorizontalAlignment(Element.ALIGN_CENTER); // Alineación centrada
        cellValue.setVerticalAlignment(Element.ALIGN_MIDDLE); // Alineación vertical
        table.addCell(cellValue);
    }

    // Clase interna para manejar el encabezado y pie de página
    class HeaderFooterPageEvent extends PdfPageEventHelper {
        @Override
        public void onEndPage(PdfWriter writer, Document document) {
            PdfContentByte canvas = writer.getDirectContent();
        }
    }
}
