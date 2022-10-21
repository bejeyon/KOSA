package classes;

class BuiltInVar01{

	public static void main(String[] args) {
		
		BuiltInVar01 obj= new BuiltInVar01();
		
		int vPrice = Integer.parseInt(args[0]);
		int vDessert = Integer.parseInt(args[1]);
		int vCount = Integer.parseInt(args[2]);

		// 배열 >> 속성 >> length

		System.out.println("배열 개수 : "+args.length);
	}
}
