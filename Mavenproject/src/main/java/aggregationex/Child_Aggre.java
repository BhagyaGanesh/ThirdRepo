package aggregationex;

public class Child_Aggre {
	
	int pincode;
	String state;
	Parent_Aggre ref;
	
	
	public Child_Aggre(int pincode,String state,Parent_Aggre ref) {
		
		
		
		this.pincode=pincode;
		this.state=state;
		this.ref=ref;
		
	}
	
	public void display(){
		
		System.out.println(ref.name);
		System.out.println(ref.address);
		System.out.println(pincode);
		System.out.println(state);
		
	}	


	public static void main(String[] args) {
		
		Parent_Aggre obj=new Parent_Aggre("Anu","flat no 25");
		
        Child_Aggre obj1=new Child_Aggre(690531,"Trivandrum",obj);
		
		obj1.display();
	
	}

}
