package classes;

class Method02ReturnType{
	int vI01=100;
	int vI02=5;

	int mSum(){
		return vI01+vI02;
		}
	int mSub(){
		return vI01-vI02;
		}
	int mMul(){
		return vI01*vI02;
		}
	int mDiv(){
		return vI01/vI02;
		}

	public static void main(String[] args) {
		Method02ReturnType cal = new Method02ReturnType();

		System.out.println(cal.vI01+"+"+cal.vI02+" = "+cal.mSum());
		System.out.println(cal.vI01+"-"+cal.vI02+" = "+cal.mSub());
		System.out.println(cal.vI01+"*"+cal.vI02+" = "+cal.mMul());
		System.out.println(cal.vI01+"/"+cal.vI02+" = "+cal.mDiv());
	}
}
