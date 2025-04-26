package interfaceEx;

public class ChildInt implements ParentInt{
	
	public static void main(String[] args) 
	{
		ChildInt obj = new ChildInt();
		System.out.println(a);
		obj.display();
		obj.show();
	}
	public void show()
	{
		System.out.println("Normal method in child class");
	}

	@Override
	public void display() 
	{
		System.out.println("Inherited method");
	}
	

}
