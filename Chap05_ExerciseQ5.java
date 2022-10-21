/*
HWJava10_12_Chap05_ExerciseQ1Q7_배재연.zip

ExerciseQ5~Q6.

다음과 같이 참조 변수 a의 이름으로 2차원 배열 객체를 생성하고자 한다. 다음 물음에 답하시오.

 1 3 5
 7 9

Q5. 2차원 배열 객체를 생성하고 각 위치에 다음과 같이 값을 초기화하는 코드를 작성하시오.
int[][] a = new int[2][];
*/
package classes;

class Chap05_ExerciseQ5
{
	public static void main(String[] args) 
	{
		int[][] a = new int[2][];
		a[0] = new int[]{1, 3, 5};
		a[1] = new int[]{7, 9};

		for(int[] outer : a){
			for(int inner : outer)
				System.out.print(inner+"\t");
			System.out.println("\n");
		}
	}
}