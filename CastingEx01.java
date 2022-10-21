class CastingEx01{
	public static void main(String[] args) {
		short s01 = 100;
		short s02 = 200;
		short s03 = 100 + 200;
		short s04 = s01 + s02;	// Error Chk
		short s05 = (short)(s01 + s02);	// Casting
		int i01 = s01;	// Up Casting >> 묵시적
		s01 = i01;	// Error Chk
		s01 = (short)i01;	// Down Casting >> 명시적
	}
}