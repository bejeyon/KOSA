/*
HWJava10_12_Chap05_ExerciseQ1Q7_배재연.zip

ExerciseQ5~Q6.

다음과 같이 참조 변수 a의 이름으로 2차원 배열 객체를 생성하고자 한다. 다음 물음에 답하시오.

 1 3 5
 7 9

Q6. 이중 for 문을 이용해 위의 2차원 배열 a의 모든 원소를 출력하는 코드를 작성하시오(단, 2개의 for 문에 들어갈 조건식에는 반드시 .length를 사용해야 함).
*/
package classes;

class Chap05_ExerciseQ6
{
	public static void main(String[] args) 
	{
		int[][] a = new int[2][];
		a[0] = new int[]{1, 3, 5};
		a[1] = new int[]{7, 9};

		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
				System.out.print(a[i][j]+"\t");
			System.out.println("\n");
		}
	}
}