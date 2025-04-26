package superkeyword;

public class MethChild extends MethParent{
	
public void show() {
		
		
		System.out.println("child class");
		super.display();
		
		//this keyword can be used for getting the current class method
		this.result();
	}
	
	public void result() {
		
		
		System.out.println("child class statement");
		super.add();
	}

	public static void main(String[] args) {
		MethChild obj=new MethChild();
		obj.show();
		//obj.display();
		//obj.result();

	}

}
