/*
HWJava19_08_Arithmetic_배재연.java

## ArithmeticException

Arithmetic.java
main
	for(int idx = -3; idx <= 3; idx++)	// -3 ~ 3
		? "100 / " + idx + " = " + ( 100 / idx )	//

Sample Run ]
	100 / -3 = XX
	...
	^ 100 / 0 에서 ArithmeticException 확인
	...
	100 / 3 = XX
*/

package classes;

class Arithmetic {
	public static void main(String[] args) {
		for(int idx = -3; idx < 4; idx++) {
			try {
				System.out.println("100 / " + idx + " = " + (100 / idx));	// Exception in thread "main" java.lang.ArithmeticException: / by zero at classes.Arithmetic.main(Arithmetic.java:24)
			}
			catch (ArithmeticException e) {
				System.out.println(idx + "번째 ArithmeticException 확인");
			}
		}
	}
}
