package online;

public class Test {

	public static String reverseWords(String s) {
		if (s == null) {
			return null;
		}
		if (s == " " || s == "") {
			return "";
		} 
		else {
			s.trim();
			String words[] = s.split(" ");
			StringBuilder newStr = new StringBuilder();

			if (words.length == 1) {
				 newStr.append(s);
				 return newStr.toString();
			} 
			else {
				for (int i = words.length - 1; i >= 0; i--) {
					if(words[i]!=null&& words[i]!=" "){
					newStr.append(words[i]);
					
					}
					newStr.append(" ");
					
				}
				return newStr.toString().trim();
			}
		}
	}

	public static void main(String agrs[]) {
		String s = "   a   b ";
		String s1="The sky is blue";
		System.out.println(reverseWords(s));
	}
}
