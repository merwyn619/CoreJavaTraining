package coreJavaTraining;

public class Minnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{2,4,5},{3,5,7},{4,1,0}};
		int min=a[0][0];
		int mincolumn=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<min)
				{
					min= a[i][j];
					mincolumn=j;
				}

			}
		}
		//System.out.println(min);
		int k=0;
		int max=a[0][mincolumn];
		while(k<3)
		{
			if(a[k][mincolumn]>max)
			{
				max=a[k][mincolumn];
			}
		k++;	
		}
		System.out.println(max);
	}

}
