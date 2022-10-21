/*
HWJava08_11_Chap03_Exercise_배재연.zip

Q7. 다음은 논리 연산자와 비트 연산자로 논리 연산을 수행한 코드다. 출력값을 쓰시오.

int a = 4, b = 5, c = 6;
System.out.println(false && a-- > 6);		// false
System.out.println(true | b++ > 6);			// true
System.out.println(true ^ c++ > 6);			// true
System.out.println(a);							// 4
System.out.println(b);							// 6
System.out.println(c);							// 7
*/
package classes;

class Chap03_ExerciseQ7
{
	public static void main(String[] args) 
	{
		int a = 4, b = 5, c = 6;
		System.out.println(false && a-- > 6);		// false
		System.out.println(true | b++ > 6);			// true
		System.out.println(true ^ c++ > 6);			// true
		System.out.println(a);							// 4
		System.out.println(b);							// 6
		System.out.println(c);							// 7
	}
}