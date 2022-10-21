/*
HWJava13_04_Chap07Summary01_배재연.zip
*/

package classes;

// 메서드의 오버로딩(Overloading)

public class MethodOverloading
{
	public static void print()
	{
		System.out.println("데이터가 없습니다.");
	}
	public static void print(int a)
	{
		System.out.println(a);
	}
	public static void print(double a)
	{
		System.out.println(a);
	}
	/*
	정의 불가능(void print(double a) {}와 중복)
	public static void print(double a)
	{
		System.out.println(a);
	}
	*/
	public static void print(int a, int b)
	{
		System.out.println("a: " + a + " b: " + b);
	}
	/*
	정의 불가능(void print(int a, int b) {}와 중복)
	public static void print(int a, int b)
	{
		System.out.println("a: " + a + " b: " + b);
	}
	*/

	public static void main(String[] args) 
	{
		print();	// "데이터가 없습니다." 출력
		print(3);	// 3 출력
		print(5.8);	// 5.8 출력
		print(2, 5);	// "2: 2 5: 5" 출력
	}
}
