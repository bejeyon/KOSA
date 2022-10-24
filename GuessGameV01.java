/*
Refer : HWJava09_03_RandomChk
파일명 ] HWJava17_04_GuessGameV01_배재연.java
조건 ]
	- 1 ~ 30 사이의 숫자 입력하세요 :
	- 2자리 이하 숫자를 입력하세요.
	- vRamdom : 1 ~ 30 사이의 임의의 숫자를 입력받는다. [ 23 ]
	- X 번째 작은 수를 입력하세요. / 큰 수를 입력하세요.

Sample Run ]
^ 1 ~ 30 사이의 숫자를 입력하세요 : _ 15 20 25
----------------------------------------------------------
1 ~ 3 회 :
	X 번째 정답 입니다. 천재 이십니다.
4 ~ 5 회 :
	X 번째 정답 입니다. 양호 하십니다.
5 ~ 15 회 :
	X 번째 정답 입니다. 분발하세요.
15회 이상 :
	탈락 입니다.
*/

package classes;

import java.io.IOException;

class GuessGameV01 {
	public static void main(String[] args) throws IOException {
		// 1 ~ 30 사이의 숫자 배정 및 사용자 입력값 저장 변수 선언
		int vRandom = (int)Math.floor(Math.random()*30+1);
		int inputAnswer = 0;
		int order = 0;

		while(true) {
			inputAnswer = -1;
			System.out.print("1-30 사이의 숫자를 입력하세요.[종료 : 0] : ");
			int result01 = System.in.read();
			int result02 = System.in.read();
			int chk = 1;	//chk == 1 이라면 result02 :13 즉 엔터 입력됨,  chk == 2  이라면 3번째 입력에서 엔터

			if(result01 == 13) {
				System.out.println();
				System.out.println("[Error] Enter 값을 입력하였습니다.\n");
				continue;
			}

			chk = System.in.available();
			System.in.skip(chk);
			
			System.out.println();
			if(chk>2) {	// chk 가 2보다 크다면 2자리 수 초과
				System.out.println("^   [ Error ] 두 자리 수를 초과하셨습니다.\n");
				continue;
			}

			if(chk == 1) {	//chk == 1이라면 resul02에서 엔터 입력
				inputAnswer = result01-48;
			}
			else {
				inputAnswer = (result01-48)*10 + result02-48;
			}

			if(inputAnswer == 0) {	//inputAnswer 가 0이면 while문 종료
				order = 0;
				break;
			}
			if(inputAnswer >30 || inputAnswer<1) {
				System.out.println("^Error Chk : 1-30 사이의 숫자를 확인하세요.\n");
				continue;
			}
			else {
				System.out.println("입력된 숫자는 : "+ inputAnswer +" (1~30) 입니다.\n");
				if(vRandom == inputAnswer) {
					order++;
					System.out.print(order +"번째\t정답입니다.\t");
					break;
				}
				else if(vRandom > inputAnswer) {
					order++;
					System.out.println(order +"번째\t큰 수를 입력해주세요 : ");
				}
				else {
					order++;
					System.out.println(order +"번째\t작은 수를 입력해주세요 : ");
				}
			}
		}

		if (order >= 1 && order < 4)
			System.out.println("천재 이십니다.");
		else if (order >=4 && order < 6)
			System.out.println("양호 하십니다.");
		else if (order >=6 && order < 15)
			System.out.println("분발 하세요.");
		else if (order >= 15)
			System.out.println("... 탈락 입니다.");

		System.out.println("시스템을 종료합니다.");
	}
}