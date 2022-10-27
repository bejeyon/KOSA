/* HWJava20_08_OuterEx02_배재연.java */

package classes;

class OuterClass {
	int x = 10;
	private class InnerClass {
		int y = 5;
	}
	public void InnerClass01() {
		InnerClass innerObj = new InnerClass();
		System.out.println(innerObj.y);
	}
}

class OuterEx02 {
	public static void main(String[] args) {
		OuterClass myOuter = new OuterClass();
		// OuterExam01.InnerClass myInner = myOuter.new InnerClass();	// innerClass private 지정자 붙어서 다른 클래스에서 객체 안 만들어짐.
		myOuter.InnerClass01();		
	}
}
