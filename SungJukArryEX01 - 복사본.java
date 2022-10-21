package classes;
class  SungJukArryEX01
{
	public static void main(String[] args) 
	{
		String vSubject[] =  {"Name","Computer","English","Mathematics","Total","Average"}; 		
		String vName[]    =  {"RM","진", "슈가", "제이홉", "지민", "뷔", "정국"};  
		
		String arr[][]=new String[vSubject.length][vName.length];
		int vScore[][] ={{90,80,70},        
						 {95,85,75},
						 {70,90,70},
						 {85,80,65},
						 {90,70,85},
						 {95,65,70},
						 {90,100,50}};

		for (int i =0; i<arr.length ; i++ )  //vSubject            
		{for (int j=1; j<arr[0].length+2 ; j++ )  //vName    22번줄에서 자꾸 범위오류가 나는데 어디서 잘못되는건지 모르겠네요..
		{
			arr[0][i]=vSubject[i];
			arr[j][0]=vName[j];
			System.out.println(arr[i][j]);
		}
		System.out.println("\n");
		}
		System.out.println("\n");
	

		UserAPI01 obj =new UserAPI01();          //mLine
		System.out.println(obj.mLine("=",100));    

		
		for (int[] tmp1 :  vScore)       //vScore  (arr배열에 vSubject과 vName을 넣은 상태라면 1행 1열 부터 값 넣어야 할거 같은데 for each 문으로 행열지정은 못하는건가용??)
		{  int total=0;                                          
		   int average=0;
			for (int tmp2 : tmp1)
		{	total+=tmp2;
			average=(total/3);
			System.out.print("\t"+tmp2);
			System.out.print("\t"+total);
			System.out.print("\t"+average);
	
		}
		System.out.println("\n");
		}
		System.out.println("\n");

		
	}
}
