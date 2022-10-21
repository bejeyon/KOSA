/* 7장 연습문제
Q1. 클래스 A가 다음과 같이 정의돼 있다.

class A {
	boolean a;
	int b;
	double c;
	String d;

	void abc() {
		System.out.println(b + c);
		System.out.println(c + d);
		System.out.println(d + a);
	}
}

다음 코드의 출력값을 쓰시오.

A a = new A();
System.out.println(a.a);	// false
System.out.println(a.b);	// 0
System.out.println(a.c);	// 0.0
System.out.println(a.d);	// null
System.out.println();

a.abc();	// 0.0, 0.0null, nullfalse
*/
package classes;

class A {
	boolean a;
	int b;
	double c;
	String d;

	void abc() {
		System.out.println(b + c);
		System.out.println(c + d);
		System.out.println(d + a);
	}
}

class Chap7_ExerciseQ1
{
	public static void main(String[] args) 
	{
		A a = new A();
		System.out.println(a.a);	// false
		System.out.println(a.b);	// 0
		System.out.println(a.c);	// 0.0
		System.out.println(a.d);	// null
		System.out.println();

a.abc();
	}
}
