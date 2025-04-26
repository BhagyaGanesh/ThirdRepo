package methodoverride;

public class Over_Child extends Over_Parent{
	
	public static void main(String[] args) {
		
		Over_Child child=new Over_Child();
		child.display();
	}

	@Override //source-->override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		
		System.out.println("child class");
	}

}
