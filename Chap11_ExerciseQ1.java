/*
11장 연습문제

Q1. 다음의 클래스 A는 오류를 포함하고 있다. 오류가 발생한 위치와 그 이유를 설명하시오.

class A {
	int a = 3;
	final int b = 5;
	A() {
		a =7;
		b = 9;	// final이 붙어 상수화된 필드 b는 값을 재할당 할 수 없음.
	}
}
*/

package classes;

class A {
	int a = 3;
	final int b = 5;
	A() {
		a =7;
		// b = 9;	// final이 붙어 상수화된 필드 b는 값을 재할당 할 수 없음.
	}
}

public class Chap11_ExerciseQ1 {
	public static void main(String[] args) {

	}
}
