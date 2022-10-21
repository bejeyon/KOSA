/*
HWJava08_11_Chap03_Exercise_배재연.zip

Q2. 다음은 증감 연산에 관한 코드다. 출력값을 쓰시오.

int a = 5;
int b = a++;
System.out.println(a);				// 6
System.out.println(b);				// 5
System.out.println(++a);				// 7
System.out.println(++b);			// 6
System.out.println(a++ + --b);		// 12
System.out.println(a + b);			// 13
*/
package classes;

class Chap03_ExerciseQ2
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = a++;
		System.out.println(a);				// 6
		System.out.println(b);				// 5
		System.out.println(++a);				// 7
		System.out.println(++b);			// 6
		System.out.println(a++ + --b);		// 12
		System.out.println(a + b);			// 13
	}
}