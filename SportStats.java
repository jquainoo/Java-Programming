/*
 * Write a program that asks the user whether a team won or lost each of 10 games of some sport.
 *  The program then displays the number of games won, the number of games lost, the percentage of 
 *  games won, and the percentage of games lost.
 * @author leonjoel
 *
 */
package cuny.lehman.cmp326;
public class SportStats {
	
	public static void main(String[] args){
		String winOrLoss; int countWin = 0, countLoss = 0;
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter win or loss: ");
		int i = 1;
		while(i <= 10){
			System.out.print("Game "+ i+":");
			winOrLoss = input.nextLine();
			if(winOrLoss.charAt(0) == 'W' || winOrLoss.charAt(0) == 'w')
				countWin++;
			else if(winOrLoss.charAt(0) == 'l' || winOrLoss.charAt(0) == 'L')
				countLoss++;
			else
				continue;
			i++;
		}
		double percentWin = (countWin * 0.10) * 100;
		double percentLoss = (countLoss * 0.10) * 100;
		System.out.println("Number of wins: "+countWin +"\nNumber of losses: "+ countLoss);
		System.out.printf("Percentage of games won: %.2f \nPercentage of games lost: %.2f", percentWin, percentLoss);
		input.close();
		
	}
}
