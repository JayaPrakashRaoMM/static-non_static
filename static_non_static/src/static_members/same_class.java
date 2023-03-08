package static_members;

public class same_class 
{
	static int a=5,b=10;
	static 
	{
		System.out.println("static blocks of same class");
	}
	public static int method()
	{
		
		return a+b;
		
	}
	public static void main(String[] args) 
	{
		int c=method();
		System.out.println("the static variable result of same class is "+c);
	}
}
