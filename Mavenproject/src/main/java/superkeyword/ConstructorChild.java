package superkeyword;

public class ConstructorChild extends ConstructorParent{
	
public ConstructorChild() {
		
		super();
		System.out.println("Child class");
	}
	
	public ConstructorChild(int a,int b) {
		
		super(2,3);
		int c=a+b;
		System.out.println(c);
		
		
	}

	public static void main(String[] args) {
		
		ConstructorChild obj=new ConstructorChild();
		ConstructorChild obj1=new ConstructorChild (12,13);
		
		
	}

}
