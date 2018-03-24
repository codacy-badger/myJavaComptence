import java.util.Scanner;

public class CheckSringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("pleae enter a string");
		String str=sc.nextLine();
		sc.close();
boolean result=isPalindrome(str);

if(result){
System.out.println("string found palindrome");
}else{
	
	System.out.println("string found not  palindrome");
}
		
	}

	private static boolean isPalindrome(String str) {
		boolean flag=true;
		for(int i=0;i<=str.length()/2;i++){
			if(str.charAt(i)!=str.charAt(str.length()-1-i)){
				flag=false;
				break;
			}
			
		}
		return flag;
	}

}
