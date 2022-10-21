/*
## HWJava11_08_StringAPI07_배재연.java
*/
package classes;

class StringAPI07
{
	public static void main(String[] args) 
	{
		String str01 = "  Nice  ";
		System.out.println("Have A" + str01 + "Day");	// >> Have A Nice Day
		System.out.println("Have A" + str01.trim() + "Day");	// >> Have ANiceDay >> _홍길동_

		String str02 = "  nice  ";
		System.out.println(str01.equals(str02));	// false
		System.out.println(str01.equalsIgnoreCase(str02));	// true
	}
}
