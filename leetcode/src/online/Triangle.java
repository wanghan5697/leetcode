package online;

import java.util.ArrayList;

public class Triangle {
	public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
		int size = triangle.size();
		if(size==0){
			return 0;
		}
		if(size==1){
			return triangle.get(0).get(0);
		}
		int dp [] = new int[triangle.size()];
		dp[0]=triangle.get(0).get(0);
		for(int i=1;i<triangle.size();i++){
			for(int j=i;j>=0;j--){
				if(j==0)
					dp[0]+=triangle.get(i).get(0);
				else if (j<i){
					dp[j]=triangle.get(i).get(j)+Math.min(dp[j], dp[j-1]);}
				
					else 
						dp[j]=triangle.get(i).get(j)+dp[j-1];
				}
			}
		int ret = Integer.MAX_VALUE;
		for(int i=0;i<dp.length;i++){
			if(dp[i]<ret){
				ret=dp[i];
			}
		}
		return ret;
	
	
	
	}
	     
	public static void main(String args[]){
		ArrayList<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> item1 = new ArrayList<Integer>();
		item1.add(0, 2);
		triangle.add(item1);
		
		ArrayList<Integer> item2 = new ArrayList<Integer>();
		item2.add(0,3);
		item2.add(1,4);
		triangle.add(item2);
		
		ArrayList<Integer> item3 = new ArrayList<Integer>();
        item3.add(0,6);
		item3.add(1,5);
		item3.add(2,7);
		triangle.add(item3);
		
		ArrayList<Integer> item4 = new ArrayList<Integer>();
		item4.add(0,4);
		item4.add(1,1);
		item4.add(2,8);
		item4.add(3,3);
		triangle.add(item4);
		
		System.out.println(new Triangle().minimumTotal(triangle));

	}

}
