package classes;

public class PackageImport_1 {
	public static void main(String[] args) {
		// 객체 생성
		// A a = new A();	// 오류
		classes.common.A a = new classes.common.A();
		// A a
		// 멤버 활용
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
	}
}
