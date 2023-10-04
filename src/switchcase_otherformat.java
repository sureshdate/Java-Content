
public class switchcase_otherformat {

	public static void main(String[] args) {
		String name = "Team";
		/*
		 * switch(name) { 
		 * case "Author":
		 * System.out.println("the value of name is author"); 
		 * break; 
		 * case "team":
		 * System.out.println("the value of name is team");
		 *  break; 
		 *  case "Team":
		 * System.out.println("the value of name is Team "); 
		 * break;//we show that its a  case sensetive; 
		 
		 * case "Editor":
		 * System.out.println("the value of name is editor"); 
		 * break; 
		 * default:
		 * System.out.println("invalid entry"); 
		 * break;
		 * 
		 * 
		 * }
		 */

		/*
		 * switch(name) { 
		 * case "Author":
		 * System.out.println("the value of name is author");
		 *  break; 
		 *  case "team": 
		 *  case "Team": 
		 *  System.out.println("the value of name is team"); 
		 *  break;
		 * 
		 * case "Editor": 
		 * System.out.println("the value of name is editor"); 
		 * break;
		 * default:
		 * System.out.println("invalid entry"); 
		 * break;
		 * 
		 * }
		 */

		switch (name.toLowerCase()) {
		case "Author":
			System.out.println("the value of name is author");
			break;
		case "team":
			System.out.println("the value of name is team");
			break;
		case "Editor":
			System.out.println("the value of name is editor");
			break;
		 default:
			 System.out.println("invalid entry"); 
			  break;

		}

	}

}
