package classes;

class  test{
	void methodEx01() throws Exception {
	   int m=0/0;
	}
	void methodEx02(StudentDTO[] obj_null) throws Exception {
	   for (int i =0; i<obj_null.length ; i++ )
	   {  System.out.print(i+ "번째 index 번호"+ obj_null[i].getNo()+"이름: "+ obj_null[i].getName()); 
	   }
	}
	void methodEx03(StudentDTO[] obj_DTO) throws Exception {
	   for (int m =0; m<=obj_DTO.length ; m++ )
	   {  System.out.print( m+ "번째 index 번호"+ obj_DTO[m].getNo()+"이름: "+ obj_DTO[m].getName()); 
	   }
	}
	void methodEx04(StudentDTO[] obj_DTO) throws Exception {
	   methodEx03(obj_DTO);
	}
	void methodEx05() throws Exception {
	   int neg_arr[] = new int[-1];
	}
	public static void main(String[] args) 
	{  StudentDTO []  obj_null = new StudentDTO[3];
	   StudentDTO []  obj_DTO = new StudentDTO[4];
	   test ccf= new test();

		obj_DTO[0]= new StudentDTO("STU001", "보라돌이");
		obj_DTO[1]= new StudentDTO("STU002", "뚜비");
		obj_DTO[2]= new StudentDTO("STU003", "나나");
		obj_DTO[3]= new StudentDTO("STU004", "뽀");

		UserAPI obj = new UserAPI();
		
		for(int i=0; i<5; i++) {
			try { 
				if (i==0)
				{ ccf.methodEx01();
				}
				else if (i==1)
				{ ccf.methodEx02(obj_null);
				}
				else if (i==2)
				{ ccf.methodEx03(obj_DTO);
				}
				else if (i==3)
				{ ccf.methodEx4(obj_DTO);
				}
				else{
					ccf.methodEx5();
				}
			}
			catch(IndexOutOfBoundsException e){
				System.out.println(i+"번째 Index에서 IndexOutOfBoundsException Error 확인!");
			}
			catch(NullPointerException e){
				System.out.println(i+"번째 Index에서 NullPointerException Error 확인!");
			}
			catch(ArithmeticException e){
				System.out.println(i+"번째 Index에서 ArithmeticException Error 확인!");
			}
			catch(Exception e){
				System.out.println(i+"번째 index에서 알 수 없는 Error 확인!");
			}
		finally{
			obj.mLine("-",20);
		}	
	}
}
}