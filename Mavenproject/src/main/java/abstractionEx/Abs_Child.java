package abstractionEx;

public class Abs_Child extends Abs_Parent{
	
public void get() {
		
		System.out.println("child class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abs_Child obj=new Abs_Child();
		obj.display();
		System.out.println(obj.sum());
		obj.show();
		obj.get();

	}
	
	@Override
	public void display() {
		System.out.println("abstract method");
		
	}

	@Override
	public int sum() {
		
		int a=12;
		int b=13;
		int c=a+b;
		return c;
	}

}
