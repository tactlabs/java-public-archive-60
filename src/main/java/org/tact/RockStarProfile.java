package org.tact;

import java.io.FileOutputStream;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.api.Spaceable;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class RockStarProfile {

	public static void main(String[] args) {
		try{
			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream("d:/Rockstar.pdf"));
			 
			document.open();
			//Format font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
			//Chunk chunk = new Chunk("Hello World");
			 
			document.add(new Paragraph("Personal Bio"));
			document.add( Chunk.NEWLINE );			
			document.add(new Paragraph("I'm a full stack developer with a keen interest in strategy and growth. Love creating new things and an enthusiastic learner. Currently, I am working with Vuedata Technologies providing legal Tamil OTT content through website and apps."));
			document.add( Chunk.NEWLINE );
			document.add( Chunk.NEWLINE );
			document.add(new Paragraph("Programming Experience & Self Rating"));
			document.add( Chunk.NEWLINE );
			PdfPTable table = new PdfPTable(4);
			table.addCell("Technology"); 
			table.addCell("Exp.in Years");
			table.addCell("self Rating out of 10");
			table.addCell("Expert Rating out of 10");
			table.addCell("Android");
			table.addCell("1");
			table.addCell("8");
			table.addCell("1");
			table.addCell("php");
			table.addCell("1");
			table.addCell("7");
			table.addCell("1");
			table.addCell("NodeJs");
			table.addCell("0");
			table.addCell("6");
			table.addCell("1");
			table.addCell("Front End(HTML,CSS,Jquery)");
			table.addCell("1");
			table.addCell("7");
			table.addCell("1");
			table.addCell("IOS");
			table.addCell("0");
			table.addCell("2");
			table.addCell("1");
			table.addCell("sql");
			table.addCell("1");
			table.addCell("8");
			table.addCell("1");
			table.addCell("NO SQL(mongoDB)");
			table.addCell("0");
			table.addCell("5");
			table.addCell("1");
			table.addCell("Java");
			table.addCell("1");
			table.addCell("6");
			table.addCell("1");
			document.add(table);
			
			document.add( Chunk.NEWLINE );
			document.add(new Paragraph("Programming activities"));
			document.add( Chunk.NEWLINE );
			PdfPTable table1 = new PdfPTable(2);
			table1.addCell("Activity"); 
			table1.addCell("Link");
			table1.addCell("Stackoverflow");
			table1.addCell("https://stackoverflow.com/users/8331502/mazhar-ghulam");
			table1.addCell("LinkedIn");
			table1.addCell("https://www.linkedin.com/in/mazghul/");
			table1.addCell("Android");
			table1.addCell("https://github.com/mazghul");	
			document.add(table1);
			document.add( Chunk.NEWLINE );
			document.add(new Paragraph("Top Problems Solved In Career"));
			document.add( Chunk.NEWLINE );
			//document.add(new Paragraph("Created a NodeJS API to test 3000+ content when we migrated from one CDN to another. This came as a sudden requirement and is completed in a single day, where manual testing would be tedious."));
			document.add(new Paragraph("Employment"));
			document.add( Chunk.NEWLINE );
			document.add(new Paragraph("Software Engineer"));
			document.add(new Paragraph("VueData Technologies Limited"));
			document.add(new Paragraph("Oct 2016 - Present"));
			document.add(new Paragraph("Android and Web development"));
			document.add(new Paragraph("TENTKOTTA "));
			document.add( Chunk.NEWLINE );
			document.add(new Paragraph("Online movie streaming platform over a variety of devices in high quality legally."));
			document.add(new Paragraph("* Understanding the requirements from the client."));
			
			 
			document.close();
		} catch(Exception e){
			System.out.println(e);
			
		}
	}

}
