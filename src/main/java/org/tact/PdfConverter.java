package org.tact;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringReader;

import com.itextpdf.awt.geom.Rectangle;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.FontSelector;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.html.simpleparser.HTMLWorker;

public class PdfConverter {
	
	private static final int FONT_SIZE = 10;
	private static final int FONT_SIZE_BOLD = 12;
	
    public static void main(String[] args) {
        try {

        	String k = "Personal Bio";
        	String l = "I'm a full stack developer with a keen interest in strategy and growth. Love creating new things and an enthusiastic learner. Currently, I am working with Vuedata Technologies providing legal Tamil OTT content through website and apps";
    	    OutputStream file = new FileOutputStream(new File("E:\\Test_12.pdf"));
    	    
    	    Document document = new Document();
    	    PdfWriter writer = PdfWriter.getInstance(document, file);

            Font font3 = new Font(Font.FontFamily.TIMES_ROMAN, FONT_SIZE_BOLD, Font.BOLD);
            Font font4 = new Font(Font.FontFamily.TIMES_ROMAN, FONT_SIZE);
    	    
    	    document.open();
  
    	   // HTMLWorker htmlWorker = new HTMLWorker(document);
    	   // htmlWorker.parse(new StringReader(k));
    	   // htmlWorker.parse(new StringReader(l));
    	    
    	    document.add(new Paragraph("Personal Bio", font4));
    	    document.add(new Paragraph("I'm a full stack developer with a keen interest in strategy and growth. Love creating new things and an enthusiastic learner. Currently, I am working with Vuedata Technologies providing legal Tamil OTT content through website and apps", font4));
    	   
    	    document.add(new Paragraph("Programming Experience & Self Rating", font3));
    		PdfPTable table = new PdfPTable(4);
    		
    		table.addCell(new Phrase("Technology", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("Exp. in Years", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("Self Rating out of 10", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("Expert Rating out of 10", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("Android", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("1", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("8", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("1", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("PHP", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("1", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("7", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("1", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("Node JS", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("0", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("6", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("1", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("Front End ( HTML,CSS,Jquery)", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("1", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("7", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("1", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("IOS", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("0", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("2", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("1", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("IOS", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("0", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("2", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("1", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("SQL", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("1", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("8", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("1", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("No SQL (MongoDB)", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("0", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("5", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("1", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("JAVA", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("1", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("6", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table.addCell(new Phrase("1", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		
    		table.setSpacingBefore(4f);
    		document.add(table);
    		
    		document.add(new Paragraph("Programming Activities", font3));
    		PdfPTable table1 = new PdfPTable(2);
    		table1.addCell(new Phrase("Activity", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table1.addCell(new Phrase("Link", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table1.addCell(new Phrase("Stackoverflow", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table1.addCell(new Phrase("https://stackoverflow.com/users/8331502/mazhar-ghulam", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table1.addCell(new Phrase("LinkedIn", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table1.addCell(new Phrase("https://www.linkedin.com/in/mazghul/", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table1.addCell(new Phrase("Github", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table1.addCell(new Phrase("https://github.com/mazghul", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
    		table1.setSpacingBefore(2f);
    		document.add(table1);
    		

    	      //document.add(new Chunk(    "This is sentence 1. ", font1));
    	      //document.add(new Phrase(   "This is sentence 2. ", font2));
    	      
    		    		
    	    document.close();
    	    file.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
    
}