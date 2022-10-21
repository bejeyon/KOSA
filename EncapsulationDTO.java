/*
HWJava14_06_EncapsulationDTO_배재연.java
*/

package classes;

public class EncapsulationDTO {
	private String name;
	private int kor;
	private int eng;
	private int math;

	public String getName() {
		return this.name;
	}
	public int getKor() {
		return this.kor;
	}
	public int getEng() {
		return this.eng;
	}
	public int getMath() {
		return this.math;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}

	public static void main(String[] args) {

	}
}
