package classes;

/*
파일명 : HWJava07_15_SelectionSort01_배재연.java

60 20 80 10 90 30 50 36 100

선택정렬알고리즘 구현하기
*/

class SelectionSort02
{
	public static void main(String[] args) 
	{
		SelectionSort02 obj = new SelectionSort02();
		int minIdx = 0;
		for(int i = 0; i < args.length-1; i++)
		{
			minIdx = i;
			for(int j = i + 1; j < args.length; j++)
			{
				if(Integer.parseInt(args[minIdx]) > Integer.parseInt(args[j]))
					minIdx = j;
			}
			String temp = args[i];
			args[i] = args[minIdx];
			args[minIdx] = temp;
		}

		for(int i = 0; i < args.length; i++)
			System.out.print(args[i]+" ");
	}
}