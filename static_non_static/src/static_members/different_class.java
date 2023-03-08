package static_members;

class test
{
	static int a=2,b=3;
	static 
	{
		System.out.println("static blocks of different class");
	}
	public static int method()
	{
		
		return a+b;
		
	}
}
public class different_class 
{
	public static void main(String[] args) 
	{
		int c=test.method();
		System.out.println("the static variable result of different class is "+c);
	}
}
