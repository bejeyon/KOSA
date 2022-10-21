package classes;

class UnitaryOpr
{
	public static void main(String[] args) 
	{
		int a = 5, b = 0, c = 0;
		a += 3;	// a = 8;
		a *= 7;	// a = 56;
		a /= 5;	// a = 11;
		System.out.println("a="+a);	// a = 11;
		a++;	// a = 11;
		System.out.println("a="+a);	// a = 12;
		b = a++;	// a = 12, b = 12;
		System.out.println("a="+a+"\tb="+b);	// a = 13, b = 12;
		c = ++a * b--;	// a = 14, b = 12, c = 14*12;
		System.out.println("a="+a+"\tb="+b+"\tc="+c);	// a = 14, b = 11, c = 14*12;
	}
}
