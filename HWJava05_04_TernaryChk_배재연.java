package classes;

/*
HWJava05_03_StrLengthChk_배재연.java

실행시 ID 입력 받는다.
ID 의 길이가 8 이상 : XXX = "사용 가능한 ID 입니다."
ID 의 길이가 8 미만 : "ID는 8자 이상 입니다."
*/

class TernaryChk
{
	public static void main(String[] args) 
	{
		String vId = args[0];
		int len = args[0].length();
		String vResult = len>=8 ? "사용 가능한 ID 입니다." : "ID는 8자 이상입니다.";

		if (len>=8)
			System.out.println(args[0]+"는 "+vResult);
		else
			System.out.println(args[0]+" : "+vResult);
	}
}
