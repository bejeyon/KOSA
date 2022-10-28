/*
HWJava21_08_Chap13Exercise_배재연.zip

13장 연습문제

Q8. 다음과 같이 이너 인터페이스 내부에 static 메서드가 있을 때 이 메서드를 호출하는 코드를 작성하시오.

class A {
	interface B {
		static void bcd() {
			System.out.println("이너 인터페이스 내 static 메서드");
		}
	}
}

public static void main(String[] args) {
	// 이너 인터페이스의 static 메서드 호출
	__________
	__________
}

실행 결과
이너 인터페이스 내 static 메서드
*/
package classes;

class A {
	interface B {
		static void bcd() {
			System.out.println("이너 인터페이스 내 static 메서드");
		}
	}
}

class Chap13_ExerciseQ8 {
	public static void main(String[] args) {
		// 이너 인터페이스의 static 메서드 호출
		A.B.bcd();
	}
}
