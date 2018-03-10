package org.tact;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MarketPredictions {
	int s = 0;
	public static void main(String[] args) {
		 MarketPredictions mp = new  MarketPredictions();
		 mp.start();

	}
	private void start(){
		List <String> li = new ArrayList<String>(10);
		List <String> l1 = new ArrayList<String>(10);
		li.add("h1"); li.add("h2"); li.add("h3"); li.add("h4");li.add("h5"); li.add("h6"); li.add("h7");
		li.add("h8"); li.add("h9"); li.add("h10"); li.add("h11");li.add("h12"); li.add("h13"); li.add("h14");
		Random rm = new Random(li.size());
		for(int i=0;i<14;i++){
			s+= i;
			if(i<li.size()){
			System.out.print(li.get(s)+" ");
			l1.add(li.get(i));
			System.out.print(li.get(s+1)+" ");
			l1.add(li.get(i+1));
			s+=1;
			System.out.println(" ");
			}else {
				System.out.println(li.get(rm.nextInt(l1.size())));
			}
		}
	
	}

}
