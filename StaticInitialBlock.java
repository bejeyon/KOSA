/*
HWJava15_02_Chap09Summary02_배재연.java
*/

// 정적 초기화 블록

package classes;

class A {
	int a;
	static int b;
	static {
		b = 5;	// static 필드의 초기화는 static {} 내에서 수행
		System.out.println("클래스 A가 로딩되었습니다!!");
	}
	A() {
		a = 3;	// instance 필드의 초기화는 일반적으로 생성자에서 수행
		// b = 5;
		System.out.println("생성자 블록 확인!!");
	}
}

class StaticInitialBlock {
	public static void main(String[] args) {
		System.out.println(A.b);	// 5 출력
		A a1 = new A();	// 생성자 블럭이 우선되어 "클래스 A가 로딩되었습니다!!"가 먼저 출력됨
	}
}
