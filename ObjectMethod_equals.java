// HWJava16_07_ObjectEqualsOverride_배재연.java

package classes;

// Object 클래스의 equals() 메서드

class A {
	String name;
	A(String name) {
		this.name = name;
	}
}

class B {
	String name;
	B(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((B)obj).name)
			return true;
		else
			return false;
	}
}

public class ObjectMethod_equals {
	public static void main(String[] args) {
		A a1 = new A("안녕");
		A a2 = new A("안녕");
		
		System.out.println(a1==a2);	// false
		System.out.println(a1.equals(a2));	// false

		B b1 = new B("안녕");
		B b2 = new B("안녕");
		
		System.out.println(b1==b2);	// false
		System.out.println(b1.equals(b2));	// true
		
		System.out.println(a1.name == b1.name);	// true

		/*
		B b1 = new B("안녕");	// 새로운 B타입 객체 b1 생성. b1.name
		B b2 = new B("안녕");	// 새로운 B타입 객체 b2 생성. b2.name
		
		// b1==b2
		B(String name) {
		this.name = name;}
		과
		B(String name) {
		this.name = name;}
		의 생성자 객체 참조값을 비교.

		// b1.equals(b2)
		this.name(b1.name)과 ((B)obj).name(b2.name)의 같은 객체를 가리키는 것을 비교.
		*/
	}
}
