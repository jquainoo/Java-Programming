/*
 * Change maker: extend the change maker program from lecture 2 to return change greater than $1.
 * @author leonjoel
 */
package cuny.lehman.cmp326;
public class ChangeMaker {
	public static void main(String[] args) {
		System.out.println("This is a change maker/calculator");
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter the amount: ");
		double amount = input.nextDouble();
		int fifties = (int) (amount / 50);
		amount %= 50;
		int twenties = (int) (amount / 20);
		amount %= 20;
		int tens = (int)(amount / 10);
		amount /= 10;
		int fives = (int)(amount / 5);
		amount %= 5;
		int ones = (int)amount;

		System.out.println("There are " + fifties +" fifties " + twenties +"  twenties " + tens +" tens "
				+ fives + " fives "+ ones + " ones");
		
		input.close();
	}

}
