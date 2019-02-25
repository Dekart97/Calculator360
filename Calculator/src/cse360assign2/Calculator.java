/* CSE 360 Assignment 2
 * Name: Dekart Kosa
 * Class ID: 445
 */

package cse360assign2;
public class Calculator {

	private int total;
	private String addString;
	private String subString;
	private String multString;
	private String divString;
	private String printString;
	private String historyString = "0";
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return 0;
	}
	
	// This method takes the parameter and adds it to the total
	public void add (int value) {
		total = total + value;
		addString = " + " + value;
		historyString = historyString + addString;
	}
	
	// This method takes the parameter and subtracts it from the total
	public void subtract (int value) {
		total = total - value;
		subString = " - " + value;
		historyString = historyString + subString;
	}
	
	// This method takes the parameter and multiplies it by total
	public void multiply (int value) {
		total = value*total;
		multString = " * " + value;
		historyString = historyString + multString;
	}
	
	// This method takes the total and divides by the parameter
	public void divide (int value) {
		if (value != 0){
            total = total/value;
            divString = " / " + value;
            historyString = historyString + divString; 
		}else{
		    total = 0;
		}
	}
	
	// This method gets the history of the calculator
	public String getHistory () {
		System.out.println(historyString);
		return historyString;
	}

}