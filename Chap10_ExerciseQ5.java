/*
HWJava16_08_Chap10_Exercise_배재연.zip

10장 연습문제

Q5. 상속 구조가 다음과 같을 때 알맞은 출력 결과를 고르시오.

		A
	↗		↖
B				C
↑
D

A aa = new A();
System.out.println(aa instanceof A);		(true / )
System.out.println(aa instanceof B);		( / false)
System.out.println(aa instanceof C);		( / false)
System.out.println(aa instanceof D);		( / false)

A ad = new D();
System.out.println(ad instanceof A);		(true / )
System.out.println(ad instanceof B);		(true / )
System.out.println(ad instanceof C);		( / false)
System.out.println(ad instanceof D);		(true / )
*/

package classes;

class Chap10_ExerciseQ5 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
