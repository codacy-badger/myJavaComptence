import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
        System.out.printf("Enter i number:  ");
        int i = in.nextInt();
        System.out.printf("Enter the  power u want for number   ");
        int j = in.nextInt();
        long l=calculatePower(i,j);
        System.out.println("answwer =="+l);

	}

	private static long calculatePower(int i, int j) {
	   long result =1;
        while(j>0){
        	result=result*i;
        	j--;
        }
		
		return result;
	}

}
