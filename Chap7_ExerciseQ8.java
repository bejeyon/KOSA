/* 7장 연습문제
Q8. 클래스 A 내부에는 2개의 생성자가 정의돼 있다.

class A {
	int a, b, c, d;
	A() {

	}
	A(int k) {
		a = k;
		b = k;
		c = k;
		d = k;
	}
}

다음과 같이 객체를 생성하고 각 필드값을 출력했을 때 모든 필드값으로 5가 출력되도록 A() 내부에 1줄의 코드를 추가하시오.

A a = new A();
System.out.println(a.a);
System.out.println(a.b);
System.out.println(a.c);
System.out.println(a.d);

실행결과
5
5
5
5
*/

package classes;

class A {
	int a, b, c, d;
	A() {
		this(5);
	}
	A(int k) {
		a = k;
		b = k;
		c = k;
		d = k;
	}
}

class Chap7_ExerciseQ8
{
	public static void main(String[] args) 
	{
		A a = new A();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
	}
}
