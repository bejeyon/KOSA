/*
HWJava20_04_Chap14Summary02_배재연.java
*/

/* 최상위 메서드인 main() 메서드가 예외를 전가했을 때 */

package classes;

class ThrowsException_2 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class cls = Class.forName("java.lang.Object2");	// Exception in thread "main" java.lang.ClassNotFoundException: java.lang.Object2
	}
}
