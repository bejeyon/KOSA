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

abstract class AbstractEx01 {	// abstract 메소드가 있는 class에 abstract 안 붙이면 Error남
	int vI01 = 10;
	abstract void mAbstract01();	// abstract body(중괄호내 부분) 있으면 Error남
}

class AbstractEx01Finish extends AbstractEx01 {
	void mAbstract01() {	// 재구현(오버로드)하지 않으면 Error남
		System.out.println("mAbstract01 확인!!");
	}
	public static void main(String[] args) {
		AbstractEx01Finish obj = new AbstractEx01Finish();
		obj.mAbstract01();
	}
}
