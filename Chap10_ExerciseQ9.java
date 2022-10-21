/*
HWJava16_08_Chap10_Exercise_배재연.zip

10장 연습문제

Q9. 다음과 같이 클래스 B는 클래스 A를 상속한 후 내부에 아무 것도 추가하지 않은 상태다.
	  이 때 오류가 발생하는데, 오류가 발생한 이유를 설명하시오.

class A {
	A(int a) {
		System.out.println("A 생성자");
	}
}
class B extends A {	// 오류 발생

}

==================================================

클래스의 생성자 중괄호 내용 첫 줄에 super()나 this()가 없다면, 컴파일러는 기본적으로 super()를 추가해서 컴파일한다.
또한 클래스에 생성자를 선언하지 않으면 컴파일러는 기본적으로 기본생성자를 추가한다.
A클래스를 상속한 B클래스에서 생성자를 선언하지 않았으므로 컴파일러에 의해 기본 생성자 B(){}가 추가되는데,
이 때 기본 생성자 B()의 중괄호 내에는 B클래스의 상위 클래스인 A클래스의 기본생성자인 super()가 추가된다.
그러나 A클래스 내에는 매개변수 int a 가 1개 있는 생성자만이 선언되어 있고, 매개변수가 없는 기본 생성자는 정의되어 있지 않다.
따라서 정의되어 있지 않은 상위클래스의 생성자를 호출하므로 오류가 발생한다.
*/

package classes;

class A {
	A(int a) {
		System.out.println("A 생성자");
	}
}
class B extends A {	// 오류 발생

}

class Chap10_ExerciseQ9 {
	public static void main(String[] args) {
		
	}
}
