package classes;

/*
HWJava10_04_ArrayEx003_배재연.java
배열 형식 03 : 
-선언, 생성, 값할당
*/

class ArrayEx003
{
	public static void main(String[] args) 
	{
		int[] arrayEx02 = new int[] {10, 20, 30, 40, 50};	// 선언 + 생성 + 값할당
		// int[] arrayEx02 = {10, 20, 30, 40, 50}; 도 가능 (new int[]의 생략)

		// Algorithm 적용
		for(int value : arrayEx02)
			System.out.println(value);
	}
}