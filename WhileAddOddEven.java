package classes;

/*
파일명 ] HWJava07_07_WhileAddOddEven_배재연.java

파일명 ] HWJava05_09_AddOddEven_배재연.java

문제 ] 1 ~ 10 까지의 합, 홀수합, 짝수합.
조건 ] void mAdd(), void mOdd(), void mEven() 적용

결과 ]
	1 ~ 10 까지의 합 = XX
	1 ~ 10 까지의 홀수합 = XX
	1 ~ 10 까지의 짝수합 = XX
*/

class WhileAddOddEven
{
	void mAdd(int num){
		int sum=0;
		int i = 1;
		while (i <= num)
		{
			sum += i;
			i++;
		}
		System.out.println(1+" ~ "+num+"까지의 합 = "+sum);
	}

	void mOdd(int num){
		int sum=0;
		int i = 1;
		while (i <= num)
		{
			if(i % 2 == 1)
				sum += i;
			i++;
		}
		System.out.println(1+" ~ "+num+"까지의 홀수합 = "+sum);
	}

	void mEven(int num){
		int sum=0;
		int i = 1;
		while (i <= num)
		{
			if(i % 2 == 0)
				sum += i;
			i++;
		}
		System.out.println(1+" ~ "+num+"까지의 짝수합 = "+sum);
	}

	public static void main(String[] args) 
	{
		AddOddEven aod = new AddOddEven();
		aod.mAdd(10);
		aod.mOdd(10);
		aod.mEven(10);
	}
/*

class AddOddEven
{
	String mAdd(int num1, int num2){
		int sum=0;
		for(int i = num1 ; i <= num2 ; i++)
			sum+=i;
		return num1+" ~ "+num2+"까지의 합 = "+sum;
	}

	void mOdd(int num1, int num2){
		int sum=0;
		for(int i = num1 ; i <= num2 ; i++)
			if(i%2==1)
				sum+=i;
		System.out.println(num1+" ~ "+num2+"까지의 홀수합 = "+sum);
	}

	void mEven(int num1, int num2){
		int sum=0;
		for(int i = num1 ; i <= num2 ; i++)
			if(i%2==0)
				sum+=i;
		System.out.println(num1+" ~ "+num2+"까지의 짝수합 = "+sum);
	}

	public static void main(String[] args) 
	{
		AddOddEven aod = new AddOddEven();
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);	
		aod.mAdd(num1, num2);
		aod.mOdd(num1, num2);
		aod.mEven(num1, num2);
	}

*/
}
