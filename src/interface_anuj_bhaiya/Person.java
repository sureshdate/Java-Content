package interface_anuj_bhaiya;

public class Person implements Student,Youtuber {
	public static void main(String[] args) {
		Person p=new Person();
		p.study();
		p.make_videos();
	}

	@Override
	public void study() {
		System.out.println("student is studying");
		
	}

	@Override
	public void make_videos() {
		System.out.println("You_tuber is making videos");
		
	}

}
//multiple inheritance supported by using interface.