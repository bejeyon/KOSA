package classes;

import java.util.Scanner;

class TravelV01Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TravelV01DAO dao = new TravelV01DAO();
		dao.dtoSet();
		int inputAnswer = -1;

		while(true) {
			inputAnswer = -1;
			dao.travelMenuChk();
			String result = sc.nextLine();

			if(result.equalsIgnoreCase("Q")) {	// result 가 Q나 q이면 while문 종료
				break;
			}			

			if(result.isEmpty() == true) {
				System.out.println("\t^ [Error] Enter 값을 입력하였습니다.\n");
				continue;
			}

			if(result.length() > 1) {
				System.out.println("\t^ [Error Chk] 1 ~ 4 숫자나 Q(or q)를 입력하세요.");
				continue;
			}

			if((int)result.charAt(0) > 48 && (int)result.charAt(0) < 52) {
				inputAnswer = (int)result.charAt(0);
				dao.travelView(inputAnswer);
				continue;
			}
			else if((int)result.charAt(0) == 52) {
				while(true) {
					System.out.print("변경하고자 하는 여행 코드를 입력해주세요. [ 종료 : Q ] >> ");
					String changeMaxCode = sc.nextLine();
					if(changeMaxCode.equalsIgnoreCase("Q"))
						return;

					if(dao.mMatchCode(changeMaxCode)) {
						System.out.println("최대 예약 가능 인원을 몇 명으로 변경할까요? 현재는 " + dao.mMatchMaxNum(changeMaxCode) + "명입니다.");
						String changeMaxNum = sc.nextLine();
						int index = dao.mChangeMaxNum(changeMaxCode, Integer.parseInt(changeMaxNum));
						System.out.println("최대 예약 가능 인원이 " + changeMaxNum + "으로 변경되었습니다.");
						break;
					}
					else {
						System.out.print("\t※ ※ 일치하는 여행 코드가 없습니다! 확인해주세요. ※ ※");
						if(changeMaxCode.equalsIgnoreCase("Q"))
							return;
						continue;
					}
				}
			}
			else {
				System.out.println("\t^ [Error Chk] 1 ~ 3 숫자나 Q(or q)를 입력하세요.");
				continue;
			}
		}
		System.out.println("\t시스템을 종료합니다.");
	}
}