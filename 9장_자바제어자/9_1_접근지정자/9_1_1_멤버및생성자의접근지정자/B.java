/*
HWJava14_09_Chap09Summary01_배재연.zip
*/

// 멤버 및 생성자에 적용되는 네 가지 접근 지정자

package classes.pack1;

public class B {
	public void print() {	// a, b, c, d
		// # 객체 생성
		A a = new A();	// 객체 생성 가능

		// # 멤버 활용
		System.out.print(a.a+ " ");	// 가능
		System.out.print(a.b+ " ");	// 가능
		System.out.print(a.c+ " ");	// 가능
		// System.out.print(a.d);	// 불가능
		System.out.println();
	}
}
