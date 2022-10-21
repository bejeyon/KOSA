package classes;

/*
HWjava06_12_ForEtcChk_배재연.zip

	ForEtc00.java
		for(int idx=0;idx<3;idx++)
			System.out.print("Nice Day");

	ForEtc01.java
		int idx = 0;
		for(;idx<3;idx++)
			System.out.print("Nice Day");

	ForEtc02.java
		int idx = 0;
		for(;idx<3;){
			System.out.print("Nice Day");
			idx++;
		}

	ForEtc03.java
		for(int idx=0,int idx1=0;(idx+idx1)<10;idx++,idx1++)
			System.out.print("Nice Day");

*/

class ForEtc02
{
	public static void main(String[] args) 
	{
		int idx = 0;
		for(;idx<3;){
			System.out.println("Nice Day");
			idx++;
		}
	}
}
