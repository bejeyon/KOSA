/* 7장 연습문제
Q6. 클래스 A에 생성자가 2개 정의돼 있다. 각각의 생성자를 이용해 객체를 생성하시오(단, 입력값은 자유롭게 지정).

class A {
	A(int k) {
	}
	A(double a, double b) {
	}
}

A a1 = __________ // 첫 번째 생성자 이용
A a2 = __________// 두 번째 생성자 이용
*/

package classes;

class A {
	A(int k) {
	}
	A(double a, double b) {
	}
}

class Chap7_ExerciseQ6
{
	public static void main(String[] args) 
	{
		A a1 = new A(7); // 첫 번째 생성자 이용
		A a2 = new A(3.14, 5.6);	// 두 번째 생성자 이용
	}
}
