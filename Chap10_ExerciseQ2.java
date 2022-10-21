/*
HWJava16_08_Chap10_Exercise_배재연.zip

10장 연습문제

Q2. 다음과 같은 상속 구조도가 있을 때 이를 코드로 작성하시오(클래스 내용은 작성하지 않음).

		A
		↑
		B
	↗		↖
C				D

class A {}
*/

package classes;

class A {}
class B extends A {}
class C extends B {}
class D extends B {}

class Chap10_ExerciseQ2 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
