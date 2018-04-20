package org.tact;

import java.io.FileOutputStream;
import java.io.Writer;

import org.springframework.validation.DefaultMessageCodesResolver.Format;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class Pdf {

	public static void main(String[] args) {
		try{
		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream("d:/a.pdf"));
		 
		document.open();
		//Format font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
		//Chunk chunk = new Chunk("Hello World");
		 
		document.add(new Paragraph("Current Teams"));
		PdfPTable table = new PdfPTable(6);
		
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
		table.addCell("Rajasthan Royals");
		table.addCell("Jaipur,Rajasthan");
		table.addCell("Sawai Mansingh Stadium");
		table.addCell("2008");
		table.addCell("Daniel Venttori");
		table.addCell("Virat Kohli");
		table.addCell("Sunrisers Hyderabad");
		table.addCell("Hyderabad,Telangana");
		table.addCell("Rajiv Gandhi International Cricket stadium");
		table.addCell("2013");
		table.addCell("Tom Moody");
		table.addCell("Kane Williamson");
		table.addCell("c1");
		table.addCell("c1");
		table.addCell("c1");
		table.addCell("c1");
		table.addCell("c1");
		table.addCell("c1");
		table.addCell("c1");
		table.addCell("c1");
		table.addCell("c1");
		table.addCell("c1");
		table.addCell("c1");
		table.addCell("c1");
		table.addCell("c1");
		table.addCell("c1");
		table.addCell("c1");
		//table.setWidthPercentage(80);
		table.setSpacingBefore(6f);
		//table.setSpacingAfter(8f);
		/*
		float[] colwidth = {2f,2f,2f,2f,2f,2f};
		table.setWidths(colwidth);
		PdfPCell c1 = new PdfPCell(new Paragraph("Team"));
		c1.setBackgroundColor(BaseColor.BLUE);
		PdfPCell c2 = new PdfPCell(new Paragraph("City"));
		c2.setBackgroundColor(BaseColor.BLUE);
		PdfPCell c3 = new PdfPCell(new Paragraph("Home ground"));
		c3.setBackgroundColor(BaseColor.BLUE);
		PdfPCell c4 = new PdfPCell(new Paragraph("debuit"));
		c4.setBackgroundColor(BaseColor.BLUE);
		PdfPCell c5 = new PdfPCell(new Paragraph("Current Coach"));
		c5.setBackgroundColor(BaseColor.BLUE);
		PdfPCell c6 = new PdfPCell(new Paragraph("Current Caption"));
		c6.setBackgroundColor(BaseColor.BLUE);
		//PdfPCell c7 = new PdfPCell(new Paragraph("Current Caption"));
		//c6.setBackgroundColor(BaseColor.BLUE);
		table.addCell(c1);
		table.addCell(c2);
		table.addCell(c3);
		table.addCell(c4);
		table.addCell(c5);
		table.addCell(c6);*/
		//table.addCell(c7);
		//table.addCell("csk");
		document.add(table);
		/*List orderList = new List(List.ORDERED);
		orderList.add(new ListItem("Fun"));
		orderList.add(new ListItem("Fun"));
		orderList.add(new ListItem("Fun"));
		orderList.add(new ListItem("Fun"));
		document.add(orderList);*/
		
		document.close();
		} catch(Exception e){
			System.out.println(e);
			
		}
	}

}
