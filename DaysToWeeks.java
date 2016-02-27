/*
 * Write a program that asks the user for the number of days, and then prints out how many weeks (and days) 
 * @author leonjoel
 */
package cuny.lehman.cmp326;
public class DaysToWeeks {

	public static void main(String[] args) {
		int numDays, weeks;
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter number of days: ");
		numDays = input.nextInt();
		weeks = numDays / 7;
		numDays %= 7;
		System.out.println("There are "+weeks+" weeks and "+numDays+" days");
		input.close();
	}

}
