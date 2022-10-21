package classes;

/*
파일명 ] HWJava06_07_MultiGuGuDan01_배재연.java

문제 ] 2단 ~ 9단까지 출력하세요.

Hint ]	Outer For : 2 ~ 9
			Inner For : 1 ~ 9
*/

class MultiGuGuDan01
{
	public static void main(String[] args) 
	{
		for (int vDan = 2 ; vDan < 10 ; vDan++ )
		{
			System.out.println("## "+vDan+" 단 ##");
			for (int is = 1; is < 10 ; is++)
			{
				System.out.println(vDan+" * "+is+" = "+(vDan*is));
			}
			System.out.println("\n");
		}
	}
}
