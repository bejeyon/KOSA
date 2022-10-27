/*
HWJava20_04_Chap14Summary02_배재연.java
*/

/* 여러 개의 예외 한꺼번에 전가하기 */

package classes;

// 1. 하위 메서드에서 직접 예외를 처리할 때
class A {
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object");	// ClassNotFoundException
			Thread.sleep(1000);	// InterruptedException
		}
		catch (InterruptedException | ClassNotFoundException e) {
			// 예외 처리 구문
		}
	}
}

// 2. 예외를 호출 메서드로 전가할 때
class B {
	void abc() {
		try {
			bcd();	// InterruptedException
		}
		catch (InterruptedException | ClassNotFoundException e) {
			// 예외 처리 구문
		}
	}
	void bcd() throws InterruptedException, ClassNotFoundException {
			Class cls = Class.forName("java.lang.Object");	// ClassNotFoundException
			Thread.sleep(1000);	// InterruptedException		
	}
}

class ThrowsException_3 {
	public static void main(String[] args) {

	}
}
