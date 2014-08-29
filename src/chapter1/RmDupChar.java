package chapter1;

public class RmDupChar {

	public static void rmDupChar (char s[]) {
		if (s == null) return;
		int len = s.length;
		if (len < 2) return;
		
		int tail = 1;
		for (int i = 1; i < len; i++) {
			int j = 0;
			for (j = 0; j < tail; j++) {
				if (s[i] == s[j])
					break;
			}
			if (j == tail) {
				s[tail++] = s[i];
			}
		}
		s[tail] = 'a';
	}
	
}
