/*
 * For this problem set, you will write a class GameCharacter that represents a character, either good or bad, in a video
 *  game. You will then use this class to write a simple game in which the player fights a monster. Both the player and the
 *   monster will be represented as instances of GameCharacter.

Create a class GameCharacter that contains 3 private instances variables:

name, a String holding the name of the character
health, an int holding a number representing how healthy the character is
isDefending, a boolean variable representing whether or not the character is in a defensive position
Write the following methods for your class:

a constructor that takes in the name and health of the character
a non-static method attack that has the header public void attack(GameCharacter opponent). This method simulates
 an attack by this instance of GameCharacter on the opponent instance that was passed in as a parameter. If isDefending
  is true for opponent, then this method should print a message that they successfully defended against the attack. If 
  isDefending is false for opponent, then this method should print a message that the attack was successful, and decrease
   health of opponent by 2. Finally set isDefending to false for this instance (since they are no longer defending, but attacking).
a non-static method defend that sets the instance variable isDefending to true
a toString() method that displays the name and health of the character
Write a static method test() in GameCharacter that calls each of the above methods at least three times to test them. Call test()
 at the beginning of the main() method to test your code. Make sure that your code is working before continuing.

Once your code in GameCharacter is working, comment out the call to test().

In the main() method of GameCharacter, write a program in which the user's character fights a monster. The code should start by 
asking the player for the name of his/her character, saying that the monster is attacking, and then at each turn, ask the user if 
they are attacking or defending. The monster always attacks. The fight should continue until either the player or the monster is 
unconscious/dead (has health <=0). Both the player and monster should be represented in the code as instances of GameCharacter.

Here are more specific instructions:

ask the user for the name of their player
make two GameCharacter instances, one for the player (using their name) and one for a monster. You can set the player's health to 
20 and the monster's to 15 (or whatever values you want)
write a while loop, that loops until either the monster or player is unconscious/dead, which corresponds to health <=0
in the while loop, ask the user whether they want to have their player attack or defend against the monster. Then call the 
corresponding method to simulate this
in the while loop, after the player has made their move, have the monster attack the player, by calling the appropriate method.
after the while loop is finish, print out who has won.
Extra challenge: Make this game more interesting by using random numbers (http://docs.oracle.com/javase/8/docs/api/java/util/Random.html) 
for the initial health of the characters, and for the damage done during attacks.
 * @author leonjoel
 *
 */
package cuny.lehman.cmp326;
public class GameCharacter {
	protected String name;
	protected int health;
	protected boolean isDefending;
	
	public GameCharacter(){
		
	}

	public GameCharacter(String name, int health, boolean isDefending){
		this.name = name;
		this.health = health;
		this.isDefending = isDefending;
		
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public void attack(GameCharacter opponent){
		if(opponent instanceof GameCharacter && ((GameCharacter)opponent).isDefending == false){
			System.out.println(opponent.name + " was attacked by " + this.name);
			opponent.health -= 2;
			opponent.isDefending = true;
		}
		else
			System.out.println(opponent.name + " successfully defended the attack from "+ this.name);
	}
	
	public boolean defend(){
		return (isDefending = false);
	}
	
	public String toString(){
		return "Character: "+ name + " Health: "+ health + "%";
	}
	
	public static void test(){
		GameCharacter villain = new GameCharacter("Orach", 20, true);
		GameCharacter monster = new GameCharacter("Mortal", 15, false);
		villain.attack(monster);
		monster.attack(villain);
		villain.toString();
		monster.toString();
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		java.util.Random rand = new java.util.Random();
		System.out.print("Enter your characters name: ");
		String character = input.nextLine();
		String response;
		GameCharacter playerOne = new GameCharacter(character, (int)rand.nextInt(500), true);
		GameCharacter monsterPlayer = new GameCharacter("Monster", (int)rand.nextInt(500), false);
		while(playerOne.health != 0 || monsterPlayer.health != 0){
			System.out.print("What do you wanna do: Attack or Defend: ");
			response = input.nextLine();
			if(response.charAt(0) == 'a' || response.charAt(0) == 'A')
				playerOne.attack(monsterPlayer);
			else
				monsterPlayer.attack(playerOne);
		}
		if(playerOne.health < monsterPlayer.health)
			System.out.println(monsterPlayer.name + " won the game with " + monsterPlayer );
		else
			System.out.println(playerOne.name + " won the game");
		input.close();
	}

}
