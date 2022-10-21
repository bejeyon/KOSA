package classes;

/*
HWJava10_07_ArrayMultiEx02_03_배재연.java
*/

class ArrayMultiEx02_03
{
	public static void main(String[] args) 
	{
		int[][] arrMultiEx02 = new int[2][3]; // 2차원 배열2 선언 + 생성
		int[][] arrMultiEx03 = new int[][] {{10, 20, 30}, {40, 50, 60}}; // 2차원 배열3 선언 + 생성 + 값할당

		int cnt = 0;
		for(int i = 0; i < arrMultiEx02.length; i++){
			for(int j = 0; j < arrMultiEx02[0].length; j++){
				cnt++;
				arrMultiEx02[i][j] = cnt;
			}
		}	// 2차원 배열2에 값 할당

		for(int i = 0; i < arrMultiEx02.length; i++){
			for(int j = 0; j < arrMultiEx02[0].length; j++){
				System.out.print(arrMultiEx02[i][j]+"\t");
			}
			System.out.println("\n");
		}	// 2차원 배열2 값 행 렬 시각화 출력

		for(int i = 0; i < arrMultiEx03.length; i++){
			for(int j = 0; j < arrMultiEx03[0].length; j++){
				System.out.print(arrMultiEx03[i][j]+"\t");
			}
			System.out.println("\n");
		}	// 2차원 배열3 값 행 렬 시각화 출력
	}
}