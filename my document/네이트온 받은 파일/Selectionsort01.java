package classes;
import java.util.Scanner;
class  Selectionsort01
{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		int [] array =new int[size];
		for (int idx=0; idx<array.length ; idx++ )
		{
			array[idx]=sc.nextInt();
		}
		
		for (int i=0; i<array.length-1 ; i++)
		{ 
			for (int j=i+1; j<array.length ; j++ )
			{
				if (array[j]<array[i]) 
				{
					int tmp=array[i];
					array[i]=array[j];
					array[j]=tmp;
				}
			}
		}
		for (int idx01=0; idx01<array.length ; idx01++ )
		{
			System.out.println(array[idx01]);
		}
		
	}
}
