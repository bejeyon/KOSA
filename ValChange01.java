package classes;

/*
>> HWJava07_13_ValChange01_배재연.java

## 2개 변수값을 서로 변경

vI01 = 10;
vI02 = 20;

System.out.println("변경 전 변수의 값 : " + vI01 + "/" + vI02);	>> 10 / 20

// vI01 = vI02 // vI01 = 20 / vI02 = 20

temp = vI01;
vI01 = vI02;
vI02 = temp;

System.out.println("변경 후 변수의 값 : " + vI01 + "/" + vI02);	>> 20 / 10
*/

class ValChange01
{
	public static void main(String[] args) 
	{
		// 2개 변수값을 서로 변경

		int vI01 = 10;
		int vI02 = 20;

		System.out.println("변경 전 변수의 값 : " + vI01 + "/" + vI02);	// 10 / 20

		int temp = vI01;
		vI01 = vI02;
		vI02 = temp;

		System.out.println("변경 후 변수의 값 : " + vI01 + "/" + vI02);	// 20 / 10
	}
}
