/*
## Refer : HWJava09_05_LottoWarmUp_배재연.java
01. int[] lottoNum = new int[6]
02. Random 클래스 적용
조건 ]
01. 1~45 사이 수 적용,
02. 중복 없이 적용

Sample Run ]

	---------- 행운의 로또 번호 ----------

	25	5		22	26	17		19

*/

package classes;

import java.util.Random;

class LottoEx01 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] vRandom = new int[6];
		
		for (int i = 0; i < 6; i++) {
			vRandom[i] = rand.nextInt(45) + 1;
			for (int j = i - 1; j >= 0; j--)
				if (vRandom[i] == vRandom[j])
					i--;
		}
		
		System.out.println("---------- 행운의 로또 번호 ----------\n");
		for (int i = 0; i <6; i++)
			System.out.print(vRandom[i] + "\t");
		System.out.println("\n");
	}
}
