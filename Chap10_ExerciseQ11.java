/*
HWJava16_08_Chap10_Exercise_배재연.zip

10장 연습문제

Q11. 다음과 같은 클래스 A가 있다.

class A {
	int data;
	A(int data) {
		this.data = data;
	}
}

다음 코드의 실행 결과로 false가 출력되는 이유를 설명하시오.

A a1 = new A(3);
A a2 = new A(3);
System.out.println(a1.equals(a2));	// false

==================================================

a1과 a2라는 객체는 서로 다른 객체. 비교할 return 된 String 값이 없음.
*/

package classes;

class A {
	int data;
	A(int data) {
		this.data = data;
	}
}

class Chap10_ExerciseQ11 {
	public static void main(String[] args) {
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1.equals(a2));	// false

		String str1 = new String("안녕");
		String str2 = new String("안녕");
		System.out.println(str1==str2);	// false
		System.out.println(str1.equals(str2));	// true
	}
}
