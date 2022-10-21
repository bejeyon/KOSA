/*
HWJava14_11_FinalChk_배재연.java

## final 지정자
	- 01. 상수 : 항상 같은 수
	- 02. XXX_XXX : 모든 변수명은 대문자와 under bar로.
	- 03. class : inherit 불가능
	- 04. MV : assign 불가능
	- 05. MM : override 불가능

1. 4 Line : final 지정자 붙임
	>> 12 Line Error Chk
	// inherit 안 되니까

2. 5 Line : final 지정자 붙임
	- 20 Line -> 21 Line
	   └> super.k = 50;
	>> 20 Line Error Chk
	// assign 안 되니까

3. 6 Line : final
	>> 15 Line Error Chk
	// override 안 되니까
*/

package classes;

class FinalEx01 {
	int vI01 = 10;
	final void mView() {
		System.out.println("부모 메소드 확인!!!");
	}
}

public class FinalChk03 extends FinalEx01 {
	int vI01 = 20;
	
	void mView() {
		System.out.println("자식 메소드 확인!!!");
	}
	
	void mPrint() {
		System.out.println(vI01);
		System.out.println(this.vI01);
		super.vI01 = 50;
		System.out.println(super.vI01);
		mView();
		this.mView();
		super.mView();
	}

	public static void main(String[] args) {
		FinalChk03 obj = new FinalChk03();
		obj.mPrint();
	}
}
