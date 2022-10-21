package classes;

class MathChk
{
	public static void main(String[] args) 
	{
		System.out.print("-10의 절댓값: ");
		System.out.println(Math.abs(-10));
		System.out.print("10의 절댓값: ");
		System.out.println(Math.abs(10));
		System.out.print("2.7 올림값: ");
		System.out.println(Math.ceil(2.7));
		System.out.print("2.3 올림값: ");
		System.out.println(Math.ceil(2.3));
		System.out.print("-2.3 올림값: ");
		System.out.println(Math.ceil(-2.3));
		System.out.print("2.7 내림값: ");
		System.out.println(Math.floor(2.7));
		System.out.print("2.3 내림값: ");
		System.out.println(Math.floor(2.3));
		System.out.print("-2.3 내림값: ");
		System.out.println(Math.floor(-2.3));
		System.out.print("2.7 반올림값: ");
		System.out.println(Math.round(2.7));
		System.out.print("2.3 반올림값: ");
		System.out.println(Math.round(2.3));
		System.out.print("10, 30 중에 큰 값: ");
		System.out.println(Math.max(10,30));
		System.out.print("10, 30 중에 작은 값: ");
		System.out.println(Math.min(10,30));
		System.out.print("2의 3제곱: ");
		System.out.println(Math.pow(2,3));
		System.out.print("64의 양의 제곱근: ");
		System.out.println(Math.sqrt(64));
		
		System.out.println("0.0보다 크거나 같고 1.0보다 작은 임의의 수 5회 출력: ");
		for (int i = 0; i < 5; i++)
		{
			System.out.println(Math.random());
		}
	}
}