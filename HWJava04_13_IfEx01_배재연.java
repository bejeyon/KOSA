package classes;

/*
파일명 : HWJava04_13_IfEx01_오렌지.java
조   건 :
	1. 실행시에 1개의 숫자(나이)를 입력 받는다.
	2. 18세 이상이면
			"성인 인증 성공!"
		아니면
			"성인 인증 실패!"
*/

class IfEx01{

	public static void main(String[] args) 	{

		int vAge = Integer.parseInt(args[0]);

		if(vAge>=18){
			System.out.println("성인 인증 성공!\n");
		}
		else{
			System.out.println("성인 인증 실패!\n");
		}
	}
}
