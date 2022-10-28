/*
HWJava21_05_AnonymousBook02_배재연.zip
*/

/* 클래스 미정의 및 참조 변수명을 사용/미사용했을 때 입력매개변수 객체 전달 */

package classes;

interface A {
	public abstract void abc();
}
class C {
	void cde(A a) {
		a.abc();
	}
}

public class AnonymousClass_4 {
	public static void main(String[] args) {
		C c = new C();
		// 방법 3. 클래스명 X + 참조 변수명 O
		A a = new A() {
			public void abc() {
				System.out.println("입력매개변수 전달");
			}
		};
		c.cde(a);
		// 방법 4. 클래스명 X + 참조 변수명 X
		c.cde(new A() {
				public void abc() {
					System.out.println("입력매개변수 전달");	// 이거 좀 괴랄한 듯
				}
			}
		);
	}
}
