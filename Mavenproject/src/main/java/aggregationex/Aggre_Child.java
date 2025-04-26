package aggregationex;

public class Aggre_Child {
	
	int roll; 
	int mark;
	Aggre_Parent ref;
	
	
	public Aggre_Child(int roll, int mark, Aggre_Parent ref) {
		
		this.roll=roll;
		this.mark=mark;
		this.ref=ref;
		
	}
	

	public void display() {
		
		System.out.println(ref.name);
		System.out.println(ref.age);
		System.out.println(roll);
		System.out.println(mark);
		
		
		
	}

	public static void main(String[] args) {
		
		Aggre_Parent obj=new Aggre_Parent("Ann", 12);
		Aggre_Child obj1=new Aggre_Child(32,50,obj);
		obj1.display();

	}

}
