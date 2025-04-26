package exception;

public class Custom {

	public static void main(String[] args) throws VoteException {
		// TODO Auto-generated method stub
		int age=15;
		if(age>=18) {
			
			System.out.println("Eligible for voting");
		}
		else {
			throw new VoteException("Not Eligible");
		}
	}

}
