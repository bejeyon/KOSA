package classes;

/*
HWjava07_05_WhileChk01_배재연.zip

	ForEtc02.java
		int idx = 0;
		for(;idx<3;){
			System.out.println("Nice Day");
			idx++;
		}
참조해서 for문을 while문으로 바꾸기.

*/

class DoWhileChk01
{
	public static void main(String[] args) 
	{		
		int idx = 5;

		while(idx < 3){
			System.out.println("Nice Day");
			idx++;
		}

		System.out.println("----------");

		do
		{
			System.out.println("Nice Day");
			idx++;
		}
		while (idx < 3);
	}
}
