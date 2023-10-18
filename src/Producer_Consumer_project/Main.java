package Producer_Consumer_project;
//4
public class Main {
	public static void main(String[] args) {
		Company comp=new Company();
		Producer p=new Producer(comp);
		Consumer c=new Consumer(comp);
		p.start();
		c.start();
		
		
	}
	
}
