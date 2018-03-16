package org.tact;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MarketPredictions {
	int s = 0;
	int a = 0;
	public static void main(String[] args)throws InterruptedException {
		 MarketPredictions mp = new  MarketPredictions();
		 mp.start();

	}
	private void start(){
		List <String> li = new ArrayList<String>(10);
		//List <String> l1 = new ArrayList<String>(10);
		li.add("Tips:1"); li.add("Tips:2"); li.add("Tips:3"); li.add("Tips:4");li.add("Tips:5"); li.add("Tips:6"); li.add("Tips:7");
		li.add("Tips:8"); li.add("Tips:9"); li.add("Tips:10"); li.add("Tips:11");li.add("Tips:12"); li.add("Tips:13"); li.add("Tips:14");
		Random rm = new Random(li.size());
		int day = 20;
		System.out.println("TOTALDAY:"+day);
		for(int i=1;i<=day;i++){
			
			if(i<=(li.size()/2)){
				System.out.print("DAY:"+i+":"+li.get(s)+" ");
				//l1.add(li.get(s));
				s+=1;
				System.out.print("DAY:"+i+":"+li.get(s)+" ");
				//l1.add(li.get(s));
				s+=1;
				System.out.println(" ");
			} else {
				System.out.print("DAY:"+i+":"+li.get(rm.nextInt(li.size()))+" ");
				System.out.print("DAY:"+i+":"+li.get(rm.nextInt(li.size()))+" ");
				System.out.println();
				
			} 
		}
	
	}

}
