
public class MyThread1 implements Runnable {
	

	public static void main(String[] args) {
		MyThread1 t=new MyThread1();
		Thread t1=new Thread(t);
		//You have to make object thread and pass Mythread object because
		//we r not inherit the thread property.but if u extends thread then 
		//u r not required to make Thread class object.
		t1.start();
		MyAnotherThread t2=new MyAnotherThread();
		t2.start();
		
	}

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Value of i is" +i);
		}
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			
		}
	}

}
