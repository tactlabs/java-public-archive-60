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
public class PdfConverter {
	
	private static final int FONT_SIZE = 10;
	private static final int FONT_SIZE_BOLD = 12;
	
    public static void main(String[] args) {
    	
        try {

        	String k = "Personal Bio";
        	String l = "I'm a full stack developer with a keen interest in strategy and growth. Love creating new things and an enthusiastic learner. Currently, I am working with Vuedata Technologies providing legal Tamil OTT content through website and apps";

    	    OutputStream file = new FileOutputStream(new File("E:\\Test_Niro.pdf"));
    	    
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
    		final String angularJs = "Angular Js";        
    	    final String php = "PHP";        
    	    final String nodejs = "Node JS";        
    	    final String frontend = "Front End ( HTML,CSS,Jquery)";        
    	    final String ios = "IOS";        
    	    final String sql = "SQL";
    	    final String nosql = "No SQL";
    	    final String java = "JAVA";      
    	    final String expertrating = "Expert Rating";
    	    final String peerrating = "Peer Rating";
    	    final String selfrating = "Self Rating";
    	    final DefaultCategoryDataset dataset = new DefaultCategoryDataset( );  
    	    dataset.addValue( 8.0, expertrating , angularJs  );        
    	    dataset.addValue( 6.5, peerrating , angularJs  );        
    	    dataset.addValue( 8.0, selfrating , angularJs  ); 
    	    
    	    dataset.addValue( 7.0, expertrating , php  );        
    	    dataset.addValue( 6.5, peerrating, php  );        
    	    dataset.addValue( 7.0, selfrating,  php); 
    	    
    	    dataset.addValue( 6.0  , expertrating , nodejs );        
    	    dataset.addValue( 7.0  , peerrating   , nodejs  );        
    	    dataset.addValue( 6.0  , selfrating   , nodejs ); 

    	    dataset.addValue( 7.0, expertrating , frontend  );        
    	    dataset.addValue( 5.5, peerrating , frontend  );        
    	    dataset.addValue( 7.0, selfrating , frontend  ); 

    	    dataset.addValue( 6.0 , expertrating, ios  );        
    	    dataset.addValue( 5.0 , peerrating , ios );        
    	    dataset.addValue( 2.0, selfrating  , ios ); 

    	    dataset.addValue( 8.0 , expertrating , sql  );        
    	    dataset.addValue( 7.0 , peerrating , sql  );        
    	    dataset.addValue( 8.0  , selfrating, sql ); 

    	    dataset.addValue( 7.0 , expertrating , nosql  );        
    	    dataset.addValue( 7.5 , peerrating  , nosql);        
    	    dataset.addValue( 5.0 , selfrating , nosql); 

    	    dataset.addValue( 8.0 , expertrating , java);        
    	    dataset.addValue( 8.0 , peerrating,   java );        
    	    dataset.addValue( 6.0 , selfrating  , java ); 
    	    
            JFreeChart jFreeChart = ChartFactory.createBarChart(
                         "Skills & Rating", //title
                         "", // categoryAxisLabel
                         "",//valueAxisLabel
                         dataset, //dataset
                         PlotOrientation.HORIZONTAL, //orientation
                         true, true, false); //legend, tooltips and urls
            
            
            
            PdfContentByte pdfContentByte = writer.getDirectContent();
            int width = 400; //width of BarChart
            int height = 250; //height of BarChart
            PdfTemplate pdfTemplate = pdfContentByte.createTemplate(width, height);
            
            //create graphics
            Graphics2D graphics2d = pdfTemplate.createGraphics(width, height,
                         new DefaultFontMapper());
            
            //create rectangle
            java.awt.geom.Rectangle2D rectangle2d = new java.awt.geom.Rectangle2D.Double(
                         0, 0, width, height);
  
            jFreeChart.draw(graphics2d, rectangle2d);
  
            graphics2d.dispose();
            pdfContentByte.addTemplate(pdfTemplate, 80, 250); //0, 0 will draw BAR chart on bottom left of page
            
            DefaultPieDataset defaultCategoryDataset = new DefaultPieDataset();
            defaultCategoryDataset.setValue("Coding Standard: 18.2%", 18.2);
            defaultCategoryDataset.setValue("Code Maintanibility: 18.2%", 18.2);
            defaultCategoryDataset.setValue("Tool exploring: 18.2%", 18.2);
            defaultCategoryDataset.setValue("Scope management: 15.9%", 15.9);
            defaultCategoryDataset.setValue("Clean coding: 15.9%", 15.9);
            defaultCategoryDataset.setValue("Presentation: 13.6%", 13.6);
  
            JFreeChart jFreeChart1 = ChartFactory.createPieChart(
                         "Strong Areas",  //pie chart title
                         defaultCategoryDataset, //pie chart dataset
                         false, false, false);  //pie chart> legend, toolt
            
            int width1 = 400; //width of PieChart
            int height1 = 200; //height of pieChart
            PdfTemplate pdfT = pdfContentByte.createTemplate(width1, height1);
            
            //create graphics
            Graphics2D g2d = pdfT.createGraphics(width1, height1,
                         new DefaultFontMapper());
            
            //create rectangle
            java.awt.geom.Rectangle2D r2d = new java.awt.geom.Rectangle2D.Double(
                         0, 0, width1, height1);
  
            jFreeChart1.draw(g2d, r2d);
  
            g2d.dispose();
            
            pdfContentByte.addTemplate(pdfT, 80, 50);
            

    	    document.close();
    	    file.close();
    	    
            

        } catch (Exception e) {

            e.printStackTrace();
        }
    }        
}