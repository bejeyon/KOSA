package classes;

class Chap03_01
{
	public static void main(String[] args) 
	{
		String b03 = Integer.toBinaryString(3);
		String b10 = Integer.toBinaryString(10);

		String x03 = Integer.toHexString(3);
		String x10 = Integer.toHexString(10);

		System.out.println("b03 : " + b03 + "\t/ int : " + Integer.parseInt(b03, 2));
		System.out.println("b03 : " + b10 + "\t/ int : " + Integer.parseInt(b10, 2));
		System.out.println("b03 : " + x03 + "\t/ int : " + Integer.parseInt(x03, 16));
		System.out.println("b03 : " + x10 + "\t/ int : " + Integer.parseInt(x10, 16));
	}
}