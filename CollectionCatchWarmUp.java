/*
HWJava19_13_CollectionCatchWarmUp_배재연.java
파일명 ]
	- StudentDTO.java / - UserAPI.java
01. methodEx01() thorws Exception
	int m = 0 / 0;
02. methodEx02(StudentDTO[] obj_null) throws Exception
	for(obj_null.length){ ? 번호 이름 }
03. methodEx03(StudentDTO[] obj_DTO) throws Exception
	for(int m = 0; m<=obj_DTO.length; m++){ ? 번호 이름 }
04. methodEx04(StudentDTO[] obj_DTO) throws Exception
	methodEx03(obj_DTO);
05. methodEx05() throws Exception
	int neg_arr[] = new int[-1];
	// NegativeArraySizeException
*/
package classes;

class CollectionCatchWarmUp {
	void methodEx01() throws Exception {
		int m = 0 / 0;
	}
	void methodEx02(StudentDTO[] obj_null) throws Exception {
		for(int i = 0; i < obj_null.length; i++){
			System.out.print(i + "번째 index의\t학번 : " + obj_null[i].getNo() + "\t");
			System.out.println("이름 : " + obj_null[i].getName() + "\t");
		}
	}
	void methodEx03(StudentDTO[] obj_DTO) throws Exception {
		for(int m = 0; m <= obj_DTO.length; m++) {
			System.out.print(m + "번째 index의\t학번 : " + obj_DTO[m].getNo() + "\t");
			System.out.println("이름 : " + obj_DTO[m].getName() + "\t");
		}
	}
	void methodEx04(StudentDTO[] obj_DTO) throws Exception {
		methodEx03(obj_DTO);
	}
	void methodEx05() throws Exception {
		int neg_arr[] = new int[-1];	// NegativeArraySizeException
	}
}
