/*
class AbstractEx01
	int vI01 = 10;
	void mAbstract01() {
		? mAbstract01 확인!!
	}

class AbstractEx01Main extends AbstractEx01
main()
	mAbstract01 obj = new mAbstract01

*/

package classes;

class AbstractEx01 {
	int vI01 = 10;
	void mAbstract01() {
		System.out.println("mAbstract01 확인!!");
	}
}

class AbstractEx01Main extends AbstractEx01 {
	public static void main(String[] args) {
		AbstractEx01 obj = new AbstractEx01();
		obj.mAbstract01();
	}
}
