/*
HWJava15_02_Chap09Summary02_배재연.zip
9장 연습문제

Q5. 다음과 같이 1개의 인스턴스 필드(a)와 1개의 정적 필드(b)를 포함하고 있는 클래스 A가 정의돼있다.

class A {
	int a = 3;
	static int b = 5;
}

이 때 다음 코드의 실행 결과를 쓰시오.

A a1 = new A();
A a2 = new A();

a1.a = 30;	// a1.a == 30
a1.b = 40;	// b == 40

a2.a = 50;	// a2.a == 50
a2.b = 60;	// b == 60

System.out.println(a1.a);	// 30 출력
System.out.println(a1.b);	// 60 출력

System.out.println(a2.a);	// 50 출력
System.out.println(a2.b);	// 60 출력
*/

package classes;

class A {
	int a = 3;
	static int b = 5;
}

class Chap9_ExerciseQ5 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();

		a1.a = 30;	// a1.a == 30
		a1.b = 40;	// b == 40

		a2.a = 50;	// a2.a == 50
		a2.b = 60;	// b == 60

		System.out.println(a1.a);	// 30 출력
		System.out.println(a1.b);	// 60 출력

		System.out.println(a2.a);	// 50 출력
		System.out.println(a2.b);	// 60 출력
	}
}
