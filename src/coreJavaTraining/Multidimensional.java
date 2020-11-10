package coreJavaTraining;

public class Multidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= new int[2][3];
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=6;
		a[1][0]=4;
		a[1][1]=9;
		a[1][2]=11;
		//System.out.println(a[1][0]);
		int b[][]= {{2,4,6},{3,6,9},{4,8,12}};
		//System.out.println(b[2][0]);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(b[i][j]);
			}
		}
	
	}

}
