/* 
HWJava18_09_Chap12Summary_배재연.zip

연습문제

Q2. 다음과 같이 클래스 A와 클래스 B의 상속 관계가 있을 때 실행코드(a.abc())의 결과가 "안녕하세요"가 나오도록 클래스 B 내부의 코드를 완성하시오.

abstract class A {
	abstract void abc();
}
class B extends A {
	__________
}

A a = new B();
a.abc();	// 안녕하세요
 */

package classes;

abstract class A {
	abstract void abc();
}

class B extends A {
	public void abc() {
		System.out.println("안녕하세요");
	}
}

public class Chap12_ExerciseQ2 {
	public static void main(String[] args) {
		A a = new B();
		a.abc();	// 안녕하세요
	}
}
