/*
HWJava15_02_Chap09Summary02_배재연.zip
9장 연습문제

Q4. 다음 코드는 오류를 포함하고 있다. 오류가 발생한 위치와 그 이유를 설명하시오.

class A {
	int a = 2;
	static int b = 3;
	void abc() {
		System.out.println(a);
		System.out.println(b);
	}
	static void bcd() {
		System.out.println(a);	// error. 정적 메서드 내부에서는 정적 변수만 사용 가능함.
		System.out.println(b);
	}
}
*/

package classes;

class A {
	int a = 2;
	static int b = 3;
	void abc() {
		System.out.println(a);
		System.out.println(b);
	}
	static void bcd() {
		System.out.println(a);	// error. 정적 메서드 내부에서는 정적 변수만 사용 가능함.
		System.out.println(b);
	}
}

class Chap9_ExerciseQ4 {
	public static void main(String[] args) {
		
	}
}
