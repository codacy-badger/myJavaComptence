import java.math.BigInteger;

import java.util.Scanner;

public class BinaryGap {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Please enter some inetegr");
			
			int number =sc.nextInt();
	         String x= Integer.toBinaryString(number);
			System.out.println("binary convrersion is =="+x.toString());
			int gap=findMaxBinaryGap(x);
			System.out.println("binarymax gap is =="+gap);
			
			sc.close();
			
		} catch (Exception e) {
			System.out.println("please enetr  a valid Integer");
			e.printStackTrace();
		}

	}
	
	
	private static int findMaxBinaryGap(String temp) {
	
	
	int maxGap=0;
	int currentGap=0;
	for(int i=1;i<temp.length();i++) {
		char ch=temp.charAt(i);
		if(ch=='1') {

			if(currentGap>maxGap)
				maxGap=currentGap;
			currentGap=0;	
			
			
		}
		
			if(ch=='0') {
			currentGap++;
		
			}
	}
		return maxGap;
	}


	private  static BigInteger  printBinaryFormat(int number){
        BigInteger binary=new BigInteger("0");
        int power =0;
        while(number > 0){
        
          
            binary =binary.add(new BigInteger(""+(int) (number%2*Math.pow(10, power))));
            number=number/2;
            power++;
            
        }
return binary;
}
	

}
