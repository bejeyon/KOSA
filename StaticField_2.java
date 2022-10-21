/*
HWJava15_02_Chap09Summary02_배재연.java
*/

// 정적 필드의 공유 기능

package classes;

class A {
	int m = 3;	// 인스턴스 필드
	static int n = 5;	// 정적 필드
}

class StaticField_2 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();

		// 인스턴스 필드
		a1.m = 5;
		a2.m = 6;
		System.out.println(a1.m);	// 5 출력
		System.out.println(a2.m);	// 6 출력

		// 정적 필드
		a1.n = 7;
		a2.n = 8;
		System.out.println(a1.n);	// 8 출력
		System.out.println(a2.n);	// 8 출력

		A.n = 9;
		System.out.println(a1.n);	// 9 출력
		System.out.println(a2.n);	// 9 출력
	}
}
