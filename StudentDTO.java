/*
HWJava19_05_NullPointerStuWarmUp_배재연.zip
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

class StudentDTO {
	private String no;
	private String name;
	
	// getter
	public String getNo() {
		return no;
	}
	public String getName() {
		return name;
	}

	// setter
	public void setNo(String no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}

	// 생성자 오버로딩
	StudentDTO() {}
	StudentDTO(String no, String name) {
		setNo(no);
		setName(name);
	}
}
