package classes;

/*
HWJava09_05_ExitChk_배재연.java

System.exit(int);

for 5회 반복 : 0~ 4
	if(idx == 3)
		System.exit(0)
	print(idx)
*/

class ExitChk
{
	public static void main(String[] args) 
	{
		for (int idx = 0; idx < 5; idx++)
		{
			if(idx == 3)
				System.exit(1);
			System.out.print(idx+" ");
		}

		System.out.println("Happy Day!!");
	}
}