package classes;

class A implements AutoCloseable
{
	String resource;
	A(String resource){
		this.resource = resource;
	}

	public void close() throws Exception{
		if(resource != null){
			resource = null;
			System.out.println("리소스가 해제되었습니다.");
		}
	}
}
class HWJava20_04_TryAutoClose_임다솜
{
	public static void main(String[] args) 
	{
		//#1. 리소스를 사용하고 finally에서 리소스 수동 해제하기
		A a1 = null;

		try{
			a1 = new A("특정파일 1");
		}catch(Exception e){
			System.out.println("예외처리");
		}finally{
			if(a1.resource!=null){
				try{
					a1.close();
				}catch(Exception e){
				}
			}
		}
		//#2. 자동 리소스 해제
		try(A a2 = new A("특정파일 2");){
		
		}catch(Exception e){
			System.out.println("예외처리");
		}
	}
}
