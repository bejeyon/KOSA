package classes;
// 실행시에 2개의 값을 입력받아 사칙연산 결과 출력
class Method03Args{
	int vI01=100;
	int vI02=5;

	int mSum(int args01, int args02){
		return args01+args02;
		}
	int mSub(int args01, int args02){
		return args01-args02;
		}
	int mMul(int args01, int args02){
		return args01*args02;
		}
	int mDiv(int args01, int args02){
		return args01/args02;
		}

	public static void main(String[] args) {

		int vM01 = Integer.parseInt(args[0]);
		int vM02 = Integer.parseInt(args[1]);

		Method03Args cal = new Method03Args();

		System.out.println(vM01+"+"+vM02+" = "+cal.mSum(vM01, vM02));
		System.out.println(vM01+"-"+vM02+" = "+cal.mSub(vM01, vM02));
		System.out.println(vM01+"*"+vM02+" = "+cal.mMul(vM01, vM02));
		System.out.println(vM01+"/"+vM02+" = "+cal.mDiv(vM01, vM02));
	}
}
