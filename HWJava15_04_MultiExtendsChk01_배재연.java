/*
HWJava15_04_MultiExtendsChk01_배재연.java
*/

package classes;
// 상속받은 클래스의 객체 생성 시 최상위 클래스의 객체부터 차례로 생성됨.
class D1 {
	D1() {
		System.out.println("D1() 생성자 확인");
	}
}

class D2 extends D1 {
	D2() {
		System.out.println("D2() 생성자 확인");
	}
}

class D3 extends D2 {
	D3() {
		System.out.println("D3() 생성자 확인");
	}
}

class Dmain extends D3 {
	Dmain() {
		System.out.println("Dmain() 생성자 확인");
	}

	public static void main(String[] args) {
		Dmain obj = new Dmain();	// 현재 클래스의 생성자를 호출 >> but 상속을 받았기 때문에 객체 생성 전 상위 클래스의 객체를 먼저 생성한다.
	}
}
