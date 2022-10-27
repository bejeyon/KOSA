/* HWJava20_06_OuterEx01_배재연.java */

package classes;

class OuterClass {
	int x = 10;
	class InnerClass {
		int y = 5;
	}
}

public class OuterEx01 {
	public static void main(String[] args) {
		OuterClass myOuter = new OuterClass();
		//OuterClass.InnerClass myInner = myOuter.new InnerClass();
		OuterClass.InnerClass myInner = new OuterClass().new InnerClass();
		System.out.println(myInner.y + myOuter.x);
	}
}
