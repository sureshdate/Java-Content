
public class ThreadOp {

	public static void main(String[] args) {
		System.out.println("Programme is started");
		int x=56;
		int y=34;
		System.out.println("sum is " +x);
		//Thread
		Thread t=Thread.currentThread();
		String tname=t.getName();
		System.out.println("current thread name " +tname);
		
		//setName
		t.setName("Mymain");
		System.out.println(t.getName());
		try {
			Thread.sleep(5000);
		}catch(Exception e){
			
		}
		//Going to start use defined thread
		System.out.println("Programme ended");
		UserThread thread=new UserThread();
		thread.start();
		
	}

}
//Daemon thread is a service provider thread that provides to the user thread.
//setDaemon(boolean);
//public boolean isDaemon();
//garbage collector is a example of daemon thread