/*
HWJava18_08_InterfaceEx03_배재연.java
interface InterfaceEx03
	int vI01 = 10;

class InterfaceEx03Main extends InterfaceEx03
	main
	InterfaceEx03Main obj = new InterfaceEx03Main();
	? obj.vI01;	// 10
	obj.vI01 = 20;	// error << 인터페이스는 자동 final
	? InterfaceEx03Main.vI01;	// 10 << 인터페이스는 자동 static
*/

package classes;

interface InterfaceEx03 {
	int vI01 = 10;
}

class InterfaceEx03Main implements InterfaceEx03 {
	public static void main(String[] args) {
		InterfaceEx03Main obj = new InterfaceEx03Main();
		System.out.println(obj.vI01);	// 10 출력
		// obj.vI01 = 20;	// error << 인터페이스는 자동 final error: cannot assign a value to final variable vI01
		System.out.println(InterfaceEx03Main.vI01);	// 10 출력 << 인터페이스는 자동 static
	}
}
