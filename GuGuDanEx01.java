package classes;

/*
HWJava06_05_GuGuDanEx01_배재연.java

조건] 실행시에 단을 입력받아 해당 구구단을 출력하시오.
	Validate01 : "^ Error Chk : 2 ~ 9 사이의 숫자를 입력하세요 !"

Sample Run ] 9

## 9 단 ##
9 * 2 = XX
9 * 3 = XX
...
9 * 9 = XX
*/

class GuGuDanEx01
{
	public static void main(String[] args) 
	{
		int vDan = Integer.parseInt(args[0]);
		
		if (vDan>9||vDan<2){
			System.out.println("2 ~ 9 사이의 숫자를 입력하세요 !");
			return;
		}
		
		System.out.println("## "+vDan+" 단 ##");

		for (int i = 2 ; i < 10 ; i++ )
		{
			System.out.println(vDan+" * "+i+" = "+(vDan*i));
		}
	}
}
