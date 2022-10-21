package classes;

class NumCng03
{
	public static void main(String[] args) 
	{
		int num = 10;
		
		// 10진수 정수 → 2진수 / 8진수 / 16진수 문자열
		System.out.println(Integer.toBinaryString(num));	// 1010 : 10진수 → 2진수
		System.out.println(Integer.toOctalString(num));	// 12 : 10진수 → 2진수
		System.out.println(Integer.toHexString(num));		// a : 10진수 → 2진수

		// 2진수 / 8진수 / 16진수 문자열 → 10진수 정수
		System.out.println(Integer.parseInt("1010",2));		// 10 : 2진수 → 10진수
		System.out.println(Integer.parseInt("12",8));		// 10 : 8진수 → 10진수
		System.out.println(Integer.parseInt("a",16));			// 10 : 16진수 → 10진수
	}
}
