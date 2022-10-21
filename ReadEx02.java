package classes;

import java.io.IOException;	// 아니면 7행에서 throws java.io.IOException 으로 해도 됨

class ReadEx02
{
	public static void main(String[] args) throws IOException
	{
		System.out.print("문자를 입력 하세요 : ");
		int result = System.in.read();

		System.out.println(result);
		System.out.println((char)result);
	}
}
