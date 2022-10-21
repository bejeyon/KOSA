/*
HWJava15_03_StaticTset01_배재연.zip
*/

package classes;

class BankV01DAO {
	BankV01DB db = new BankV01DB();
	BankV01DTO dto[] = new BankV01DTO [db.bankInfo.length];
	UserAPI uAPI = new UserAPI();
	
	void dtoSet() {
		for(int i = 0; i < db.bankInfo.length; i++) {
			dto[i] = new BankV01DTO(db.bankInfo[i][0], db.bankInfo[i][1], db.vBalance[i]);
		}
	}

	void printBankInfo() {
		uAPI.mLine("=", 20);
		System.out.println();

		System.out.println("계좌No.\t고객명\t잔고");
		
		uAPI.mLine("=", 20);
		System.out.println();

		for (int i = 0; i < db.bankInfo.length; i++) {
			System.out.print(dto[i].getNo() + "\t");
			System.out.print(dto[i].getName() + "\t");
			System.out.print(dto[i].getBalance() + "\t");
			System.out.println();
			BankV01DTO.bankBalance += dto[i].getBalance();
		}

		uAPI.mLine("=", 20);
		System.out.println();

		System.out.println("은행 잔고 : \t" + BankV01DTO.bankBalance);
	}
}