package org.tact;

import java.util.ArrayList;
public class App 
{
    public static void main( String[] args )
    {
    	int n1=5;
    	int n2=10;
    	int n3,i,count=23;    
    	 System.out.println("1-"+n1);
    	 System.out.println("2-"+n2);
    	 
    	for(i=2;i<count;++i)    
    	 {    
    	  n3=n1+n2;    
    	  System.out.println(i+1+"-"+n3);    
    	  n1=n2;    
    	  n2=n3;    
    	 }    
    	
    }
}
