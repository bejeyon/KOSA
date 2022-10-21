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

class Daily extends Employee {
	private int workday;
	private int dailypay;

	// getter
	public int getWorkday() {
		return workday;
	}
	public int getDailypay() {
		return dailypay;
	}

	// setter
	public void setWorkday(int workday) {
		this.workday = workday;
	}
	public void setDailypay(int dailypay) {
		this.dailypay = dailypay;
	}

	Daily() {
	}

	Daily(String no, String name, String initday, int workday, int dailypay) {
		super(no, name, initday);
		setWorkday(workday);
		setDailypay(dailypay);
	}

	int payChk() {
		return workday * dailypay;
	}

}