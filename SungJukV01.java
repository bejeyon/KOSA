/*
HWJava12_01_toCharArraySungJukV01_배재연.zip
01. 학생명, 정답(문자), 학생답(문자열)
02. mCompare(학생명, 학생답(문자배열))
	  정답==학생딥 >> +=10, O, X

	char[] jungDop = new char[] {'1', '2', '3', '4', '1', '2', '3', '4', '1', '2'};

	String[] hakName = {"희동이", "둘  리", "마이콜", "영  희", "철  수", "고길동" ,"또  치"};
	String[] sHakDap = {"1234321412", "3241234222", "1234123412", 
								  "1222134213", "1321321141", "1231231231", 
								  "1243432131"};
*/

package classes;

class SungJukV01
{
	public static void main(String[] args) 
	{
		char[] jungDop = new char[] {'1', '2', '3', '4', '1', '2', '3', '4', '1', '2'};

		String[] hakName = {"희동이", "둘  리", "마이콜", "영  희", "철  수", "고길동" ,"또  치"};
		String[] sHakDap = {"1234321412", "3241234222", "1234123412", "1222134213", "1321321141", "1231231231", "1243432131"};
		
		SungJukV01 match = new SungJukV01();

		char ox[] = new char[jungDop.length];
		int score;

		UserAPI uapi = new UserAPI();

		uapi.mLine("=", 100);
		System.out.println();

		System.out.print("정  답\t: ");
		for(char dap : jungDop)
			System.out.print(dap+"\t");
		System.out.println();

		uapi.mLine("=", 100);
		System.out.println();

		for (int i = 0; i < hakName.length; i++)
		{
			ox = sHakDap[i].toCharArray();
			match.mCompare(hakName[i], ox);
		}
	}

	char[] jungDop = new char[] {'1', '2', '3', '4', '1', '2', '3', '4', '1', '2'};

	void mCompare(String name, char[] inputAnswer)
	{
		System.out.print(name+"\t: ");
		for (int i = 0; i < inputAnswer.length; i++)
		{
			System.out.print(inputAnswer[i]+"\t");
		}
		System.out.println();
		System.out.print("\t  ");
		int total = 0;
		for (int i = 0; i < inputAnswer.length; i++)
		{
			if (jungDop[i]==inputAnswer[i])
			{
				System.out.print("O\t");
				total = total + 10;
			}
			else
				System.out.print("X\t");
		}
		System.out.print("[ 점 수 ] : "+total);
		System.out.println();
	}
}
