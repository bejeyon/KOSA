/*
실습
파일명 ] HWJava11_01_SungJukArryEx01_배재연.java
조건 ]
		1. String vSubject[] =  {"Name","Computer","English","Mathematics","Total","Average"}; 		
		2. String vName[]    =  {"RM","진", "슈가", "제이홉", "지민", "뷔", "정국"};  		
		3. int vScore[][] ={{90,80,70},        
									{95,85,75},
									{70,90,70},
									{85,80,65},
									{90,70,85},
									{95,65,70},
									{90,100,50}};
결과 ]
		Name		Computer		English		Mathmatics		Total		Average
		=============================================================== mLine( , )
		RM			XX				XX			XX					XX		XX.XX
		...
		------------------------------------------------------------------------------------ mLine( , )
		Average	XX.X				XX.X			XX.X
*/
package classes;

class SungJukArryEx01
{
	public static void main(String[] args) 
	{
		UserAPI uapi = new UserAPI();

		String vSubject[] =  {"Name","Computer","English","Mathematics","Total","Average"}; 		
		String vName[]    =  {"RM","진", "슈가", "제이홉", "지민", "뷔", "정국"};  
		int vScore[][] ={{90,80,70},        
								{95,85,75},
								{70,90,70},
								{85,80,65},
								{90,70,85},
								{95,65,70},
								{90,100,50}};
		
		for (int i = 0; i < vSubject.length; i++)
			System.out.print(vSubject[i] + "\t\t");
		System.out.println();
		
		uapi.mLine("=", 100);
		System.out.println();

		for (int i = 0; i < vName.length; i++)
		{
			System.out.print(vName[i] + "\t\t");
			for (int j = 0; j < vScore[i].length; j++)
			{
				System.out.print(vScore[i][j] + "\t\t");
			}
			int total = 0;
			double average = 0.0;
			for (int j = 0; j < vScore[i].length; j++)
			{
				total += vScore[i][j];
			}
			average = (double)total/vScore[i].length;
			System.out.print(total + "\t\t");
			System.out.print(average + "\t\t");
			System.out.println();
		}
		System.out.println();

		uapi.mLine("-", 100);
		System.out.println();
		System.out.print(vSubject[5] + "\t\t");

		double sumCom =0;
		double aveCom = 0.0;
		double sumEng = 0;
		double aveEng = 0.0;
		double sumMath = 0;
		double aveMath = 0.0;
		for (int j = 0; j < vScore[j].length; j++)
		{
			for (int i = 0; i < vScore.length; i++)
			{
				if (j == 0)
					sumCom += vScore[i][j];
				else if (j == 1)
					sumEng += vScore[i][j];
				else
					sumMath += vScore[i][j];
			}
		}
		aveCom = (double)sumCom/vScore.length;
		aveEng = (double)sumEng/vScore.length;
		aveMath = (double)sumMath/vScore.length;
		System.out.print(aveCom + "\t");
		System.out.print(aveEng + "\t");
		System.out.print(aveMath + "\t");
		System.out.println();
	}
}
