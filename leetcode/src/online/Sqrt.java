package online;

public class Sqrt {
	 public int sqrt(int x) {
		 if(x<0){
			 return -1;
		 }
		 if(x==0){
			 return 0;
		 }
		 
		 int low =0;
		 int high=x;
		 while(low<high){
			 long mid=(long)(low+high)/2;
			 if(mid*mid<x)
				 low=(int)mid+1;
			 else if(mid*mid>x){
				 high=(int)mid-1;
			 }
			 else 
				 return (int)mid;
			 
		 }
		 return high;
				 
				 
	    }

}
