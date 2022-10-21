package classes;

class ReturnTypeChk{
	
	String mChk01(){
		String vS = "ExcitingJava!!!";
		return vS;
	}
	String mChk02(){
		return "FightingJava";
	}
	int mChk03(){
		return 200;
	}
	double mChk04(){
		return 3.4;
	}
	boolean mChk05(){
		return true;
	}
	void mChk06(){
		System.out.println("NiceDay");
	}

	public static void main(String[] args) {
		ReturnTypeChk rtc= new ReturnTypeChk();
		System.out.println(rtc.mChk01());
		System.out.println(rtc.mChk02());
		System.out.println(rtc.mChk03());
		System.out.println(rtc.mChk04());
		System.out.println(rtc.mChk05());
		rtc.mChk06();
	}
}
