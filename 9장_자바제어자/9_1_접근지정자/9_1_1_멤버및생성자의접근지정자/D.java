/*
HWJava14_09_Chap09Summary01_배재연.zip
*/

// 멤버 및 생성자에 적용되는 네 가지 접근 지정자

package classes.pack2;

import classes.pack1.A;

public class D extends A {
	public void print() {	// a, b, c, d
		// # 멤버 활용
		System.out.print(a + " ");	// 가능
		System.out.print(b + " ");	// 가능
		// System.out.print(a.c+ " ");	// 불가능
		// System.out.print(a.d);	// 불가능
		System.out.println();
	}
}
