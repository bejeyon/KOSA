package classes;

class NotChk
{
	public static void main(String[] args) 
	{
		System.out.println(~3);						// -4
		System.out.println(~0b00000011);		// -4
		System.out.println(~0x03);				// -4

		System.out.println(~0);						// -1
		System.out.println(~0b00000000);	// -1
		System.out.println(~0x00);				// -1
	}
}