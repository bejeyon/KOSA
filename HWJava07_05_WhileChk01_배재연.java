package classes;

/*
HWjava07_05_WhileChk01_배재연.zip

	ForEtc02.java
		int idx = 0;
		for(;idx<3;){
			System.out.println("Nice Day");
			idx++;
		}
참조해서 for문을 while문으로 바꾸기.

*/

class WhileChk01
{
	public static void main(String[] args) 
	{
		int idx = 0;
		for( ; idx < 3 ; ){
			System.out.println("Nice Day");
			idx++;
		}

		UserAPI uapi = new UserAPI();
		uapi.mLine("-", 10);
		System.out.print("\n");
		
		idx = 0;
		while(idx < 3){
			System.out.println("Nice Day");
			idx++;
		}
	}
}
