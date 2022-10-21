/*
HWJava13_04_Chap07Summary01_배재연.zip
*/

package classes;

// 참조 자료형 매개변수값의 변화

import java.util.Arrays;

public class EffectOfReferenceDataArgument
{
	public static void modifyData(int[] a)
	{
		a[0] = 4;
		a[1] = 5;
		a[2] = 6;
		printArray(a);	// [4, 5, 6]
	}

	public static void printArray(int[] a)
	{
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) 
	{
		int[] array = new int[]{1, 2, 3};
		modifyData(array);
		printArray(array);	// [4, 5, 6]
	}
}
