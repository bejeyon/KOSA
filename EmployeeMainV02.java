/*
HWJava16_02_EmployeeMainV02_배재연.zip

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

class EmployeeMainV02 {
	public static void main(String[] args) {
		Regular re01[] = {new Regular("R001", "보라", "2020-01-05", 250), new Regular("R002", "뚜비", "2019-03-03", 300)};
		Daily da01[] = {new Daily("D001", "나나", "2018-09-05", 15, 15), new Daily("D002", "나나", "2016-01-05", 25, 15)};
		UserAPI uAPI = new UserAPI();

		System.out.println("사번\t이름\t입사일\t\t월급");
		uAPI.mLine("=", 50);
		System.out.println();
		
		for (int i = 0; i < re01.length; i++) {
			System.out.println(re01[i].getNo() + "\t" + re01[i].getName() + "\t" +  re01[i].getInitday() + "\t" + re01[i].payChk() + "만원");
		}
		for (int i = 0; i < re01.length; i++) {
			System.out.println(da01[i].getNo() + "\t" + da01[i].getName() + "\t" +  da01[i].getInitday() + "\t" + da01[i].payChk() + "만원");
		}
	}
}