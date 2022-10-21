package classes;

/*
Lotto
01. 6개 숫자 입력
02. 1 ~ 45 사이의 숫자
03. 중복 없다.

실습 ] 실행 시 6개의 숫자 입력 받아서 [ 1 ~ 45 ]
		파일 ] HWJava09_05_LottoWarmUp_배재연.java
		조건 ]
				1. 6개의 인자가 아닌 경우
					─▶ " 입력 숫자 개수 오류 입니다.[ 6개의 숫자 입력 확인 ] "
				2. 1 ~ 45 사이의 수가 아니면,
					─▶ " 입력 숫자 범위 오류 입니다.[ 1 ~ 45 사이 숫자 확인 ] "
				3. 중복이 있다면...
					─▶ " 입력 숫자 중복 오류입니다.[ 중복 숫자 확인 ] "
		결과 ]
				행운의 Lotto 선택 숫자 : X X X X X X 입니다.
*/

class LottoWarmUp
{
	public static void main(String[] args) 
	{
		// 입력 받은 숫자 개수 저장 및 숫자 범위 확인 및 중복 확인용 변수 생성
		int len = args.length;
		int inputNum = 0;
		int outerNum = 0;
		int innerNum = 0;
		
		// 입력 받은 숫자 개수 판별 후 6개가 아닐 시 종료
		if (len != 6)
		{
			System.out.println("입력 숫자 개수 오류입니다. [ 6개의 숫자 입력 확인 요망]");
			System.out.println("현재 입력 숫자 개수: "+len+"개");
			System.exit(1);
		}

		// 입력 받은 숫자 범위 확인 후 범위 초과 시 종료
		for (int i = 0; i < len; i++)
		{
			inputNum=Integer.parseInt(args[i]);
			if (!(inputNum>=1&&inputNum<46)){
				System.out.println("입력 숫자 범위 오류 입니다.[ 1 ~ 45 사이 숫자 확인 ]");
				System.out.println(inputNum+"은(는) 1 ~ 45 사이의 숫자가 아닙니다.");
				System.exit(2);
			}
		}

		// 입력 받은 숫자 중복 확인 후 중복이 있을 시 종료
		for (int i = 1; i < len; i++ )
		{
			outerNum = Integer.parseInt(args[i]);
			for (int j = i - 1; j >= 0 ; j--)
			{
				innerNum = Integer.parseInt(args[j]);
				if(outerNum == innerNum){
					System.out.println("입력 숫자 중복 오류입니다.[ 중복 숫자 확인 ]");
					System.out.println((j+1)+"번째 숫자와 "+(i+1)+"번째 숫자 "+inputNum+"은(는) 중복된 숫자입니다.");
					System.exit(3);
				}
			}
		}
		
		// 모든 조건 통과 시 행운의 로또 번호 출력
		System.out.print("행운의 Lotto 선택 숫자: ");
		for (int i = 0; i < len; i++)
		{
			inputNum=Integer.parseInt(args[i]);
			System.out.print(inputNum+" ");
		}
		System.out.print("입니다.");
	}
}