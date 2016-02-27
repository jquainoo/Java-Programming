/*For this subclass, write the following methods:
a (default) constructor which does not take in any parameters. It should set the name and health of the monster to something 
appropriate. (Again, you can randomly chose the health value from some range).
a method attack(GameCharacter opponent), which overrides the attack method in GameCharacter. You should make this method different
 from the default attack method in GameCharacter. For example, maybe the monster does 5 health points of damage, or maybe the monster
  succeeds with the attack 25% of the time when the Player is defending.
a method specialAttack(GameCharacter opponent) (or other appropriate name), which simulates the Monster making a special attack on
 its opponent. It should be different than the attack method you just defined.
Again, test these methods by calling them at least three times in the method test2.
 * @author leonjoel
 */
package cuny.lehman.cmp326;
public class Monster extends GameCharacter {

	public Monster() {
		super.name = "Tasmanian Devil";
		super.health = new java.util.Random().nextInt(25);
		super.isDefending = isDefending;
	}

	public Monster(String name, int health, boolean isDefending) {
		super(name, health, isDefending);
	}
	
	@Override
	public void attack(GameCharacter opponent){
		if(opponent instanceof GameCharacter && ((GameCharacter)opponent).isDefending == true && new java.util.Random().nextInt(20) <= 5){
			opponent.health -= 5;
			if(opponent.health < 0)
				opponent.health = 0;
		}
		else{
			opponent.health -= 7;
			if(opponent.health < 0)
				opponent.health = 0;
		}
	}
	
	public void specialAttack(GameCharacter opponent){
		if(opponent instanceof GameCharacter && ((GameCharacter)opponent).health >= 20)
			opponent.isDefending = false;
	}
	
	
	public static void test3(){
		Monster monsterOne = new Monster();
		Monster monsterTwo = new Monster();
		monsterOne.attack(monsterTwo);
	}
	
	public static void main(String[] args){
		test3();
	}
}
