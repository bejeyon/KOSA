/*
HWJava19_15_ThrowNew_배재연.java
02. 예외 처리 방식
	01) 던진다 : throws
	02) 잡는다 : try ~ catch
	03) 임의 발생 : throw 발생 객체
											└> new 예외생성자()
*/

package classes;

import java.io.IOException;	// 아니면 24행에서 java.io.IOException으로 해도 됨

class ThrowNew {
	public static void main(String[] args) {
		int vResult;
		try {
			System.out.print("문자를 입력 하세요 : ");
			vResult = System.in.read();
			if(vResult == 65)
				throw new IOException();
			System.out.println("입력된 문자는 " + vResult + "입니다.\n");
		}
		catch(IOException e) {	// java.io.IOException으로 해도 됨
			System.out.println("A 문자 입력 안 됨!!\n");
		}
	}
}
