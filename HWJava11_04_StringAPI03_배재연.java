/*
## HWJava11_04_StringAPI03_배재연.java
*/
package classes;

class StringAPI03
{
	public static void main(String[] args) 
	{
		boolean result;
		String str = "HappyDay.java";
		String str2 = "";

		result = str.endsWith("java");	// true
		System.out.println(result);
		result = str.endsWith("html");	// false
		System.out.println(result);
		result = str.startsWith("Happy");	// true
		System.out.println(result);
		result = str.startsWith("Nice");	// false
		System.out.println(result);
		System.out.println();

		System.out.println(str.isEmpty());	// false
		System.out.println(str2.isEmpty());	// true
	}
}
