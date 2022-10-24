/*
HWJava17_11_UtilScannerNumChk_배재연.java

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

class UtilScannerNumChk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputAnswer = -1;
		while(true) {
			inputAnswer = -1;
			System.out.print("0 ~ 9 사이의 숫자를 입력하세요. [종료 : Q] : ");
			String result = sc.nextLine();

			if(result.equals("Q") || result.equals("q")) {	// result 가 Q나 q이면 while문 종료
				break;
			}			

			if(result.isEmpty() == true) {
				System.out.println("\t^ [Error] Enter 값을 입력하였습니다.\n");
				continue;
			}

			if(result.length() > 1) {
				System.out.println("\t^ [Error Chk] 1자리 숫자를 입력하세요.");
				continue;
			}

			if((int)result.charAt(0) >= 48 && (int)result.charAt(0) <= 57) {
				System.out.println("\t^ 입력된 숫자 " + result + "입니다.");
				continue;
			}
			else {
				System.out.println("\t^ [Error Chk] 0 ~ 9 사이의 숫자를 입력하세요.");
				continue;
			}
		}
		System.out.println("\t시스템을 종료합니다.");
	}
}
