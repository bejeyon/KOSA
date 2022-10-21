package classes;

class LogicalChk01{
	public static void main(String[] args) 	{
		int num = 5;
		System.out.println(num < 5 && num < 10);	// false
		System.out.println(num < 5 || num < 4);	// false
		System.out.println(!(num < 5 && num < 10));	// true
	}
}