/*
HWJava21_15_LambdaEx06_배재연.java
*/

/* 배열의 생성자 참조 */

package classes;

interface A {
	int[] abc(int len);
}

public class RefOfArrayConstructor {
	public static void main(String[] args) {
		// 1. 익명 이너 클래스
		A a1 = new A() {
			@Override
			public void abc(B b, int k) {
				b.bcd(k);
			}
		};
		// 2. 람다식
		A a2 = (B b, int k) -> {b.bcd(k);};
		// 3. 직접 정의한 인스턴스 메서드 참조
		A a3 = B::bcd;
		a1.abc(new B(), 3);
		a2.abc(new B(), 3);
		a3.abc(new B(), 3);
	}
}
