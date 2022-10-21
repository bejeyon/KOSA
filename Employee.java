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

class Employee {
	private String no;
	private String name;
	private String initday;

	// getter
	public String getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public String getInitday() {
		return initday;
	}

	// setter
	public void setNo(String no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setInitday(String initday) {
		this.initday = initday;
	}

	Employee() {
	}

	Employee(String no, String name, String initday) {
		setNo(no);
		setName(name);
		setInitday(initday);
	}

	int payChk() {
		return 0;
	}

}