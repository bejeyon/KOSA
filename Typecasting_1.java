package classes;

// 클래스의 업캐스팅 및 다운캐스팅

// 다운캐스팅의 경우 다형성될 때 업캐스팅 당한 원본 객체가 다시 다운캐스팅 당한 후에 저장될 객체 변수보다 같거나 작아야 오류가 발생하지 않음.

//클래스의 상속 관계
class A {}
class B extends A {}
class C extends B {}
class D extends B {}

public class Typecasting_1 {
	public static void main(String[] args) {
		// #1. 업캐스팅(자동 변환) : 캐스팅 구문을 생략했을 때 컴파일러가 자동으로 추가
		A ac = (A) new C();	// C → A 업캐스팅(자동 변환)
		A bc = (B) new C();	// C → B 업캐스팅(자동 변환)
		
		B bb = new B();
		A a = (A) bb;	// B → A 업캐스팅(자동 변환)

		// #2-1. 다운캐스팅(수동 변환) : 캐스팅이 불가능한 경우(실행 시 예외 발생)
		A aa = new A();
		// B b = (B) aa;	// A → B 다운캐스팅(수동 변환) : 불가능
		// C c = (C) aa;	// A → C 다운캐스팅(수동 변환) : 불가능

		// #2-2. 다운캐스팅(수동 변환) : 캐스팅이 가능한 경우
		A ab = new B();
		B b = (B) ab;	// A → B 다운캐스팅(수동 변환)
		// C c = (C) ab;	// A → C 다운캐스팅(수동 변환) : 불가능

		B bd = new D();
		D d = (D) bd;	// B → D 다운캐스팅(수동 변환)

		A ad = new D();
		B a1 = (B) ad;	// A → B 다운캐스팅(수동 변환)
		D d1 = (D) ad;	// A → D 다운캐스팅(수동 변환)
	}
}

// 다운캐스팅의 경우 다형성될 때 업캐스팅 당한 원본 객체가 다시 다운캐스팅 당한 후에 저장될 객체 변수보다 같거나 작아야 오류가 발생하지 않음.