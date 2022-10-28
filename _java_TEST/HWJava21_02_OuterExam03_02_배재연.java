/*
HWJava21_02_OuterExam03_02_배재연.java
*/
/* 지역 이너 클래스의 컴파일 이후 생성 클래스 파일 */

package classes;

class A {
	void abc() {
		class B {}
		class C {}
	}
	void bcd() {
		class C {}
		class D {}
	}
}

class OuterExam03_02 {
	public static void main(String[] args) {

	}
}
