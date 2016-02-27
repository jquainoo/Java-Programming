package cuny.lehman.cmp326;

/*Write a class BaseballPlayer that represents a baseball player. It should contain 4 private instances variables:
name, a String holding the name of the player
team, a String holding the team the player plays on
numRuns, a variable of type int that represents the total number of runs scored by the player
numOuts, a variable of type int that represents the total number of times the player has been out
Write the following methods for your class:

a constructor that takes in the name of the player and his/her team
getters and setters for numRuns and numOuts. The setters should only allow these variables to be set to positive numbers,
and should instead print an error message for any negative numbers (You can decide how to handle 0.) a method that computes and 
returns the player's batting average, which is the total number of runs scored divided by the total number of outs

a toString() method that displays the name of the player, their team, and their batting average (call your method)
Test all of these methods in your main class by calling them.
 * @author leonjoel
 *
 */
public class BaseballPlayer{
	private String name;
	private String team;
	private int numRuns;
	private int numOuts;
	
	
	public BaseballPlayer(String name, String team, int numRuns, int numOuts){
		this.name = name;
		this.team = team;
		this.numRuns = numRuns;
		this.numOuts = numOuts;
	}

	public int getNumRuns() {
		return numRuns;
	}

	public void setNumRuns(int numRuns) {
		if(numRuns > 0)
			this.numRuns = numRuns;
		else
			System.out.println("You cannot set negative values");
	}

	public int getNumOuts() {
		return numOuts;
	}

	public  void setNumOuts(int numOuts) {
		if(numOuts > 0)
			this.numOuts = numOuts;
		else
			System.out.println("You cannot set negative values");
	}
	
	public double battingAverage(){
		return ((double)numRuns / (double)numOuts);
	}
	
	@Override
	public String toString(){
		return "Player's name: "+ name + "\nTeam: "+team + "\nBatting Average: "+ this.battingAverage();
	}

	public static void main(String[] args) {
		BaseballPlayer Barry = new BaseballPlayer("Barry Bonds", "NY Yankees", 300, 500);
		BaseballPlayer Chuck = new BaseballPlayer("Barry Bonds", "NY Yankees", 300, 500);
		System.out.println(Barry.toString());
		System.out.println(Barry.equals(Chuck));
	}

}
