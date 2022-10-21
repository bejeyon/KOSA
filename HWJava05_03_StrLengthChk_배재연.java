package classes;

/*
HWJava05_03_StrLengthChk_배재연.java

실행시 ID 입력 받는다.
ID 의 길이가 8 이상 : XXX = "사용 가능한 ID 입니다."
ID 의 길이가 8 미만 : "ID는 8자 이상 입니다."
*/

class StrLengthChk
{
	public static void main(String[] args) 
	{
		if (args[0].length()>=8)
			System.out.println(args[0]+" = 사용 가능한 ID 입니다.");
		else
			System.out.println(args[0]+": ID는 8자 이상 입니다.");
	}
}
