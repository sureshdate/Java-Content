package Producer_Consumer_project;
//1
public class Company {
	int n;
	boolean f=false;
	//f=false chance:producer
	//f=true chance:consumer
//we use synchronized because other thread will not run
	synchronized public void produce_item(int n) throws Exception 
	{
		if(f) {
			wait();
		}
		this.n=n;
		System.out.println("produced : "+this.n);
		f=true;
		notify();
		
		
	}
	synchronized public int consume_item() throws Exception {
		if(!f) {
			wait();
		}
		System.out.println("consumed : "+this.n);
	    f=false;
	    notify();
		return this.n;
		
	}
}
