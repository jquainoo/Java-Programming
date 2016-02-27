/*
 * Write a program that asks the user for the required type of word to fill in four blanks 
 * in a sentence or two. The program should then display the filled in sentence(s) to the user.
 *  You may use the example sentence below, or make up your own.
 * @author leonjoel
 *
 */
package cuny.lehman.cmp326;
public class MadLIbs {

	public static void main(String[] args) {
		String s1, s2;
		System.out.print("Enter two strings (adjectives): ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		s1 = input.next();
		s2 = input.next();
		
		System.out.println("It was a "+ s2 +" and "+ s1 +" but I still managed to "
				+ "make it to the house of my aunt to watch the Santa Claus parade.");
		input.close();

	}

}
