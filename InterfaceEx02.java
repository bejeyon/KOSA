package classes;

class Class01 {}
class Class02 {}
class Class03 {}

interface Inter01 {}
interface Inter02 {}
interface Inter03 {}

class ClassT01 extends Class01 {}
//class ClassT02 extends Class01, Class02 {}	// error

class ClassT03 implements Inter01 {}
class ClassT04 implements Inter01, Inter02 {}

interface InterT01 extends Inter01 {}
interface InterT02 extends Inter01, Inter02 {}
class ClassT05 extends Class01 implements Inter01, Inter02 {}

class InterfaceEx02 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
