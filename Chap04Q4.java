package classes;

/*
Q4. 다음 for 문과 동일한 기능을 수행하는 while 문을 작성하시오.

for(int i = 10; i > 0; i -= 2){
	System.out.println(i);
}
*/

class Chap04Q4
{
	public static void main(String[] args) 
	{
		int i = 10;
		while(i > 0){
			System.out.println(i);
			i -= 2;
		}
	}
}