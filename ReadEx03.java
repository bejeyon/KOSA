package classes;

import java.io.IOException;	// 아니면 7행에서 throws java.io.IOException 으로 해도 됨

class ReadEx03
{
	public static void main(String[] args) throws IOException
	{
		System.out.print("문자를 입력 하세요 : ");
		int result01 = System.in.read();
		int result02 = System.in.read();
		int result03 = System.in.read();
		// int result04 = System.in.read();

		System.out.println(result01);
		System.out.println(result02);
		System.out.println(result03);
		// System.out.println(result04);

		// System.out.println((char)result1);
	}
}
