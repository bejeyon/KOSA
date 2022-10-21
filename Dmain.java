/*
HWJava15_04_MultiExtendsChk01_배재연.java
*/

package classes;

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
		Dmain obj = new Dmain();
	}
}
