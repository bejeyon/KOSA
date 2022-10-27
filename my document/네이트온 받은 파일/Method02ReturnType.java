package classes;

public class Method02ReturnType {

	int vI01 = 100;
	int vI02 = 5;
	public static void main(String[] args) {
			 int result = 0;
              Method02ReturnType obj = new Method02ReturnType();
              result = obj.mSum();
              System.out.println(result);              
              result = obj.mSub();
              System.out.println(result);
              result = obj.mMul();
              System.out.println(result);
              result = obj.mDiv();
              System.out.println(result);
	}
	
	int mSum() {
		return vI01 + vI02;
	}
	int mSub() {
		return vI01 - vI02;
	}
	int mMul() {
		return vI01 * vI02;
	}
	int mDiv() {
		return vI01 / vI02;
	}

}
