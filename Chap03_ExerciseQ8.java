/*
HWJava08_11_Chap03_Exercise_배재연.zip

Q8. 다음은 대입 연산자에 관한 코드다. 출력값을 쓰시오.

int a = 3;
a <<= 1;									// 0b00000011 << 1칸 : 6
System.out.println(a);			// 6 출력
a &= 5;									// 0b00000110 & 0b00000101 = 0b00000100 : 4
System.out.println(a);			// 4 출력
a -= 1;									// a = a - 1 = 4 - 1 = 3
System.out.println(a *= 2);	// a = a * 2 = 3 * 2 = 6 출력
*/
package classes;

class Chap03_ExerciseQ8
{
	public static void main(String[] args) 
	{
		int a = 3;
		a <<= 1;									// 0b00000011 << 1칸 : 6
		System.out.println(a);			// 6 출력
		a &= 5;									// 0b00000110 & 0b00000101 = 0b00000100 : 4
		System.out.println(a);			// 4 출력
		a -= 1;									// a = a - 1 = 4 - 1 = 3
		System.out.println(a *= 2);	// a = a * 2 = 3 * 2 = 6 출력
	}
}