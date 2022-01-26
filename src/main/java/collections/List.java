package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class List {

	public static void main(String[] args) {
		//creating arraylist
	ArrayList list = new ArrayList();
	//adding objects in arraylist
	list.add(1);
	list.add("garndparents");
	list.add(2);
	list.add("parents");
	list.add(3);
	list.add("childrens");
	
	//l.contains();
	//removing values from the list
	list.remove(0);
	//printing the arralist obejct
	System.out.println("returing element:"+list.get(1));
	//changing elements
	list.set(0, "familytree");
	System.out.println("sorting numbers..");
	ArrayList<Integer>list1=new ArrayList<Integer>();
	list1.add(19);
	list1.add(0);
	list1.add(22);
	list1.add(17);
	Collections.sort(list1);
	
		//iterator 
	Iterator itr = list1.iterator();
	//check if iterator has the elements
	while(itr.hasNext())
	{
		System.out.println(itr.next());//printing the elements add move to next 
	}
	

	}

}
