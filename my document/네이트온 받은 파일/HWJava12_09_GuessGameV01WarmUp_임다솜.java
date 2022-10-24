package classes;

import java.io.IOException;
/*
Sample Run ] 

1 ~ 30 사이의 숫자를 입력하세요. [ 종료 : 0 ] : 50

        ^   [ Error ] 1 ~ 30 사이의 숫자를 입력하세요.

1 ~ 30 사이의 숫자를 입력하세요. [ 종료 : 0 ] : 1234

        ^   [ Error ] 두 자리 수를 초과하셨습니다.

1 ~ 30 사이의 숫자를 입력하세요. [ 종료 : 0 ] : 25

            입력된 숫자는 25 입니다

1 ~ 30 사이의 숫자를 입력하세요. [ 종료 : 0 ] : 0
시스템을 종료합니다.
*/
class HWJava12_09_GuessGameV01WarmUp_임다솜 
{
	public static void main(String[] args) throws IOException
	{
		
		
		while(true){
			int value = -1;
			System.out.print("1-30 사이의 숫자를 입력하세요.[종료 : 0] : ");
			int result01 = System.in.read();
			int result02 = System.in.read();
			int garbage;
			int chk = 0;	//chk == 0 이라면 result02 :13 즉 엔터 입력됨,  chk == 1  이라면 3번째 입력에서 엔터 

			if(result01 == 13){
				System.out.println();
				System.out.println("[Error] Enter 값을 입력하였습니다.\n");
				continue;
			}

			
			while((garbage = System.in.read())!=10){	//남은 입력 받음 (lf 받을떄까지)

				chk++;
			}
			
			System.out.println();
			if(chk>1){	// chk 가 1보다 크다면 2자리 수 초과
				System.out.println("^   [ Error ] 두 자리 수를 초과하셨습니다.\n");
				continue;
			}

			if(chk == 0 ){	//chk == 0이라면 resul02에서 엔터 입력
				value = result01-48;
			}else{
				value = (result01-48)*10 + result02-48;
			}

			if(value == 0){	//value 가 0이면 while문 종료
				break;
			}
			if(value >30 || value<1){
				System.out.println("^Error Chk : 1-30 사이의 숫자를 확인하세요.\n");
				continue;
			}else{
				System.out.println("입력된 숫자는 : "+value+" (1~30) 입니다.\n");
			}
		
		}

		System.out.println("시스템을 종료합니다.");
	}
}
