package exception_handling;

public class Exception_by_anuj {
	public static void main(String[] args) {
		fun1();
	}
	static void fun1() {
		int a=5;
		int b=3;
		int c=a/b;
		System.out.println(c);
		
		/* isDanger=true;
		if(isDanger) {
			throw new ArrayIndexOutOfBoundsException("danger was coming");*/
			try {
				fun2();
			}
			catch(Exception e) {
				System.out.println(e.getMessage()+" occured");
			}
		}//throws keyword handle in this function with try catch block.
	   
		static void fun2() throws ArrayIndexOutOfBoundsException {
			boolean isDanger1=true;
			if(isDanger1) {
				throw new ArrayIndexOutOfBoundsException("danger1 was coming");
				
			}
		}
	}

