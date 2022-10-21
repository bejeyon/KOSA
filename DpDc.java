/*
HWJava14_03_DpDc_배재연.zip
01. 객체생성 : SpSc
02. System.out.println(SpSc.MV);
	  SpSc.MM();
*/

//package classes;

import classes.SpSc;

public class DpDc {
	public static void main(String[] args) {
		SpSc obj = new SpSc();
		
		System.out.println(obj.vPublic);
		System.out.println(obj.vProtected);
		System.out.println(obj.vDefault);
		System.out.println(obj.vPrivate);
		System.out.println();

		obj.mPublic();
		obj.mProtected();
		obj.mDefault();
		obj.mPrivate();
	}
}
