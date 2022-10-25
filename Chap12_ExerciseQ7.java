/* 
HWJava18_09_Chap12Summary_배재연.zip

연습문제

Q7. 다음 코드는 인터페이스 A를 상속해 클래스 B를 정의한 코드로, 오류가 포함돼 있다.
	 오류가 발생한 이유와 해결책을 쓰시오.

interface A {
	void abc();
}
class B implements A {
	void abc() {	// 인터페이스 내 메소드는 기본 public 지정자가 붙으므로 상속되어 오버라이딩된 메소드는 public이어야 함.
		// ...
	}
}
 */

package classes;

interface A {
	void abc();
}

class B implements A {
	public void abc() {	// 인터페이스 내 메소드는 기본 public 지정자가 붙으므로 상속되어 오버라이딩된 메소드는 public이어야 함.
		// ...
	}
}

public class Chap12_ExerciseQ7 {
	public static void main(String[] args) {
	}
}
