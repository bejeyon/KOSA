/*
HWJava21_08_Chap13Exercise_배재연.zip

13장 연습문제

Q7. 다음과 같이 클래스 A 내에 이너 인터페이스 B가 있을 때 이너 인터페이스의 객체를 생성하는 코드를 익명 이너 클래스 방법으로 작성하시오
	(객체의 참조 변수명은 ab로 하고, 메서드 오버라이딩일 때 메서드 내부는 비워 둠).

class A {
	interface B {
		void abc();
	}
}

public static void main(String[] args) {
	// 이너 인터페이스의 객체 생성(익명 이너 클래스 이용)
	__________
	__________
	ab.abc();
}
*/
package classes;

class A {
	interface B {
		void abc();
	}
}

class Chap13_ExerciseQ7 {
	public static void main(String[] args) {
		// 이너 인터페이스의 객체 생성(익명 이너 클래스 이용)
		A.B ab = new A.B(){	// 정적 이너 인터페이스만 존재할 수 있다. 만일 이너 인터페이스 앞에 static 제어자를 생략하면 컴파일러가 자동으로 추가
			public void abc(){}	// 인터페이스의 메소드는 반드시 public
		};
		ab.abc();
	}
}
