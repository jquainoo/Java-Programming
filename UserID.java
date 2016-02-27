/*
 * Write a program that asks the user to enter their first and last name, separated by a space. 
 * This program then outputs a user ID, which is the first two letter of their first name, followed
 *  by the first four letters of their last name, followed by the number of characters in their full 
 *  first and last name (but not counting the space). All letters in the user ID should be lower case.
 * @author leonjoel
 *
 */
package cuny.lehman.cmp326;
public class UserID {

	public static void main(String[] args) {
		String firstName, lastName;
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter first name followed by last name: ");
		firstName = input.next();
		lastName = input.next();
		System.out.println(firstName.substring(0,2).toLowerCase() + lastName.substring(0,5).toLowerCase() +
				(firstName.length()+lastName.length()));
		input.close();
	}

}
