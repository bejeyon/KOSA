package classes;

/*
HWJava06_03_mLine_오렌지.java

Sample Run ] 객체.mLine('-',30)
print("------------------------------") 30
print("==============================") 15
print("******************************") 50

파일명 : LineChk
*/

class LineChk
{
	void mLine(String ch1, int num){
		for(int i = 1 ; i <= num ; i++)
			System.out.print(ch1);
	}

	public static void main(String[] args) 
	{
		String inputCh = args[0];
		int inputNum = Integer.parseInt(args[1]);

		LineChk obj = new LineChk();

		obj.mLine(inputCh, inputNum);
	}
}
