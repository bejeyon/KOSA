/*
HWJava21_08_Chap13Exercise_배재연.zip

13장 연습문제

Q2. 클래스 A 내부에 이너 클래스 B가 있을 때 다음 코드와 같이 b.bcd()의 결과가 "이너 클래스의 메서드"로 출력되도록
	이너 클래스 객체를 생성하는 코드를 작성하시오(참조 변수명은 b로 정함).

class A {
	class B {
		void bcd() {
			System.out.println("이너 클래스의 메서드");
		}
	}
}

public static void main(String[] args) {

	// 이너 클래스 B의 객체 생성(참조 변수명 b)
	__________
	__________
	b.bcd();
}
*/
package classes;

class A {
	class B {
		void bcd() {
			System.out.println("이너 클래스의 메서드");
		}
	}
}

class Chap13_ExerciseQ2 {
	public static void main(String[] args) {
		// 이너 클래스 B의 객체 생성(참조 변수명 b)
		A.B b = new A().new B();
		b.bcd();
	}
}
