/*
HWJava15_05_EmployeeWarmUp_배재연.zip

Employee.java
	- MV, getter / setter / Constructor(3)
	- payChk() : Override
Regular.java extends Employee
	- MV, getter / setter /
	  Constructor(4)
	  super(3)
	  this.pay = pay;
Daily.java extends Employee
	- MV, getter / setter /
	  Constructor(5)
	  super(3)
	  this.pay = workday * dailypay
EmployeeMain.java

*/

package classes;

class Regular_TEST extends Employee_TEST {
	private int pay;

	// getter
	public int getPay() {
		return pay;
	}

	// setter
	public void setPay(int pay) {
		this.pay = pay;
	}

	Regular_TEST() {
	}

	Regular_TEST(String no, String name, String initday, int pay) {
		super();
		setPay(pay);
	}

	int payChk() {
		return pay;
	}

}