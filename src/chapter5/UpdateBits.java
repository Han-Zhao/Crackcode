package chapter5;

public class UpdateBits {

	public static int updateBits(int n, int m, int i, int j) {
		
		int max = ~0;
		//System.out.println(max);
		//System.out.println(Integer.toBinaryString(max));
		int left = max - ((1<<(j+1)) - 1);
		//System.out.println(Integer.toBinaryString((1<<(j+1)) - 1));
		//System.out.println(Integer.toBinaryString(left));
		int right = (1<<i) - 1;
		int mask = left | right;
		//System.out.println(Integer.toBinaryString(mask));
		
		return (n & mask) | (m << i);
	}
	
}
