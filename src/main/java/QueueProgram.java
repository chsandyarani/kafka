package collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueProgram {

	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("java");  
		queue.add("python");  
		queue.add("c");  
		queue.add("c++");  
		queue.add("testing");  
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("iterating the queue elements:");  
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		queue.remove();  
		queue.poll();  
		System.out.println("after removing two elements:"+queue);  
	}

}
