package classes;

/*
Q5. 다음 이중 for 문을 실행했을 때 'A'는 몇 회 출력되는지 쓰시오.

for(int i = 0; i < 5; i++){
	for(int j = 0; j < 3; j++){
		if(i == 2) {
			continue;
		}
		if(j == 1) {
			break;
		}
		System.out.println("A");
	}
}

4회
*/

class Chap04Q5
{
	public static void main(String[] args) 
	{
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 3; j++){
				if(i == 2) {
					continue;
				}
				if(j == 1) {
					break;
				}
				System.out.println("A");
			}
		}
	}
}