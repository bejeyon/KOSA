/*
## HWJava11_11_SplitUrlExam01_배재연.java

https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=html

※URL 형식 : 프로토콜://도메인,ip:포트번호/경로...?

프로토콜 : https
도메인 : search.naver.com
경로 : search.naver
QueryString : where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=html
QueryString 개수 : XX개
QueryString 변수명 : where / 변수값 : nexearch
*/
package classes;

class SplitUrlExam01
{
	public static void main(String[] args) 
	{
		String str = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=html";	// URL
		System.out.println(str);	// URL 출력
		System.out.println();

		String[] arr1 = str.split("://");	// URL을 프로토콜과 나머지 부분으로 나누어 배열 arr1에 저장
		//for(String temp1 : arr1)
		//	System.out.println(temp1);
		//System.out.println();
		System.out.println("프로토콜 : "+arr1[0]);	// 프로토콜 부분인 arr1[0]을 출력
		System.out.println();

		String[] arr2 = arr1[1].split("/");	// URL에서 프로토콜을 분리하고 나머지 부분인 arr1[1]을 도메인과 나머지 부분으로 나누어 arr2에 저장
		//for(String temp2 : arr2)
		//	System.out.println(temp2);
		//System.out.println();
		System.out.println("도메인 : "+arr2[0]);	// 도메인 부분인 arr2[0]을 출력
		System.out.println();

		String[] arr3 = arr2[1].split("\\?");	// URL에서 프로토콜과 도메인을 분리하고 나머지 부분인 arr2[1]을 경로와 나머지 부분으로 나누어 arr3에 저장
		//for(String temp3 : arr3)
		//	System.out.println(temp3);
		//System.out.println();
		System.out.println("경로 : "+arr3[0]);	// 경로 부분인 arr3[0]을 출력
		System.out.println();

		System.out.print("QueryString : "); // URL에서 프로토콜과 도메인과 경로를 분리하고 나머지 부분인 arr3[1]을 출력
		System.out.println(arr3[1]);
		System.out.println();

		String[] arr4 = arr3[1].split("&");	// URL에서 프로토콜과 도메인과 경로를 분리하고 나머지 부분인 arr3[1]을 QueryString별로 나누어 arr4에 저장
		//for(String temp4 : arr4)
		//	System.out.println(temp4);
		//System.out.println();
		
		System.out.print("QueryString 개수 : ");	// arr4 배열의 길이를 반환하여 QueryString 개수 출력
		System.out.println(arr4.length);
		System.out.println();

		String[] arr5 = {"", ""};	// QueryString별로 변수명과 변수값을 나눠 저장할 배열 변수 arr5 선언
		for (int i = 0; i < arr4.length; i++)
		{
			arr5 = arr4[i].split("=");	// QueryString별로 "="를 기준으로 변수명과 변수값을 나눔
			System.out.print("QueryString 변수명 : "+arr5[0]+"\t\t/ ");	// 변수명 부분인 arr5[0]을 출력
			System.out.println("변수값 : "+arr5[1]);	// 변수값 부분인 arr5[1]을 출력
		}
	}
}
