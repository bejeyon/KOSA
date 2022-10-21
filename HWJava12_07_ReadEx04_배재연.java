package classes;

import java.io.IOException;	// 아니면 7행에서 throws java.io.IOException 으로 해도 됨

class ReadEx04
{
	public static void main(String[] args) throws IOException
	{
		System.out.print("숫자를 입력 하세요 : ");	// 2자 이하 입력 e.g) 13
		int result01 = System.in.read();	// 49
		int result02 = System.in.read();	// 51		>> 13 >> (result01-48)*10^1 + (result02-48)*10^0;
		//int result03 = System.in.read();
		// int result04 = System.in.read();

		if (result02>=48&&result02<=57)
			System.out.println((result01-48)*10 + (result02-48)*1);
		else
			System.out.println(result01-48);
		//System.out.println(result03);
		// System.out.println(result04);

		// System.out.println((char)result1);
	}
}
