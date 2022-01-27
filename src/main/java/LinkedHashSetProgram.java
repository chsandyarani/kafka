package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetProgram {

	public static void main(String[] args) {
		 LinkedHashSet  set=new LinkedHashSet();  
         set.add(1);    
         set.add("avro");    
         set.add(2);   
         set.add("bravo");  
         //aadding duplicate values
         set.add("echo");
         set.add("echo");  
         System.out.println(set);  
	}

}
