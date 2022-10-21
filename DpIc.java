/*
HWJava14_04_DpIc_배재연.zip
01. 객체생성 : SpSc
02. System.out.println(SpSc.MV);
	  SpSc.MM();
*/

//package classes;

import classes.SpSc;

public class DpIc extends SpSc {
	public static void main(String[] args) {
		DpIc dPiC = new DpIc();
		
		System.out.println(dPiC.vPublic);
		System.out.println(dPiC.vProtected);
		System.out.println(dPiC.vDefault);
		System.out.println(dPiC.vPrivate);
		System.out.println();

		dPiC.mPublic();
		dPiC.mProtected();
		dPiC.mDefault();
		dPiC.mPrivate();
	}
}
