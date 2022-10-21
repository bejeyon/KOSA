package classes;

/*
>> HWJava07_01_ForStar01_배재연.java

for를 이용하여 다음을 출력하라

							outer i = 0; i < 5; i++	/ inner j = 0; j < i; j++
☆									 1								   1
☆☆								 2								   2
☆☆☆							 3								   3
☆☆☆☆							 4								   4
☆☆☆☆☆						 5								   5

01. outer : 5회
02. inner : 5회
*/

class ForStar01
{
	public static void main(String[] args) 
	{
		for (int i = 0; i < 5; i++)
		{
			for (int j=0; j <= i ; j++)
				System.out.print("☆");
			System.out.print("\n");
		}
	}
}
