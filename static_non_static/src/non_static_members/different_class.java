package non_static_members;

class tests
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
}
public class different_class
{
	public static void main(String[] args) 
	{
		new tests().test();
		tests.demo();
		
	}
}
