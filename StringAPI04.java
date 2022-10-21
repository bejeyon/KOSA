/*
## HWJava11_05_StringAPI04_배재연.java
*/
package classes;

class StringAPI04
{
	public static void main(String[] args) 
	{
		// replace(char oldChar, char newChar) : String
		String str = "Exciting Java";
		String result1 = str.replace("Java","JSP");
		System.out.println(result1);
		System.out.println();

		// split(String regex) : String[]
		str = "Have A Nice Day";
		String[] result2 = str.split(" ");
		System.out.println(result2.length);	// 5 출력
		for(String re2 : result2)
			System.out.println(re2);

		str = "010-1234-5678";
		String[] result3 = str.split("-");
		System.out.println(result3.length);	// 3 출력
		for(String re3 : result3)
			System.out.println(re3);
	}
}
