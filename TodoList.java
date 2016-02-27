/*
 * Write a class TodoList that represents a to-do list. It will use the TodoItem class from previous homework. You can 
 * either use your version of this class, or download and use the version posted as a solution. The TodoList class should contain
 *  two instance variables:
an array of 100 TodoItem instances, that represents the to-do list.
an int numItems that holds the number of TodoItem instances that are actually in the array (the remaining slots will be unitialized 
or null). This variable should be initialized to 0, since the to-do list is empty.Since we must give an array a size when we initialize
 it, we (arbitrarily) set the size of the array representing the to-do list to be 100. That is, we can have up to 100 items in our to-do
 list. Many to-do lists have less than 100 items in them, so we have another variable that keeps track of exactly how many TodoItem 
 instances are in the array. We will assume that the first numItems elements of the array are TodoItem instances, and the remaining elements
  are null.
Write three methods for this class:
add: This method should take in a TodoItem as a parameter, and add it to the TodoItem array in the first empty slot. Instance variable 
numItems should be updated accordingly. If the array is already full of TodoItem instances, this method should print a message saying 
so, and do nothing.
delete: This method should take in an int, and return the TodoItem at that index in the TodoItem array. If there is no TodoItem 
instance at that index, this method should return null (what is currently in the array at that index, in this case). Addtionally, 
all TodoItem instances in the array at higher indices should be moved one position lower to delete this TodoItem from the array. Ex.
 If we delete the TodoItem instance at position 5, we would save it to be returned at the end of the method, and then move the TodoItem
  in position 6 into position 5, and then the TodoItem in position 7 into position 6, etc. Finally, update the instance variable numItems.
toString: This method should display the TodoItem instances in the array as a to-do list.
Test these methods by calling them each at least three times.
 * @author leonjoel
 */
package cuny.lehman.cmp326;
public class TodoList extends TodoItem {
	private TodoItem[] todoList = new TodoItem[100];
	private int numItems = 0;

	public TodoList() {
	}

	public TodoList(String item, int month, int day, boolean isDone) {
		super(item, month, day, isDone);
	}

	public TodoList(String item) {
		super(item);
	}

	public TodoItem[] getTodoList() {
		return todoList;
	}

	public int getNumItems() {
		return numItems;
	}

	public void setTodoList(TodoItem[] todoList) {
		this.todoList = todoList;
	}

	public void setNumItems(int numItems) {
		this.numItems = numItems;
	}
	
	public void add(TodoItem list){
		for(int i = 0; i < todoList.length; i++){
			if(todoList[i] == null){
				todoList[i] = list;
				numItems++;
				break;
			}
		}
	}
	
	public void delete(int index){
		index -= 1;
		if(todoList[index] != null){
			todoList[index] = null;
			System.out.println("Item at index "+ (index + 1 ) +" removed successfully.");
		}
		else
			System.out.println("The index "+ (index + 1 ) + " you are trying to remove is empty.");
		
		for(int i = index; i < todoList.length - 1; i++){
			todoList[i] = todoList[i+1];
			if(todoList[i+1] == null)
				break;
		}
	}
	
	@Override
	public String toString(){
		return item + " " + day + " "+ month + " " + numItems;
	}
	
	public static void main(String[] args){
		TodoList todo = new TodoList();
		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		System.out.print("how many items do you want to add: ");
		int num = keyboard.nextInt();
		String[] items = new String[num];
		for(int i = 0; i < num; i++){
			System.out.print("Enter item now: ");
			items[i] = keyboard.next();
			TodoItem todoItem = new TodoItem(items[i]);
			todo.add(todoItem);
		}
		System.out.println(java.util.Arrays.toString(todo.todoList));
		
		System.out.println("Enter the index of the item you want to remove: ");
		int index = keyboard.nextInt();
		todo.delete(index);
		//System.out.println(java.util.Arrays.toString(todo.todoList));
		keyboard.close();
	}

}
