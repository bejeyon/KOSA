/*
HWJava21_08_Chap13Exercise_배재연.zip

13장 연습문제

Q4. 클래스 A 내부에 이너 클래스 B가 있을 때 다음 코드와 같이 ab.bcd()의 결과가 "정적 이너 클래스의 메서드"가 출력되도록
	정적 이너 클래스의 객체를 생성하는 코드를 작성하시오(참조 변수명은 ab로 정함).

class A {
	static class B {
		void bcd() {
			System.out.println("정적 이너 클래스의 메서드");
		}
	}
}

public static void main(String[] args) {
	// 정적 이너 클래스 B의 객체 생성(참조 변수명 ab)
	__________
	__________
	ab.bcd();
}

실행 결과
정적 이너 클래스의 메서드
*/
package classes;

class A {
	static class B {
		void bcd() {
			System.out.println("정적 이너 클래스의 메서드");
		}
	}
}

class Chap13_ExerciseQ4 {
	public static void main(String[] args) {
		// 정적 이너 클래스 B의 객체 생성(참조 변수명 ab)
		A.B ab = new A.B();
		ab.bcd();
	}
}
