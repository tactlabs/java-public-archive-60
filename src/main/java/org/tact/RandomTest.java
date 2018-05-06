package org.tact;

import java.util.Random;

public class RandomTest {
public static void main(String[] args){
		String val = " ";
		
		String emailid = "msparthiruth@gmail.com";
		String array[] = emailid.split("@");
		int i=0;
	    for (String temp: array){
			 array[i] = temp;
	        // System.out.println(temp);
	         i++;
	    }
	    
	    String original = array[0];
	    val += original.replace(" ","-");
		 //System.out.println(array[0]);
	    //String array1[] = array[0].split(" ");
	    //for(int j=0;j<array[0].length-1;j++){
	    //	if(array[0].replace('-', '')
	    	
	    	//}
	   // }
		//val += original;
	    val+= "-";
		
	     
	    // char (1), random a-z
	    int ranChar = 97 + (new Random()).nextInt(122-97);
	    char ch = (char)ranChar;        
	    val += ch;      
	   // System.out.println(val);
	
	    // numbers (6), random 0-9
	    Random r = new Random();
	    int numbers = 1000000 + (int)(r.nextFloat() * 8999000);
	    val += String.valueOf(numbers);
	    //System.out.println(val);
	
	    //val += "-";
	    // char or numbers (5), random 0-9 A-Z
	   /* for(int i = 0; i<6;){
	        int ranAny = 48 + (new Random()).nextInt(90-65);

        if(!(57 < ranAny && ranAny<= 65)){
        char c = (char)ranAny;      
        val += c;
        i++;
        }

    }*/
	    System.out.println(val);
}
}
