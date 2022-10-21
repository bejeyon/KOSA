/*
HWJava16_08_Chap10_Exercise_배재연.zip

10장 연습문제

Q10. 클래스 A와 B의 구조는 다음과 같다.

class A {
	A() {
		System.out.println("A 생성자1");
	}
	A(int a) {
		this();
		System.out.println("A 생성자2");
	}
}
class B extends A {
	B() {
		System.out.println("B 생성자1");
	}
	B(int a) {
		super(a);
		System.out.println("B 생성자2");
	}
}

다음 코드의 실행 결과를 쓰시오.

public static void main(String[] args) {
	B bb = new B(5);	// "A 생성자1"\n"A 생성자2"\n"B 생성자2" 출력
}
*/

package classes;

class A {
	A() {
		System.out.println("A 생성자1");
	}
	A(int a) {
		this();
		System.out.println("A 생성자2");
	}
}

class B extends A {
	B() {
		System.out.println("B 생성자1");
	}
	B(int a) {
		super(a);
		System.out.println("B 생성자2");
	}
}

class Chap10_ExerciseQ10 {
	public static void main(String[] args) {
		B bb = new B(5);	// "A 생성자1"\n"A 생성자2"\n"B 생성자2" 출력
	}
}
