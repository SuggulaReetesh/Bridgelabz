package Day10;

public class rotate {

	public static String rotatestring(String s) {
		s = s.substring(s.length() - 1) + s.substring(0, s.length() - 1);
		char c[] = s.toCharArray();
		int pos, j, k;
		pos = 2;
		for (j = c.length - pos - 2, k = 1; j <= c.length - 1; j = j + 3, k++) {
			c[j] = s.charAt(pos * k + k - 1);
		}
		c[pos] = s.charAt(s.length() - 1);
		String string = new String(c);
		System.out.println(string);
		return s;
	}

	public static void main(String[] args) {
		String s = "ab1cd2ef3";
		System.out.println(s);
		rotatestring(s);
	}
}