package classes;

/*
HWjava06_10_ForEachFinish_배재연.java
실행시에 10 20 30 40 50 입력받는다.
	int cnt = args.length;
	for(idx=0;idx<cnt;idx++)
		print(args[idx]+"\t");

Sample Run ]
10 20 30 40 50
*/

class ForEachFinish02
{
	public static void main(String[] args) 
	{
		int[] arrInt = {10, 20, 30, 40, 50};
		for(int item : arrInt)
			System.out.print(item+"\t");
	}
}
