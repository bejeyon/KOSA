package classes;

/*
>> HWJava06_06_MultiFor01_배재연.java
## 다중 for문 >> 이차 for문(3차까지 가는 경우 많지 않음. 차수가 많아지면 가독성 저하돼서 지양함.)
outer for
	inner for

main
int cnt = 0;
for(int idx = 0; idx < 5 ; idx++)	// 0 1 2 3 4 >> outer 5회
{
	for(int idx2 = 0; idx2 < 3 ; idx2++)	// 0 1 2 >> inner 3회
	{
		cnt++;
		print(cnt)	// 1 2 3 4 ... 15
	}
}	// Algorithm >> 15회
*/

class MultiFor01
{
	public static void main(String[] args) 
	{
		int cnt = 0;
		for(int idx = 0; idx < 5 ; idx++)	// 0 1 2 3 4 >> outer 5회
		{
			for(int idx2 = 0; idx2 < 3 ; idx2++)	// 0 1 2 >> inner 3회
			{
				cnt++;
				System.out.print(cnt+" ");	// 1 2 3 4 ... 15
			}
		}	// Algorithm >> 15회
	}
}
