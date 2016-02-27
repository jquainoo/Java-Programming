/*
 * Write a class TodoItem that represents an item in a to-do list. It should have the following private instance variables:
a String that holds a description of the item that needs to be done (ex. "walk dog")
an int that holds the month (converted to a number) that the item is due
an int that holds the day that the item is due
a boolean variable isDone that holds whether or not the item has been completed.
The class should also have the following private static class variables, both initialized to 0:

an int numItems that holds how many TodoItem instances have been made
an int numDone that holds how many TodoItem instances have been completed
Write the following methods for your class:

a constructor that takes in the description of the to-do item, the day it is due, and the month it is due (as an int). This 
constructor should initialize the boolean variable isDone to false. This constructor should also increment the class variable numItems.
a second constructor that only takes in the description of the to-do item. This constructor should initialize the boolean variable
 isDone to false. This constructor should also increment the class variable numItems.
a toString() method
getters and setters for the due day and month. The setters should only allow the due date to be set to a number between 1 
and 31, and the due month to be set to a number between 1 and 12. (You can ignore that fact that some months have less than 31 days.)
a non-static method that checks off an item as being done. Specifically, it should set the instance variable isDone to true, and 
increment the class variable numDone.
a static method that returns the percentage of to-do list items completed. (That is, it shoud return numDone/numItems as a double).
Test all of these methods (except the getters) by calling them at least three times in your main method.
 * @author leonjoel
 *
 */
package cuny.lehman.cmp326;
public class TodoItem {
	protected String item;
	protected int month;
	protected int day;
	private boolean isDone;
	protected static int numItems = 0;
	private static int numDone = 0;
	
	public TodoItem(){
		
	}
	
	public TodoItem(String item, int month, int day, boolean isDone){
		this.item = item;
		this.month = month;
		this.day = day;
		this.isDone = false;
		System.out.println(isDone);
		numItems++;
	}
	
	public TodoItem(String item){
		this.item = item;
		isDone = false;
		numItems++;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month >= 1 && month <= 12)
			this.month = month;
		else
			System.out.println("Month can not be less than 1 or greater than 12");
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if(day >= 1 && day <= 31)
			this.day = day;
		else
			System.out.println("Day can not be less than 1 or greater than 31");
	}
	
	public static int getNumDone() {
		return numDone;
	}

	public static void setNumDone(int numDone) {
		TodoItem.numDone = numDone;
	}

	public String checkItemOff(){
		String itemDone;
		if(!isDone){
			itemDone = item + " is done successfully";
			isDone = true;
			setNumDone(getNumDone() + 1);
		}
		else
			itemDone = item + " is not done";
		return itemDone;
	}
	
	public static double percentDone(){
		return ((getNumDone()/numItems) * 100);
	}
	
	public String getMonthInString(){
		switch(month){
			case 1:
				return "January"; 
			case 2:
				return "February"; 
			case 3:
				return "March"; 
			case 4:
				return "April"; 
			case 5:
				return "May"; 
			case 6:
				return "June";
			case 7:
				return "July";
			case 8:
				return "August";
			case 9:
				return "September";
			case 10:
				return "October";
			case 11:
				return "November";
			case 12:
				return "December";
			default:
				return "Error";
		}
	}
		
	@Override 
	public String toString(){
		if(getMonthInString() == "Error")
			return item;
		else
			return item +" on "+ getMonthInString() +" " + day + " number of items: "+ numItems + " number done: "+ getNumDone() +" "+ checkItemOff();
	}

	public static void main(String[] args) {
		TodoItem item = new TodoItem("Wash the dishes", 1, 19, false);
		System.out.println(item.toString());

	}

}
