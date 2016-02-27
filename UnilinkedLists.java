package cuny.lehman.cmp326;
import java.util.NoSuchElementException;

public class UnilinkedLists<E> {
    private Node<E> head;
    private int track = 0;
    private Node<E> temp;
    
    public String toString(){
	   if (head == null) {
		   return " ";
	   }
	   else {
		    Node<E> cursor = head;
		    String string = cursor.data.toString();
		    cursor = cursor.next;
		    while (cursor != null) {
		      string += "--->" + cursor.data.toString();
		      cursor = cursor.next;
		    }
		    return string;  
	   }   
    }
    
     public boolean equals(UnilinkedLists<E> list){
	 if (this.size() != list.size())
		 return false;
	 Node<E> cursor = head;
	 for (int i = 0; i < size(); i++) {
		 if (list.indexOf(cursor.data) != this.indexOf(cursor.data))
			 return false;
		 cursor = cursor.next;
	 }
	 return true;
  	}
   
	public boolean isEmpty() {
		return head == null;
	}
 
	public void clear(){
		head = null;
	}

	public int size(){
		Node<E> cursor = head;
		int i = 1;
		while (cursor.next != null) {
			cursor = cursor.next;
			 i++;
		}
		return i;
	}
	
	public int indexOf(E element){
		Node<E> cursor = head;
		int index = 0;
		while (cursor != null){
			if (cursor.data.equals(element))
		      return index;  
		  index++;
		  cursor = cursor.next;
		}
	 return -1;
	}

	public boolean contains(E element){
	   return indexOf(element) == 1;
	}

	public void add(E element){
	    if(head == null) 
	    	head = new Node<E>(element,null);
	    
	    else{ 
	       Node<E> cursor = head;
		   while(cursor.next != null){
			 cursor = cursor.next;
		     }
		   cursor.next = new Node<E>(element,null);
		  track++; 
	    }

	  }

	public void addAfter(E mark,E elementToAdd){
	 int n=this.indexOf(mark);
	 if(n == -1)
		 throw new NoSuchElementException();
	 else 
	     {
		  Node<E> cursor = head;
		  for(int i = 1;i < n; i++){
		  cursor = cursor.next;
	     }
		  cursor.next = new Node<E>(elementToAdd,cursor.next);
		  track++;
	   }
	}
	
	public E getNextData(){
		E getData = null; //Just initializing variable.could be anything
		if(temp == null){
			 temp = head;
		  }
		if(temp != null){ 
		   getData = temp.data;
		   temp = temp.next;}
		track++;
		if(track > size()){
			track = 0;
			throw new IndexOutOfBoundsException();}
		return getData;
	}
	
	public void addFirst(E element){
       head = new Node<E>(element,head);
	}

	public E head(){
    	return head.data;
    }
   
	public boolean remove(E element){
    	int  i = 1, n = indexOf(element);
    	Node<E> cursor = head;
    	if(n ==- 1)
    		return false;
    	if(head.data == element)
    		head = head.next;
    	else{
    		while(i < n){
             cursor = cursor.next;
    		 i++;
        }
    	  cursor.next = cursor.next.next;
    	  track--;
    	}
    	return true;
    }

	public boolean removeAll(E element){
       	if(indexOf(element) ==- 1)
       		return false;
		int n = size();
		for(int i = 0; i < n; i++){
			remove(element);
		}
       	return true;
    }
	
    public void deduplicate(){
    	for(int i = 0; i < 2; i++){
    	Node<E> starter = head;
        Node<E> mover = head;
    	while(mover != null){
    		starter = mover;
            while(starter != null && starter.next != null){
            	if(mover.data.equals(starter.next.data))
            	 starter.next = starter.next.next;
            	starter = starter.next;
            	
            }
            mover = mover.next;
    	} 
        }
    }
    
    private static class Node<E>{
	      
    	 private Node<E> next;
    	 private E data;
     
    	 Node(E element, Node<E> next){
    		 this.data = element;
    		 this.next = next;
    	 }
    	 public int hashCode(){
    			int result = data != null ? data.hashCode() : 0;
    			return 31 * result + (next != null ? next.hashCode() : 0);
    		}
	  }
      

     public static class Cursor<E>{
    	 private Cursor<E> position;
    	 
    	 private Cursor(){
    	 	 
    	 }
    	 
    	 public boolean hasNext(){
			return false;
    		 
    	 }
    	 
    	 public E next(){
			return null;
    		 
    	 }

		public Cursor<E> getPosition() {
			return position;
		}

		public void setPosition(Cursor<E> position) {
			this.position = position;
		}
     }        
    	
 }
     
	 
     
    

