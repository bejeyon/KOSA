/*
HWJava16_04_InstanceOfChk_배재연.zip

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

class EmployeeInstanceof {
	public static void main(String[] args) {
		Employee em01 = new Employee();
		Regular re01 = new Regular();
		Daily da01 = new Daily();

		boolean result;

		result = (em01 instanceof Employee);
		System.out.println(result);	// true

		result = (re01 instanceof Employee);
		System.out.println(result);	// true

		result = (da01 instanceof Employee);
		System.out.println(result);	// true

		result = (em01 instanceof Regular);
		System.out.println(result);	// false

		//result = (re01 instanceof Daily);	// error: incompatible types: Regular cannot be converted to Daily
		//System.out.println(result);
	}
}