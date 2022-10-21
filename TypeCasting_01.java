package classes;

/*
자료형 간의 타입 변환 방법
1. 자료형 A 변수명 = (자료형 A) 값
2. long 변수명 = 값 + L;
3. long 변수명 = 값 + l;
4. float 변수명 = 값 + F;
5. float 변수명 = 값 + f;
*/

class TypeCasting_01
{
	public static void main(String[] args) 
	{
		
		// 캐스팅 방법 1: 자료형
		int value1 = (int)5.3;			// 값이 (int)5.3 → 5로 변경됨. // 자료형 삽입으로 타입 변환
		long value2 = (long)10;		// 자료형 삽입으로 타입 변환
		float value3 = (float)5.8;	// 자료형 삽입으로 타입 변환
		double value4 = (double)16;	// 자료형 삽입으로 타입 변환

		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println();

		// 캐스팅 방법 2: L, F
		long value5 = 10L;	// long형으로 타입 변환
		long value6 = 10l;	// long형으로 타입 변환
		float value7 = 5.8F;	// float형으로 타입 변환
		float value8 = 5.8f;	// float형으로 타입 변환

		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
	}
}
