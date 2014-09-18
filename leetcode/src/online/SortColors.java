package online;

public class SortColors {

	public void sortColor(int A[]) {

        if (A == null) {
			return;
		}
		int n = A.length;
		int i = 0, j = n - 1, cur = 0;

		while (cur <= j) {

			if (A[cur] == 0) {
				swap(A,i,cur);
				i++;
				cur++;

			}
			else if (A[cur] == 2) {
				swap(A,j, cur);
				j--;
			} else
				cur++;
		}
}
public void swap(int A[], int a,int b) {
		int tmp = A[a];
		A[a] = A[b];
		A[b] = tmp;
	}

	public static void main(String args[]) {
		int a[] = { 1,0,2,0,1,2,0 };
		new SortColors().sortColor(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}

	}

}
