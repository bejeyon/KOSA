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

public class OuterEx02 {
	public static void main(String[] args) {
		OuterClass myOuter = new OuterClass();
		// OuterClass.InnerClass myInner = myOuter.new InnerClass();
		myOuter.InnerClass01();

	}

}