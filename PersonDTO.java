/*
HWJava19_18_TheaterEntrance_배재연.zip
----------------------------------------
연습 ] 영화관 입관 관리 프로그램
----------------------------------------
** 실습 : 영화관 입관 관리 PG [ 19세 이상 관람 가능 ]
조	건 ]
	1. EntranceException 생성(사용자 정의 예외)
	2. getMessage() 메소드 이용
	3. 19세 이하 try ~ catch 예외 처리
파일명 ]
	1. PersonDTO.java
		name, age,
		+ getter, constructor(name, age)(setter의 역할 생성자가 하니까 굳이 만들지 말기)
	2. TheaterEntrance.java
		PersonDTO dto[] = 장미(15), 오렌지(23), 개나리(22), 소나무(17), 바다(18), 정직(20)
			=> 객체 배열
Sample Run ]
	영화관 입관 List 확인
	--------------------------
	장미		님: 입장불가 !!!
	오렌지	님: 입장하세요
	...
	바다		님 : 입장불가 !!!
	정직		님 : 입장하세요
*/
package classes;

class PersonDTO {
	private String name;
	private int age;

	// getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	PersonDTO() {}

	PersonDTO(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
