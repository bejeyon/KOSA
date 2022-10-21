/*
HWJava08_11_Chap03_Exercise_배재연.zip

Q3. 다음은 비트 연산자에 관한 코드다. 출력값을 쓰시오(3 = 0b00000011, 5 = 0b00000101이며, 출력값은 2진수로 표현해도 됨).

System.out.println(5 & 3);	// 1
System.out.println(5 | 3);	// 111 -> 7
System.out.println(5 ^ 3);	// 110 -> 6
System.out.println(~5);		// 0b11111010 -> -6
*/
package classes;

class Chap03_ExerciseQ3
{
	public static void main(String[] args) 
	{
		System.out.println(5 & 3);	// 1
		System.out.println(5 | 3);	// 111 -> 7
		System.out.println(5 ^ 3);	// 110 -> 6
		System.out.println(~5);		// 0b11111010 -> -6
	}
}