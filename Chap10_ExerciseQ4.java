/*
HWJava16_08_Chap10_Exercise_배재연.zip

10장 연습문제

Q4. 상속 구조가 다음과 같다. 다음 중 타입 변환이 올바른 것은 O, 잘못된 것은 X에 표시하시오.

A
↑
B	← ┐
↑		│
C		E
↑
D

A a1 = new A();
B b1 = (B)a1;		( / X)
C c1 = (C)a1;		( / X)
D d1 = (D)a1;		( / X)
E e1 = (E)a1;		( / X)

A a2 = new B();
B b2 = (B)a2;		(O / )
C c2 = (C)a2;		( / X)
D d2 = (D)a2;	( / X)
E e2 = (E)a2;		( / X)

A a3 = new C();
B b3 = (B)a3;		(O / )
C c3 = (C)a3;		(O / )
D d3 = (D)a3;	( / X)
E e3 = (E)a3;		( / X)
*/

package classes;

class Chap10_ExerciseQ4 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
