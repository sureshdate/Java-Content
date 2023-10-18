package Producer_Consumer_project;
//3
public class Consumer extends Thread {

	Company c;//this is created because we have to call consume_item
	 
	Consumer(Company c){
		 this.c=c;
	 }
	 public void run()
	 {
		
		 while(true) {
			 try {
				this.c.consume_item();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			 try {
				 Thread.sleep(2000);
			 }
			 catch(Exception e) {
				 
			 }
			
		 }
	 }
	 
	}
