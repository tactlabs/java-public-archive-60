package org.tact;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

//import org.ocpsoft.prettytime.PrettyTime;

public class FuzzyLogic {

	public static void main(String[] args) {
		
		//PrettyTime p = new PrettyTime(new Locale("fr"));
		//System.out.println(p.format(new Date()));
		try {
	        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	        Date past = format.parse("26/4/2018");
	        Date now = new Date();
            System.out.println("input Date:"+past);
            System.out.println("TDY Date:"+now);
	       // System.out.println(TimeUnit.MILLISECONDS.toMillis(now.getTime() - past.getTime()) + " milliseconds ago");
	       // System.out.println(TimeUnit.MILLISECONDS.toMinutes(now.getTime() - past.getTime()) + " minutes ago");
            if(TimeUnit.MILLISECONDS.toHours(now.getTime() - past.getTime())<24){
            	 System.out.println(TimeUnit.MILLISECONDS.toHours(now.getTime() - past.getTime()) + " hours ago");
            }else if(TimeUnit.MILLISECONDS.toDays(now.getTime() - past.getTime())<=30){
	        //System.out.println(TimeUnit.MILLISECONDS.toHours(now.getTime() - past.getTime()) + " hours ago");
	        System.out.println(TimeUnit.MILLISECONDS.toDays(now.getTime() - past.getTime()) + " days ago");
            } 
           // System.out.println(TimeUnit.MILLISECONDS.toWeeks(now.getTime() - past.getTime()) + " days ago");
	    }
	    catch (Exception j){
	        j.printStackTrace();
	    }
	}

}
