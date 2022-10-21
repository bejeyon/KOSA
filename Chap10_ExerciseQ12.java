/*
HWJava16_08_Chap10_Exercise_배재연.zip

10장 연습문제

Q11. 다음과 같은 클래스 A가 있다.

class A {
	int data;
	A(int data) {
		this.data = data;
	}
}

다음 코드의 실행 결과로 false가 출력되는 이유를 설명하시오.

A a1 = new A(3);
A a2 = new A(3);
System.out.println(a1.equals(a2));	// false

==================================================

Q12. Q11에서 출력값이 true가 나오도록 클래스 A를 수정하시오.

class A {
	int data;
	A(int data) {
		this.data = data;
	}
__________________________________________________
}

A a1 = new A(3);
A a2 = new A(3);
System.out.println(a1.equals(a2));	// true
*/

package classes;

class A {
	int data;
	A(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) {
		if (this.data == ((A)obj).data)
			return true;
		else
			return false;
	}
}

class Chap10_ExerciseQ12 {
	public static void main(String[] args) {
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1.equals(a2));	// true
		
		/*
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		System.out.println(str1==str2);	// false
		System.out.println(str1.equals(str2));	// true
		*/
	}
}
