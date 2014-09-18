package online;

public class PlusOne {

	public int[] plusOne(int[] digits){
		if (digits==null||digits.length==0){
			return null;
		}
		int carry=0;
		int i= digits.length-1;
		digits[i]+=1;
		while(digits[i]>=10){
			digits[i]=digits[i]-10;
			i--;
			if (i>=0){
				digits[i]+=1;
			}
			else {
				carry=1;
				break;
			}
		}
		
		// create new space for overflow 
	if(carry==0)
		return digits;
	
		int [] res = new int[digits.length+1];
		res[0]=1;
		 for(i=0;i<digits.length;i++){
	            res[i+1]=digits[i];
	        }
		return res;
	}
}
