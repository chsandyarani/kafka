package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) {
		  HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,"amma");  //Put elements in Map  
		   map.put(2,"dady");    
		   map.put(3,"childern");   
		   map.put(4,"brothers");  
		   map.put(1,"parents"); //trying duplicate key
		   
		   System.out.println("Initial list of elements: "+map);  
		    //key-based removal  
		    map.remove(1);  
		    System.out.println("Updated list of elements: "+map);  
		    //value-based removal  
		    map.remove(2);  
		    System.out.println("Updated list of elements: "+map);  
		    //key-value pair based removal  
		    map.remove(3, "children");  
		    System.out.println("Updated list of elements: "+map);  
		   }      
		       
		/*   System.out.println("Iterating Hashmap...");  
		   for(Entry<Integer, String> m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		   map.putIfAbsent(5, "amma");  
		      System.out.println("After invoking putIfAbsent() method ");  
		      for(Entry<Integer, String> m:map.entrySet()){    
		           System.out.println(m.getKey()+" "+m.getValue());    
		          }  
		      
		      HashMap<Integer,String> map1=new HashMap<Integer,String>();  
		      map.put(6,"sister");  
		      map.putAll(map);  
		      System.out.println("After invoking putAll() method ");  
		      for(Entry<Integer, String> m:map1.entrySet()){    
		           System.out.println(m.getKey()+" "+m.getValue());    
		          }  
		      
		      
	}*/

}
