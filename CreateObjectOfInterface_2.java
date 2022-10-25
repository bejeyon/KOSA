/* 익명 이너 클래스를 활용해 인터페이스 객체 생성(방법#2) */

package classes;

interface A {
	int a = 3;
	void abc();
}

public class CreateObjectOfInterface_2 {
	public static void main(String[] args) {
		// 객체 생성
		A a1 = new A() {
			public void abc() {
				System.out.println("방법 2. 익명 이너 클래스를 이용한 객체 생성");
			}
		};	// 세미콜론 필수
		A a2 = new A() {
			public void abc() {
				System.out.println("방법 2. 익명 이너 클래스를 이용한 객체 생성");
			}
		};	// 생성자 호출 때마다 오버라이딩 해줘야 함

		// 메서드 호출
		a1.abc();
		a2.abc();
	}
}
