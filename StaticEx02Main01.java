/*
HWJava14_14_StaticEx02_배재연.java
*/

package classes;

class StaticEx02 {
	int vI01 = 10;
	static int vI02 = 20;
	void mStatic01() {
		vI01++;
		vI02++;
	}
	static void mStatic02() {
		vI01++;	// error: non-static variable vI01 cannot be referenced from a static context. static 메소드는 static 변수만 사용 가능
		vI02++;
	}
}

class StaticEx02Main01 extends StaticEx02 {
	/*
		void mStatic02() {	// error. static 메소드는 override 불가능
		vI01++;
		vI02++;
	}
	*/
	public static void main(String[] args) {
		
	}
}
