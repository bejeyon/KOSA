/*
HWJava21_08_Chap13Exercise_배재연.zip

13장 연습문제

Q3. 실행 결과가 "클래스 A 메서드"가 나오도록 이너 클래스 B의 bcd() 메서드에서 클래스 A의 print() 메서드를 호출하는 코드를 작성하시오.

class A {
	void print() {
		System.out.println("클래스 A 메서드");
	}
	class B {
		void print() {
			System.out.println("클래스 B 메서드");
		}
		void bcd() {
		__________
		__________
		}
	}
}

public static void main(String[] args) {
	A a = new A();
	A.B ab = a.new B();
	ab.bcd();
}

실행 결과
클래스 A 메서드
*/
package classes;

class A {
	void print() {
		System.out.println("클래스 A 메서드");
	}
	class B {
		void print() {
			System.out.println("클래스 B 메서드");
		}
		void bcd() {
			A.this.print();
		}
	}
}

class Chap13_ExerciseQ3 {
	public static void main(String[] args) {
		A a = new A();
		A.B ab = a.new B();
		ab.bcd();
	}
}
