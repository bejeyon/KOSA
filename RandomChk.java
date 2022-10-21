package classes;

class RandomChk
{
	public static void main(String[] args) 
	{
		// Returns a random integer from 0 to 9:
		for (int i = 0; i < 5; i++)
			System.out.println(Math.floor(Math.random()*10));
		System.out.println("--------------------");
		// Returns a random integer from 0 to 10:
		for (int i = 0; i < 5; i++)
			System.out.println(Math.floor(Math.random()*11));
		System.out.println("--------------------");
		// Returns a random integer from 1 to 10:
		for (int i = 0; i < 5; i++)
			System.out.println(Math.floor(Math.random()*10+1));
		System.out.println("--------------------");
		// Returns a random integer from 0 to 45:
		for (int i = 0; i < 5; i++)
			System.out.println(Math.floor(Math.random()*46));
		System.out.println("--------------------");
		// Returns a random integer from 1 to 45:
		for (int i = 0; i < 5; i++)
			System.out.println(Math.floor(Math.random()*45+1));
		System.out.println("--------------------");
	}
}