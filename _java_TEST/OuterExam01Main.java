/* HWJava20_07_OuterExam01_배재연.java */

package classes;

class OuterExam01 {
	int vI01 = 100;
	static int vI02 = 200;
	void mPrint() {
		System.out.println("vI01 = " + vI01);
		System.out.println("vI02 = " + vI02);
	}
	class Inner {
		int vInn01 = 100;
		// static vInn02 = 200;
		void mPrintInner() {
			System.out.println("vI01 = " + vI01);
			System.out.println("vI02 = " + vI02);	// <<-- mPrint();
			System.out.println("vInn01 = " + vInn01);
		}
		class InnerSub01 {
			void mPrintInnerSub01() {
			System.out.println("Triple InnerClass");
			}
		}
	}
}

class OuterExam01Main {
	public static void main(String[] args) {
		OuterExam01 outer = new OuterExam01();
		// OuterExam01.Inner outerInner = outer.new Inner();
		OuterExam01.Inner outerInner = new OuterExam01().new Inner();
		OuterExam01.Inner.InnerSub01 oiSub01 = outerInner.new InnerSub01();
		outer.mPrint();
		System.out.println("----------");
		outerInner.mPrintInner();
		System.out.println("----------");
		oiSub01.mPrintInnerSub01();
	}
}
