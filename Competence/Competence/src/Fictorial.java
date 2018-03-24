import java.util.Scanner;

public class Fictorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
        System.out.printf("Enter i Value:  ");
        int i = in.nextInt();
      long result=  findFictorialUsingRecursion(i);
      
      
      System.out.println("fictorial  of"+i+"  =="+result);

	}

	private static long findFictorial(int i) {
		int result=1;
		while(i>0){
			
			result=result*i--;
			
		}
		return result;
	}
	
	private static long findFictorialUsingRecursion(int i) {
		if(i==0||i==1){
		return 1;
		}
		else{
			
			return i*  findFictorialUsingRecursion(i-1);
			}
		}
		
}
