package classes;

class SwitchCase03
{
	public static void main(String[] args) 
	{
		int month = Integer.parseInt(args[0]);
		String msg = "";

		switch (month)
		{
			case 12 :
			case 1 :
			case 2 :
				msg = "월은 겨울입니다.";
				break;
			case 3 :
			case 4 :
			case 5 :
				msg = "월은 봄입니다.";
				break;
			case 6 :
			case 7 :
			case 8 :
				msg = "월은 여름입니다.";
				break;
			case 9 :
			case 10 :
			case 11 :
				msg = "월은 가을입니다.";
				break;
			default :
				msg = "1 ~ 12 사이의 숫자를 입력하세요.";
		}
		System.out.println(month+msg);
	}
}
