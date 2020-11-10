package coreJavaTraining;

public class ConstructDemo {

	public ConstructDemo()
	{
		System.out.println("I am in constructor");
	}
	
	public ConstructDemo(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public ConstructDemo(String str)
	{
		System.out.println(str);
	}
	
	public void getData()
	{
		System.out.println("I am in method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructDemo cd=new ConstructDemo();
		ConstructDemo c=new ConstructDemo(4,7);
		ConstructDemo cs=new ConstructDemo("Hello");
		//cd.getData();
	}

}
