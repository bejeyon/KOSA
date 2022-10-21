package classes;

class BreakContinueChk
{
	public static void main(String[] args) 
	{
		// break문 출력 확인
		System.out.println("break문 출력 확인\n");
		for (int i = 0; i < 10; i++)
		{
			if (i == 4)
				break;
			System.out.print(i+" ");
		}
		
		// continue문 출력 확인
		System.out.println("\n\ncontinue문 출력 확인\n");
		for (int i = 0; i < 10; i++)
		{
			if (i == 4)
				continue;
			System.out.print(i+" ");
		}
	}
}
