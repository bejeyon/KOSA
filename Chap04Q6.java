package classes;

/*
Q6~Q7. 다음은 바깥쪽 10회, 안쪽 5회를 반복하는 이중 for 문이다. 다음 물음에 답하시오.

for(int i = 0; i < 10; i++){
	for(int j = 0; j < 5; j++){
		// ...
	}
}

Q6. 레이블을 사용하지 않고 i = 3, j = 2일 때 이중 for 문을 한 번에 탈출하는 코드를 완성하시오.
*/

class Chap04Q6
{
	public static void main(String[] args) 
	{
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 5; j++){
				if(i == 3 && j == 2)
					break;
			}
		}
	}
}