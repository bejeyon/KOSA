package classes;

class ForChk02
{
	public static void main(String[] args) 
	{
		for(int i = 0 ; i < 11 ; i=i+2){
				System.out.print(i+"\t");
		}

		System.out.print("\n\n");

		for(int i = 0 ; i < 11 ; i++){
			if(i%2==0)
				System.out.print(i+"\t");
		}
	}
}
