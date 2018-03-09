package org.tact;

public class PControl {

	public static void main(String[] args) {
		PControl pc = new PControl();
		pc.tactStackoverFlowScore();
	}
	
	static int counter = 0;
	
	public void tactStackoverFlowScore(){
		counter++;
		System.out.println(counter);
		
		tactStackoverFlowScore();
	}
}
