package classes;

class UseClass01{
	int vI01 = 100;
	int vI02 = 5;
	void mSum(){
		System.out.println(vI01 + vI02);
	}

	public static void main(String[] args) 	{
	// DataType 객체명 = new 생성자;
	UseClass01 obj01 = new UseClass01();
	System.out.println(obj01.vI01);
	System.out.println(obj01.vI02);
	obj01.mSum();
	}
}