/* 7장 연습문제
Q4. 클래스 A 내부에는 다음과 같이 기본 자료형과 참조 자료형을 입력매개변수로 하는 abc(), bcd() 메서드가 정의돼 있다.

class A {
	void abc(int m) {
		m = 8;
	}
	void bcd(int[] n) {
		n[0] = 4; n[1] = 5; n[2] = 6;
	}
}

이 때 다음 코드의 출력값을 쓰시오.

A a = new A();

int m = 5;
int[] n = {1, 2, 3};

a.abc(m);
a.bcd(n);

System.out.println(m);	// 5 출력
System.out.println(Arrays.toString(n));	// [4, 5, 6] 출력
*/

package classes;

import java.util.Arrays;

class A {
	void abc(int m) {
		m = 8;
	}
	void bcd(int[] n) {
		n[0] = 4; n[1] = 5; n[2] = 6;
	}
}

class Chap7_ExerciseQ4
{
	public static void main(String[] args) 
	{
		A a = new A();

		int m = 5;
		int[] n = {1, 2, 3};

		a.abc(m);
		a.bcd(n);

		System.out.println(m);	// 5 출력
		System.out.println(Arrays.toString(n));	// [4, 5, 6] 출력
	}
}
