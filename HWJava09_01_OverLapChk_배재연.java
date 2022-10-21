package classes;

/*
// 10 20 30 20 40 45
	HWJava09_01_OverLapChk_배재연.java
파일 ] OverLapChk.java
조건
01. 실행 시 6개의 숫자를 입력받는다.
02. 중복된 값이 있다면
	  몇 번째 어떤 숫자인지 출력한다.

Sample Run ]
	4번째 20 숫자 중복 확인!!

	행운의 로또 번호
	XX XX XX XX XX XX

	outer : 
		i >> 1
	inner
		j >> i-1 ~ 0

==========

sw =	0,			1
		false,	true
*/

class OverLapChk
{
	public static void main(String[] args) 
	{
		int len = args.length;
		int outerN = 0;
		int innerN = 0;

		for (int i = 1; i < len; i++)
		{
			outerN = Integer.parseInt(args[i]);
			for(int j = i - 1; j >= 0; j--)
			{
				innerN = Integer.parseInt(args[j]);
				if (outerN == innerN)
				{
					System.out.println("중복된 숫자 "+outerN+" 이 있습니다!!");
					return;
				}
			}
		}

		System.out.println("행운의 로또 번호");
		for (int k = 0; k < len; k++)
			System.out.print(args[k]+" ");
	}
}
