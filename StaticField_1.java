/*
HWJava15_02_Chap09Summary02_배재연.java
*/

// 인스턴스 필드와 정적 필드의 활용 방법

package classes;

class A {
	int m = 3;	// 인스턴스 필드
	static int n = 5;	// 정적 필드
}

class StaticField_1 {
	public static void main(String[] args) {
		// #1. 인스턴스 필드 활용 방법(항상 객체를 생성한 후 사용 가능)
		A a1 = new A();
		System.out.println(a1.m);	// 3 출력

		// #2. 정적(static) 필드 활용 방법
		// @방법#1. (객체 생성 없이 클래스명으로 바로 활용)
		System.out.println(A.n);	// 5 출력
		// @방법#2. (객체 생성 후 활용 : 인스턴스와 동일) : 가능한 지양
		A a2 = new A();
		System.out.println(a2.n);	// 5 출력
	}
}
