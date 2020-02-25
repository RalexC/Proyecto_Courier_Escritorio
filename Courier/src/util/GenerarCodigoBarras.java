/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author Ralex
 */
public class GenerarCodigoBarras {

    public static void barras(String b,String Nombre,String Direccion,String Ruc) {

        
        
        try {
            Document doc = new Document();
            PdfWriter pdf = PdfWriter.getInstance(doc, new FileOutputStream(b+".pdf"));
            doc.open();
            
            Barcode128 code128 = new Barcode128();
            code128.setCode(b);
            Image img128 = code128.createImageWithBarcode(pdf.getDirectContent(), BaseColor.BLACK, BaseColor.BLACK);
            img128.scalePercent(200);
            
            doc.add(new Paragraph("Nombre: " + Nombre));
            doc.add(new Paragraph("Direccion: " + Direccion));
            doc.add(new Paragraph("Ruc: " + Ruc));
            doc.add(img128);
            
            doc.close();
            
            
        } catch (DocumentException | FileNotFoundException e) {
                System.out.println("error"+e);
        }   

    }
    
    public static void main(String[] args) {
       
       
    }

}
