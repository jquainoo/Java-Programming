/*
 * Write a guessing game program that asks the user to guess a secret number. If the guess is
 *  too high or too low, the program should display a message saying so and ask the user to guess 
 *  again. If the user guesses correctly, your program should congratulate them and end.
 * @author leonjoel
 *Extra challenge: Instead of always having the program exit when the user guesses the number,
 * ask the user if they want to play again (and let them do so, if they say yes).
 */
package cuny.lehman.cmp326;
public class GuessingGame {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int guess, guessNumber; String response; 
		int wins = 0, countGuess = 0;
		guessNumber = 1 + new java.util.Random().nextInt(10);
		do{
			System.out.print("Enter a number:");
			guess = scan.nextInt();
			countGuess++;
			if(guess < guessNumber)
				System.out.println("You guessed too low try again");
			else if(guess > guessNumber)
				System.out.println("You guessed too high try again");
			else{
				System.out.println("Congratulations! You guessed right");
				wins++;
				System.out.print("Would like to play again: ");
				response = scan.next();
				if(response.charAt(0) == 'Y' || response.charAt(0) == 'y'){
					guessNumber = 1 + new java.util.Random().nextInt(10); //Switches the secret number
					guess = 2000;
				}
				else
					System.out.println("You won "+wins +" out of "+ countGuess +" guesses");
			}
		}
		while(guess != guessNumber);
			
		scan.close();

	}

}
