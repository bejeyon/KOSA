package classes;

class LabelBreakContinue
{
	public static void main(String[] args) 
	{
		System.out.println("break문 출력 확인\n");
		for (int i = 0; i < 3; i++)			// outer : 0 1 2
		{
			for (int j = 0; j < 5 ; j++)	// inner : 0 1 2 3 4
			{
				if (j == 3)
				break;
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
		// 0 1 2
		// 0 1 2
		// 0 1 2

		System.out.println("\n-------------------------");
		System.out.println("label 및 break문 출력 확인\n");
labelN :for (int i = 0; i < 3; i++)		// outer : 0 1 2
			{
				for (int j = 0; j < 5 ; j++)		// inner : 0 1 2 3 4
				{
					if (j == 3)
						break labelN;
					System.out.print(j + " ");
				}
				System.out.print("\n");
			}
			// 0 1 2
		
		System.out.println("\n-------------------------");
		System.out.println("label 및 continue문 출력 확인\n");
labelO :for (int i = 0; i < 3; i++)		// outer : 0 1 2
			{
				System.out.print("\n");
				for (int j = 0; j < 5 ; j++)		// inner : 0 1 2 3 4
				{
					if (j == 3)
						continue labelO;
					System.out.print(j + " ");
				}
				
			}
			// 0 1 2
			// 0 1 2
			// 0 1 2
	}
}
