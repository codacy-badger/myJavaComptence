//program to find first occurence and second occurence of chara in given string

import java.util.Scanner;

public class FirstOccurenceAndSecondOccurence {

	public static void main(String[] args) {
		
		try{
	Scanner sc=new Scanner(System.in);
	System.out.println("pleae enter a string");
	String str=sc.nextLine();
	System.out.println("pleae enter a char to search");
	char ch=sc.next(".").charAt(0);
		
	
	int postFirst=findFirstOccurence(str,ch);
	System.out.println("first occurence of "+ch+"is =="+postFirst);
	int postSecond=findScondOccurence(str,ch);
	System.out.println("second occurence of "+ch+"is =="+postSecond);
	
	
	int differnece=difereceFirstAndSceond(str,ch);
	System.out.println("diffrence b/w first and second occurence== "+differnece);
	
}catch(Exception e){
			
	System.out.println("enter proper input");
		}
	
	}

	private static int difereceFirstAndSceond(String str, char ch) {
		
		int count=0;
		int temp=-1;
		for(int i=0;i<str.length();i++){
			if(ch==str.charAt(i)){
			       count++;
			       
			       if(count==1){
						temp=i;
					}
				}
			
			
			if(count==2){
				return i-temp;
			}
			
		}
		
		return 0;
	}

	private static int findScondOccurence(String str, char ch) {
		int count=0;
		for(int i=0;i<str.length();i++){
		
			if(ch==str.charAt(i)){
		       count++;
			}
		if(count==2){
			return i;
		}
		}
		
		return -1;
		
	}

	private static int findFirstOccurence(String str, char ch) {
   for(int i=0;i<str.length();i++){
	
	if(ch==str.charAt(i))
	  return i;
	
    }
		return -1;
	}

}
