/*
Refer : HWJava12_04_ReadEx01
>> ExceptionEx02
HWJava19_03_ExceptionEx01_02_배재연.zip
*/

package classes;

import java.io.IOException;	// 아니면 16행에서 java.io.IOException으로 해도 됨

class ExceptionEx02 {
	public static void main(String[] args) {
		try {
		  System.in.read();	// 예외 발생 가능한 문장;
		}
		catch(IOException e) {	// java.io.IOException으로 해도 됨
		  // 예외 발생 시 적용할 문장;
		}
	}
}
