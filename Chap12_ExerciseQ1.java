/* 
HWJava18_09_Chap12Summary_배재연.zip

연습문제

Q1. 다음은 추상 클래스 A를 상속해 클래스 B를 정의한 코드로, 오류를 포함하고 있다.
	 오류가 발생한 이유와 그 해결책을 쓰시오. 
 
abstract class A {
	abstract void abc();
}
class B extends A {
	// 추상 클래스를 상속받은 자식 클래스는 반드시 부모 추상 메소드를 전부 오버라이딩 해서 중괄호 body로 재구현해야 함.
}
 */

package classes;

abstract class A {
	abstract void abc();
}
class B extends A {
	void abc() {}; // 추상 클래스를 상속받은 자식 클래스는 반드시 부모 추상 메소드를 전부 오버라이딩 해서 중괄호 body로 재구현해야 함.
}

public class Chap12_ExerciseQ1 {
	public static void main(String[] args) {

	}
}
