/*
HWJava21_08_Chap13Exercise_배재연.zip

13장 연습문제

Q5. 다음과 같이 이너 클래스 B는 bcd() 메서드를 포함하고 있으며, 여기에는 4줄의 실행문이 포함돼있다. 
	각 실행문의 가능 여부를 O, X로 표기하고, X라면 그 이유를 쓰시오.

class A {
	int a = 3;
	static int b = 4;
	void method1() {
	}

	static void method2() {
	}
	static class B {
		void bcd() {
			System.out.println(a);
			System.out.println(b);
			method1();
			method2();
		}
	}
}

			실행문					실행문 가능 여부(O, X)				오류가 발생한 이유
System.out.println(a);						X						정적 이너 클래스 내부에서는 아우터 클래스의 정적 멤버만 사용할 수 있음.
System.out.println(b);						O
		method1();								X						정적 이너 클래스 내부에서는 아우터 클래스의 정적 멤버만 사용할 수 있음.
		method2();								O
*/
package classes;

class A {
	int a = 3;
	static int b = 4;
	void method1() {
	}

	static void method2() {
	}
	static class B {
		void bcd() {
			System.out.println(a);	// error: non-static variable a cannot be referenced from a static context
			System.out.println(b);
			method1();	// error: non-static variable a cannot be referenced from a static context
			method2();
		}
	}
}

class Chap13_ExerciseQ5 {
	public static void main(String[] args) {

	}
}
