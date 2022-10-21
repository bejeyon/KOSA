package classes;

class ArithmeticChk01{
	public static void main(String[] args) 	{
		int vl01 = 100;
		int vl02 = 5;
		System.out.println(vl01+vl02);
		System.out.println(vl01-vl02);
		System.out.println(vl01*vl02);
		System.out.println(vl01/vl02);
		System.out.println(vl01%vl02);
		int result = ++vl02;
		System.out.println(result);
		vl02 = 5;
		result = vl02++;
		System.out.println(result);
		vl02 = 5;
		System.out.println(vl02++);
		System.out.println(vl02);
		vl02 = 5;
		System.out.println(++vl02);
		System.out.println(--vl02);
		System.out.println(--vl02);
	}
}