/* 7장 연습문제
Q7. 클래스 A를 다음과 같이 정의했을 때 다음 코드의 출력 결과를 쓰시오.

class A {
	int m = 3;
	int n = 5;
	void abc(int m, int n) {
		m = this.m;
		n = n;
	}
}

A a = new A();
a.abc(7, 8);
System.out.println(a.m);	// 3 출력
System.out.println(a.n);	// 5 출력
*/

package classes;

class A {
	int m = 3;
	int n = 5;
	void abc(int m, int n) {
		m = this.m;
		n = n;
	}
}

class Chap7_ExerciseQ7
{
	public static void main(String[] args) 
	{
		A a = new A();
		a.abc(7, 8);
		System.out.println(a.m);	// 3 출력
		System.out.println(a.n);	// 5 출력
	}
}
