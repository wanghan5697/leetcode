package online;

public class IntegerToRoman {

	public String intToRoman(int num){
		if(num<1||num>3999){
			return "-1";
		}
		String sArray[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X",
				"IX", "V", "IV", "I" };
		int numArr[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	    String res = "";
	    for(int i=0;i<numArr.length;i++){
	    	while(num>=numArr[i]){
	    		num-=numArr[i];
	    		res+=sArray[i];
	    	}
	    }
		return res;
	}
}
