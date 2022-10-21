/*
## HWJava11_02_StringAPI01_배재연.java
*/
package classes;

class StringAPI01
{
	public static void main(String[] args) 
	{
		String str = "HappyDay";
		System.out.println(str.charAt(5)); // D 해당 정수번째에 있는 문자 반환
		System.out.println(str.indexOf('D'));	// 5	문자열 내에서 해당 문자가 있는 위치 정수로 반환 
		System.out.println(str.indexOf(68));	// 5	A:65 B C D
		System.out.println(str.indexOf("Day"));	// 5 오버로드의 개념 확인
	}
}
