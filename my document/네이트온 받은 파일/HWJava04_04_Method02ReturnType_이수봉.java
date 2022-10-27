package classes;

class Method02ReturnType{

	
	public static void main(String[] args){

		// 객체 생성
		Method02ReturnType calObj = new Method02ReturnType();

		// 사칙연산 결과 출력
		System.out.println("Sample Run ] ");
		
		// 덧셈
		System.out.print(calObj.var01 + " + " + calObj.var02 + " = ");
		System.out.println(calObj.mSum());

		// 뺄셈
		System.out.print(calObj.var01 + " - " + calObj.var02 + " = ");
		System.out.println(calObj.mSub());

		// 곱셈
		System.out.print(calObj.var01 + " * " + calObj.var02 + " = ");
		System.out.println(calObj.mMul());

		// 나눗셈
		System.out.print(calObj.var01 + " / " + calObj.var02 + " = ");
		System.out.println(calObj.mDiv());


	}

	// int형 변수 선언 및 할당
	int var01 = 100;
	int var02 = 5;

	// var01 과 var02 값을 입력받아 덧셈 결과를 int형으로 반환하는 메소드 정의
	int mSum(){
		return var01 + var02;
	}

	// var01 과 var02 값을 입력받아 뺄셈 결과를 int형으로 반환하는 메소드 정의
	int mSub(){
		return var01 - var02;
	}

	// var01 과 var02 값을 입력받아 곱셈 결과를 int형으로 반환하는 메소드 정의
	int mMul(){
		return var01 * var02;
	}

	// var01 과 var02 값을 입력받아 나눗셈 결과를 int형으로 반환하는 메소드 정의
	int mDiv(){
		return var01 / var02;
	}

}
