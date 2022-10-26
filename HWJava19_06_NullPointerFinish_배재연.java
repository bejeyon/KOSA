/*
HWJava19_06_NullPointerFinish_배재연.java
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

class NullPointerFinish {
	public static void main(String[] args) {
		StudentDTO[] dto = new StudentDTO[4];
		dto[0] = new StudentDTO("STU001", "뽀오");
		dto[1] = new StudentDTO("STU002", "나나");
		
		System.out.print("학번\t");
		System.out.println("이름");
		for(int i = 0; i < dto.length; i++) {	// Error. Exception in thread "main" java.lang.NullPointerException	at classes.NullPointerStudent.main(NullPointerStudent.java:25)
			try {
				System.out.print(dto[i].getNo() + "\t");
				System.out.println(dto[i].getName() + "\t");
			}
			catch (NullPointerException e) {
				System.out.println(i + "번째 NullPointerException 확인!!!");
			}
		}
/*
		for(StudentDTO temp : dto){
			System.out.print(temp.getNo()+"\t");
			System.out.println(temp.getName() + "\t");
*/
	}
}
