/*
HWJava20_04_Chap14Summary02_배재연.java

연습문제

Q5. 다음은 try-with-resource 구문을 사용해 자동으로 리소스를 해제할 수 있도록 한 코드다. 코드의 빈칸을 완성하시오.

class A implements __________ {
	String res = "리소스 할당";
	@Override
	public void __________ throws Exception {
		res = null;
		System.out.println("리소스 자동 해제");
	}
}

public static void main(String[] args) {
	try (A b = new A()) {
		// ...
	}
	catch (Exception e) {
		// ...
	}
}

실행 결과
리소스 자동 해제
*/
package classes;

class A implements AutoCloseable {
	String res = "리소스 할당";
	@Override
	public void close() throws Exception {
		res = null;
		System.out.println("리소스 자동 해제");
	}
}

class Chap14_ExerciseQ5 {
	public static void main(String[] args) {
		try (A b = new A()) {
			// ...
		}
		catch (Exception e) {
			// ...
		}
	}
}
