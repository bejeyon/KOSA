/*
11장 연습문제

Q2. 다음은 2개의 메서드를 포함하고 있는 클래스 A를 상속받아 클래스 B를 정의하는 코드로, 오류를 포함하고 있다.
	오류가 발생한 위치와 그 이유를 설명하시오.

class A {
	void abc() { System.out.println("클래스 A의 abc() 메서드"); }
	final void bcd() { System.out.println("클래스 A의 bcd() 메서드"); }
}
class B extends A {
	void abc() { System.out. println("클래스 B의 abc() 메서드"); }
	final void bcd() { System.out.println("클래스 B의 bcd() 메서드"); }	// final이 붙어 상수화 된 bcd() 메소드는 오버라이딩이 불가능.
}
*/

package classes;

class A {
	void abc() { System.out.println("클래스 A의 abc() 메서드)"); }
	final void bcd() { System.out.println("클래스 A의 bcd() 메서드"); }
}
class B extends A {
	void abc() { System.out. println("클래스 B의 abc() 메서드"); }
	// final void bcd() { System.out.println("클래스 B의 bcd() 메서드"); }	// final이 붙어 상수화 된 bcd() 메소드는 오버라이딩이 불가능.
}

public class Chap11_ExerciseQ2 {
	public static void main(String[] args) {

	}
}
