package Producer_Consumer_project;
//2
public class Producer extends Thread {
 Company c;//this is created because we have to call produce_item
 
 Producer(Company c){
	 this.c=c;
 }
 public void run()
 {
	 int i=1;
	 while(true) {
		 try {
			this.c.produce_item(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			 Thread.sleep(1000);
		 }
		 catch(Exception e) {
			 
		 }
		 i++;
	 }
 }
 
}
