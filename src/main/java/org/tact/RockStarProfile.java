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
			table.addCell("Team");
			table.addCell("City");
			table.addCell("Home ground");
			table.addCell("debut");
			table.addCell("Current Coach");
			table.addCell("Current Caption");
			table.addCell("Chennai Super Kings");
			table.addCell("Chennai,Tmil Nadu");
			table.addCell("M.A Chidambaram Stadium");
			table.addCell("2008");
			table.addCell("stephen Fleming");
			table.addCell("MS Dhoni");
			table.addCell("Delhi Daredevils");
			table.addCell("delhi");
			table.addCell("Feroz Shah Kotla Ground");
			table.addCell("2008");
			table.addCell("Ricky Ponting");
			table.addCell("Gautam Gambhir");
			table.addCell("Kings XI Punjab");
			table.addCell("Mohali,Punjab");
			table.addCell("PCA Stadium");
			table.addCell("2008");
			table.addCell("Brad Hodge");
			table.addCell("Ravichandran Ashwin");
			table.addCell("Kolkata Knight Riders");
			table.addCell("Kolkata,West Bengal");
			table.addCell("Eden Gardens");
			table.addCell("2008");
			table.addCell("jacques Kallis");
			table.addCell("Dinesh Karthik");
			table.addCell("Mumbai Indians");
			table.addCell("Mumbai,Maharashtra");
			table.addCell("Wankhede Stadium");
			table.addCell("2008");
			table.addCell("Mahela Jayawardene");
			table.addCell("Rohit Sharma");
			
			document.add(table);
			document.close();
		} catch(Exception e){
			System.out.println(e);
			
		}
	}

}
