/*
HWJava13_05_Chap07Summary02_배재연.zip
*/

package classes;

// 묵시적 this 키워드 자동 추가

// #1. 클래스 내부에서 필드, 메서드 앞에 자동으로 붙는 this 키워드
class A
{
	int m;
	int n;
	void init(int a, int b)
	{
		int c;
		c = 3;
		this.m = a;	// this. 생략 시 자동 추가
		this.n = b;	// this. 생략 시 자동 추가
	}
	void work()
	{
		this.init(2, 3);	// this. 생략 시 자동 추가
	}
}

class ThisKeyword_1
{
	public static void main(String[] args) 
	{
		// #2. 클래스 객체 생성
		A a = new A();
		// #3. 메서드 호출 / 필드값 활용
		a.work();
		System.out.println(a.m);	// 2
		System.out.println(a.n);	// 3
	}
}
