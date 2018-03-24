import java.util.Scanner;

public class AnagramTest {
		   public static void main(String[] args) {
		   System.out.println("Plz Enter Your First String: ");
		   Scanner sc = new Scanner(System.in);
		    String s1 = sc.nextLine();
		   System.out.println("Plz Enter Your Second String: ");

		     String s2 = sc.nextLine();
		    System.out.println(getAnagramString(s1,s2));

		}
		public static boolean getAnagramString(String s1,String s2){
		   char[] c1 = s1.toCharArray();
		   StringBuffer sb = new StringBuffer(s2);
		for(char d: c1){
		   int index = sb.indexOf(String.valueOf(d));       
		     if(index !=-1){
		         sb.deleteCharAt(index);
		     }//if
		     else{
		         return false;
		     }
		}
		return sb.length() ==0;
		}

}
