/* 인터페이스 내 필드 및 메서드의 제어자 */

package classes;

interface A {
	public static final int a = 3;
	public abstract void abc();
}

interface B {
	int b = 3;	// 생략했을 때 자동으로 public static final
	void abc();	// 생략했을 때 자동으로 public abstract
}

public class InterfaceCharacteristics {
	public static void main(String[] args) {
		// static 자동 추가 확인
		System.out.println(A.a);
		System.out.println(B.b);

		// final 자동 추가 확인
		//A.a = 5;	// 불가능 error: cannot assign a value to final variable a
		//B.b = 5;	// 불가능 error: cannot assign a value to final variable b
	}
}
