package exception;

public class ExceptionEx {
	
	public static void main(String args[]) {
		
	/*	int a=5;
		int b=0;
		try {
		int c=a/b;
		}
		catch(ArithmeticException ae) {
			//System.out.println("Exception handled");
			 b=2;
			int e=a/b;
			System.out.println(e);
			
		}
		finally {
			System.out.println("Remaining code");
		}
		*/
		
		/*
		try {
		int ar[] = {1,2,3};
		for(int i=0;i<4;i++)
		{
			System.out.println(ar[i]);
		}
		}
		
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Exception handled");
		}
		
		finally {
			System.out.println("Remaining code");
		}
		
		*/
		
		
		try {
			String a=null;
			System.out.println(a);
		}
		catch(NullPointerException ae) {
			System.out.println("Exception handled");
		}
		finally {
			System.out.println("Remanining code");
		}
	}

}
