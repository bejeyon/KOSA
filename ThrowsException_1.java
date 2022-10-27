/*
HWJava20_04_Chap14Summary02_배재연.java
*/

/* 직접 예외 처리를 할 때와 호출 메서드로 예외를 전가할 때 */

package classes;

// 1. 하위 메서드에서 직접 예외를 처리할 때
class A {
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Thread.sleep(1000);	// 일반 예외: InterruptedException
		}
		catch (InterruptedException e) {
			// 예외 처리 구문
		}
	}
}

// 2. 예외를 호출 메서드로 전가할 때
class B {
	void abc() {
		try {
			bcd();	// 일반 예외: InterruptedException
		}
		catch (InterruptedException e) {
			// 예외 처리 구문
		}
	}
	void bcd() throws InterruptedException {
			Thread.sleep(1000);	// 일반 예외: InterruptedException		
	}
}

class ThrowsException_1 {
	public static void main(String[] args) {

	}
}
