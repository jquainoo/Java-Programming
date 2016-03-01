/*
This is a continuation of problem sets 9 and 13. You may either use your own TodoItem and TodoList classes, or the ones 
posted as solutions (or a combination of the two).

a) Make TodoItem implement the Comparable<TodoItem> interface. To do this, you will need to write the method compareTo,
 which should compare two TodoItems based on their due date (you can assume all items have the same year).

Test your compareTo method by calling it three times in the main() method.
*/

package cuny.lehman.cmp326;

public class TodoItemComparable extends TodoItem implements Comparable<TodoItem>{
	
	public TodoItemComparable(String item, int month, int day, boolean isDone){
		super(item, month, day, isDone);
	}

	@Override
	public int compareTo(TodoItem item) {
		if (item instanceof TodoItem && this.day == ((TodoItem)item).day && this.month == ((TodoItem)item).month)
			return 1;
		else
			return -1;
	}
	

	public static void main(String[] args) {
		TodoItemComparable item = new TodoItemComparable("Walk", 3, 4, true);
		TodoItemComparable item2 = new TodoItemComparable("Sing", 3, 4, false);
		System.out.println(item.compareTo(item2));


	}

}
