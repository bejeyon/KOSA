/*
Refer : HWJava12_04_ReadEx01
>> ExceptionEx01
HWJava19_03_ExceptionEx01_02_배재연.zip
*/

package classes;

import java.io.IOException;	// 아니면 12행에서 throws java.io.IOException 으로 해도 됨

class ExceptionEx01 {
	public static void main(String[] args) throws IOException {	// throws java.io.IOException 으로 해도 됨
		System.in.read();
	}
}
