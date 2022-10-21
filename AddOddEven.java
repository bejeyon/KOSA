package classes;

/*
파일명 ] HWJava05_09_AddOddEven_배재연.java
문제 ] 1 ~ 10 까지의 합, 홀수합, 짝수합.
조건 ] void mAdd(), void mOdd(), void mEven() 적용

결과 ]
	1 ~ 10 까지의 합 = XX
	1 ~ 10 까지의 홀수합 = XX
	1 ~ 10 까지의 짝수합 = XX
*/

class AddOddEven
{
	void mAdd(int num){
		int sum=0;
		for(int i = 1 ; i <= num ; i++)
			sum+=i;
		System.out.println(1+" ~ "+num+"까지의 합 = "+sum);
	}

	void mOdd(int num){
		int sum=0;
		for(int i = 1 ; i <= num ; i++)
			if(i%2==1)
				sum+=i;
		System.out.println(1+" ~ "+num+"까지의 홀수합 = "+sum);
	}

	void mEven(int num){
		int sum=0;
		for(int i = 1 ; i <= num ; i++)
			if(i%2==0)
				sum+=i;
		System.out.println(1+" ~ "+num+"까지의 짝수합 = "+sum);
	}

	public static void main(String[] args) 
	{
		AddOddEven aod = new AddOddEven();
		aod.mAdd(10);
		aod.mOdd(10);
		aod.mEven(10);
	}
}
