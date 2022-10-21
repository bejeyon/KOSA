package classes;

class A
{
	int m = 3;
	int n = 4;
	void print() {
		System.out.println(m + ", " + n);
	}
}

public class ExternalClass_1 {
	public static void main(String[] args) {
		// 객체 생성
		A a = new A();
		a.print();	// "3, 4" 출력
	}
}
