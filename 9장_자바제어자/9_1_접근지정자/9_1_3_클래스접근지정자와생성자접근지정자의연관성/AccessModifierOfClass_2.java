/*
HWJava14_09_Chap09Summary01_배재연.zip
*/

// 같은 패키지에서 클래스 접근 지정자와 생성자 접근 지정자

package classes;

import classes.pack0.AA;
//import classes.pack0.BB;	// 불가능
import classes.pack0.CC;

public class AccessModifierOfClass_2 {
	public static void main(String[] args) {
		//#1. 객체 생성
		AA a = new AA();	// 객체 생성 가능(AA a) + 생성자 호출 가능(new AA());
		//BB b = new BB(); // 객체 생성 불가능(BB b) + 따라서 생성자 호출 불가능(new B());
		//CC c = new CB(); //	객체 생성 가능(CC c) + 그러나 생성자 호출 불가능(new C());
	}
}
