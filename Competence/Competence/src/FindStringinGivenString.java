//program tocheck whether a string is in given string

import java.util.Scanner;

public class FindStringinGivenString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("pleae enter a string needs to string");
		String str=sc.nextLine();
		System.out.println("pleae enter string");
		String str2=sc.next();
		boolean find=serachString(str,str2);
		System.out.println("is found"+find);
	}

	private static boolean serachString(String str, String str2) {
		
		char[] apple=str.toCharArray();
		char[] webapple=str2.toCharArray();
		
		  for (int i = 0; i < webapple.length - apple.length+1; i++) {
		        for (int j = 0; j < apple.length; j++) {
		            if (webapple[i + j] == apple[j]) {
		                if (j == apple.length - 1) {
		                    return true;
		                }
		            } else {
		                break;
		            }
		        }
		    }
		
		return false;
	}

	
	
	
	
}
