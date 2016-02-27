/*Create this subclass, and write the following methods:
a constructor which takes in a String representing the name of the Player. This constructor should set the health to either a 
specific value, like 20, or to a randomly chosen value from some range (say 20-25)
a method specialAttack(GameCharacter opponent), which simulates the Player making a special attack on the opponent. It should 
somehow be different than the attack(..) method in GameCharacter. For example, maybe it does 10 health points of damage, but only 
succeeds half the time the Player tries it. You can call this method something other that specialAttack if you prefer (i.e. castSpell, 
etc.)	 @author leonjoel
 */
package cuny.lehman.cmp326;
public class Wizard extends GameCharacter {
	
	public Wizard() {
		super.name = name;
		super.health = 20 + new java.util.Random().nextInt(6);
		super.isDefending = isDefending;
	}

	public Wizard(String name, int health, boolean isDefending) {
		super(name, health, isDefending);
		
	}
	
	public void specialAttack(GameCharacter opponent){
		if(this instanceof GameCharacter && (new java.util.Random().nextInt(20)) <= 10 && ((GameCharacter)opponent).isDefending == false){
			opponent.health -= 10;
			opponent.isDefending = true;
			//System.out.println(opponent.health);
		}
		else
			System.out.println("Health:"+opponent.health + "%");
	}
	
	@Override
	public String toString(){
		return "Players name: " + this.name + " Health: " + this.health +"-points.";
	}
	
	public static void test2(){
		Wizard wizardOne = new Wizard();
		Wizard wizardTwo = new Wizard();
		wizardOne.specialAttack(wizardTwo);
	}

	public static void main(String[] args) {
		test2();
	}

}
