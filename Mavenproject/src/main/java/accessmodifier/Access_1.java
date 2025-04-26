package accessmodifier;

public class Access_1 {
	
public void show() {
		
		System.out.println("This is a public method");
		
		}

private void showprivate() {
	
	System.out.println("This is a private method");
	
}

protected void showprotected() {
	
	System.out.println("This is a protected method");
	
}

void showdefault() {
	
	
	System.out.println("This is default method");
}

public static void main(String[] args) {
	Access_1 obj=new Access_1();
	obj.show();
	obj.showprivate();
	obj.showprotected();
	obj.showdefault();
	

}

}
