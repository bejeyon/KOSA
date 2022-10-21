// HWJava16_06_Chap10Summary02_배재연.zip

package classes;

// this() 메서드와 super() 메서드의 혼용

class A {
	A() {
		this(3);
		System.out.println("A 생성자 1");
	}
	A(int a) {
		System.out.println("A 생성자 2");
	}
}

class B extends A {
	B() {
		this(3);
		System.out.println("B 생성자 1");
	}
	B(int a) {
		System.out.println("B 생성자 2");
	}
}

public class SuperMethod_2 {
	public static void main(String[] args) {
		// #1. A 객체 생성
		A aa1 = new A();
		System.out.println();
		A aa2 = new A(3);
		System.out.println();

		// #2. B 객체 생성
		B bb1 = new B();
		System.out.println();
		B bb2 = new B(3);
	}
}
