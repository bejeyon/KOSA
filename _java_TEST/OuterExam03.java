/*
HWJava21_01_OuterExam03_배재연.java
*/

package classes;

class OuterExam03 {
	int vI01 = 10;
	static int vI02 = 20;
	void mPrint() {
		class Inner3 {
			int vInn01 = 30;
			// static int vInner02 = 50;
			void mPrintInner() {
				System.out.println("vInn01 = " + vInn01);
			}
		}
		Inner3 inner3 = new Inner3();
		inner3.mPrintInner();
	}
	public static void main(String[] args) {
		OuterExam03 outer3 = new OuterExam03();
		outer3.mPrint();
	}
}
