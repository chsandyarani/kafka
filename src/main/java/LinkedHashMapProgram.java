package collections;

import java.util.LinkedHashMap;

public class LinkedHashMapProgram {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();  
		  
		 lhm.put(0,"movie");  
		 lhm.put(1,"story");  
		 lhm.put(2,"direction");  
		 //Fetching key  
	       System.out.println("Keys: "+lhm.keySet());  
	       //Fetching value  
	       System.out.println("Values: "+lhm.values());  
	       //Fetching key-value pair  
	       System.out.println("Key-Value pairs: "+lhm.entrySet());  
	       lhm.remove(1);  
	       System.out.println("After  remove() method: "+lhm);    
		 
		 System.out.println(lhm);
		
	}

}
