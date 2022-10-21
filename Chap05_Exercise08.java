/*
## HWJava11_09_Chap05_Exercise08_배재연.java
*/
package classes;

class Chap05_Exercise08
{
	public static void main(String[] args) 
	{
		String str = "내 이름은 [홍길동]입니다. 나이는 [15]살 입니다.";
		String name = "";
		int age = 0;

		int index11 = str.indexOf("[");
		int index12 = str.indexOf("]");
		int index21 = str.lastIndexOf("[");
		int index22 = str.lastIndexOf("]");

		name = str.substring(index11+1, index12);
		age = Integer.parseInt(str.substring(index21+1, index22));

		System.out.println(name);	// 홍길동
		System.out.println(age);	// 15
	}
}
