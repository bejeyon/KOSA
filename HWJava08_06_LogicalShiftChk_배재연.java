package classes;

class LogicalShiftChk02
{
	public static void main(String[] args) 
	{
		int flags = 0b10110110;
		System.out.println(flags >>> 0 & 1);
		System.out.println(flags >>> 1 & 1);
		System.out.println(flags >>> 2 & 1);
		System.out.println(flags >>> 3 & 1);
		System.out.println(flags >>> 4 & 1);
		System.out.println(flags >>> 5 & 1);
		System.out.println(flags >>> 6 & 1);
		System.out.println(flags >>> 7 & 1);
	}
}