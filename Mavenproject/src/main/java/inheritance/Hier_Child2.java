package inheritance;

public class Hier_Child2 extends Hier_Parent{
	
public void display() {
		
		System.out.println("Child 2");
	}
	public static void main(String[] args) {
		
		Hier_Child2 obj=new Hier_Child2();
		obj.display();
		obj.display1();
		

	}

}
