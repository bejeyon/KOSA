/*
HWJava20_04_Chap14Summary02_배재연.java
*/

/* 예외 객체의 대표적인 메서드 printStackTrace() */

package classes;

class A {
	void abc() throws NumberFormatException {
		bcd();
	}
	void bcd() throws NumberFormatException {
		cde();
	}
	void cde() throws NumberFormatException {
		int num = Integer.parseInt("10A");	// 예외 발생
	}
}

public class ExceptionMethod_2 {
	public static void main(String[] args) {
		// 1. 객체 생성
		A a = new A();
		// 2. 메서드 호출 + 예외 처리
		try {
			a.abc();
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
