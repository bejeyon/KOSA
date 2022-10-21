/*
HWJava16_01_EmployeeMainV01_배재연.zip

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

class EmployeeMainV01 {
	public static void main(String[] args) {
		Regular re01 = new Regular("R001", "오렌지", "2020-03-05", 300);
		Daily da01 = new Daily("D001", "나나", "2018-09-05", 15, 15);
		UserAPI uAPI = new UserAPI();

		System.out.println("사번\t이름\t입사일\t\t월급");
		uAPI.mLine("=", 50);
		System.out.println();

		System.out.println(re01.getNo() + "\t" + re01.getName() + "\t" +  re01.getInitday() + "\t" + re01.payChk() + "만원");
		System.out.println(da01.getNo() + "\t" + da01.getName() + "\t" +  da01.getInitday() + "\t" + da01.payChk() + "만원");
	}
}
