package online;

import java.util.ArrayList;

public class NQueens {
	public ArrayList<String[]> solveNQueens(int n) {
		ArrayList<String[]> res = new ArrayList<String[]>();
		int[] loc = new int[n];
		dfs(res, loc, 0, n);
		return res;

	}

	public void dfs(ArrayList<String[]> res, int[] loc, int cur, int n) {
		if (cur == n) {
			printBoard(res, loc, n);
		} else {
			for (int i = 0; i < n; i++) {
				loc[cur] = i;
				if (isValid(loc, cur)) {
					dfs(res, loc, cur + 1, n);
				}
			}
		}

	}

	public boolean isValid(int[] loc, int cur) {
		for (int i = 0; i < cur; i++) {
			if (loc[i] == loc[cur] || Math.abs(loc[i] - loc[cur]) == cur - i) {
				return false;
			}
		}
		return true;
	}

	public void printBoard(ArrayList<String[]> res, int[] loc, int n) {
		String[] ans = new String[n];
		for (int i = 0; i < n; i++) {
			StringBuffer row = new StringBuffer();
			for (int j = 0; j < n; j++) {
				if (j == loc[i])
					row.append("Q");
				else
					row.append(".");
			}
			ans[i] = row.toString();
		}
		res.add(ans);
	}
}
