/*
HWJava15_02_Chap09Summary02_배재연.zip
9장 연습문제

Q6. 클래스 A가 다음과 같이 선언돼 있다.

class A {
	static int a;
	__________
}

이 때 다음과 같이 System.out.println(A.a)의 출력값이 8이 나오도록 클래스 A를 완성하시오.

System.out.println(A.a);	// 8
*/

package classes;

class A {
	static int a;
	static {
		a = 8;
	}
}

class Chap9_ExerciseQ6 {
	public static void main(String[] args) {
		System.out.println(A.a);	// 8
	}
}
