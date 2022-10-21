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

package classes;

import java.io.IOException;	// 아니면 7행에서 throws java.io.IOException 으로 해도 됨

class GuessGameV01WarmUp
{
	public static void main(String[] args) throws IOException
	{
		System.out.print("1-30 사이의 숫자를 입력하세요. [ 종료 : 0 ]");
		int result01 = System.in.read();
		int result02 = System.in.read();
		int result03 = System.in.read();

		while(result01 != 48)
		{
			while((result01==13)||(result01>51&&result01<58)||(result01==51&&result02>48&&result02<58)||(result02 != 13 && result03 != 13))
			{
				if(result01==13)
					System.out.println("^[Error] Enter값을 입력하였습니다. [ 종료 : 0 ]");
				if((result01>51&&result01<58)||(result01==51&&result02>48&&result02<58))
					System.out.println("^[Error] 1-30 사이의 숫자를 입력하세요. [ 종료 : 0 ]");
				if(result02 != 13 && result03 != 13)
					System.out.println("^[Error] 1-30 사이의 숫자를 입력하세요. [ 종료 : 0 ]");
				while(System.in.read()!=10);
				result01 = System.in.read();
				result02 = System.in.read();
				result03 = System.in.read();
			}

			if(result01 == 48)
			{
				System.out.println("종료합니다.");
				break;
			}
			
			if(result02 == 13)
			{
				System.out.println("입력된 숫자는 : " + (result01-48) + "입니다.");
				break;
			}
			else if(result03 == 13)
			{
				System.out.println("입력된 숫자는 : " + ((result01-48)*10 + (result02-48)*1) + "입니다.");
				break;
			}
		}
		System.out.println("종료합니다.");
	}
}
