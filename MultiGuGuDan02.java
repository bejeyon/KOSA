package classes;

/*
----------------------------------------------------------------------------------------------------
2단			3단			4단			5단			6단			7단			8단			9단
----------------------------------------------------------------------------------------------------
2X1=2		...																								9X1=9
...
2X9=18		...																								9X9=81

## 다중 for
01. outer : 시침
	 inner : 분침
02. outer : 행 >> 9회(1 ~ 9)
	  inner : 열 >> 8회(초기값 : 2)
*/

class MultiGuGuDan02
{
	public static void main(String[] args) 
	{
		UserAPI uapi = new UserAPI();

		uapi.mLine("-", 100);
		System.out.print('\n');
		for(int i = 2 ; i < 10 ; i++)
			System.out.print(i+"단\t");
		System.out.print('\n');
		uapi.mLine("-", 100);
		System.out.print('\n');

		for (int is = 1 ; is < 10 ; is++ )
		{
			for (int vDan = 2; vDan < 10 ; vDan++)
			{
				System.out.print(vDan+"X"+is+"="+(vDan*is)+"\t");
			}
			System.out.println(" ");
		}
		uapi.mLine("=", 100);
		System.out.print('\n');
	}
}
