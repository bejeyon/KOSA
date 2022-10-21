package classes;

class LogicalOpr
{
	public static void main(String[] args) 
	{
		int x, y, z;
		boolean t;

		x = y = z = 1;
		
		t = ((++x != 0) || (++y != 0) || (++z != 0));
		System.out.println("x = " + x + ",\ty = " + y + ",\tz = " + z + ",\tt = " + t);
		System.out.print('\n');

		t = ((++x != 0) | (++y != 0) | (++z != 0));
		System.out.println("x = " + x + ",\ty = " + y + ",\tz = " + z + ",\tt = " + t);
		System.out.print('\n');

		x = y = z = -1;

		t = ((++x != 0) && (++y != 0) && (++z != 0));
		System.out.println("x = " + x + ",\ty = " + y + ",\tz = " + z + ",\tt = " + t);
		System.out.print('\n');

		t = ((++x != 0) & (++y != 0) & (++z != 0));
		System.out.println("x = " + x + ",\ty = " + y + ",\tz = " + z + ",\tt = " + t);
		System.out.print('\n');
	}
}
