/*
HWJava10_11_ArrayForEach_배재연.java
*/
package classes;

class ArrayForEach
{
	public static void main(String[] args) 
	{
		int[][] arr = {{1, 2}, {3, 4, 5}};

		for(int[] temp : arr){
			for(int inTemp : temp)
				System.out.print(inTemp+"\t");
			System.out.println("\n");
		}
	}
}