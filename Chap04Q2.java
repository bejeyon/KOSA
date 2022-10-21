package classes;

/*
Q2. Q1에서 완성한 코드를 동일한 기능을 수행하는 switch 구문으로 작성하시오.(단, 0 <= score <= 100).

	값의 범위		출력 학점
	score > = 90	A학점
	80 <= score < 90	B학점
	70 <= score < 80	C학점
	score < 70	F학점
*/

class Chap04Q2
{
	public static void main(String[] args) 
	{
		int score = 72;

		switch(score/10){
		case 10:
		case 9:
			System.out.println("A학점");
			break;

		case 8:
			System.out.println("B학점");
			break;

		case 7:
			System.out.println("C학점");
			break;

		default:
			System.out.println("F학점");
		}
	}
}