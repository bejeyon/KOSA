package classes;

/* 실행 시 총식사가격, 디저트가격, 인원수 입력 후 결과를 출력하세요.
파일명 : 
조건 1 : int 형 vPrice, vDessert, vCount, vDutchPay;
			mDutch() : 매개변수 2개 >> Total금액, 인원수
결과
		식대 총 가격 : xxx원
		디저트 총 가격 : xxx원
		인원 수 : x명
		----------------------------
		인당 가격 : xxx
*/

class DutchPay01{

	int mDutch(int total, int people){
		return total/people;
	}

	public static void main(String[] args) {
		
		DutchPay01 dp= new DutchPay01();
		
		int vPrice = Integer.parseInt(args[0]);
		int vDessert = Integer.parseInt(args[1]);
		int vCount = Integer.parseInt(args[2]);
		int vDutchPay = dp.mDutch((vPrice+vDessert),vCount);

		System.out.println("식대 총 가격 : "+vPrice+"원");
		System.out.println("디저트 총 가격 : "+vDessert+"원");
		System.out.println("인원 수 : "+vCount+"명");
		System.out.println("----------------------------");
		System.out.println("인당 가격 : "+vDutchPay+"원");
		System.out.println("\n");
	}
}
