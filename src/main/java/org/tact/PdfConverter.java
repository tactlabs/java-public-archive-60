package org.tact;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.StringReader;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.html.simpleparser.HTMLWorker;

public class PdfConverter {
    public static void main(String[] args) {
        try {

        	String k = "Personal Bio :I'm a full stack developer with a keen interest in strategy and growth. Love creating new things and an enthusiastic learner. Currently, I am working with Vuedata Technologies providing legal Tamil OTT content through website and apps ";
    	    OutputStream file = new FileOutputStream(new File("E:\\Test123.pdf"));
    	    Document document = new Document();
    	    PdfWriter.getInstance(document, file);
    	    document.open();
    	    HTMLWorker htmlWorker = new HTMLWorker(document);
    	    htmlWorker.parse(new StringReader(k));
    	    document.close();
    	    file.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}