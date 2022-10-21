/*
HWJava16_08_Chap10_Exercise_배재연.zip

10장 연습문제

Q7. 다음과 같이 클래스 A를 상속받아 B, C, D, E 클래스를 생성하고자 한다. 다음 중 오류를 포함하고 있는 클래스는 무엇이고, 오류가 발생한 이유는 무엇인지 쓰시오.

class A {
	void method() {
	}
}
class B extends A {
	public void method() {
	}
}
class C extends A {
	protected void method() {
	}
}
class D extends A {
	void method() {
	}
}
class E extends A {	// error. 자식 클래스는 부모 클래스보다 접근지정자 범위가 더 좁을 수 없음.
	private void method() {
	}
}

오류를 포함하고 있는 클래스 명 : E
오류가 발생한 이유 : 자식 클래스는 부모 클래스보다 접근지정자 범위가 더 좁을 수 없음.
*/

package classes;

class Chap10_ExerciseQ7 {
	public static void main(String[] args) {
		
	}
}
