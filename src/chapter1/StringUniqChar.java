package chapter1;

public class StringUniqChar {

	public static boolean isUniqChar(String s) {
		boolean[] tmp = new boolean[256];
		for (int i = 0; i < s.length(); i++) {
			if (!tmp[s.charAt(i)]) {
				tmp[s.charAt(i)] = true;
			} else
				return false;
		}
		return true;
	}
	
}
