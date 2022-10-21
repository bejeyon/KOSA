/*
HWJava13_04_Chap07Summary01_배재연.zip
*/

package classes;

// 기본 자료형 입력매개변수값의 변화

public class EffectOfPrimaryDataArgument
{
	public static int twice(int a)
	{
		a = a * 2;
		return a;
	}

	public static void main(String[] args) 
	{
		int a = 3;
		int result1 = twice(3);
		System.out.println(result1);	// 6
		int result2 = twice(a);
		System.out.println(result2);	// 6
		System.out.println(a);	// 3
	}
}
