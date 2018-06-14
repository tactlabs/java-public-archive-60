package org.tact;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.Months;

public class JavaDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        
	        DateTime startDate = new DateTime(2013, 10, 20, 5, 5, 0);
	        DateTime endDate = new DateTime(2013, 10, 30, 8, 10, 0);
	        
	        int min = Minutes.minutesBetween(startDate, endDate).getMinutes();
	        
	        System.out.println("The time different between in given date " + min + " minutes ");
	        
	        if(min < 59){
	       	 	System.out.println(" few Minutes ago"); //Time is less then 60 min
	       }else if(min > 60 && min < 1440 ){
	    	   System.out.println(" few Hours ago");//Time is greater then 1 hour but less then one day
	       }else if(min >= 1440 && min < 20160){
	    	   System.out.println("few days ago");//Time is greater then 1 day but less then two week
	       }else{
	    	   System.out.println("few weeks ago");//Time is two week or greater then two week
	       }
	    
	}
}
