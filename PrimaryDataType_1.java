package classes;

/*
실수 리터럴 자료형 결정 및 인식
float a = 3.5F;	// 뒤에 F가 붙었으므로 float로 인식(float=float)
double a = 5.8;	// 실수 리터럴은 기본적으로 double로 인식(double = double)
double a = 5;		// int로 인식하지만 자동 타입 변환해 double로 변환(double = double)
float a = 3.5;		// 실수 리터럴은 기본적으로 double로 인식(float = double) → 오류 발생
*/

class PrimaryDataType_1
{
	public static void main(String[] args) 
	{
		// boolean: true / false
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println();

		// 정수(byte, short, int, long) : 음의 정수 / 0 / 양의 정수
		byte value1 = 10;
		short value2 = -10;
		int value3 = 100;
		long value4 = -100L;	// long 자료형으로 인식
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println();

		// 실수(float, double) : 음의 실수 / 0 / 양의 실수
		float value5 = 1.2F;	// float 자료형으로 인식
		double value6 = -1.5;
		double value7 = 5;		// 자동 타입 변환
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);	// 실숫값으로 출력
	}
}
