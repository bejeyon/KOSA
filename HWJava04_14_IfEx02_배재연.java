package classes;

/*
파일명 : HWJava04_14_IfEx02_오렌지.java
조   건 :
	1. 실행시에 1개의 점수를 입력 받는다.
	2. 0~100 사이의 점수이면
			90 이상 A 학점
			80 이상 B 학점
			......
			60 이상 D 학점
			그 이하는 F 학점

		그렇지 않으면 "점수의 범위를 벗어났습니다."
*/

class IfEx02{

	public static void main(String[] args) 	{

		int vScore = Integer.parseInt(args[0]);

		if(vScore>=0&&vScore<=100){
			if(vScore>=90){
				System.out.println("A 학점\n");
			}
			else if(vScore>=80){
				System.out.println("B 학점\n");
			}
			else if(vScore>=70){
				System.out.println("C 학점\n");
			}
			else if(vScore>=60){
				System.out.println("D 학점\n");
			}
			else{
				System.out.println("F 학점\n");
			}
		}
		else{
			System.out.println("점수의 범위를 벗어났습니다.\n");
		}
	}
}
