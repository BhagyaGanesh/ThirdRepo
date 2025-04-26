package collectionex;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set st = new HashSet();
		st.add("Set1");
		st.add("Set2");
		st.add("Set3");
		st.add("Set4");
		System.out.println(st);
		
		Set s = new HashSet();
		s.add("Dog");
		s.add("Cat");
		s.add("Puppy");
		s.add("Elephant");
		System.out.println(s);
		System.out.println(st.addAll(s));
		System.out.println(st);
		//contains
		System.out.println(st.contains("Puppy"));
		System.out.println(st.containsAll(s));
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		System.out.println(st.size());
	    s.clear();
	    System.out.println(s);
	    

	}

}
