//revers e a string

import java.lang.*;
import java.util.*;

class ReverseString{


public static void main(String args[]){
	//System.out.println(args[0]);

	if(args.length==0){
	Scanner sc=new Scanner(System.in);
System.out.println("please enter string ");
String str=sc.next();

if(str=="")

{

System.out.println("please enter a non string ");
return;
}
System.out.println("reverse of string "+str+"is =="+reverseString(str));

	}
if(args.length>0){

for(String s:args)
System.out.println("reverse of string "+s+"is =="+reverseString(s));

}



}

private static String reverseString(String str){
	
	

char[] temparray = str.toCharArray();
int len=temparray.length;

if(len ==1){
return str;
}

for(int i=0;i<=(len-1)/2;i++){
if(temparray[i]!=temparray[len-1-i]){
char temp=temparray[i];
temparray[i]=temparray[len-1-i];
temparray[len-1-i]=temp;
}

}

return new String(temparray);
}


}