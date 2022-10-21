package classes;

class ComparisonChk01{
	public static void main(String[] args) 	{
		int vI01 = 100;
		int vI02 = 5;
		System.out.println(vI01 == vI02);	// false
		System.out.println(vI01 == vI01);	// true
		System.out.println(vI01 != vI02);	// true
		System.out.println(vI01 != vI01);	// false
		System.out.println(vI01 > vI02);	// true
		System.out.println(vI01 < vI02);	// false
		System.out.println(vI01 >= vI02);	// true
		System.out.println(vI01 >= vI01);	// true
		System.out.println(vI01 <= vI02);	// false
		System.out.println(vI01 <= vI01);	// true
	}
}