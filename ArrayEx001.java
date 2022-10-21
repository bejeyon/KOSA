package classes;

/*
HWJava10_02_ArrayEx001_배재연.java
배열 형식 01 : 
-선언
-생성
-값할당
*/

class ArrayEx001
{
	public static void main(String[] args) 
	{
		int[] arrayEx01;	// 선언
		arrayEx01 = new int[5];	// 생성, index : 0 ~ 4
		for(int idx = 0; idx < arrayEx01.length; idx++)
			arrayEx01[idx] = (idx + 1) * 10;	// 값 할당

		// Algorithm 적용
		for(int idx = 0; idx < arrayEx01.length; idx++)
			System.out.println(arrayEx01[idx]);
	}
}