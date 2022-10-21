/*
HWJava14_10_OverrideChk_배재연.zip
*/

package classes;

class OverrideEx01 {
	int vI01 = 10;
	void mView() {
		System.out.println("부모 메소드 확인!!!");
	}
}

public class OverrideMain extends OverrideEx01 {
	int vI01 = 20;
	
	void mView() {
		System.out.println("자식 메소드 확인!!!");
	}
	
	void mPrint() {
		System.out.println(vI01);
		System.out.println(this.vI01);
		System.out.println(super.vI01);
		mView();
		this.mView();
		super.mView();
	}

	public static void main(String[] args) {
		OverrideMain obj = new OverrideMain();
		obj.mPrint();
	}
}
