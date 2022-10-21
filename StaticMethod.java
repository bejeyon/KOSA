/*
HWJava15_02_Chap09Summary02_배재연.java
*/

// 인스턴스 메서드와 정적 메서드

package classes;

class A {
	void abc() {	// 인스턴스 메서드
		System.out.println("instance 메서드");
	}
	static void bcd() {	// 정적 메서드
		System.out.println("static 메서드");
	}
}

class StaticMethod {
	public static void main(String[] args) {
		// #1. 인스턴스 메서드 활용 방법(객체 생성 후에만 사용 가능)
		A a1 = new A();
		a1.abc();	// instance 메서드

		// #2. 정적 메서드 활용 방법
		// @방법1. 클래스 이름으로 바로 접근하여 사용
		A.bcd();	// static 메서드
		// @방법2. 객체 생성 후에도 사용 가능 : 가능한 지양
		A a2 = new A();
		a2.bcd();	// static 메서드
	}
}
