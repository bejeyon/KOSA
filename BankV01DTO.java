/*
HWJava15_03_StaticTset01_배재연.zip
*/

package classes;

class BankV01DTO {
	private String no;	// 고객번호
	private String name;	// 고객이름
	private int balance;	// 고객 잔고
	static int bankBalance;	// 은행잔고

	String getNo() {
		return no;
	}
	void setNo(String no) {
		this.no = no;
	}

	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}

	int getBalance() {
		return balance;
	}
	void setBalance(int balance) {
		this.balance = balance;
	}

	static {
		bankBalance = 100000;
	}

	BankV01DTO() {
	}
	
	BankV01DTO(String no, String name, int balance) {
		setNo(no);
		setName(name);
		setBalance(balance);
	}
}
