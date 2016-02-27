/*
 * Write a class Person that contains 3 instances variables:
 * name, a String holding the name of the person
mother, a variable of type Person that represents the person's mother
father, a variable of type Person that represents the person's father
Write the following methods for your class:
a constructor that takes in the name of the person
a toString() method that displays the name of the person, and the names of their mother and father, if available
a method that prints out the person's mother, father, and grandparents (if known)
Test these methods in your main class by calling them at least three times.

Hint: if you haven't initialized the mother and father instance variables, then they will have the value null. So you 
could test if the mother of Person bart is known (that is, initialized), by testing if (bart.mother != null) { //then 
the mother variable has been initialized, and can be access as bart.mother }
 * @author leonjoel
 *
 */
package cuny.lehman.cmp326;
public class Person {
	private static String name;
	private static Person mother;
	private static Person father;
	
	public Person(){
		
	}

	public Person(String name){
		Person.name = name;
		
	}
	public static void printMothersName(){
		System.out.println("Mother's name is "+ Person.mother);
	}
	
	public static void printFathersName(){
		System.out.println("Father's name is "+ Person.father);
	}

	public String toString(){
		return "Name is "+ name;
	}
	
	public static void main(String[] args) {
		Person person = new Person("Kiddie");
		System.out.println(person.toString());
		if(Person.mother != null || Person.father != null){
			System.out.println(Person.mother);
			System.out.println(Person.father);
		}
		else
			System.out.println("Name of mother and father not initialized");
		
	}

}
