/*
HWJava20_02_Chap14Summary01_배재연.zip
*/

/* 대표적인 실행 예외 */

package classes;

class A {}
class B extends A {}

class UncheckedException {
	public static void main(String[] args) {
		// Unchecked Exception == RuntimeException(실행 예외)

		// 1. ArithmaticException
		System.out.println(3 / 0);	// java.lang.ArithmeticException: / by zero

		// 2. ClassCastException
		A a = new A();
		B b = (B)a;	// java.lang.ClassCastException: classes.A cannot be cast to classes.B

		// 3. ArrayIndexOutOfBoundsException
		int[] array = {1, 2, 3};
		System.out.println(array[3]);	// java.lang.ArrayIndexOutOfBoundsException: 3

		// 4. NumberFormatException
		int num = Integer.parseInt("10!");	// java.lang.NumberFormatException: For input string: "10!"

		// 5. NullPointerException
		String str = null;
		System.out.println(str.charAt(2));	// java.lang.NullPointerException
	}
}
