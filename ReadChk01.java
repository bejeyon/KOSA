/*
HWJava12_08_ReadChk01_배재연.java
조건 1] 1-30 사이의 숫자를 입력하세요. [ 종료 : 0 ]
조건 2] ^ Error Chk : 1자리 또는 2자리 숫자를 입력하세요.
결과 ] 입력된 숫자는 : X(1-30) 입니다.
*/

package classes;

import java.io.IOException;	// 아니면 7행에서 throws java.io.IOException 으로 해도 됨

class ReadChk01
{
	public static void main(String[] args) throws IOException
	{
		System.out.print("1-30 사이의 숫자를 입력하세요. [ 종료 : 0 ]");
		int result00 = 0;
		int result01 = System.in.read();
		int result02 = System.in.read();
		int result03 = System.in.read();

		if(result01 == 48)
			System.exit(0);

		else if(result02>=48&&result02<=57)
		{
			while(result03>=48&&result03<=57)
			{
				System.out.println("1자리 또는 2자리 숫자를 입력하세요.");
				System.exit(1);
			}
			while(result01>51||(result01==50&&result02>48))
			{
				System.out.println("1 - 30 사이의 숫자 확인하세요.");
				System.exit(2);
			}
			System.out.println("입력된 숫자는 : " + ((result01-48)*10 + (result02-48)*1) + "입니다.");
		}
		else
			System.out.println("입력된 숫자는 : " + (result01-48) + "입니다.");
	}
}
