/*
HWJava10_12_Chap05_ExerciseQ1Q7_배재연.zip

ExerciseQ2.

다음은 int[] 자료형에 3개의 정숫값 3,4,5를 저장하는 코드다. 각 코드상에서 메모리의 모양을 그리시오(이 때 객체가 생성되는 위칫값은 100번지라 가정).

										클래스 영역					스택 영역					힙 영역
int[] a;																	null

a = new int[3];														100							(100번지 위치에) a라는 공간 3칸(각 칸마다 0값 저장돼있음) 생성

a[0] = 3;																100							(100번지 위치에) a라는 공간 3칸(각 칸마다 3, 4, 5값 저장돼있음) 유지
a[1] = 4;
a[2] = 5;
*/
package classes;

class Chap05_ExerciseQ2
{
	public static void main(String[] args) 
	{

	}
}