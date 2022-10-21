package classes;

import java.io.IOException;

class  ReadChk01{
	public static void main(String[] args) throws IOException {
		
		// 아스키코드 변환한 값을 넣을 변수 선언
		int result=0;

		System.out.print(" 1~30 사이의 숫자를 입력하세요 [ 종료 : 0 ] : ");
		
		// 첫 번째 입력의 아스키 코드값 할당
		int num1 = System.in.read();

		// 두 번째 입력의 아스키 코드값 할당
		int num2 = System.in.read();

		// 세 번째 입력의 아스키 코드값 할당
		int num3 = System.in.read();
		

		// 만약 첫 번째 입력이 0이라면 종료
		if (num1 == 48)
		{
			System.exit(0);
		}

		/* 
		1. 한 자리 수가 입력 되었을 경우 
		두 번째로 읽어온 값은 엔터의 아스키 코드값인 13일 것이다.
		2. 두 자리 수가 입력 된 경우
		세 번째로 읽은 값이 엔터키의 아스키 코드값일 것이다.
		3. 세 자리 수가 입력된 경우
		세 번째로 읽은 값이 13이 아닐 것이다. 
		*/
		if (num2 == 13)
		{
			result = (num1-48);
		}else if (num3 == 13)
		{
			result = (num1-48)*(int)Math.pow(10,1) + (num2-48);
		}else{
			System.out.println("\n^ Error Chk : 1자리 또는 2자리 숫자를 입력하세요.\n");
			System.exit(0);
		}
		

		// 만약 변환 결과값이 30보다 큰 경우 오류 메세지 출력 및 종료
		if (result>30)
		{
			System.out.println("\n^ Error Chk : 1 ~ 30 사이의 숫자를 확인하세요.\n");
			System.exit(0);
		}
		

		// 오류가 없다면 출력
		System.out.println("\n입력된 숫자는 : "+result+"(1~30) 입니다.\n");
	}
}
