package methodoverride;

public class MethodChild extends MethodParent{
	

	public void sum(int a, int b) {
		
		int c=a+b;
		System.out.println(c);
		super.sum(20, 30);
		
	}
	
	
	public void display() {
		
		System.out.println("child class");
		super.display();
	}

	public static void main(String[] args) {
		
		 MethodChild obj=new MethodChild();
		 obj.sum(12,13);
		 obj.display();

	}

}
