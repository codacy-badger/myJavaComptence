
public class AddTwoFraction {

	public static void main(String[] args) {
System.out.println(gcd(5,5));
System.out.println(lcm(5,5));
System.out.println(add(1,2,4 ,5));

	}
	static String  add(int num1, int num2,int den1, int den2) {
		
		int lcm=lcm(den1,den2);
		
		int num3=lcm/den1;
		int num4=lcm/den2;
		
		int x=num1*num3+num2*num4;
	
		return x+"/"+lcm;
	}
	
	
	static int  gcd(int a, int b) {
		int gcd =1;
		
		for(int i=2;i<=a && i<=b; i++) {
			
			if(a%i==0 && b%i==0) 
				gcd=i;
		}
		
		return gcd;
	}


static int lcm(int a,int b) {
	
	int gcd=gcd(a,b);
	return a*b/gcd;
}

}