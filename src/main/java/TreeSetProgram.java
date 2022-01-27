package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetProgram {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();  
	      ts.add("set");  
           ts.add("hashset");  
		  ts.add("linkedhashset");  
		  ts.add("treeset");  
		  
		  System.out.println(ts);
		  System.out.println("Highest Value: "+ts.pollFirst());  
	         System.out.println("Lowest Value: "+ts.pollLast());  
	         System.out.println("Initial Set: "+ts);  
	           
	         System.out.println("Reverse Set: "+ts.descendingSet());  
	           
	         System.out.println("Head Set: "+ts.headSet("C", true));  
	          
	         System.out.println("SubSet: "+ts.subSet("A", false, "E", true));  
	           
	         System.out.println("TailSet: "+ts.tailSet("C", false));  
		 
		  System.out.println("Traversing element through Iterator in descending order");  
	         Iterator i=ts.descendingIterator();  
	         while(i.hasNext())  
	         {  
	             System.out.println(i.next());  
	         }  
	           
	}

}
