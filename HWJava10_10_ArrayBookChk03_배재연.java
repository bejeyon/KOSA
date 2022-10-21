/*
HWJava10_10_ArrayBookChk03_배재연.java
*/
package classes;

class ArrayBookChk03
{
	public static void main(String[] args) 
	{
		// 1차원 배열 생성 방법을 통한 2차원 배열 생성 방법 1
		
		// 행 성분 생성
		int[][] a = new int[2][];
		
		// 열 성분 생성
		a[0] = new int[3];
		a[0][0] = 1; a[0][1] = 2; a[0][2] = 3;
		a[1] = new int[2];
		a[1][0] = 4; a[1][1] = 5;

		// 1차원 배열 생성 방법을 통한 2차원 배열 생성 방법 2
		
		// 행 성분 생성
		int[][] b = new int[2][];
		
		// 열 성분 생성
		b[0] = new int[]{1, 2, 3};
		b[1] = new int[]{4, 5};

		// 2차원 배열 a, b의 각 요소들 값 행 열 시각화하여 출력
		for (int i = 0; i<a.length; i++)
		{
			for (int j = 0; j<a[i].length; j++)
				System.out.print(a[i][j]+"\t");
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i<b.length; i++)
		{
			for (int j = 0; j<b[i].length; j++)
				System.out.print(b[i][j]+"\t");
			System.out.println();
		}
		System.out.println();
	}
}