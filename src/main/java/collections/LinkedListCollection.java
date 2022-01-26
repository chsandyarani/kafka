package collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollection {


	public static void main(String[] args) {
		
		 LinkedList linkedList=new LinkedList();
		 //dding objects to the linked list
	        linkedList.add(0);
	        linkedList.add(1);
	        linkedList.add(2);
	        linkedList.add("family");
	        linkedList.add("kmc");
	        //printing
	        System.out.println(linkedList);
	        //adding object with index value
	        linkedList.add(5,"hyderabad");
	        System.out.println(linkedList);
	        //printing size of an linkedkist
	        System.out.println(linkedList.size());
              //removing 
	        System.out.println(linkedList.remove(5));
	        System.out.println(linkedList);

	      
	        System.out.println(linkedList.remove("collection"));
	        System.out.println(linkedList);
            //seting object for the exsiting object value
	        System.out.println(linkedList.set(3,"java"));
	        
	        System.out.println(linkedList);
	        System.out.println(linkedList.contains("collection"));
	        System.out.println(linkedList.isEmpty());
             //iterating 87 
	        Iterator iterator=linkedList.iterator();
	        System.out.println(iterator.next());
	        System.out.println(iterator.hasNext());

	        linkedList.clear();

	      

	    }



}

