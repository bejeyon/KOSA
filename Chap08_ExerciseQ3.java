/*
8장 연습문제
Q2~Q3. 다음과 같이 pack01 패키지 내부에는 클래스 A, pack02 패키지 내부에는 클래스 B가 정의돼 있다.
			클래스 B 내부의 bcd() 메서드를 실행해 클래스 A의 객체를 생성한 후 필드를 출력하려고 하니 오류가 발생했다.

package pack01;

public class A {
	public int m = 3;
	public int n = 5;
}

----------------------

package pack02;

public class B {
	void bcd() {
		A a = new A();	// 오류 발생
		System.out.println(a.m);
		System.out.println(a.n);
	}
}

===============================

Q3. 임포트를 사용해 클래스 B의 코드를 수정하시오.

package pack02;

import pack01.A;

public class B {
	void bcd() {
		A a = new A();	// 오류 발생
		System.out.println(a.m);
		System.out.println(a.n);
	}
}
*/

package classes;

public class Chap08_ExerciseQ3 {
	public static void main(String[] args) {

	}
}
