package online;

public class RomanToInteger {

	public int romanToInt(String s) {
		int graph[] = new int[256];
		graph['I'] = 1;
		graph['V'] = 5;
		graph['X'] = 10;
		graph['L'] = 50;
		graph['C'] = 100;
		graph['D'] = 500;
		graph['M'] = 1000;
		char arr[] = s.toCharArray();
		int sum = graph[arr[0]];
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (graph[arr[i]] >= graph[arr[i + 1]]) {
				sum += graph[arr[i + 1]];
			} else
				sum += graph[arr[i + 1]] - 2 * graph[arr[i]];

		}
		return sum;

	}
	public static void main(String args[]){
		String s ="XCIX";
		System.out.println(new RomanToInteger().romanToInt(s));
		
	}
}
