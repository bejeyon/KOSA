package classes;

/*
실수 자료형의 구분
				부호비트		가수비트		지수비트		총
float :			1					23				8				32
double :			1					52				11				64

int형과 float형 연산 시 같은 4byte여도 float형이 더 상위자료형으로 인식되어 결과값이 float형으로 auto casting 됨.
*/	

class FloatVsDouble
{
	public static void main(String[] args) 
	{
		// float의 정밀도(대략 소수 7자리)
		float f1 = 1.0000001f;
		System.out.println(f1);	// 정상 출력
		float f2 = 1.00000001f;
		System.out.println(f2);	// 오차 발생

		// double의 정밀도(대략 소수 15자리)
		double d1 = 1.000000000000001;
		System.out.println(d1);	// 정상 출력
		double d2 = 1.0000000000000001;
		System.out.println(d2);	// 오차 발생
	}
}
