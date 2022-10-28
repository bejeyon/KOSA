/*
HWJava21_04_AnonymousBook01_배재연.java
*/

package classes;

class A {
	C c = new B();
	void abc() {
		c.bcd();
	}

	class B implements C {
		public void bcd() {
			System.out.println("인스턴스 이너 클래스");
		}
	}
}

interface C {
	public abstract void bcd();
}

class AnonymousClass_1 {
	public static void main(String[] args) {
		// #1. 객체 생성 및 메서드 호출
		A a = new A();
		a.abc();	// 인스턴스 이너 클래스
	}
}
