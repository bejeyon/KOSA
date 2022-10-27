/*
HWJava20_04_Chap14Summary02_배재연.java

연습문제

Q1. 다음 예외 발생 코드와 예외의 종류를 연결하시오.

① int num = Integer.parseInt("10!");
② String a = null;
	System.out.println(a.charAt(2));
③ System.out.println(3/0);
④ new FileInputStream("text.txt");
⑤ Thread.sleep(1000);
⑥ Class.forName("java.lang.Object");
⑦ int[] a = {1, 2, 3};
	System.out.println(a[3]);

ⓐ ArrayIndexOutOfBoundsException
ⓑ ClassNotFoundException
ⓒ NumberFormatException
ⓓ InterruptedException
ⓔ FileNotFoundException
ⓕ NullPointerException
ⓖ ArithmeticException

1 - c
2 - f
3 - g
4 - e
5 - d
6 - b
7 - a
*/
package classes;

class Chap14_ExerciseQ1 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
