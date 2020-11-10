package coreJavaTraining;

public class StaticVar {

	String name;
	String address;
	static String city;
	static int i;
	
	static
	{
		city="Bangalore";
		int i=0;
	}
		
	StaticVar(String name, String address)
	{
		this.name=name;
		this.address=address;
		i++;
		System.out.println(i);
	}
	public void getAddress()
	{
		System.out.println(address+" "+city);
	}
	public static void getCity()
	{
		System.out.println(city);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar obj=new StaticVar("Bob","Navghar");
		StaticVar obj2=new StaticVar("Ram","Jessal Park");
		obj.getAddress();
		obj2.getAddress();
		StaticVar.getCity();
		StaticVar.i=4;
		obj.address="XYZ";
	
	}

}
