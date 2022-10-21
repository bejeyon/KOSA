package classes;

/*
HWjava06_09_ForEachWarmUp_배재연.java
실행시에 10 20 30 40 50 입력받는다.
	int cnt = args.length;
	for(idx=0;idx<cnt;idx++)
		print(args[idx]+"\t");

Sample Run ]
10 20 30 40 50
*/

class ForEachWarmUp
{
	public static void main(String[] args) 
	{
		int cnt = args.length;
		for(int idx = 0 ; idx < cnt ; idx++)
		System.out.print(args[idx]+"\t");
	}
}
