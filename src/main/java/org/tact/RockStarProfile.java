package org.tact;

import java.io.FileOutputStream;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
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
			PdfPTable table2 = new PdfPTable(2);
			table2.addCell("Created a NodeJS API to test 3000+ content when we migrated from one CDN to another. This came as a sudden requirement and is completed in a single day, where manual testing would be tedious.");
			table2.addCell("When suddenly some of the PayPal IPN fails, Debugged the whole PayPal process and after comparing the data, found Paypal suddenly start sending repetitive keys which were thought to be unique. Fixed the issue and updated all the missing accounts using a PHP script");
			table2.addCell("Got spammed by 2000+ emails in 5 minutes for our support mail. Redirected the page origin and implemented captcha authentication in 1 hour thus not missing the tickets and fixing the issue");
			table2.addCell("When there where too many data mismatch between our and our partner's record which lead to a lot of confusion, wrote a PHP script to get the reconciliation and correct them.");
			table2.addCell("                                                                                                                                                                          ");
			table2.addCell("Went on to Apalya Technologies, Hyderabad to fix the issue for Sun NXT app on Lyca STB and moving to production");
			table2.addCell("When our APIs were down at 2 am due to high traffic, fixed the issue and increased the performance in 20 minutes to bring back the apps live.");
			table2.addCell("Fixed the broken facebook login, for which we didn't have credentials, by debugging the changes in Graph API, found the admin of the app using app id and got back the credentials. Thus saving 10000+ records of data.");
			table2.addCell("Implementing token signing techniques to avoid hackers stealing our content.");
			table2.addCell("  ");
			document.add(table2);
			document.add( Chunk.NEWLINE );
			document.add(new Paragraph("Projects"));
			document.add( Chunk.NEWLINE );
			PdfPTable table3 = new PdfPTable(2);
			table3.addCell("BotSample      View Code on Github    Feb 13 2018");
			table3.addCell("Bus-Tracking-App View Code on Github Jan 08 2018");
			table3.addCell("GPSTracking View Code on Github Jan 08 2018");
			table3.addCell("OutFocusRED View Code on Github Jan 08 2018");
			table3.addCell("Outlink View Code on Github Jan 08 2018");
			table3.addCell(" ");
			document.add(table3);
			document.add( Chunk.NEWLINE );
			document.add(new Paragraph("Employment"));
			document.add( Chunk.NEWLINE );
			document.add(new Paragraph("Software Engineer"));
			document.add(new Paragraph("VueData Technologies Limited"));
			document.add(new Paragraph("Oct 2016 - Present"));
			document.add(new Paragraph("Android and Web development"));
			document.add(new Paragraph("TENTKOTTA "));
			document.add( Chunk.NEWLINE );
			document.add(new Paragraph("Online movie streaming platform over a variety of devices in high quality legally."));
			List unorderedList = new List(List.UNORDERED);
			unorderedList.add(new ListItem("Understanding the requirements from the client. "));
			unorderedList.add(new ListItem("Interaction with customers to solve their issues. "));
			unorderedList.add(new ListItem("Enhancement of latest features in website. "));
			unorderedList.add(new ListItem("Took ownership and integrated the Lyca APIs with the system. "));
			unorderedList.add(new ListItem("PayPal API integration and profile management from website and CMS "));
			unorderedList.add(new ListItem("Took ownership and enhanced the application for mobile and TV devices."));
			unorderedList.add(new ListItem("Developed the RESTful API"));
			document.add(unorderedList);
			document.add(new Paragraph("Technology Used:"));
			document.add(new Paragraph("HTML5, CSS, PHP, SQL, XML, JAVA, NODEJS, PAYPAL API, GRAPH API."));
			document.add( Chunk.NEWLINE );
			document.add(new Paragraph("SUPER SARAVANA STORES APP "));
			document.add(new Paragraph("An Android Application for Super Saravana Stores, a shopping center for its customer interaction. "));
			List unorderedList1 = new List(List.UNORDERED);
			unorderedList1.add(new ListItem("Understanding the requirements and developed a POC. "));
			unorderedList1.add(new ListItem("End to end Development of the Android App from scratch to final product."));
			unorderedList1.add(new ListItem("Developed the RESTful API."));
			document.add(unorderedList1);
			document.add( Chunk.NEWLINE );
			document.add(new Paragraph("Technology Used:"));
			document.add(new Paragraph(" JAVA, XML, NODEJS"));
			document.close();
		} catch(Exception e){
			System.out.println(e);
			
		}
	}

}
