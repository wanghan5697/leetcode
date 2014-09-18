package online;

public class InterleavingString {

	public boolean isInterleave(String s1, String s2, String s3) {
		if(s1==null||s2==null||s3==null){
			return false;
		}
		int len1= s1.length(),len2=s2.length(),len3=s3.length();
		if(len1+len2!=len3){
			return false;
		}
		boolean dp[][]= new boolean[len1+1][len2+1];
		dp[0][0]=true;
		for(int i=1;i<len1+1;i++){
				if(s1.charAt(i-1)==s3.charAt(i-1)&&dp[i-1][0]){
					dp[i][0]=true;
				}
			}
		for(int j=1;j<s2.length()+1;j++){
			if(s2.charAt(j-1)==s3.charAt(j-1)&&dp[0][j-1]){
				dp[0][j]= true;
			}			
		}
		
		for(int i=1;i<s1.length()+1;i++){
			for(int j=1;j<s2.length()+1;j++){
				if(s1.charAt(i-1)==s3.charAt(i+j-1)&&dp[i-1][j]){
					dp[i][j]=true;
				}
				if(s2.charAt(j-1)==s3.charAt(i+j-1)&&dp[i][j-1]){
					dp[i][j]=true;
				}
			}
		}
		return dp[s1.length()][s2.length()];
		}
		

	}
