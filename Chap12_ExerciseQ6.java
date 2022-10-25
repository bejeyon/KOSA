/* 
HWJava18_09_Chap12Summary_배재연.zip

연습문제

Q6. 다음과 같이 클래스 D가 인터페이스 A, B, 클래스 C를 상속하고자 할 때의 상속 문법을 완성하시오.

interface A {}
interface B {}
class C {}
class D ____________________ {}	// extends C implements A, B
 */

package classes;

interface A {}
interface B {}
class C {}
class D extends C implements A, B {}	// extends C implements A, B

public class Chap12_ExerciseQ6 {
	public static void main(String[] args) {
	}
}
