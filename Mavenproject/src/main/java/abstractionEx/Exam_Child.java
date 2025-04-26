package abstractionEx;

public class Exam_Child extends Exam_Parent{
	
public void display1() {
		
		
		System.out.println("Child class method");
	}

	public static void main(String[] args) {
		
		Exam_Parent obj=new Exam_Child();
		obj.show(); // Calls overridden method in child
		obj.display();// Calls inherited method from parent
		
		// obj.display1();----reference type (on the left side) is Exam_Parent. And Exam_Parent doesn’t know about display1(), since it’s a method only defined in the child class.
//Java restricts access to only the methods and fields defined in the reference type, even though the actual object is of the child class.
	}
	
	//@Override ---on extending child class it shows error. so the fix, add unimplemented methods is selected  
	
		public void show() {
			
			
			System.out.println("Implemented abstract method");
			
		}

}
