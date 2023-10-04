
public class Method_OverLoading {

	public static void main(String[] args) {
		System.out.println(sum(1,2));
		System.out.println(sum(1,2.8F));
		System.out.println(sum(4.6,2.8));
		System.out.println(sum(4.6,2.8,1.5));
	}
	
	public static int sum(int x,int y)
	{
		System.out.println("Adding two entity");
		return(x+y);
	}
    
	public static float sum(int x,float y)
	{
		System.out.println("Adding int entity and float entity");
		return x+y ;
	}
   
	public static double sum(double x,double y)
	{
		System.out.println("Adding 2 double entity");
		return x+y ;
	}
	
	public static double sum(double x,double y,double z)
	{
		System.out.println("Adding 3 double entity");
		return x+y+z ;
	}

}
