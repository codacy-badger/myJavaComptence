import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
//program to find all possible substring in given string

import java.util.Scanner;
import java.util.Set;

public class SubString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a string for getting substring");
		String s=sc.next();
		Set<String> list =findPermutationOfString(s);
		
		System.out.println("list of all substring=="+list);
		

	}
	
	private static Set<String> findPermutationOfString(String s) {
		Set<String> ls=new LinkedHashSet();
		for(int x=1;x<=s.length();x++){
			for(int y=0;y<s.length();y++){
				
				int z=y+x;
				if(z<=s.length())
					ls.add(getSubstring(s,y,z));
					
			}
			
		}
		
		
		return ls;
	}

	private static String getSubstring(String text, int startPos, int endPos){
		String retString="";
		
		if((startPos>=0)&& (startPos<endPos)&& (endPos<=text.length())){
			
			for(int i=startPos;i<endPos;i++)
			retString=retString+text.charAt(i);
		}
		
		
		return retString;
	}
	

}
