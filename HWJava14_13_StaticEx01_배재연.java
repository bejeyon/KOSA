/*
HWJava14_13_StaticEx01_배재연.java

## 메모리 영역

Class					Stack					Heap
-------------------------------------------------
int vI02 = 20;
				21		obj01	→				vI01 = 10;
																11
				22	obj02	→				vI01 = 10;
																11
				23	obj03	→				vI01 = 10;
																11
*/

package classes;

public class StaticEx01 {
	int vI01 = 10;
	static int vI02 = 20;

	void mView() {
		vI01++;
		vI02++;
	}
	
	void mPrint() {
		System.out.print(this.vI01 + "\t");
		System.out.println(this.vI02);
	}

	public static void main(String[] args) {
		StaticEx01 obj01 = new StaticEx01();
		StaticEx01 obj02 = new StaticEx01();
		StaticEx01 obj03 = new StaticEx01();
		
		obj01.mView();
		obj01.mPrint();

		obj02.mView();
		obj02.mPrint();

		obj03.mView();
		obj03.mPrint();
	}
}
