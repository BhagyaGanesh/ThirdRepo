package collectionex;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericEx {

	public static void main(String[] args) {
		
       ArrayList a=new ArrayList();
		
		a.add("Black");
		a.add("Yellow");
		a.add("blue");
		a.add("Green");
		System.out.println(a);
		
		ArrayList col=new ArrayList();
		
		col.add("100");
		col.add("200");
		col.add("300");
		col.add("400");
		System.out.println(col);
		
		
		//addAll--add one list to another list 
		System.out.println(a.addAll(col));
		System.out.println(a);
		
		System.out.println(a.contains("blue"));
		
		//containsAll--check if a collection contains all the elements of another collection
		System.out.println(a.containsAll(col));
		
		/*Iterator:Loops through the collection as long as there's another element (hasNext()).
		Prints each element using next()*/

		Iterator itr=col.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		

	}
		
		itr.remove();
		System.out.println(col);
		
	}

}
