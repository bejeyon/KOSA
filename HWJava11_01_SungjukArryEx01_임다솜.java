package classes;



class  HWJava11_01_SungjukArryEx01_임다솜
{
	public static void main(String[] args) 
	{
		HWJava11_01_SungjukArryEx01_임다솜 obj = new HWJava11_01_SungjukArryEx01_임다솜();

		String[] vSubject = {"Name","Computer","English","Mathematics","Total","Average"};
		String[] vName = {"RM","진","슈가","제이홉","지민","뷔","정국"};
		int[][] vScore = {{90,80,70},        
						 {95,85,75},
						 {70,90,70},
						 {85,80,65},
						 {90,70,85},
						 {95,65,70},
						 {90,100,50}};
	
		int[] vAverage = new int[vScore[0].length];

		for(String vSub : vSubject){
			System.out.print(vSub+" \t");
		}

		System.out.println();
		System.out.println(obj.mLine('=',100));

		for(int i = 0 ; i < vName.length ; i++){
			int sum=0;	//total
			String outPut = vName[i]+" \t\t"; //출력 스트링에 이름 더함
			for(int j = 0 ; j < vScore[i].length;j++){
				vAverage[j]+=vScore[i][j];
				sum+=vScore[i][j]; //total에 점수 더함
				outPut+=vScore[i][j]+" \t\t";//출력 스트링에 점수 더함
			}
			int average = sum/vScore[i].length;

			outPut+=sum+" \t"+average;// total과 average 
			
			System.out.println(outPut);// 한줄 출력
		}
		System.out.println(obj.mLine('-',100));
		
		//Average 출력
		System.out.print("Average \t");
		for(int average : vAverage){
			System.out.print(average/vName.length+" \t");
		}


	}

	String mLine(char c, int num){
		String result = "";
		for(int i = 0 ; i < num ; i++){
			result+=c;
		}

		return result;
	}
}
