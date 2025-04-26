package inheritance;

public class Hier_Child1 extends Hier_Parent{
	
    public void display() {
		
		System.out.println("Child 1");
	}
    
	public static void main(String[] args) {
		
		Hier_Child1 obj=new Hier_Child1 ();
		obj.display();
		obj.display1();


	}

}
