package classes;
class JoConfirmV01 
{   //실행시 3인이상의 이름을 입력받는다.
	//3인이하라면 "3인이상을 입력하세요"
	//중복없이 1~인원수 랜덤하게 출력
	public static void main(String[] args) 
	{ JoConfirmV01 teamchk = new JoConfirmV01();
	teamchk.peoplecnt(args);
	int[] lottoNum =new int[args.length];
	
	System.out.println(" ");
	for (int i =0; i<args.length ; i++ )
	{
		System.out.print(lottoNum[i]+"\t");
	}

	for (int i=0; i<args.length ; i++)
	{ lottoNum[i]=((int)(Math.random()*args.length))+1;
		for (int j=i-1; j>=0 ; j-- )
		{ if ( lottoNum[i]==lottoNum[j])
			{ i--; 
				}
			}
		}			
}
	void peoplecnt(String[] array){
		for (int i=0;i<array.length ; i++ )
		{if (array.length<3)
			{System.out.println("3인이상을 입력하세요");
		System.exit(0);
			}
		else {
			System.out.print(array[i]+"\t");	}
		}
	}
	
}


