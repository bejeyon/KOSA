package classes;

/*
HWJava10_06_ArrayMultiEx01_01_배재연.java
*/

class ArrayMultiEx01_01
{
	public static void main(String[] args) 
	{
		int[][] arrMultiEx;	// 2차원 배열 선언

		arrMultiEx = new int[2][3]; // 2차원 배열 생성

		int cnt = 0;
		for(int i = 0; i < arrMultiEx.length; i++){
			for(int j = 0; j < arrMultiEx[0].length; j++){
				cnt++;
				arrMultiEx[i][j] = cnt;
			}
		}	// 2차원 배열에 값 할당

		for(int i = 0; i < arrMultiEx.length; i++){
			for(int j = 0; j < arrMultiEx[0].length; j++){
				System.out.print(arrMultiEx[i][j]+"\t");
			}
			System.out.println("\n");
		}	// 2차원 배열 값 행 렬 시각화 출력
	}
}