package classes;

/*
1. 문자의 저장 방식
	1) 문자 값 또는 정숫값 입력
		(1) 문자로 입력됐을 때 → <유니코드 표> → 문자에 해당하는 정숫값 → 메모리에 정숫값 저장
		(2) 정수 또는 유니코드값으로 입력됐을 때 → 메모리에 정숫값 저장
2. 문자의 출력 방식
	1) 메모리에 정숫값 저장 → <유니코드 표> → 정수에 해당하는 문자 값 → 문자 출력

----------

유니코드를 입력할 때는 '\\u + 16진수 유니코드'와 같이 사용.
값을 '\\u + 16진수 유니코드'로 입력할 때 유니코드값은 2byte, 즉 16진수 4자리로 표현해야 한다.

10진수		16진수		문자
13				0x000D	CR
48			0x0030		0
65			0x0041		A
97			0x0061		a
44032		0xac00		가
*/

class PrimaryDataType_2
{
	public static void main(String[] args) 
	{
		// 문자로 저장하는 방법
		char value1 = 'A';
		char value2 = '가';
		char value3 = '3';	// 숫자 3이 아닌 문자 '3'을 가리킴.
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println();

		// 정수로 저장하는 방법
		char value4 = 65;
		char value5 = 0xac00;
		char value6 = 51;
		System.out.println(value4);	// char 자료형의 출력값은 문자로 출력
		System.out.println(value5);
		System.out.println(value6);
		System.out.println();

		// 유니코드로 직접 입력
		char value7 = '\u0041';
		char value8 = '\uac00';
		char value9 = '\u0033';
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println();
	}
}
