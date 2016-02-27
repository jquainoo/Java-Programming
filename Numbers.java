/*
 * Write a program that displays the numbers from 1 to n in a grid of a certain size. You should ask the user for n,
 *  as well as the number of columns for the grid. For example, if the user tells you n=15, columns = 3, your program
 *   should display something like 1 2 3
 *   							   4 5 6
 *   							   7 8 9
If the user tells you n = 10, columns = 3, your program should display something like 1 2 3
																					  4 5 6
																					  7 8 9
 * @author leonjoel

 */
package cuny.lehman.cmp326;
public class Numbers {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		double numberOfCol, number;
		System.out.print("Enter number of columns, number to display: ");
		numberOfCol = scan.nextDouble();
		number = scan.nextDouble();
		int count = 0;
		int n = (int)numberOfCol;
		int j = (int)number;
		for(int i = 1; i <= j; i++){
			count++;
			if(count == n || count == 2 * n || count == 3 * n || count == 4 * n || count == 5 * n|| count == 6 * n || count == 7 * n){
				System.out.print(i + " ");
				System.out.println();
			}
			else
				System.out.print(i+" ");
		}
		scan.close();

	}

}
