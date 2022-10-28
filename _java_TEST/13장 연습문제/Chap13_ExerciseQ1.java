/*
HWJava21_08_Chap13Exercise_배재연.zip

13장 연습문제

Q1. 다음과 같이 클래스 내부에 이너 클래스와 이너 인터페이스가 위치할 때 컴파일 이후 생성되는 모든 .class 파일명을 쓰시오.

class A {
	class B {}
	interface C {}
	class D {
		void def() {
			class E{}
		}
	}
}

==========
A.class
A$B.class
A$C.class
A$D.class
A$D$1E.class
*/
package classes;

class A {
	class B {}
	interface C {}
	class D {
		void def() {
			class E{}
		}
	}
}

class Chap13_ExerciseQ1 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
