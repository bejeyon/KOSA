/* HWJava20_09_OuterExam02_배재연.java */

package classes;

class OuterExam02 {
	int vI01 = 10;
	
	static int vI02 = 20;
	
	void mPrint() {
		System.out.println("vI01 = " + vI01);
		System.out.println("vI02 = " + vI02);
	}

	static class Inner2 {
		int vInn01 = 30;
		static int vInn02 = 50;	// ? static class 내부 필드와 메소드에 static 붙이고 안 붙이고는 무슨 차이?
		void mPrintInner() {
			// mPrint();
			// System.out.println("vI01 = " + vI01);
			System.out.println("vI02 = " + vI02);
		}
	}

	public static void main(String[] args) {
		OuterExam02.Inner2 outer2Inner2 = new OuterExam02.Inner2();
		System.out.println(outer2Inner2.vInn01);
		outer2Inner2.mPrintInner();
	}
}
