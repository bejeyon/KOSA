package classes;

/* Sample Run )
이름    수학 국어 영어 총점 평균
----------------------------------------------------------
홍길동  XX  XX   XX          총점/(args.length-1)
*/

class ArrayLengthExam01{

/*	int mAve(int total, int num){
		return total/num;
	}
*/
	public static void main(String[] args) 	{

//		ArrayLengthExam01 obj = new ArrayLengthExam01();

		String vName = args[0];
		int vMath = Integer.parseInt(args[1]);
		int vKor = Integer.parseInt(args[2]);
		int vEng = Integer.parseInt(args[3]);
		int vTotal = vMath+vKor+vEng;
		int vLen = args.length-1; 
		int vAve = vTotal/vLen;
//		int vAve = obj.mAve(vTotal,((args.length)-1));

		System.out.println("이름\t수학\t국어\t영어\t총점\t평균");
		System.out.println("----------------------------------------------");
		System.out.println(vName+"\t"+vMath+"\t"+vKor+"\t"+vEng+"\t"+vTotal+"\t"+vAve);
	}
}
