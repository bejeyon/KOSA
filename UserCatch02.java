/*
HWJava19_17_UserCatch02_배재연.java
02. 예외 처리 방식
	01) 던진다 : throws
	02) 잡는다 : try ~ catch
	03) 임의 발생 : throw 발생 객체
											└> new 예외생성자()
*/

package classes;

import java.io.IOException;	// 아니면 35행에서 java.io.IOException으로 해도 됨

class ANeverException extends Exception {
	ANeverException() {
		System.out.println("A 문자 입력 안 됨!!_ 사용자 정의\n");
	}
	ANeverException(String message) {
		super(message);	// 부모 class?인 throwable의 생성자 생성
	}
}

class UserCatch02 {
	public static void main(String[] args) {
		int vResult;
		try {
			System.out.print("문자를 입력 하세요 : ");
			vResult = System.in.read();
			// 입력 문자가 A 또는 a일 경우
			// 임의 발생 예외처리를 사용
			if(vResult == 65 || vResult == 97)
				throw new ANeverException("A 문자 입력 안 됨_ 상세 메시지 확인!!!!");	// 새로운 ANeverException 생성자 객체 생성
			System.out.println("입력된 문자는 " + vResult + "입니다.\n");
		}
		catch(IOException e) {	// java.io.IOException으로 해도 됨
			System.out.println("IOException 발생 !!\n");
		}
		catch(ANeverException e) {
			System.out.println(e.getMessage());	// ANeverException의 객체 e로 부모 생성자 호출하여 출력
		}
	}

}
