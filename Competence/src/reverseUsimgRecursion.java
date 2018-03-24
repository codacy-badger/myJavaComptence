//reverse a string using recursion
public class reverseUsimgRecursion {

	public static void main(String[] args) {
	
		String s="abcde_fghg";
		
		System.out.println(reverseString(s));
		
		
	}
	
	private static String reverseString(String str){
		
	return str.length()==1?str:(reverseString(str.substring(1))+str.charAt(0));

}
}