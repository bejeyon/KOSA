/*
HWJava20_04_Chap14Summary02_배재연.java

연습문제

Q4. 다음 예외 처리 구문은 오류를 포함하고 있다. 오류가 발생한 이유와 그 해결책을 쓰시오.

try {
	int[] array = new int[] {1, 2, 3};
	System.out.println(array[3]);
}
catch (Exception e) {
	System.out.println("다른 예외가 발생했습니다.");
}
catch (ArrayIndexOutOfBoundsException e) {	// 하위 클래스의 객체가 후순위 catch문 매개변수가 되어서는 안 됨. 영영 닿지 못함. 상위 클래스의 객체가 매개변수로 있는 catch문과 순서를 바꿔야 함.
	System.out.println("배열 인덱스의 사용 범위를 벗어났습니다.");
}
*/
package classes;

class Chap14_ExerciseQ4 {
	public static void main(String[] args) {
		try {
		int[] array = new int[] {1, 2, 3};
			System.out.println(array[3]);
		}
		catch (ArrayIndexOutOfBoundsException e) {	// 하위 클래스의 객체가 후순위 catch문 매개변수가 되어서는 안 됨. 영영 닿지 못함. 상위 클래스의 객체가 매개변수로 있는 catch문과 순서를 바꿔야 함.
			System.out.println("배열 인덱스의 사용 범위를 벗어났습니다.");
		}
		catch (Exception e) {
			System.out.println("다른 예외가 발생했습니다.");
		}
	}
}
