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

class Under19Exception extends Exception {
	Under19Exception(String message) {
		super(message);	// 부모 class?인 throwable의 생성자 생성
	}
}

class TheaterEntrance {
	public static void main(String[] args) {
		PersonDTO[] dto = {new PersonDTO("장미", 15),
										new PersonDTO("오렌지", 23), 
										new PersonDTO("개나리", 22), 
										new PersonDTO("소나무", 17), 
										new PersonDTO("바다", 18), 
										new PersonDTO("정직", 20)};
		System.out.println("영화관 입관 List 확인");
		System.out.println("------------------------------");
		for(int i = 0; i < dto.length ; i++) {
			try {
				if(dto[i].getAge() < 19)
					throw new Under19Exception(dto[i].getName() + "\t님: 입장 불가 !!!");
				System.out.println(dto[i].getName() + "\t님: 입장하세요");
			}
			catch(Under19Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
