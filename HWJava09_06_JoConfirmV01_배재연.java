package classes;

/*
파일 ] HWJava09_06_JoConfirmV01_배재연.java
문제 ]
		1. 실행 시에 3인 이상의 이름을 입력 받는다.
			3인 이하라면 "^ 3인 이상을 입력하세요"
		2. 중복 없이 1 ~ 인원수 랜덤하게 출력
Sample Run ]
		보라 뽀오 나나 뚜비
		3		2		4		1
*/

class JoConfirmV01
{
	public static void main(String[] args) 
	{
		// 입력 받은 인원 체크 및 인원수 출력용 변수 생성
		int len = args.length;
		int outerNum = 0;
		int innerNum = 0;
		
		// 입력 받은 인원 명수 판별 후 3인 미만일 시 종료
		if (len < 3)
		{
			System.out.println("3인 이상의 이름을 입력하세요");
			System.out.println("현재 입력 인원수: "+len+"명");
			System.exit(1);
		}
		
		for (String people : args)
			System.out.print(people+"\t");
		System.out.print("\n");
		
		// 난수 저장용 배열 생성
		int[] arr = new int[len];

		for (int i = 0; i < len; i++)
		{
			arr[i] = (int)Math.floor(Math.random()*len+1);
		}

		for (int i = 1; i < len; i++ )
		{
			outerNum = arr[i];
			for (int j = i - 1; j >= 0 ; j--)
			{
				innerNum = arr[j];
				while(outerNum == innerNum){
					arr[j] = (int)Math.floor(Math.random()*len+1);
					innerNum = arr[j];
				}
			}
		}

		for (int num : arr)
			System.out.print(num+"\t");
		System.out.print("\n");

	}
}