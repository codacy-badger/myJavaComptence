import java.util.*;

class StringTest 
{
    public static void main(String[] args)
    {
    	  System.out.println("Plz Enter Your First String: ");
		   Scanner sc = new Scanner(System.in);
		   String originalString = sc.nextLine();
		   System.out.println("Plz Enter String for which you want to replace");

		   String stringReplace = sc.nextLine();
		   System.out.println("Plz Enter String for which you want to replace with");
		   String stringReplaceWith = sc.nextLine();
    
        String replacedString = replaceMethod(originalString, stringReplace, stringReplaceWith);
        System.out.println(replacedString);
    }

    static String replaceMethod(String str, String from, String to) 
    {
        String[] arr = str.split(from);
        StringBuilder output = new StringBuilder();

        int i = 0;
        for (; i < arr.length - 1; i++)
        output.append(arr[i]).append(to);

        output.append(arr[i]);
        if (str.substring(str.lastIndexOf(" ")).equalsIgnoreCase(" " + from))
            output.append(to);

        return output.toString();
    }
}