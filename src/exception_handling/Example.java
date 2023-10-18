package exception_handling;

import java.util.Scanner;
//exception is an event that can happen during the execution of programme and disrupts its normal flow
//the normal flow of the programme halts and jre tries to find someone 
//that can handle the raised exception
//when the exception occurs in a method the process of creating the exception object 
//and handling it over to runtime is called as "throwing the exception
//A throw keywword used in java used to exlicitely throw an exception from method or body
//throws keyword in java used in the signature of method to indicate that this method might throw one 
//throws keyword in java used in the signature of method to indicate 
//this method might throw one of listed type of exception.The caller of this method hs to handle the exception 
//using try catch block.
public class Example {

	public static void main(String[] args) throws AgeInvalidException {
		try {
//			int a[]=new int[5];
//			System.out.println(a[6]);
			
		System.out.println("Taking input from user");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n1");
		int n1=sc.nextInt();
		System.out.println("enter n2");
		int n2=sc.nextInt();
		int result=n1/n2;
		System.out.println(result);
		}
		catch(ArithmeticException e){
			System.out.println("you cannot divide by 0");
			System.out.println(e.getMessage());//the exception object contains a lot of 
			//debugginginformations such as method hierachy line no where the exxception occured
       
			  //if appropriate exception handler is found,exception object is passed to the handler to process
			//the handler is said  to "catching the exception".
		
		}
		catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println("arrayindex out of bond");
		}
		catch(NumberFormatException e){
			System.out.println("Invalid numbers");
		
		}
		catch(Exception e) {
			System.out.println("this is error");
			//we can attach multiple catch block with one try block
			//if you dont know the exception type then directly  write parent class of exception type that is exception
		
		}
		finally {
			System.out.println("I am in finally block");
			System.out.println("closing all the resources");
			//this block always executed..
		}
	}

}
