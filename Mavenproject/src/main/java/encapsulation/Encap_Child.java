package encapsulation;

public class Encap_Child {
	
	public static void main(String[] args) {
		
		Encap_Parent pkg=new Encap_Parent();
		pkg.setUsername("User");
		pkg.setPassword("password");
		
		System.out.println(pkg.getUsername());
		System.out.println(pkg.getPassword());

	}


}
