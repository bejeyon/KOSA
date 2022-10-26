/*
HWJava19_07_ArrayIndexOutOfBounds_배재연.java
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

class ArrayIndexOutOfBounds {
	public static void main(String[] args) {
		StudentDTO[] dto = {new StudentDTO("STU001", "뽀오"),
										 new StudentDTO("STU002", "나나"),
										 new StudentDTO("STU003", "뚜비"),
										 new StudentDTO("STU004", "보라")};
		
		System.out.print("학번\t");
		System.out.println("이름");
		for(int i = 0; i <= dto.length; i++) {	// 0 1 2 3 4	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4 at classes.ArrayIndexOutOfBounds.main(ArrayIndexOutOfBounds.java:29)
			try {
				System.out.print(dto[i].getNo() + "\t");
				System.out.println(dto[i].getName() + "\t");
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(i + "번째 ArrayIndexOutOfBounds 확인!!!");
			}
		}
/*
		for(StudentDTO temp : dto){
			System.out.print(temp.getNo()+"\t");
			System.out.println(temp.getName() + "\t");
*/
	}
}
