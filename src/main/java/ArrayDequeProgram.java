package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeProgram {

	public static void main(String[] args) {
		//Creating Deque and adding elements  
		   Deque<String> deque = new ArrayDeque<String>();  
		   deque.add("sun");    
		   deque.add("moon");     
		   deque.add("midnight");
		   System.out.println(deque);  
		   deque.pollLast();  
		    System.out.println("After pollLast() Traversal..."+deque);  
		
	}

}
