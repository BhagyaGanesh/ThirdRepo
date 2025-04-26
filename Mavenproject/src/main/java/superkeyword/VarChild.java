package superkeyword;

public class VarChild extends VarParent{
	
String color="red";
	
	public void display() {
		
		System.out.println(color);
		//super keyword can be used in diff method not in main method
		System.out.println(super.color);
		
	}

	public static void main(String[] args) {
		
		VarChild obj=new VarChild();
		obj.display();
		

	}

}
