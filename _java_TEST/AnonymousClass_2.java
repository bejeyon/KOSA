/*
HWJava21_04_AnonymousBook01_배재연.java
*/

package classes;

interface C {
	public abstract void bcd();
}

class A {
	C c = new C() {
		public void bcd() {
			System.out.println("익명 이너 클래스");
		}
	};
	void abc() {
		c.bcd();
	}
}

class AnonymousClass_2 {
	public static void main(String[] args) {
		// #1. 객체 생성 및 메서드 호출
		A a = new A();
		a.abc();	// 익명 이너 클래스
	}
}
