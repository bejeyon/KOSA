/*
HWJava17_09_UtilRandomChk01_배재연.java
## Random class 적용 : >>
01. 1 ~ 45 사이의 숫자를 5회 반환
	- for 문 사용
*/

package classes;

import java.util.Random;

class UtilRandomChk01 {
	public static void main(String[] args) {
		int vRandom = 0;
		Random rand = new Random();
		for (int i = 0; i < 5; i++) {
			vRandom = rand.nextInt(45) + 1;
			System.out.println(vRandom);
		}
	}
}
