package classes;

class HWJava11_05_StringAPI04_손충모
{
	public static void main(String[] args) 
	{
		String str = "Exciting Java";
		System.out.println(str.replace("Java","JSP"));

		str = "Have A Nice Day";
		String[] arrOfStr = str.split(" "); 
		for (String a : arrOfStr) 
            System.out.println(a); 

		str = "010-1234-5678";
		arrOfStr = str.split("-"); 
		for (String a : arrOfStr) 
            System.out.println(a);
	}
}