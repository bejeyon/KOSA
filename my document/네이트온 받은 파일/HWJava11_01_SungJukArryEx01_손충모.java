import java.util.Arrays; 

class Main {
	public static void main(String[] args) {
		String vSubject[] =  {"Name","Computer","English","Mathematics","Total","Average"}; 		
		String vName[]    =  {"RM","진", "슈가", "제이홉", "지민", "뷔", "정국"};  
		int vScore[][] ={{90,80,70},        
						 {95,85,75},
						 {70,90,70},
						 {85,80,65},
						 {90,70,85},
						 {95,65,70},
						 {90,100,50}};
		int sum[] = new int[vScore.length];
		int avg[] = new int[3];

		System.out.println(Arrays.toString(vSubject));
		for(int i=0;i<60;i++) System.out.print('=');
		System.out.println();
		for(int i=0;i<vScore.length;i++) {
			System.out.print(vName[i]+"\t"); 
			for(int j=0;j<vScore[i].length;j++) {
				System.out.print(vScore[i][j]+"\t");
				sum[i] += vScore[i][j];
				avg[j] += vScore[i][j]/7;
			}
			System.out.print(sum[i]+"\t");
			System.out.print(sum[i]/vScore[i].length+"\t");
			System.out.println();
		}
		for(int i=0;i<60;i++) System.out.print('-');
		System.out.println();
		System.out.print("Average"+Arrays.toString(avg));
	}
}
