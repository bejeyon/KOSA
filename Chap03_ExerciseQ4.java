/*
HWJava08_11_Chap03_Exercise_배재연.zip

Q4. 다음은 시프트 연산자에 관한 코드다. 출력값을 쓰시오.

System.out.println(7 << 2);		// 0b00000111 << 28
System.out.println(7 >> 3);		// 0b00000111 >> 0
System.out.println(-7 << 2);	// 0b11111001 << -28
System.out.println(-7 >> 2);	// 0b11111001 >> 0b11111110 -2
System.out.println(-1 >>> 30);	// 0b11111111 >> 0b00000011 3
*/
package classes;

class Chap03_ExerciseQ4
{
	public static void main(String[] args) 
	{
		System.out.println(7 << 2);		// 0b00000111 << 28
		System.out.println(7 >> 3);		// 0b00000111 >> 0
		System.out.println(-7 << 2);	// 0b11111001 << -28
		System.out.println(-7 >> 2);	// 0b11111001 >> 0b11111110 -2
		System.out.println(-1 >>> 30);	// 0b11111111 >> 0b00000011 3
	}
}