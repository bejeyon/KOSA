/* 7장 연습문제
Q2. 4가지 형태로 오버로딩된 print() 메서드의 실행 결과가 다음과 같이 출력되도록 클래스 A를 완성하시오.

class A {

}

A a = new A();
a.print();
a.print(3);
a.print(5.8);
a.print("안녕");

실행결과
입력값이 없습니다.
정수 입력값 : 3
실수 입력값 : 5.8
문자열 입력값 : 안녕
*/

package classes;

class A {
	void print(){
		System.out.println("입력값이 없습니다.");
	}
	void print(int a){
		System.out.println("정수 입력값 : " + a);
	}
	void print(double a){
		System.out.println("실수 입력값 : " + a);
	}
	void print(String a){
		System.out.println("문자열 입력값 : " + a);
	}
}

class Chap7_ExerciseQ2
{
	public static void main(String[] args) 
	{
		A a = new A();
		a.print();
		a.print(3);
		a.print(5.8);
		a.print("안녕");
	}
}
