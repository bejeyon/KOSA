/*
HWJava18_03_LottoTotalOddEvenV03_배재연.java

==================================================
	## Lotto 추첨 ##
==================================================
	1. Total [전체 추천]
	2. Odd [홀수 추천]
	3. Even [짝수 추천]
	Q. 종료
--------------------------------------------------
	^ 메뉴를 선택하세요 : 1

	---------- 행운의 로또 번호 ----------
	36	41		19		30	33	6

==================================================
	## Lotto 추첨 ##
==================================================
	1. Total [전체 추천]
	2. Odd [홀수 추천]
	3. Even [짝수 추천]
	Q. 종료
--------------------------------------------------
	^ 메뉴를 선택하세요 : 2

	---------- 행운의 로또 번호 ----------
	1	35	9		11		21		13

*/

package classes;

import java.util.Scanner;
import java.util.Random;

class LottoTotalOddEvenV03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		UserAPI uapi = new UserAPI();
		int inputAnswer = -1;
		int[] vRandom = new int[6];

		while(true) {
			inputAnswer = -1;

			uapi.mLine("=", 50);
			System.out.println();
			System.out.print("\t## Lotto 추첨 ##");
			System.out.println();
			uapi.mLine("=", 50);
			System.out.println();
			System.out.println("\t1. Total [전체 추천]");
			System.out.println("\t2. Odd [홀수 추천]");
			System.out.println("\t3. Even [짝수 추천]");
			System.out.println("\tQ. 종료");
			uapi.mLine("-", 50);
			System.out.println();
			System.out.print("\t ^ 메뉴를 선택하세요 : ");

			String result = sc.nextLine();

			if(result.equalsIgnoreCase("Q")) {	// result 가 Q나 q이면 while문 종료
				break;
			}			

			if(result.isEmpty() == true) {
				System.out.println("\t^ [Error] Enter 값을 입력하였습니다.\n");
				continue;
			}

			if(result.length() > 1) {
				System.out.println("\t^ [Error Chk] 1 ~ 3 숫자나 Q(or q)를 입력하세요.");
				continue;
			}

			if((int)result.charAt(0) > 48 && (int)result.charAt(0) < 52) {
				inputAnswer = (int)result.charAt(0);
				switch (inputAnswer) {
					case 49:
						for (int i = 0; i < 6; i++) {
							vRandom[i] = rand.nextInt(45) + 1;
							for (int j = i - 1; j >= 0; j--)
								if (vRandom[i] == vRandom[j])
									i--;
						}	
						System.out.println("\n");
						System.out.println("\t---------- 행운의 로또 번호 ----------\n");
						for (int i = 0; i <6; i++)
							System.out.print("\t" + vRandom[i]);
						System.out.println("\n");
						break;
					
					case 50:
						for (int i = 0; i < 6; i++) {
							do {
								vRandom[i] = rand.nextInt(45) + 1;
							} while (vRandom[i] % 2 == 0);
							
							for (int j = i - 1; j >= 0; j--)
								if (vRandom[i] == vRandom[j])
									i--;
						}
						System.out.println("\n");
						System.out.println("\t---------- 행운의 로또 홀수 번호 ----------\n");
						for (int i = 0; i <6; i++)
							System.out.print("\t" + vRandom[i]);
						System.out.println("\n");
						break;

					case 51:
						for (int i = 0; i < 6; i++) {
							do {
								vRandom[i] = rand.nextInt(45) + 1;
							} while (vRandom[i] % 2 == 1);
							
							for (int j = i - 1; j >= 0; j--)
								if (vRandom[i] == vRandom[j])
									i--;
						}					
						System.out.println("\n");
						System.out.println("\t---------- 행운의 로또 짝수 번호 ----------\n");
						for (int i = 0; i <6; i++)
							System.out.print("\t" + vRandom[i]);
						System.out.println("\n");
						break;
				}
				continue;
			}
			else {
				System.out.println("\t^ [Error Chk] 1 ~ 3 숫자나 Q(or q)를 입력하세요.");
				continue;
			}
		}
		System.out.println("\t시스템을 종료합니다.");
	}
}
