package classes;

import java.io.IOException;

class AvailableChk01 {
	public static void main(String[] args) throws IOException {
		System.out.println("문자를 입력 하세요.");
		int result = System.in.read();
		System.out.println("입력된 1Byte : " + result);
		int chk = System.in.available();
		System.out.println("남은 Byte 수 : " + chk + "\n\n\n");
	}
}
