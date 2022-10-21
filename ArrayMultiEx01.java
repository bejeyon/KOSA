package classes;

/*
HWJava10_05_ArrayMultiEx01_배재연.java
*/

class ArrayMultiEx01
{
	public static void main(String[] args) 
	{
		int[][] arrEx;	// 2차원 배열 선언

		arrEx = new int[2][3]; // 2차원 배열 생성

		int cnt = 0;
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 3; j++){
				cnt++;
				arrEx[i][j] = cnt;
			}
		}	// 2차원 배열에 값 할당

		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(arrEx[i][j]+"\t");
			}
			System.out.println("\n");
		}	// 2차원 배열 값 행 렬 시각화 출력
	}
}