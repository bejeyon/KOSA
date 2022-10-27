/*
HWJava20_02_Chap14Summary01_배재연.zip
*/

/* 대표적인 일반 예외 */

package classes;

import java.io.FileInputStream;
import java.io.InputStreamReader;

class A implements Cloneable {
	protected Object clone() throws CloneNotSupportedException {	// Object.clone()이 protected로 정의돼있음.
		return super.clone();
	}
}

class CheckedException {
	public static void main(String[] args) {
		// Checked Exception(일반 예외)

		// 1. InterruptedException
		Thread.sleep(1000);

		// 2. ClassNotFoundException
		Class cls = Class.forName("java.lang.object");

		// 3. IOException
		InputStreamReader in = new InputStreamReader(System.in);
		in.read();

		// 4. FileNotFoundException
		FileInputStream fis = new FileInputStream("text.txt");

		// 5. CloneNotSupportedException
		A a1 = new A();
		A a2 = (A)a1.clone();
	}
}
