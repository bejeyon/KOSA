/*
HWJava14_07_EncapsulationMain_배재연.java

class EncapsulationMain
	- dto 객체 생성
	- dto.name X
	- dto.setName("홍길동") O
	- dto.getName() O

Sample Run ]
이름		국어	영어	수학
------------------------- UserAPI
홍길동	90	100	90
*/

package classes;

public class EncapsulationMain {
	public static void main(String[] args) {
		EncapsulationDTO dto = new EncapsulationDTO();
		UserAPI uapi = new UserAPI();

		dto.setName("홍길동");
		dto.setKor(90);
		dto.setEng(100);
		dto.setMath(90);

		System.out.print("이름\t");
		System.out.print("국어\t");
		System.out.print("영어\t");
		System.out.print("수학\t");
		System.out.println();

		uapi.mLine("-", 30);
		System.out.println();
		System.out.print(dto.getName() + "\t");
		System.out.print(dto.getKor() + "\t");
		System.out.print(dto.getEng() + "\t");
		System.out.print(dto.getMath() + "\t");
		System.out.println();
	}
}
