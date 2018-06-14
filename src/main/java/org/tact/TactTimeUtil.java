package org.tact;

import java.util.Date;

import org.joda.time.DateTime;

public class TactTimeUtil {

	public static void main(String[] args){

		String fTime = getFuzzyTime();
		System.out.println(fTime);
	}
	
	public static String getFuzzyTime(){

		Date future = new Date();
		DateTime pastDt = new DateTime().minusDays(24);

		Date past = pastDt.toDate();
		
		getFuzzyTime(past, future);
		
		long diff = future.getTime() - past.getTime();
		
		System.out.println(diff);
		
		// in min, in hours, in days, in week

		return "-";
	}
	
	public static String getFuzzyTime(Date start, Date end){
		
		// < 59
		// few mins go
		
		// > 60
		//few hours ago
		
		// 14 days
		// few weeks ago
		
		// few days ago
		
		return "-";
	}
}
