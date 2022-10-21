package classes;

import classes.common.A;

public class PackageImport_2 {
	public static void main(String[] args) {
		// 객체 생성
		A a = new A();
		// A a
		// 멤버 활용
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
	}
}
