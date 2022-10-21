package classes;

class CalcV01
{
	public static void main(String[] args) 
	{
		int I01=Integer.parseInt(args[0]);
		int I02=Integer.parseInt(args[1]);
		System.out.println(args[0]+"+"+args[1]+" = "+(I01+I02));
		System.out.println(args[0]+"-"+args[1]+" = "+(I01-I02));
		System.out.println(args[0]+"*"+args[1]+" = "+(I01*I02));
		System.out.println(args[0]+"/"+args[1]+" = "+(I01/I02));
	}
}
