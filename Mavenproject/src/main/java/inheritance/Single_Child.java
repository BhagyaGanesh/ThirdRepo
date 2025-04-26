package inheritance;

public class Single_Child extends Single_Parent{
	
	public void display1(){
		System.out.println("This is child class");
		
		
	}

	public static void main(String[] args) {
		
		Single_Child obj=new Single_Child();
		obj.display();
		obj.display1();
		
	}

}
