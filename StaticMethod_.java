/* 인터페이스 내 정적 메서드 */

package classes;

interface A {
	static void abc() {
		System.out.println("A 인터페이스의 정적 메서드 abc()");
	}
}

public class StaticMethod_ {
	public static void main(String[] args) {
		// 정적 메서드 호출
		A.abc();
	}
}
