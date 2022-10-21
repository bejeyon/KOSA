/*
HWJava13_01_ThisConsEx01_배재연.java
파일명 ] ThisConsEx01.java
method : 생성자(int vI01)
	print : "매개변수가 하나인 생성자 : " + vI01
	this(vI01, 30)	// error : this() method는 문장의 첫 라인에 위치해야 함.

method : 생성자(int vI02, int vI03)
	print : "매개변수가 두 개인 생성자 : " + (vI02 + vI03)

main() method
	ThisConsEx01 obj = new ThisConsEx01(20);
*/

package classes;

class ThisChk01
{
	int vI01;
	void mTest()
	{
		int vI01 = 10;
		System.out.println(this.vI01);
	}

	public static void main(String[] args) 
	{
		ThisChk01 obj = new ThisChk01();
		obj.mTest();
	}
}
