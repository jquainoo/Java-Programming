package cuny.lehman.cmp326;

/*
 * Consider the class Athlete, which is available here. Add a static method to the class which takes an array of Athletes
 *  as its argument, and returns the total number of medals won by all athletes stored in the array. Change the package of
 *   Athlete.java if needed. Test your method by calling it in the main(..) method with at least three different input arrays.
 * @author leonjoel
 */
public class Athlete {
	private String name;	// the name of the athlete
	private String sport;	// the sport the athlete does
	private int numMedals;	// the number of medals that the athlete has won
	
	public Athlete(String name, String sport, int numMedals) {
		this.name = name;
		this.sport = sport;
		this.numMedals = numMedals;
	}
	public Athlete(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSport() {
		return sport;
	}
	
	public void setSport(String sport) {
		this.sport = sport;
	}

	public int getNumMedals() {
		return numMedals;
	}

	public void setNumMedals(int numMedals) {
		this.numMedals = numMedals;
	}
	
	public static int totalMedalsWon(Athlete[] athletes){
		int totalMedals = 0;
		for(int i = 0; i < athletes.length; i++){
			totalMedals += athletes[i].numMedals;
		}
		return totalMedals;
	}
	
	public String toString() {
		return name + " does " + sport + " and has won " + numMedals + " medal(s).";
	}
	
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter number of athlete: ");
		int num = input.nextInt();
		Athlete[] athletes = new Athlete[num];
		String[] names = new String[num];
		String[] sports = new String[num]; 
		int[] medals = new int[num];
		for(int i = 0; i < athletes.length; i++){
			System.out.println("Enter athlete name: ");
			names[i] = input.next();
			System.out.print("Enter name of sports: ");
			sports[i] = input.next();
			System.out.println("Enter number of medals won: ");
			medals[i] = input.nextInt();
			athletes[i] = new Athlete(names[i], sports[i], medals[i]);
		}
		System.out.println("Total number of medals = " + totalMedalsWon(athletes));
		input.close();
	}

}
