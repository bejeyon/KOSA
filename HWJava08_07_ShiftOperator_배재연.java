package classes;

public class ShiftOperator {	
    public static void main(String[] args) {		
        //#1.산술쉬프트(부호변화가 없음 *2, /2 효과)
        //@ << Left shift
        System.out.println(3<<1);	//6		0000...0011 = 3	->	0000...0110 = 6
        System.out.println(-3<<1);	//-6		1111...  1101 = -3	->	1111...  11010 = -{(4+1)+1} = -6
        System.out.println(3<<2);	//12		0000...0011 = 3	->	0000...1100 = 12
        System.out.println(-3<<2);	//-12		1111...  1101 = -3	->	1111...  110100 = -{(8+2+1)+1} = -12
        System.out.println();
        
        //@ >> Right shift
        System.out.println(5>>1);	//2		0000...0101 = 5	->	0000...0010 = 2
        System.out.println(-5>>1);	//-3		1111...1011 = -5	->	1111...1101 = -{(2)+1} = -3
        System.out.println(5>>2);	//1		0000...0101 = 5	->	0000...0001 = 1
        System.out.println(-5>>2);	//-2		1111...1011 = -5	->	1111...1110 = -{(1)+1} = -2
        System.out.println();
        
        //#2. 논리쉬프트 (>>>)
        System.out.println(3>>>1);    //		0000...0011 = 3	->	0000...0001 = 1
        System.out.println(-3>>>31); //		1111...1101   = -3	->	0000...0001 = 1
    }
}