/*
====================메뉴 선택====================
	1. 전체 여행 상품 소개
	2. 개별 자유 여행 상품 소개
	3. 패키지 여행 상품 소개
	4. 최대 예약 가능 인원 변경
	Q. 메뉴 종료
==================================================
메뉴 입력 >> 1

----------------------------------------------------------------------
여행코드		도시			비행기				여행유형		최대인원
----------------------------------------------------------------------
TRAV001		뮌헨			핀란드항공		자유여행		15
TRAV002		프라하		에어프랑스		패키지여행	20
TRAV003		오사카		대한항공			패키지여행	12
TRAV004		상해			아시아나항공		자유여행		22
TRAV005		마닐라		필리핀항공		패키지여행	17

변경하고자 하는 여행 코드를 입력 해주세요. [종료 : Q] > kkk
----------------------------------------------------------------------

		# 일치하는 여행 코드가 없습니다!. 확인해주세요 ##

----------------------------------------------------------------------
변경하고자 하는 여행 코드를 입력 해주세요. [종료 : Q] >> TRAV001

최대 예약 가능 인원을 몇 명으로 변경할까요? 현재는 15명 입니다. >> 17

최대 예약 가능 인원이 17 으로 변경되었습니다.

TravelV01DAO.java
TravelV01DB.java
TravelV01DTO.java
TravelV01Main.java
UserAPI.java

=-----------
TravelV01DTO.java
	private String travelCode;
	private String cityName;
	private String flight;
	private int travelType;
	private int maxPerson;

	public static final int INDIVIDUAL = 0;
	public static final int PACKAGE = 1;

	+ // dtoSet 메소드
	public void dtoSet(){
+ public void travelPrintInfo(){
*/

/*		--------------------

		TravelV01DAO.java
		  + // 메뉴 체크 메소드
		void travelMenuChk(String menu){
		  + // 여행 상품 출력 메소드
		void travelView(int index){
		+ // dtoSet 메소드
		public void dtoSet(){
		+ public void travelPrintInfo(){

		=================================;
*/	

class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
