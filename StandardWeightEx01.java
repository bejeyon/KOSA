package classes;

/*
파일명 ] HWJava05_10_StandardWeightEx01_배재연.java
[예제] 키와 체중을 입력받아 비만도 조사 [ 실행시 ]

	표준체중 = (키 - 100) * 0.9

	비만 : 표준체중 5kg 이상 초과

	허약 : 표준체중 5kg 이상 미달

결과 ]
	당신의 키는 XX cm, 체중은 XX kg 이고
	정상체중은 XX kg ~ XX kg 입니다.
	당신은 표준[ 비만, 허약 ] 체중입니다.
*/

class StandardWeightEx01
{
	void mLine1(int num1, int num2){
		System.out.println("당신의 키는 "+num1+"cm, 체중은 "+num2+"kg 이고");
	}
	void mLine2(int num1, int num2){
		double vStd = (num1-100)*0.9;
		System.out.println("정상체중은 "+(vStd-5)+"kg ~ "+(vStd+5)+"kg 입니다.");
	}
	void mLine3(int num1, int num2){
		double vStd = (num1-100)*0.9;
		String vNow = "";
		if (num2>=(vStd-5)&&num2<=(vStd+5))
			vNow = "표준";
		else if (num2<(vStd-5))
			vNow = "허약";
		else
			vNow = "비만";
		System.out.println("당신은 "+vNow+" 체중입니다.");
	}

	public static void main(String[] args) 
	{
		int vHeight = Integer.parseInt(args[0]);
		int vWeight = Integer.parseInt(args[1]);

		StandardWeightEx01 swe = new StandardWeightEx01();

		swe.mLine1(vHeight, vWeight);
		swe.mLine2(vHeight, vWeight);
		swe.mLine3(vHeight, vWeight);
	}
}
