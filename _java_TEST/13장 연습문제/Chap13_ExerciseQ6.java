/*
HWJava21_08_Chap13Exercise_배재연.zip

13장 연습문제

Q6. 다음 코드는 오류를 포함하고 있다. 오류가 발생한 위치와 그 이유를 설명하시오.

class A {
	int m = 3;
	int n = 5;
	void abc() {
		int n = 5;
		class B {
			void bcd() {
				m = m + 1; System.out.println(m);
				n = n + 1; System.out.println(n);	// 지역 이너 클래스는 자신이 정의된 메서드의 지역 변수를 사용할 때는
																	반드시 해당 지역 변수가 final로 선언돼야 함.
			}
		}
	}
}

오류가 발생한 번호										오류가 발생한 이유

*/
package classes;

class A {
	int m = 3;
	int n = 5;
	void abc() {
		int n = 5;
		class B {
			void bcd() {
				m = m + 1; System.out.println(m);
				n = n + 1; System.out.println(n);	// error: local variables referenced from an inner class must be final or effectively final
			}
		}
	}
}

class Chap13_ExerciseQ6 {
	public static void main(String[] args) {

	}
}
