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

class  EmployeeCasting {
	public static void main(String[] args) {
		Employee emp01 = new Employee();
		Regular reg01 = new Regular();
		Daily dai01 = new Daily();

		emp01 = reg01;	// Up Casting
		reg01 = (Regular)emp01;	// Down Casting << 부모 : 일반화 자식 : 특화화된... 실제로 이렇게 쓰지는 않음.
	}
}
