package collections;

import java.util.TreeMap;

public class TreeMapProgram {

	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(0,"lappy");    
	      map.put(1,"mouse");    
	      map.put(2,"keyboard");    
	      map.put(3,"ear buds");    
	      System.out.println(map);
	      //removing
	      map.remove(3);      
	      System.out.println("After  remove() method"+map);  
	      //Maintains descending order  
	      System.out.println("descendingMap: "+map.descendingMap());  
	      //Returns key-value pairs whose keys are less than or equal to the specified key.  
	      System.out.println("headMap: "+map.headMap(2,true));  
	      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
	      System.out.println("tailMap: "+map.tailMap(2,true));  
	      //Returns key-value pairs exists in between the specified key.  
	      System.out.println("subMap: "+map.subMap(0, false, 2, true));   

	}

}
