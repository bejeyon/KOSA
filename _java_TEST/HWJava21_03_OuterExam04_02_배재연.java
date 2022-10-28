/*
HWJava21_03_OuterExam04_02_배재연.java
*/

package classes;

interface Inner4 {
	void mPrintInner4();
}

class OuterExam04_02 {
	public static void main(String[] args) {
		int vI01 = 10;
		final int vI02 = 20;
		vI01 = 20;
		System.out.println("vI01 = " + vI01);

		Inner4 inner4 = new Inner4() {
			public void mPrintInner4() {
				// vI01 = 30;	// 익명내부클래스에 들어가는 지역변수는 자동으로 final 처리돼서 재할당 불가
				// System.out.println("vI01 = " + vI01);	// error: local variables referenced from an inner class must be final or effectively final
				System.out.println("vI02 = " + vI02);
			}
		};

		inner4.mPrintInner4();
	}
}
