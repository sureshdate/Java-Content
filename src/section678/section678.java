package section678;

import java.util.Scanner;

/*public class section678 {

	public static void main(String[] args) {
		 int x=5;
		   switch(x) {
		   case 1:System.out.println("the value pf x is 1");
		   break;
		   case 2:System.out.println("the value pf x is 2");
		   break;
		   case 3:System.out.println("the value pf x is 3");
		   break;
		   default:
			   System.out.println("the value of x is other than 1,2,3");
		   
		   
		   }

	}

}*///switch case part 1

//switch case part 2:we cannot use float but we can use char and string. switch case is case sensitive
/*public class section678 {
     public static void main(String[] args) {
	char x='c';
		   switch(x) {
		   case 'a':
		   case 'A':
			   
			   System.out.println("the value pf x is a");
		   break;
		   case 'b':
		   case 'B':
			   System.out.println("the value pf x is b");
		   break;
		   case 'c':
		   case 'C':System.out.println("the value pf x is c");
		   break;
		   default:
			   System.out.println("the value of x is other than a,b,c");
		   
		   
		   }

	}

}*/
//switch case part3//switch case is case sensitive
/*public class section678 {
	public static void main(String[] args) {
	String name= "Author";
		   switch(name) {
		   case "Team":
		   case "team":
			   
			   System.out.println("the value of name is team");
		   break;
		   case "Author":
		   case "author":
			   System.out.println("the value of name is author");
		   break;
		   case "Public":
		   case "public":System.out.println("the value of name is public");
		   break;
		   default:
			   System.out.println("the value of name is other than team,author,public");
		   
		   
		   }

	}

}*/

//in other way
/*public class section678 {
	public static void main(String[] args) {
	String name= "Author";
		   switch(name.toLowerCase()) {
		   case "Team":
		  
			   
			   System.out.println("the value of name is team");
		   break;
		   case "author":
		  
			   System.out.println("the value of name is author");
		   break;
		   case "Public":
		   System.out.println("the value of name is public");
		   break;
		   default:
			   System.out.println("the value of name is other than team,author,public");
		   
		   
		   }

	}

	

}
*/
//programms in java
//1)prime no 2)factorial no 3)reverse no 4)palindrome no 5)fibonacci series

//factorial no

/*public class section678{
	public static void main(String[]args)
	{
		int n,fact=1;
		System.out.println("please enter any no");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		System.out.print("factorial of number is "+fact);
	}
}*/

//reverse no
/*public class section678{
	public static void main(String[]args)
	{
		int n,rem;
		System.out.println("please enter any no");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		while(n>0)
		{
			rem=n%10;
			System.out.print(rem);
			n=n/10;
		}
		
	}
}
*/
//palindrom no//reverse no which is similar to no is same no that is called palindrome no
/*public class section678{
	public static void main(String[]args)
	{
		int n,rem,s=0,c;
		System.out.println("please enter any no");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		c=n;
		while(n>0)
		{
			rem=n%10;
			s=(s*10) + rem;
			n=n/10;
			
		}
		if(c==s)
		{
			System.out.println("palindrome no");
		}
		else {
			System.out.println("not a palindrome no");
		}
	}
}
*/

//fibbonacci series//0,1,1,2,3.....
/*public class section678 {
	public static void main(String[]args)
	{
	  int a=0,b=1,c,term;
			  System.out.println("enter range");
	         Scanner sc=new Scanner(System.in);
	         term=sc.nextInt();
	       for(int i=1;i<=term;i++)
	       {
	    	   System.out.print(a+"_");
	    	   c=a+b;
	    	   a=b;
	    	   b=c;
	    	   
	    	   
	       }
	}
}*/


//section 7 start=>method
/*public class section678 {
	public static void main(String[]args)
	{
	 loop1();
	 System.out.println("*****************");
	 loop2();
	}
	public static void loop1()
	{
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
	}
	public static void loop2()
	{
		int j=20;
		while(j<=30)
		{
			System.out.println(j);
			j++;
		}
	}
}*/

/*public class section678 {
	public static void main(String[]args)
	{
	 loop1(5,10);
	 
	}
	public static void loop1(int step,int finalValue)
	{
		while(step<=finalValue)
		{
			System.out.println(step);
			step++;
		}
	}
	
}*/

//method parameter and return type
/*public class section678 {
	public static void main(String[]args)
	{
	
	 System.out.println("Area of rectangle is"+areaRectangle(5.4,3.2));

	}
	public static double areaRectangle(double length,double width)
	{
		return length*width;
	}
	
}	*/

//method overloading
/*public class section678 {
	public static void main(String[]args)
	{
	
	 System.out.println("Area of rectangle is"+area(5.4,3.2));
	 System.out.println("Area of square is"+area(5.4));

	}
	public static double area(double length,double width)
	{
		return length*width;
	}
	public static double area(double side)
	{
		return side*side;
	}
	
}
*/

/*public class section678 {
	public static void main(String[]args)
	{
	
	 System.out.println("sum is"+sum(5,3));
	 System.out.println("sum is"+sum(5, 7.4f));

	}
	public static int sum(int x,int y)
	{
		return x+y;
	}
	public static float sum(int x,float y)
	{
		return x+y;
	}
	
}
*/































