package org.tact;

import java.awt.Graphics2D;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringReader;

import com.itextpdf.awt.DefaultFontMapper;
import com.itextpdf.awt.geom.Rectangle;
import com.itextpdf.awt.geom.Rectangle2D;
import com.itextpdf.awt.geom.Rectangle2D.Double;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.FontSelector;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.html.simpleparser.HTMLWorker;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import java.awt.Color;
import java.io.File;
  
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;

public class pdfonverterPart2 {
	
	private static final int FONT_SIZE = 10;
	private static final int FONT_SIZE_BOLD = 12;
	
   public static void main(String args[]) throws Exception {
	   OutputStream file = new FileOutputStream(new File("E:\\Test_Nirosha.pdf"));
	    
	    Document document = new Document();
	    PdfWriter writer = PdfWriter.getInstance(document, file);

       Font font3 = new Font(Font.FontFamily.TIMES_ROMAN, FONT_SIZE_BOLD, Font.BOLD);
       Font font4 = new Font(Font.FontFamily.TIMES_ROMAN, FONT_SIZE);
	    
	    document.open();

	   // HTMLWorker htmlWorker = new HTMLWorker(document);
	   // htmlWorker.parse(new StringReader(k));
	   // htmlWorker.parse(new StringReader(l));
	    
	    document.add(new Paragraph("Top Problems Solved In Career", font4));
	    PdfPTable table = new PdfPTable(2);
		
		table.addCell(new Phrase("Created a NodeJS API to test 3000+ content when we migrated from one CDN to another. This came as a sudden requirement and is completed in a single day, where manual testing would be tedious.", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
		table.addCell(new Phrase("When suddenly some of the PayPal IPN fails, Debugged the whole PayPal process and after comparing the data, found Paypal suddenly start sending repetitive keys which were thought to be unique. Fixed the issue and updated all the missing accounts using a PHP script", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
		

		table.setSpacingBefore(2f);
		document.add(table);
		
	    PdfPTable table1 = new PdfPTable(2);
		
		table1.addCell(new Phrase("", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
		table1.addCell(new Phrase("", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
		

		table1.setSpacingBefore(2f);
		document.add(table1);
		
	    PdfPTable table2 = new PdfPTable(2);
		
		table2.addCell(new Phrase("", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
		table2.addCell(new Phrase("", FontFactory.getFont(FontFactory.TIMES_ROMAN, FONT_SIZE)));
		

		table.setSpacingBefore(2f);
		document.add(table1);
		
		

        }
}