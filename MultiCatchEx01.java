/*
HWJava19_11_MultiCatchEx01_배재연.zip
Refer : HWJava19_06_NullPointerFinish_배재연.java
>> StudentDTO
	String no;
	String name;
	getter / setter / Construct(_, _)

>> NullPointerStudent.java
main()
	StudentDTO[] dto = StudentDTO 4개;
	dto[0] = new StudentDTO("STU001", "뽀오");
	dto[1] = new StudentDTO("STU002", "나나");
for(dto.length)
	getter 이용 no, name 출력	// dto[2], dto[3]은 null 포인터이므로 오류남.
*/
package classes;

class MultiCatchEx01 {
	public static void main(String[] args) {
		StudentDTO[] dto = new StudentDTO[4];
		dto[0] = new StudentDTO("STU001", "보라돌이");
		dto[1] = new StudentDTO("STU002", "뚜비");
		dto[2] = new StudentDTO("STU002", "나나");
		UserAPI uapi = new UserAPI();
		
		System.out.print("학번\t");
		System.out.println("이름");
		uapi.mLine("-", 20);
		System.out.println();
		for(int i = 0; i <= dto.length; i++) {
			try {
				int vI01 = 100 / i;
				System.out.print(dto[i].getNo() + "\t");
				System.out.println(dto[i].getName() + "\t");
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(i + "번째 index에서 ArrayIndexOutOfBounds 확인 !! ");
			}
			catch (NullPointerException e) {
				System.out.println(i + "번째 index에서 NullPointerException 확인 !! ");
			}
			catch (ArithmeticException e) {
				System.out.println(i + "번째 index에서 ArithmeticException 확인 !! ");
			}
			catch (Exception e) {
				System.out.println(i + "번째 index에서 알 수 없는 Error 확인 !! ");
			}
			finally {
				uapi.mLine("-", 20);
				System.out.println();
			}
		}
/*
		for(StudentDTO temp : dto){
			System.out.print(temp.getNo()+"\t");
			System.out.println(temp.getName() + "\t");
*/
	}
}
