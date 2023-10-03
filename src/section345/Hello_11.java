//import java.math.BigDecimal;

/*public class Hello_11 {
	public static void main(String[]args)
	{
		System.out.println("Hello java");
	}

}*/
//space in a memory is nothing but a variable.data type is a type of variable in 
//which we wiil store a data.and name of the variable is case sensetive

//understanding variables
/*public class Hello_11 {
	public static void main(String[]args)
	{
		int value1=2;int value2=3;
		int value3= value1*value2;
		System.out.println(value3);
	}

}*/

//primitive data type(part1)

//primitive data types(floating point datatype)
//int and float-32bit memory and double occupies-64bit memory floating point data types are 2 -int and float
//double is preferred when u make of double data type of variable beause it is more precise and your programm work faster
//if u use double instead of float.likewise int data is prefer instead of short long data type.
/*public class Hello_11 {
	public static void main(String[] args) {
		// int value1=9/2;
		// float value2=9f/2f;
		// double value3=9d/2d;
		// System.out.println("value1 " +value1);
		// System.out.println("value2 " +value2);
		// System.out.println("value3 " +value3);

		// int marker=512;
		// double percentage=marker*0.46f;
		// System.out.println("percentage="+percentage);
	}
}*/

// primitive data type(boolean and char)
// java follows unicode mechanism so pls follow unicode table on google for char
// data type.
/*public class Hello_11 {
	public static void main(String[] args) {
		boolean var=false;
		System.out.println(var);
		
		char var1='\u00A7';
		System.out.println(var1);
		
		
	}
}*/

// big decimal introduction
/*public class Hello_11 {
	public static void main(String[] args) {
//		double x=1.05;
//		double y=2.55;
		BigDecimal d1=new BigDecimal("1.05");
		BigDecimal d2=new BigDecimal("2.55");
		System.out.println(d1.add(d2));
		
	}
}*/

// string basics
/*public class Hello_11 {
	public static void main(String[] args) {
   int var1=10;
   String var2="20";
   System.out.println(var1+20+"hi");
		
	}
}*/
// typecasting is a interconversion of data type

// TypeCasting
// typecasting means conversion from one data type to another.
// cannot convert from bigger data type to smaller data type.that time we have
// to use explicite typecasting.
// byte->short->int->long-> float->double i.e 8bit->16bit->32bit->64bit->
// 32bit->64bit ->impilcite typecasting(widening)
// implicite typecasting of int to float is possible.

// explicite typecasting(narrowing)-double->float->long->int->short->byte
// we wont be able to cast from string.

/*public class Hello_11 {
	public static void main(String[] args) {
   int var1=10;
   short var2=(short)var1;
   System.out.println(var2);
   
   double v2=20.12345;
   float v1=(float)v2
   System.out.println(v1);
		
	}
}//explixcite type casting*/

/*public class Hello_11 {
	public static void main(String[] args) {
 
   short var1=10;
   int var2=20;
   System.out.println(var2);
   
 
		
	}
}*///implicite typecasting

//exercise=>(a+b)square=(a*a)+2ab+(b*b)
/*public class Hello_11 {
	public static void main(String[] args) {
 
  int a=25;
  float b= 42.95f;
  int value=(int)(a*a+2*(a*b)+b*b);
  System.out.println("value of equation is "+value);
  
 }
}*/

//Arithmetic operators in java
/*public class Hello_11 {
	public static void main(String[] args) {
 
    int x=10;
    System.out.println(x--);//++ operator also we can use preincrement and postincrement
    System.out.println(x);
  
 }
}*/

/*public class Hello_11 {
	public static void main(String[] args) {
    boolean x=true;
    boolean y=false;
    if(false && true) {
	  System.out.println("condition is true");
    }
    else {
	  System.out.println("condition is false");
    }
  
 }
}*/
/*public class Hello_11 {
	public static void main(String[] args) {
    boolean x=true;
    boolean y=false;
    if(false || true) {
	  System.out.println("condition is true");
    }
    else {
	  System.out.println("condition is false");
    }
  
 }
}*/

/*public class Hello_11 {
	public static void main(String[] args) {
   int ageofboy=21;
   int ageofgirl=18;
    if((ageofboy>=21) && (ageofgirl>=18)) {
	  System.out.println("ready to get married");
    }
    else {
	  System.out.println("wait it for kiddo");
    }
  
 }
}*/


//ternary operator

/*public class Hello_11 {
	public static void main(String[] args) {
   boolean x;
   x=(5>4)?true:false;
   System.out.println(x);
  
 }
}*/

//assignment operator
/*public class Hello_11 {
	public static void main(String[] args) {
    int x=5;
    x+=5; //x=x+5;
    x-=5; //x=x-5;
    x*=5; //x=x*5;
    x/=5; //x=x/5;
    x%=5; //x=x%5;
   
    System.out.println(x);
    		 
  
 }
}*/
























