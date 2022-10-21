/*
HWJava15_01_StaticEx03_배재연.java
*/

package classes;

class StaticEx03 {
	StaticEx03() {
		System.out.println("생성자 확인!!");
	}
	
	static{
		System.out.println("static 블럭 확인!!");
	}

	public static void main(String[] args) {
		StaticEx03 obj = new StaticEx03();
	}
}
