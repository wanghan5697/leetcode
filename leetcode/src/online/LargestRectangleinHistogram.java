package online;

import java.util.LinkedList;

public class LargestRectangleinHistogram {
	 public int largestRectangleArea(int[] height) {
	        
	    if(height==null||height.length==0){
	    	return 0;
	    }
	    int maxArea=0;
	    LinkedList<Integer> stack= new LinkedList<Integer>();
	    for(int i=0;i<height.length;i++){
	    	while(!stack.isEmpty()&&height[i]<=height[stack.peek()]){
	    		int index=stack.pop();
	    		int curArea = stack.isEmpty()?i*height[index]:(i-stack.peek()-1)*height[index];
	    	    maxArea=Math.max(maxArea, curArea);
	    	    
	    	
	    	
	    	}
	    	stack.push(i);
	    }
	    while(!stack.isEmpty()){
	    	int index=stack.pop();
	    	int curArea=stack.isEmpty()?height.length*height[index]:(height.length-stack.peek()-1)*height[index];
	        maxArea=Math.max(maxArea, curArea);
	    }
	    return maxArea;

	 }

}
