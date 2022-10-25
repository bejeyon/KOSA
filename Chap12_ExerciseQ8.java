/* 
HWJava18_09_Chap12Summary_배재연.zip

연습문제

Q8. 다음 인터페이스 A는 디폴트 메서드를 포함하고 있다.
	 자식 클래스에서 부모 클래스의 abc() 메서드를 호출하는 코드를 추가해 다음과 같은 실행 결과가 나오도록 빈칸을 완성하시오.

interface A {
	default void abc() {
		System.out.println("A 인터페이스의 abc()");
	}
}
class B implements A {
	@Override
	public void abc() {
		__________
		__________
		System.out.println("B 클래스의 abc()");
	}
}

B b = new B();
b.abc();

==========
실행 결과
A 인터페이스의 abc()
B 클래스의 abc()
 */

package classes;

interface A {
	default void abc() {
		System.out.println("A 인터페이스의 abc()");
	}
}

class B implements A {
	@Override
	public void abc() {
		A.super.abc();
		System.out.println("B 클래스의 abc()");
	}
}

public class Chap12_ExerciseQ8 {
	public static void main(String[] args) {
		B b = new B();
		b.abc();
	}
}
