package cuny.lehman.cmp326;
/*
 * Write a program that converts a recipe measurement in teaspoons (tsp.) 
 * and tablespoons (tbsp.) into milliliters (mL). Your code shoud ask the
 *  user for the number of teaspoons and tablespoons, and then print the 
 *  total number of millilters in both. 1 tsp. = 4.9289 mL and 1 tbsp. = 14.7868 mL
 * @author leonjoel
 *
 */
public class BakingConverter {

	public static void main(String[] args) {
		double tableSpn, teaSpn;
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter number of table spoon and tea spoon: ");
		tableSpn = input.nextDouble();
		teaSpn = input.nextDouble();
		System.out.printf("There is %.3fmL.", ((tableSpn * 14.7868)+ (teaSpn * 4.9289)));
		input.close();

	}

}
