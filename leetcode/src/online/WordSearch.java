package online;

public class WordSearch {
	public boolean exist(char[][] board, String word) {
		if (board == null || board.length == 0 || board[0].length == 0) {
			return false;
		}
		if (word == null || word.length() == 0) {
			return true;
		}
		int m = board.length;
		int n = board[0].length;
		boolean[][] visited = new boolean[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (dfs(board, word, 0, i, j, visited)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean dfs(char[][] board, String word, int index, int m, int n,
			boolean[][] visited) {
		if (index == word.length()) {
			return true;
		}
		if (m < 0 || m >= board.length || n < 0 || n >= board[0].length) {
			return false;
		}
		if (visited[m][n]) {
			return false;
		}
		if (board[m][n] != word.charAt(index)) {
			return false;
		}
		visited[m][n] = true;
		boolean res = dfs(board, word, index + 1, m - 1, n, visited)
				|| dfs(board, word, index + 1, m + 1, n, visited)
				|| dfs(board, word, index + 1, m, n - 1, visited)
				|| dfs(board, word, index + 1, m, n + 1, visited);
		visited[m][n] = false;
		
		return res;

	}

}
