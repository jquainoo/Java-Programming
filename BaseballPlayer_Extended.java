/*Equals method for BaseballPlayer
Add a (non-static) equals(..) method to your class BaseballPlayer from Problem Set 8. This method should take
 in a single BaseballPlayer instance as a parameter, and return true if the name and team are the same as in the calling instance.

Instead of your version, you can use the BaseballPlayer class I posted as the solution instead, but should say so in the comments.
 * @author leonjoel
 *
 */
package cuny.lehman.cmp326;
public class BaseballPlayer_Extended {
	private String name;
	private String team;
	private int numRuns;
	private int numOuts;
	
	
	public BaseballPlayer_Extended(String name, String team, int numRuns, int numOuts){
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
	
	@Override
	public boolean equals(BaseballPlayer_Extended player){
		return (player instanceof BaseballPlayer_Extended && ((BaseballPlayer_Extended)player).name.equalsIgnoreCase(this.name) && ((BaseballPlayer_Extended)player).team.equalsIgnoreCase(this.team));
	}

	public static void main(String[] args) {
		BaseballPlayer_Extended Barry = new BaseballPlayer_Extended("Barry Bonds", "NY Yankees", 300, 500);
		BaseballPlayer_Extended Chuck = new BaseballPlayer_Extended("Barry Bonds", "NY Yankees", 300, 500);
		System.out.println(Barry.toString());
		System.out.println(Barry.equals(Chuck));
	}

}
