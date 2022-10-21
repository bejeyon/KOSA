/*
HWJava16_08_Chap10_Exercise_배재연.zip

10장 연습문제

Q3. 다음과 같은 상속 관계에서 다형적 표현을 사용한 객체 생성 코드 중 올바른 것은 O, 잘못된 것은 X에 표시하시오.

		A
	↗		↖
B				C
↑
D

// 다형적 표현
A a1 = new A();		(O / )
A a2 = new B();		(O / )
A a3 = new C();		(O / )
A a4 = new D();		(O / )

B b1 = new A();		( / X)
B b2 = new B();		(O / )
B b3 = new C();		( / X)
B b4 = new D();		(O / )

C c1 = new A();		( / X)
C c2 = new B();		( / X)
C c3 = new C();		(O / )
C c4 = new D();		( / X)

D d1 = new A();		( / X)
D d2 = new B();		( / X)
D d3 = new C();		( / X)
D d4 = new D();		( / X)
*/

package classes;

class Chap10_ExerciseQ3 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
