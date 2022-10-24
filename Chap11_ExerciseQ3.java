/*
11장 연습문제

Q3. 다음은 A, B, C, D 클래스 간의 상속 구조를 자바 코드로 표현한 것으로, 오류를 포함하고 있다.
	오류가 발생한 위치와 그 이유를 설명하시오.

class A {}
class B extends A {}
final class C extends B {}
final class D extends C {}	// final이 붙어 상수화된 class C는 최종 클래스로서, 상속될 수 없다.
*/

package classes;

class A {}
class B extends A {}
final class C extends B {}
// final class D extends C {}	// final이 붙어 상수화된 class C는 최종 클래스로서, 상속될 수 없다.

public class Chap11_ExerciseQ3 {
	public static void main(String[] args) {

	}
}
