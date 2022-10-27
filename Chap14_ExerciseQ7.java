/*
HWJava20_04_Chap14Summary02_배재연.java

연습문제

Q7. 클래스 A는 학점이 3.0 미만일 때 사용자 정의 일반 예외(ScoreException)를 발생시키는 abc() 메서드를 포함하고 있다.

class ScoreException extends Exception {
	public ScoreException() {
	}
	ScoreException(String s) {
		super(s);
	}
}
class A {
	void abc(double score) throws ScoreException {
		if(score >= 3.0) {
			System.out.println("장학금 대상자입니다.");
		}
		else {
			throw new ScoreException("학점 미달입니다.");
		}
	}
}

이 때 다음 코드의 실행 결과를 쓰시오.

public static void main(String[] args) {
	A a = new A();
	try {
		a.abc(3.8);
		a.abc(2.5);
	}
	catch (ScoreException e) {
		System.out.println(e.getMessage());
	}
}

==========

"장학금 대상자입니다."
"학점 미달입니다."
*/
package classes;

class ScoreException extends Exception {
	public ScoreException() {
	}
	ScoreException(String s) {
		super(s);
	}
}
class A {
	void abc(double score) throws ScoreException {
		if(score >= 3.0) {
			System.out.println("장학금 대상자입니다.");
		}
		else {
			throw new ScoreException("학점 미달입니다.");
		}
	}
}

class Chap14_ExerciseQ7 {
	public static void main(String[] args) {
		A a = new A();
		try {
			a.abc(3.8);	// "장학금 대상자입니다."
			a.abc(2.5);	// "학점 미달입니다."
		}
		catch (ScoreException e) {
			System.out.println(e.getMessage());
		}
	}
}
