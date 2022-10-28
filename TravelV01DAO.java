package classes;

class TravelV01DAO {	
	UserAPI uapi = new UserAPI();
	TravelV01DB db = new TravelV01DB();
	TravelV01DTO dto[] = new TravelV01DTO[db.travelInfo.length];
	
	void dtoSet(){
		for (int i = 0; i < dto.length; i++)
			dto[i] = new TravelV01DTO(db.travelInfo[i][0], db.travelInfo[i][1], db.travelInfo[i][2], db.travelType[i], db.maxPerson[i]);
	}
	
	void travelMenuChk(){
		uapi.mLine("=", 50);
		System.out.print("메뉴 선택");
		uapi.mLine("=", 50);
		System.out.println();
		System.out.println("\t1. 전체 여행 상품 소개");
		System.out.println("\t2. 개별 자유 여행 상품 소개");
		System.out.println("\t3. 패키지 여행 상품 소개");
		System.out.println("\t4. 최대 예약 가능 인원 변경");
		System.out.println("\tQ. 메뉴 종료");
		uapi.mLine("=", 110);
		System.out.println();
		System.out.print("메뉴 입력 >> ");
	}

	void travelView(int index){
		uapi.mLine("-",110);
		System.out.println();
		System.out.print("여행코드\t");
		System.out.print("도시\t");
		System.out.print("비행기\t\t");
		System.out.print("여행유형\t");
		System.out.print("최대인원");
		System.out.println();
		uapi.mLine("-",110);
		System.out.println();

		switch(index) {
			case 49:
				for(int i = 0; i < dto.length; i++) {
					System.out.print(dto[i].getTravelCode() + "\t\t");
					System.out.print(dto[i].getCityName() + "\t");
					System.out.print(dto[i].getFlight() + "\t");
					System.out.print(dto[i].getTravelType() + "\t");
					System.out.print(dto[i].getMaxPerson());
					System.out.println();
				}
				break;
			case 50:
				for(int i = 0; i < dto.length; i++) {
					if(dto[i].getTravelType().equals("자유여행")){
						System.out.print(dto[i].getTravelCode() + "\t\t");
						System.out.print(dto[i].getCityName() + "\t");
						System.out.print(dto[i].getFlight() + "\t");
						System.out.print(dto[i].getTravelType() + "\t");
						System.out.print(dto[i].getMaxPerson());
						System.out.println();
					}
				}
				break;
			case 51:
				for(int i = 0; i < dto.length; i++) {
					if(dto[i].getTravelType().equals("패키지여행")){
						System.out.print(dto[i].getTravelCode() + "\t\t");
						System.out.print(dto[i].getCityName() + "\t");
						System.out.print(dto[i].getFlight() + "\t");
						System.out.print(dto[i].getTravelType() + "\t");
						System.out.print(dto[i].getMaxPerson());
						System.out.println();
					}
				}
				break;
		}
	}
	
	boolean mMatchCode(String travelCode) {
		boolean match = false;
		for (int i = 0; i < dto.length; i++)
			if(dto[i].getTravelCode().equals(travelCode))
				match = true;
		return match;
	}

	int mMatchMaxNum(String travelCode) {
		int beforMax = 0;
		for (int i = 0; i < dto.length; i++)
			if(dto[i].getTravelCode().equals(travelCode))
				beforMax = dto[i].getMaxPerson();
		return beforMax;
	}

	int mChangeMaxNum(String changeMaxCode, int num) {
		int indexNum = 0;
		for (int i = 0; i < dto.length; i++)
			if(dto[i].getTravelCode().equals(changeMaxCode)) {
				dto[i].setMaxPerson(num);
				indexNum = i;
			}
		return indexNum;
	}

	void travelPrintInfo(int index){
		System.out.print(dto[index].getTravelCode() + "\t\t");
		System.out.print(dto[index].getCityName() + "\t");
		System.out.print(dto[index].getFlight() + "\t");
		System.out.print(dto[index].getTravelType() + "\t");
		System.out.print(dto[index].getMaxPerson());
		System.out.println();
	}
}