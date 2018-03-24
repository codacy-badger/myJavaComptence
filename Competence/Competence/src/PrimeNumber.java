//program to check number is prime or not prime

import java.util.*;

public class PrimeNumber{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number to chec whether is prime or not ");
int num=0;
try {
	num=sc.nextInt();
	if(num<0)
		{System.out.println("please enter postive number");
		return;
		}
				
	} catch (InputMismatchException e) {
	System.out.println("please enter only number only");
	return;
}catch (Exception e) {
	System.out.println("please enter valid onnumber only");
	return;
}

boolean flag=true;
if(num!=0 || num!=1 ){
flag=checkISPrime(num);
}
else{
flag=checkISPrime(71);
}
if(flag && num!=0 && num!=1 ){
System.out.println("entered is  prime");
}
else{
System.out.println("entered is not prime");

}

}


private static boolean checkISPrime(int num){
boolean flag=true;
for(int i=2;i<Math.sqrt(num);i++){
if(num%i==0){
flag=false;
break;
}

}
return flag;
}



}