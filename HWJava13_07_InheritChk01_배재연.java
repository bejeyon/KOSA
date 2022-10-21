/*
HWJava13_07_InheritChk01_배재연.java

## Inherit 상속
	- 부모 클래스의 재산 사용 허용
	- 일반화, 재사용
	- 키워드 : extends
*/

package classes;

class Inherit01 {
	int vI00 = 300;
	void mInherit00() {
		System.out.println("상위 메소드 확인");
	}
}

class InheritChk01 extends Inherit01 {
	int vI01 = 100;
	void mInherit01() {
		System.out.println("하위 메소드 확인");
	}
	
	public static void main(String[] args) {
		InheritChk01 obj = new InheritChk01();
		
		System.out.println(obj.vI01);
		System.out.println(obj.vI00);
		
		obj.mInherit01();
		obj.mInherit00();
	}
}
