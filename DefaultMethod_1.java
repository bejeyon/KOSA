/* 인터페이스 구현 및 디폴트 메서드의 오버라이딩 */

package classes;

interface A {
	void abc();
	default void bcd() {	// 인터페이스 내 default method는
		System.out.println("A 인터페이스의 bcd()");
	}
}

class B implements A {	// 재구현 안 해도 되고
	public void abc() {
		System.out.println("B 클래스의 abc()");
	}
}

class C implements A {
	public void abc() {
		System.out.println("C 클래스의 abc()");
	}
	public void bcd() {	// 재구현 해도 된다.
		System.out.println("C 클래스의 bcd()");
	}
}

public class DefaultMethod_1 {
	public static void main(String[] args) {
		// 객체 생성
		A a1 = new B();
		A a2 = new C();

		// 메서드 호출
		a1.abc();	// "B 클래스의 abc()" 출력
		a1.bcd();	// "A 인터페이스의 bcd()" 출력
		a2.abc();	// "C 클래스의 abc()" 출력
		a2.bcd();	// "C 클래스의 bcd()" 출력
	}
}
