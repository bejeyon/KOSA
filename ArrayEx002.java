package classes;

/*
HWJava10_03_ArrayEx002_배재연.java
배열 형식 02 : 
-선언, 생성
-값할당
*/

class ArrayEx002
{
	public static void main(String[] args) 
	{
		int[] arrayEx02 = new int[5];	// 선언 + 생성
		
		for(int idx = 0; idx < arrayEx02.length; idx++)
			arrayEx02[idx] = (idx + 1) * 10;	// 값 할당

		// Algorithm 적용
		for(int value : arrayEx02)
			System.out.println(value);
	}
}