/* 7장 연습문제
Q3. 다음의 클래스 A 내부에는 int[] 객체를 입력매개변수로 입력받아 배열의 모든 원소를 합한 후 리턴하는 arraySum() 메서드가 정의돼 있다.

class A {
	int arraySum(int[] array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
}

다음과 같이 4가지 방법으로 arraySum() 메서드를 호출할 때 오류가 발생하는 코드와 그 이유를 설명하시오.

A a = new A();
int[] data1 = new int[] {1, 2, 3};
int[] data2 = {1, 2, 3};
System.out.println(a.arraySum(data1));
System.out.println(a.arraySum(data2));
System.out.println(a.arraySum(new int[] {1, 2, 3}));
System.out.println(a.arraySum({1, 2, 3}));	// 여기서 오류남.

오류가 나는이유 : 
arraySum 메서드의 매개변수로서 int[] array가 선언되어 있다.
그렇다면 배열의 선언/초기화 방법에서 배열의 '선언'은 '생성 및 초기화'와 분리가 되는 경우에 해당되므로,
이 때에는 배열의 초기화를 할 때 'new int[]' 부분을 생략하고 중괄호 내 초기화의 내용 부분만 기술할 수는 없다.
따라서 매개변수에 배열의 생성 및 초기화가 필요한 부분에서 중괄호 내 초기화의 내용 부분만 기술한 22번째줄의 코드는 오류이다.
*/

package classes;

class Chap7_ExerciseQ3
{
	public static void main(String[] args) 
	{
	}
}
