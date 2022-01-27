package collections;

import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
		//creating hashset and adding elements
		HashSet set = new HashSet();
		set.add("kafka");
		set.add("server");
		
		set.add("zookeeper");
		set.add("producer");
		set.add("consumer");
		System.out.println("Elements"+set);
		//Removing specific element from Hashset
set.remove("zookeeper");
System.out.println("After removing elements "+set);
HashSet<String> set1=new HashSet<String>();  
set1.add("partition");  
set1.add("replication");  
set.addAll(set1);  
System.out.println("Updated List: "+set);  
//Removing all the new elements from HashSet  
set.removeAll(set1);  
System.out.println("After  removeAll() method: "+set);
//Removing all the elements available in the set  
set.clear();  
System.out.println("After invoking clear() method: "+set);  


	}

}
