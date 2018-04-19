package org.tact;

import java.io.FileOutputStream;

import org.springframework.validation.DefaultMessageCodesResolver.Format;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
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
		 
		document.add(new Paragraph("welcome to all"));
		PdfPTable table = new PdfPTable(6);
		table.setWidthPercentage(90);
		table.setSpacingBefore(5f);
		table.setSpacingAfter(5f);
		
		float[] colwidth = {2f,2f,2f,2f,2f,2f};
		table.setWidths(colwidth);
		PdfPCell c1 = new PdfPCell(new Paragraph("Column1"));
		c1.setBackgroundColor(BaseColor.BLUE);
		PdfPCell c2 = new PdfPCell(new Paragraph("Column2"));
		c2.setBackgroundColor(BaseColor.BLUE);
		PdfPCell c3 = new PdfPCell(new Paragraph("Column3"));
		c3.setBackgroundColor(BaseColor.BLUE);
		PdfPCell c4 = new PdfPCell(new Paragraph("Column4"));
		c4.setBackgroundColor(BaseColor.BLUE);
		PdfPCell c5 = new PdfPCell(new Paragraph("Column5"));
		c5.setBackgroundColor(BaseColor.BLUE);
		PdfPCell c6 = new PdfPCell(new Paragraph("Column6"));
		c6.setBackgroundColor(BaseColor.BLUE);
		table.addCell(c1);
		table.addCell(c2);
		table.addCell(c3);
		table.addCell(c4);
		table.addCell(c5);
		table.addCell(c6);
		table.addCell("csk");
		document.add(table);
		
		document.close();
		} catch(Exception e){
			System.out.println(e);
			
		}
	}

}
