package online;

import java.util.ArrayList;

public class RestoreIPAddresses {
	public ArrayList<String> restoreIpAddresses(String s) {
		ArrayList<String> res = new ArrayList<String>();
		if (s == null || s.length() < 4 || s.length() > 12) {
			return res;
		}
		String item = new String();
		dfs(s, 0, item, res);
		return res;

	}

	private void dfs(String s, int start, String item, ArrayList<String> res) {
		if (start == 3 && isValid(s)) {
			res.add(item + s);
			return;
		}
		for(int i=0;i<3&&i<s.length()-1;i++){
			String substr=s.substring(0,i+1);
			if(isValid(substr)){
				dfs(s.substring(i+1,s.length()),start+1,item+substr+'.',res);
			}
		}
	}

	private boolean isValid(String str) {
		if (str == null || str.length() > 3) {
			return false;
		}
		int num = Integer.parseInt(str);
		if (str.charAt(0) == '0' && str.length() > 1)
			return false;
		if (num >= 0 && num <= 255)
			return true;
		return false;
	}

}
