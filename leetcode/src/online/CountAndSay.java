package online;

public class CountAndSay {

	public String countAndSay(int n) {

		if (n <= 0) {
			return "";
		}

		String s = "1";

		for (int i = 1; i < n; i++) {
			int count = 1;
			StringBuffer res = new StringBuffer();

			for (int j = 1; j < s.length(); j++) {
				if (s.charAt(j) == s.charAt(j - 1)) {
					count++;
				} else {
					res.append(count).append(s.charAt(j - 1));
					count = 1;
				}
			}
			res.append(count).append(s.charAt(s.length() - 1));
			s = res.toString();
		}
		return s;
	}

	public static void main(String args[]) {
		String str = new CountAndSay().countAndSay(5);
		System.out.println(str);
	}
}
