/*
## HWJava11_07_StringAPI06_배재연.java
*/
package classes;

class StringAPI06
{
	public static void main(String[] args) 
	{
		// indexOf(int ch) : int
		// lastIndexOf(int ch) : int
		String hello = "HelloWorld_MyWorld";

		System.out.println(hello.indexOf("World"));
		System.out.println(hello.lastIndexOf("World"));

		// toCharArray()
		char[] result = hello.toCharArray();
		System.out.println(result.length);
		System.out.println(result[5]);
	}
}
