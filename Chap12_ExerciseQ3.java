/* 
HWJava18_09_Chap12Summary_배재연.zip

연습문제

Q3. 다음과 같은 추상 클래스 A가 정의돼 있다.
	실행 코드가 "반갑습니다"를 출력하도록 익명 이너 클래스를 이용해 객체를 생성하는 코드를 완성하시오.

abstract class A {
	abstract void abc();
}

A a = __________
__________
__________
a.abc();	// 반갑습니다.
 */

package classes;

abstract class A {
	abstract void abc();
}

public class Chap12_ExerciseQ3 {
	public static void main(String[] args) {
		A a = new A() {
			public void abc() {
				System.out.println("반갑습니다");
			}
		};	// 세미콜론 필수
		a.abc();	// 반갑습니다.
	}
}
