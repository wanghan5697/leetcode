package online;

import java.util.Scanner;

public class Split {

	public void split(){
		System.out.println("Input a number:");
		Scanner s = new Scanner(System.in);
		String t = s.nextLine();
		int len=t.length()/2;
			
		String first=t.substring(0,len);
	    String last=t.substring(len+1,t.length());
	    int f=Integer.parseInt(first);
	    int l=Integer.parseInt(last);
	    System.out.println("first half is: "+f);
	    System.out.println("second half is: "+l);
	    	
	    s.close();
	}
}
