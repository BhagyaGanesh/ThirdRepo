package collectionex;

import java.util.ArrayList;
import java.util.List;

public class GenericList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li=new ArrayList<String>();
		//add
		li.add("blue");
		li.add("Green");
		li.add("Red");
		li.add("yellow");
		System.out.println(li);
		li.add("Red");
		System.out.println(li);
		
		//set--to change element in a particular index
		li.set(1, "violet");
		System.out.println(li);
		
		//indexOf--to return index of element--first occurrence
		System.out.println(li.indexOf("Red"));
		
		//lastIndexOf--last occurrence
		System.out.println(li.lastIndexOf("Red"));
		
		//remove
		System.out.println(li.remove(4));
		System.out.println(li);
		
		//get---to get element in a particular index
		System.out.println(li.get(2));
		
		//contains--to check if there is a particular element
		System.out.println(li.contains("violet"));
		System.out.println(li.contains("purple"));
		
		//isempty-- to check the list is empty
		System.out.println(li.isEmpty());
		
		//size
		System.out.println(li.size());
		
		
		

	}

}
