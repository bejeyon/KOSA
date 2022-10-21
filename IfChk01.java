package classes;

class IfChk01{

	public static void main(String[] args) 	{

		int vTime = Integer.parseInt(args[0]);

		// example 01
		if(20>18){
			System.out.println("20 is greater than 18\n");
		}

		// example 02
		if(vTime<18){
			System.out.println("Good day.\n");
		}
		else{
			System.out.println("Good evening.\n");
		}

		// example 03
		if(vTime<10){
			System.out.println("Good morning.\n");
		}
		else if(vTime<20){
			System.out.println("Good day.\n");
		}
		else{
			System.out.println("Good evening.\n");
		}
	}
}
