package org.tact;

import java.util.ArrayList;
class a{
	void show(){
	System.out.println("class object a");
	String s = "1b2n3m4j";
	String b = " ";
	for(int i=0;i< s.length()-1;i++){
		if(s.charAt(i)>=48 && s.charAt(i)<= 57){
			b += s.charAt(i);
		}
	}
	System.out.println(b);
	}
}
public class App 
{
    public static void main( String[] args )
    {
    	a s; // aggrecation
    	 s= new a();
    	s.show(); //agrrecation
    	
    }
}
