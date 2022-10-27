/*
HWJava20_04_Chap14Summary02_배재연.java

연습문제

Q6. 클래스 A 내부에는 abc() 메서드와 bcd() 메서드가 있으며, bcd() 메서드에는 예외 처리 구문을 포함하고 있다.

class A {
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Thread.sleep(1000);
			Class.forName("java.lang.Object");
		}
		catch (InterruptedException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

이 때 bcd()가 예외를 직접 처리하지 않고 전가할 때의 코드를 완성하시오.

class A {
	void abc() {
		__________
		__________
		__________
	}
	void bcd() __________ {
		Thread.sleep(1000);
		Class.forName("java.lang.Object");
	}
}
*/
package classes;

class A {
	void abc() {
		try {
			bcd();
		}
		catch (InterruptedException | ClassNotFoundException e) {
			// 예외 처리 구문
		}
	}
	void bcd() throws InterruptedException, ClassNotFoundException {
		Thread.sleep(1000);
		Class.forName("java.lang.Object");
	}
}

class Chap14_ExerciseQ6 {
	public static void main(String[] args) {

	}
}
