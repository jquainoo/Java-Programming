/*
 * Calculating tips: write a program that reads an amount and prints the tip (15%) and the total amount 
 * after adding the tip to the original bill. If the amount is under $30, the tip is fixed to $5.
 * @author leonjoel
 */
package cuny.lehman.cmp326;
public class TipCalculator {

	public static void main(String[] args) {
		System.out.println("This program calculates a tip in a restaurant");
		double total = 0, subtotal, tip;
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter subtotal: ");
		subtotal = input.nextDouble();
		
		if(subtotal < 30)
			tip = 5;
		else
			tip = 0.15 * subtotal;
		
		total = subtotal + tip;
		System.out.println("The gratuity is $"+tip +" and the total is $"+total);
		input.close();
	}

}
