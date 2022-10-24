/*
HWJava17_11_UtilScannerEx01_배재연.java

## Scanner 클래스 nextLine() 적용 : String
## String
	- length()
1. 길이 Chk << 1자리 이상이면 
					^ [Error Chk] 1자리 숫자를 입력하세요.
2. 48 ~ 57 숫자가 아니면 <<
					^ [Error Chk] 0~9사이의 숫자를 입력하세요.
3. 대문자 Q, 또는 소문자 q : 종료
					^ 시스템을 종료 합니다.
Sample Run ]
	0 ~ 9 사이의 숫자를 입력하세요. [ 종료 : Q ] >>
*/

package classes;

import java.util.Scanner;

class UtilScannerEx01 {
	public static void main(String[] args) {
		System.out.print("문자열을 입력해 주세요 : ");
		Scanner sc = new Scanner(System.in);
		String inputMsg = sc.nextLine();
		System.out.println(inputMsg);
	}
}
