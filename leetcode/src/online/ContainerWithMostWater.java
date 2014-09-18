package online;

public class ContainerWithMostWater {

	public int maxArea(int[] height) {
		int i, j, lh, rh, area, temp, length = height.length;
		lh = height[0];
		rh = height[height.length - 1];
		area = 0;
		i = 0;
		j = length - 1;
		
		while (i < j) {
			temp = Math.min(lh, rh) * (j - i);
			if (temp > area) {
				area = temp;
			}
			if (lh < rh) {
				while (i < j && height[i] <= lh) {
					i++;
				}
				if (i < j) {
					lh = height[i];
				}
			} else {
				while (i < j && height[j] <= rh) {
					j--;
				}
				if (i < j) {
					rh = height[j];
				}
			}
		}
		return area;

	}

}
