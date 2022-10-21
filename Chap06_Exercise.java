/*
HWJava12_02_Chap06_Exercise_배재연.zip
6장 연습문제

Q1. 클래스 내부에 올 수 있는 4가지 구성 요소와 외부에 올 수 있는 3가지 구성 요소를 쓰시오.
	- 클래스 내부 : 필드, 메서드, 생성자, 이너 클래스
	- 클래스 외부 : 패키지, 임포트, 외부 클래스

Q2. 다음과 같이 클래스 A가 정의돼 있을 때 다음 코드를 작성하시오.

class A {
	int m;
	void method() {
		System.out.println("A의 메서드");
	}
}
*/

package classes;

class A {
	int m;
	void method() {
		System.out.println("A의 메서드");
	}
}

class Chap06_Exercise
{
	public static void main(String[] args) 
	{
		// 참조변수 a를 선언하고 클래스 A의 객체를 생성하시오.
		A a = new A();
		// 객체 내부의 필드 m에 값 5를 대입하시오.
		a.m = 5;
		// 필드 m의 값을 콘솔에 출력하시오.
		System.out.println(a.m);
		// 메서드 method()를 호출하시오.
		a.method();
	}
}
