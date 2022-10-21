package classes;

/*
Q3. 다음과 같이 출력되도록 if 문과 break, continue를 이용해 for 문 코드를 완성하시오.

for(int i = 0; ; i++){
	if(i%2 == 1)
		continue;
	if(i >10)
		break;
	System.out.println(i);	// 0, 2, 4, 6, 8, 10
}
*/

class Chap04Q3
{
	public static void main(String[] args) 
	{
		for(int i = 0; ; i++){
			if(i%2 == 1)
				continue;
			if(i >10)
				break;
			System.out.println(i);	// 0, 2, 4, 6, 8, 10
		}
	}
}