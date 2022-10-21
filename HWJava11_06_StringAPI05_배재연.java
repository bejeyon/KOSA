/*
## HWJava11_06_StringAPI05_배재연.java
*/
package classes;

class StringAPI05
{
	public static void main(String[] args) 
	{
		// substring(int beginIndex)
		// substring(int beginIndex, int endIndex)
		String str = "Exciting Java";
		String result = str.substring(7);	// g java
		System.out.println(result);
		result = str.substring(3, 6);	// iti
		System.out.println(result);
		System.out.println();

		// toLowerCase()
		// toUpperCase()
		result = str.toLowerCase();
		System.out.println(result);
		result = str.toUpperCase();
		System.out.println(result);
		System.out.println();

		// valueOf(int i)
		int vI01 = 100;
		int vI02 = 200;
		System.out.println(vI01 + vI02);	// 300 출력
		result = String.valueOf(vI01) + String.valueOf(vI02);	// 100200 출력
		System.out.println(result);
		System.out.println();
	}
}
