package coreJavaTraining;

public class exceptionDemo {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=8;
		
		try
		{
			int k=b/a;
			System.out.println(k);
			//int arr[]=new int[5];
			//System.out.println(arr[7]);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("I caught Arithmetic Exception");
		}
		catch(IndexOutOfBoundsException ie)
		{
			System.out.println("I caught Index OutOfBounds Exception");
		}
		catch(Exception e)
		{
			System.out.println("I caught the error");
		}
		finally
		{
			System.out.println("Delete Cookies");
		}
		
	}

}
