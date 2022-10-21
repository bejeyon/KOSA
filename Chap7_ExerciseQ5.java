/* 7장 연습문제
Q5. 가변 길이 자료형을 이용해 여러 개의 정수를 개수와 상관없이 입력받아 평균값을 출력하는 averageScore() 메서드를 클래스 A 안에 정의하시오.

class A {

}

A a = new A();

a.averageScore(1);
a.averageScore(1, 2);
a.averageScore(1, 2, 3);
a.averageScore(1, 2, 3, 4);
// ...
*/

package classes;

class A {
	void averageScore(int...values) {
		double sum = 0.0;
		int len = values.length;
		for (int i = 0; i < len; i++)
		{
			sum += values[i];
		}
		System.out.println(sum/len);
	}
}

class Chap7_ExerciseQ5
{
	public static void main(String[] args) 
	{
		A a = new A();

		a.averageScore(1);
		a.averageScore(1, 2);
		a.averageScore(1, 2, 3);
		a.averageScore(1, 2, 3, 4);
	}
}
