package online;

import java.util.LinkedList;

public class SimplifyPath {
	public String simplifyPath(String path) {
		if (path == null || path.length() == 0) {
			return path;
		}
		LinkedList<String> stack = new LinkedList<String>();
		String[] token = path.split("/");

		for (String s : token) {
			if (s.length() == 0 || s.equals(".")) {
				continue;
			} else if (s.equals("..")) {
				if (!stack.isEmpty()) {
					stack.pop();
				}
			} else {
				stack.push(s);
			}
		}
		if (stack.isEmpty()) {
			stack.push("");
		}
		String ret = "";
		while (!stack.isEmpty()) {
			ret += "/" + stack.removeLast();
		}
		return ret;

	}

	/*
	 * if (path == null || path.length() == 0) { return new String(); } String[]
	 * token = path.split("/"); Stack<String> stack = new Stack<String>(); for
	 * (int i = 0; i < token.length; i++) { if (token[i].equals("..")) { if
	 * (!stack.isEmpty()) { stack.pop(); } else { continue; }
	 * 
	 * } else if (token[i].equals(".") || token[i].length() == 0) { continue; }
	 * else { stack.push(token[i]); } }
	 * 
	 * String ret = new String(""); if (stack.size() == 0) { return "/"; }
	 * Stack<String> stack2 = new Stack<String>(); while (stack.size() > 0) {
	 * stack2.push(stack.pop()); } while (stack2.size() > 0) { ret += "/"; ret
	 * += stack2.pop(); } return ret;
	 * 
	 * }
	 */
}
