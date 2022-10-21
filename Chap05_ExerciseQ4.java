/*
HWJava10_12_Chap05_ExerciseQ1Q7_배재연.zip

ExerciseQ4.

다음과 같이 5개의 원소가 있는 1차원 배열의 모든 원소를 순서대로 출력하는 코드를 for-each 문을 이용해 작성하시오.
int[] = new int[]{1, 2, 3, 4, 5};
*/
package classes;

class Chap05_ExerciseQ4
{
	public static void main(String[] args) 
	{
		int[] arr= new int[]{1, 2, 3, 4, 5};
		for(int value : arr)
			System.out.println(value);
	}
}