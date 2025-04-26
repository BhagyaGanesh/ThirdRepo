package encapsulation;

public class Enc_2 {
	
public static void main(String[] args) {
		
	Enc_1 obj=new Enc_1();
		obj.setAge(24);
		obj.setName("Angel");
		
		int at=obj.getAge();
		System.out.println(at);
		System.out.println(obj.getName());
		
		

	}

}
