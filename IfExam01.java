package classes;

/*
HWJava05_01_IfExam01_배재연.java

실행 시에 ID와 PWD를 입력받는다.

main() 메소드에 구현
vId   = "Orange"
vPwd = "1234"

01. vId 일치(args[0]으로 해도 됨) && vPwd 일치 : "Orange 님 로그인 성공!"
02. vId 일치 && vPwd 불일치 : "Pwd 확인하세요."
03. vId 불일치 : "회원가입 확인하세요!!"
*/

class IfExam01
{
	public static void main(String[] args) 
	{
		String vId = "Orange";
		String vPwd = "1234";

		if (vId.equals(args[0])&&vPwd.equals(args[1]))
		{
			System.out.println("Orange 님 로그인 성공!");
		}
		else if (vId.equals(args[0])&&(!(vPwd.equals(args[1]))))
		{
			System.out.println("Pwd 확인하세요.");
		}
		else
			System.out.println("회원가입 확인하세요!!");

/*		int vId = Integer.parseInt("Orange");
		int vPwd = Integer.parseInt("1234");

		int vId02 = Integer.parseInt(args[0]);
		int vPwd02 = Integer.parseInt(args[1]);

		if (vId==vId02&&vPwd==vPwd02)
		{
			System.out.println("Orange 님 로그인 성공!");
		}
		else if (vId==vId02&&vPwd!=vPwd02)
		{
			System.out.println("Pwd 확인하세요.");
		}
		else
			System.out.println("회원가입 확인하세요!!");
*/
	}
}
