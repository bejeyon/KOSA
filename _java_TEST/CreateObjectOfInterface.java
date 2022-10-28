/*
HWJava21_06_AnonyInterface_배재연.java
*/

/* 이너 인터페이스의 2가지 객체 생성 방법 */

package classes;

class A {
	// int vI01 = 10;	// inner interface는 자동 static 지정자 붙으므로 내부에서는 static 변수만 사용 가능
	static int vI01 = 10;
	interface B {
		default void mV01() {
			vI01 = 20;	// inner interface는 자동 static 지정자 붙으므로 내부에서는 static 변수만 사용 가능
		}
		public abstract void bcd();
	}
}

class C implements A.B {
	public void bcd() {
		System.out.println("이너 인터페이스 구현 클래스 생성");
	}
}

public class CreateObjectOfInterface {
	public static void main(String[] args) {
		// 객체 생성 방법 #1(자식 클래스 직접 생성)
		A.B ab = new C();
		C c = new C();
		c.bcd();
		// 객체 생성 방법 #2(익명 이너 클래스 생성)
		A.B b = new A.B() {
			public void bcd() {
				System.out.println("익명 이너 클래스로 객체 생성");
			}
		};
		b.bcd();
	}
}
