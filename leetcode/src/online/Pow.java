package online;

public class Pow {

    public double pow(double x, int n) {
    	 if(n<0){
             return 1/powZ(x,(-1)*n);
    	 }
    	 else 
    		 return powZ(x,n);
    }   	
    	
   public double powZ(double x,int n){
	   if(n==0){
	    	return 1.0;

	    }
	   else if(n==1){
	    	return x;
	    }else {
	        if(n%2==0){
	    	return powZ(x,n/2)*powZ(x,n/2); 
	        }else {
	        	return powZ(x,n/2)*powZ(x,n/2)*x;
	        }
	        
   
   }
}

}