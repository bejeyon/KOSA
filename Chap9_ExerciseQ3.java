/*
HWJava15_02_Chap09Summary02_배재연.zip
9장 연습문제

Q3. 패키지 pack01 내에는 A.java, B.java 파일, 패키지 pack02 내에는 C.java, D.java 파일이 있다.
	  이들 4개의 소스 파일에서 클래스 A에 포함된 4개의 필드를 사용하고자 한다.
	  이 때 각 클래스 위치에서 사용할 수 있는 모든 필드를 쓰시오.

==================================================
package pack01;

public class A {
	public int a;
	protected int b;
	int c;
	private int d;

	void abc() {
		System.out.println(this._____);	// a, b, c, d
	}
}
--------------------------------------------------
package pack01;

public class B {
	void bcd() {
		A a = new A();
		System.out.println(a._____);	// a, b, c
	}
}
==================================================
package pack02;

import pack01.A;

public class C {
	void cde() {
		A a = new A();
		System.out.println(a._____);	// a
	}
}
--------------------------------------------------
package pack02;

import pack01.A;

public class D extends A {
	void def() {
		System.out.println(this._____);	// a, b
	}
}
==================================================
*/

package classes;

class Chap9_ExerciseQ3 {
	public static void main(String[] args) {
		
	}
}
