/*
HWJava14_09_Chap09Summary01_배재연.zip
*/

// 같은 패키지에서 클래스 접근 지정자와 생성자 접근 지정자

package classes;

public class AccessModifierOfClass_1 {
	public static void main(String[] args) {
		//#1. 객체 생성
		A a = new A();	// 선언 가능(A a) + 생성자 호출 가능(new A());
		B b = new B(); //	선언 가능(B b) + 생성자 호출 가능(new B());
		C c = new C(); //	선언 가능(C c) + 생성자 호출 가능(new C());
	}
}
