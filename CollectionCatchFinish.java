/*
HWJava19_14_CollectionCatchFinish_배재연.java
Sample Run ]
0번째 index에서 ArithmeticException 확인 !!
--------------------
1번째 index에서 NullPointerException 확인 !!
--------------------
0번째 index의   학번 : STU001   이름 : 보라돌이
1번째 index의   학번 : STU002   이름 : 뚜비
2번째 index의   학번 : STU003   이름 : 나나
3번째 index의   학번 : STU004   이름 : 뽀
2번째 index에서 ArrayIndexOutOfBounds 확인 !!
--------------------
0번째 index의   학번 : STU001   이름 : 보라돌이
1번째 index의   학번 : STU002   이름 : 뚜비
2번째 index의   학번 : STU003   이름 : 나나
3번째 index의   학번 : STU004   이름 : 뽀
3번째 index에서 ArrayIndexOutOfBounds 확인 !!
--------------------
4번째 index에서 알 수 없는 Error 확인 !!
*/
package classes;

class CollectionCatchFinish {
	public static void main(String[] args) {
		CollectionCatchWarmUp obj = new CollectionCatchWarmUp();
		UserAPI uapi = new UserAPI();

		StudentDTO obj_null[] = new StudentDTO[3];
		StudentDTO obj_DTO[] = new StudentDTO[4];

		obj_DTO[0] = new StudentDTO("STU001", "보라돌이");
		obj_DTO[1] = new StudentDTO("STU002", "뚜비");
		obj_DTO[2] = new StudentDTO("STU003", "나나");
		obj_DTO[3] = new StudentDTO("STU004", "뽀");

		for(int m = 0; m < 5; m++) {
			try
			{
				if(m==0) {
					obj.methodEx01();
				}
				else if(m==1) {
					obj.methodEx02(obj_null);
				}
				else if(m==2) {
					obj.methodEx03(obj_DTO);
				}
				else if(m==3) {
					obj.methodEx04(obj_DTO);
				}
				else {
					obj.methodEx05();
				}
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(m + "번째 index에서 ArrayIndexOutOfBounds 확인 !! ");
			}
			catch (NullPointerException e) {
				System.out.println(m + "번째 index에서 NullPointerException 확인 !! ");
			}
			catch (ArithmeticException e) {
				System.out.println(m + "번째 index에서 ArithmeticException 확인 !! ");
			}
			catch (Exception e) {
				System.out.println(m + "번째 index에서 알 수 없는 Error 확인 !! ");
			}
			finally {
				uapi.mLine("-", 20);
				System.out.println();
			}
		}
	}
}
