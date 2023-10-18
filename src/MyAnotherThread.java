
public class MyAnotherThread extends Thread {
	

	public void run() {
		for(int i=10;i>=1;i--) {
			System.out.println("Another thread =" +i);
		}
		//we use try catch block because it can get interrupt exception.
		try {
			Thread.sleep(1000);
			
		}catch(Exception e) {
			
		}
	}

}
