/*
HWJava17_10_UtilScannerChk01_배재연.java
*/

package classes;

import java.util.Scanner;

class UtilScannerChk01 {
	public static void main(String[] args) {
		System.out.print("문자열을 입력해 주세요 : ");
		Scanner sc = new Scanner(System.in);
		String inputMsg = sc.nextLine();
		System.out.println(inputMsg);
	}
}
