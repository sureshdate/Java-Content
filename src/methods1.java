
public class methods1 {

	public static void main(String[] args) {
		
		loop(1,10);
		System.out.println("*******************");
		loop(20,40);
		System.out.println("*******************");
		loop(1,10);
		System.out.println("*******************");
	}
		
		
		
		public static void loop(int step, int finalizeValue)
		{
			while(step<=finalizeValue)
			{
				System.out.println(step);
				step++;
			}

		}
	}


