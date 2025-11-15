package tatiana;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Paragraph;
import java.io.FileOutputStream;

public class CrearPDF {
    public void añadirTexto() throws Exception {
        Document document = new Document();
        String parrafo = "Buenos días, Tatiana. ¿Qué tal?. \n"
                + "Eres la más guapa y simpática del mundo, nunca he conocido a nadie como tú. \n"
                + "Gracias por existir. \n";
        PdfWriter.getInstance(document, new FileOutputStream("recibo.pdf"));
        document.open();
        document.add(new Paragraph(parrafo));
        document.close();
    }

    public static void main(String args[]) {
        try {
            CrearPDF p = new CrearPDF();
            p.añadirTexto();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}