/*
HWJava16_08_Chap10_Exercise_배재연.zip

10장 연습문제

Q6. 클래스 A와 B가 다음과 같다.

class A {
	void hello() {
		System.out.println("안녕하세요");
	}
}
class B extends A {
	void hello() {
		System.out.println("반갑습니다");
	}
}

다음 실행 코드의 결과를 쓰시오.

A aa = new A();
aa.hello();	// "안녕하세요" 출력

B bb = new B();
bb.hello();	// "반갑습니다" 출력

A ab = new B();
ab.hello();	// "반갑습니다" 출력
*/

package classes;

class A {
	void hello() {
		System.out.println("안녕하세요");
	}
}

class B extends A {
	void hello() {
		System.out.println("반갑습니다");
	}
}

class Chap10_ExerciseQ6 {
	public static void main(String[] args) {
		A aa = new A();
		aa.hello();

		B bb = new B();
		bb.hello();

		A ab = new B();
		ab.hello();
	}
}
