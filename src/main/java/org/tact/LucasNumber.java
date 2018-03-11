package org.tact;

public class LucasNumber {
	
	public static int lucas(int n)
    { 
     if (n == 0) 
        return 2;
     if (n == 1) 
        return 1;
     
    return lucas(n - 1) + lucas(n - 2); 
    }
     
	public static void main(String[] args) {
		int n = 9;
	    System.out.println(lucas(n));

	}

}
