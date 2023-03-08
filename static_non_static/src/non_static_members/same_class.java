package non_static_members;

public class same_class
{
	static int a=92;
	int aa=221;
	public void test()
	{
		System.out.println("to access the non static method from static method"+a);
	}
	public static void demo()
	{
		System.out.println("to access the static method from another static method"+a);
	}
	public static void main(String[] args) 
	{
		new same_class().test();
		demo();
		
	}
}
