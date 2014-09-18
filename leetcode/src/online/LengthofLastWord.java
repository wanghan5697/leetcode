package online;

public class LengthofLastWord {
	public int lengthOfLastWord(String s) {
		int len = s.length();
		int count = 0;
		for (int i = len - 1; i >= 0; i--) {

			if(s.charAt(i)==' '){
				if(count==0){
					continue;
				}
				else 
					return count;
			}
			count++;
		}
		return count;
	}
}
