/*
## HWJava11_03_StringAPI02_배재연.java
*/
package classes;

class StringAPI02
{
	public static void main(String[] args) 
	{
		String str = "HappyDay";	// H : ABCDEFGH
		System.out.println(str.compareTo("happyDay"));	// 72 - 104 = -32
		System.out.println(str.compareTo("Happyday"));	// 68 - 100 = -32
		System.out.println(str.compareTo("HappyAay"));	// 68 - 65 = 3
		System.out.println();
		System.out.println(str.compareToIgnoreCase("happyDay"));	//0
		System.out.println(str.compareToIgnoreCase("Happyday"));	// 0
	}
}
