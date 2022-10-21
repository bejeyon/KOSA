/*
HWJava14_01_SpSc_배재연.java
01. 객체생성 : SpSc
02. System.out.println(SpSc.MV);
	  SpSc.MM();
*/

package classes;

public class SpSc {
	public String vPublic = "public MV Chk !!";
	protected String vProtected = "protected MV Chk !!";
	String vDefault = "default MV Chk !!";
	private String vPrivate = "private MV Chk !!";

	public void mPublic() {
		System.out.println("public MM Chk !!");
	}
	protected void mProtected() {
		System.out.println("protected MM Chk !!");
	}
	void mDefault() {
		System.out.println("default MM Chk !!");
	}
	private void mPrivate() {
		System.out.println("private MM Chk !!");
	}

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
