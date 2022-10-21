package classes;

/*
파일명 : HWJava07_15_SelectionSort01_배재연.java

60 20 80 10 90 30 50 36 100

선택정렬알고리즘 구현하기
*/

class SelectionSort01
{
	public static void main(String[] args) 
	{
		for(int i = 0; i < args.length-1; i++)
		{
			for(int j = i + 1; j < args.length; j++)
			{
				if(Integer.parseInt(args[i]) > Integer.parseInt(args[j]))
				{
					String temp = "";
					temp = args[i];
					args[i] = args[j];
					args[j] = temp;
				}
			}
		}

		for(int i = 0; i < args.length; i++)
			System.out.print(args[i]+" ");
	}
}