package coreJavaTraining;

public class childlevel extends ParentAirCraft{

	public void getData(int a)
	{
		System.out.println(a);
	}
	public void getData(String a)
	{
		System.out.println(a);
	}
	public void getData(int a, int b)
	{
		System.out.println(b);
	}
	public void engine()
	{
		System.out.println("Engineer");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childlevel cl=new childlevel();
		cl.getData(3);
		cl.getData("Hello");
		cl.getData(5, 7);
		cl.engine();
	}

}
