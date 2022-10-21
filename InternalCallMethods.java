/*
HWJava13_04_Chap07Summary01_배재연.zip
*/

package classes;

// 클래스의 내부에서 메서드 호출

class InternalCallMethods
{
	public static void print()
	{
		System.out.println("안녕");
	}
	public static int twice(int k)
	{
		return k*2;
	}
	public static double sum(int m, double n)
	{
		return m + n;
	}

	public static void main(String[] args) 
	{
		// 같은 클래스 안에 있는 내부 메서드 호출
		print();	// "안녕" 출력

		int a = twice(3);
		System.out.println(a);	// 6 출력

		double b = sum(a, 5.8);
		System.out.println(b);	// 11.8 출력
	}
}
