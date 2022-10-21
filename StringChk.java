package classes;

/*
	String str = "abc";
is equivalent to:
	char data[] = {'a','b','c'};
	String str = new String(data);

	레퍼런스형은 값 자체가 들어가는 게 아니라 주소값이 들어가게 됨.
	처음에 선언하면 NULL값을 받음.
	그리고 new라는 키워드에 의해서 논리적으로 주소값을 갖고, 그 주소값에 가게 되면 힙 영역의 객체가 거기에 저장이 되어 있음.

	메모리 영역 3가지 : Class 영역(=메소드 영역), Stack 영역(변수 저장), Heap 영역(객체 저장)
*/

class StringChk
{
	public static void main(String[] args) 
	{
		String vS01 = "abc01";
		String vS02 = "abc01";
		String vS03 = "abc02";
		String vS04 = new String("abc01");
		String vS05 = new String("abc01");
		
		System.out.println("주소값으로 객체 비교하기");
		System.out.println("\n");

		if(vS01 == vS02)
			System.out.println("vS01 == vS02");
		else
			System.out.println("vS01 != vS02");

		if(vS01 == vS03)
			System.out.println("vS01 == vS03");
		else
			System.out.println("vS01 != vS03");

		if(vS04 == vS05)
			System.out.println("vS04 == vS05");
		else
			System.out.println("vS04 != vS05");
		
		System.out.println("\n");
		System.out.println("--------------------");
		System.out.println("\n");

		System.out.println("equals로 객체 비교하기");
		System.out.println("\n");

		System.out.println(vS01.equals(vS02));
		System.out.println(vS01.equals(vS03));
		System.out.println(vS02.equals(vS03));
		System.out.println(vS04.equals(vS05));
		System.out.println("\n");

		if(vS01.equals(vS02))
			System.out.println("vS01 == vS02");
		else
			System.out.println("vS01 != vS02");

		if(vS01.equals(vS03))
			System.out.println("vS01 == vS03");
		else
			System.out.println("vS01 != vS03");

		if(vS04.equals(vS05))
			System.out.println("vS04 == vS05");
		else
			System.out.println("vS04 != vS05");

		System.out.println("\n");
	}
}
