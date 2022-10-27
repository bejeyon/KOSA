/*
HWJava20_04_Chap14Summary02_배재연.java

연습문제

Q2. 다음 코드의 try{} 구문과 catch(){} 구문에는 공통적인 코드가 포함돼 있다. finally{} 블록을 사용해 중복을 제거한 코드를 작성하시오.

try {
	int a = 3;
	System.out.println(5 / a);
	System.out.println("출력 내용 1");
	System.out.println("출력 내용 2");
	System.out.println("출력 내용 3");
}
catch (ArithmeticException e) {
	System.out.println("예외 발생");
	System.out.println("출력 내용 1");
	System.out.println("출력 내용 2");
	System.out.println("출력 내용 3");
}

try {
	int a = 3;
	System.out.println(5 / a);
}
catch (ArithmeticException e) {
	System.out.println("예외 발생");
}
finally {
	System.out.println("출력 내용 1");
	System.out.println("출력 내용 2");
	System.out.println("출력 내용 3");
}
*/
package classes;

class Chap14_ExerciseQ2_TEST {
	public static void main(String[] args) {
		try {
			int b = 3;
			System.out.println(5 / b);
		}
		catch (ArithmeticException e) {
			System.out.println("예외 발생");
		}
		finally {
			for (int i = 1; i <4; i++)
				System.out.println("출력 내용" + i);
		}
	}
}
