package inheritance;

public class Multi_Child extends Multi_Intermediate{
	
public void diaplay2() {
		
		System.out.println("Child class ");
	}

	public static void main(String[] args) {
		
		Multi_Child obj=new Multi_Child();
		obj.display();
		obj.display1();
		obj.diaplay2();
		
		

	}

}
